package controller;

import com.opensymphony.xwork2.ActionSupport;
import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class ExcelActionController extends ActionSupport {

    @RequestMapping("/index")
    public String handleRequestIndex(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "index";
    }

    @RequestMapping("/excel")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {


        StringBuffer sb = new StringBuffer();
        sb.append("<table><tr><td>名称</td><td>邮箱</td></tr>");
        Map<String, String> map = new HashMap<String, String>();
        map.put("hututu1", "hututu@sina.com");
        map.put("hututu2", "hututu@sohu.com");
        map.put("hututu3", "hututu@163.com");
        for (String key : map.keySet()) {
            sb.append("<tr><td>").append(key).append("</td><td>").append(map.get(key)).append("</td></tr>");
        }
        request.getSession().setAttribute("excel", sb.toString());
        //response.sendRedirect(request.getContextPath() + "/export.jsp");
        return "export";
    }

    @RequestMapping("/tx")
    public String handleRequestWay2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        OutputStream os = response.getOutputStream();// 取得输出流
        response.reset();// 清空输出流
        response.setHeader("Content-disposition", "attachment; filename=testRed.xls");// 设定输出文件头
        response.setContentType("application/msexcel");// 定义输出类型

        WritableWorkbook wbook = Workbook.createWorkbook(os); // 建立excel文件
        String tmptitle = "测试数据"; // 标题
        WritableSheet wsheet = wbook.createSheet(tmptitle, 0); // sheet名称

        // 设置excel标题
        WritableFont wfont = new WritableFont(WritableFont.ARIAL, 16, WritableFont.BOLD, false,
                UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
        WritableCellFormat wcfFC = new WritableCellFormat(wfont);
        wcfFC.setBackground(Colour.AQUA);
        wsheet.addCell(new Label(1, 0, tmptitle, wcfFC));
        wfont = new jxl.write.WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD, false,
                UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
        wcfFC = new WritableCellFormat(wfont);

        // 开始生成主体内容
        wsheet.addCell(new Label(0, 2, "姓名"));
        wsheet.addCell(new Label(1, 2, "邮箱"));
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Map<String, String> map = new HashMap<String, String>();
        map.put("hututu1", "hututu@sina.com");
        map.put("hututu2", "hututu@sohu.com");
        map.put("hututu3", "hututu@163.com");
        int count = 0;
        for (String key : map.keySet()) {
            wsheet.addCell(new Label(0, count + 3, key));
            wsheet.addCell(new Label(1, count + 3, map.get(key)));
            count++;
        }

        // 主体内容生成结束
        wbook.write(); // 写入文件
        wbook.close();
        os.close(); // 关闭流
        return "tx";
    }

}

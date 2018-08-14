package cn.aofeng.threadpool4j.common.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * XML DOM解析器辅助类。
 */
public class DomUtil {

    private static Logger _logger = LoggerFactory.getLogger(DomUtil.class);

    /**
     * 生成XML文件的{@link Document}实例。
     *
     * @param classPathXmlFile 相对于CLASSPATH的文件路径，以"/"开头。例："/threadpool4j.xml"
     * @return XML文件的{@link Document}实例。如果文件找不到或XML格式错误将返回null。
     */
    public static Document createDocument(String classPathXmlFile) {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            DocumentBuilder dom = domFactory.newDocumentBuilder();
            document = dom.parse(DomUtil.class.getResourceAsStream(classPathXmlFile));
        } catch (Exception e) {
            _logger.error(String.format("create Document of xml file[%s] occurs error", classPathXmlFile), e);
        }

        return document;
    }

}

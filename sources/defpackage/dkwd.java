package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwd {
    public static final /* synthetic */ int a = 0;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static String a(Date date) {
        String format;
        SimpleDateFormat simpleDateFormat = b;
        synchronized (simpleDateFormat) {
            format = simpleDateFormat.format(date);
        }
        return format;
    }

    public static synchronized Date b(String str) {
        Date parse;
        synchronized (dkwd.class) {
            try {
                SimpleDateFormat simpleDateFormat = b;
                synchronized (simpleDateFormat) {
                    parse = simpleDateFormat.parse(str);
                }
            } catch (ParseException e) {
                try {
                    SimpleDateFormat simpleDateFormat2 = c;
                    synchronized (simpleDateFormat2) {
                        return simpleDateFormat2.parse(str);
                    }
                } catch (ParseException e2) {
                    dkty.s(e2, "Encountered ParseException when parsing Date with dateFormat2", new Object[0]);
                    dkty.s(e, "Encountered ParseException when parsing Date with dateFormat", new Object[0]);
                    throw new XmlPullParserException(a.a(str, "Invalid date [ ", "]"));
                }
            }
        }
        return parse;
    }

    public static Document c() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        return newInstance.newDocumentBuilder().newDocument();
    }

    public static Element d(Document document, XmlPullParser xmlPullParser) {
        String str;
        Element createElementNS = document.createElementNS(xmlPullParser.getNamespace(), xmlPullParser.getName());
        createElementNS.setPrefix(xmlPullParser.getPrefix());
        int depth = xmlPullParser.getDepth();
        int namespaceCount = xmlPullParser.getNamespaceCount(depth) - (depth > 0 ? xmlPullParser.getNamespaceCount(depth - 1) : 0);
        for (int i = 0; i < namespaceCount; i++) {
            createElementNS.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:".concat(String.valueOf(xmlPullParser.getNamespacePrefix(i))), xmlPullParser.getNamespaceUri(i));
        }
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            createElementNS.setAttributeNS(xmlPullParser.getAttributePrefix(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
        }
        xmlPullParser.nextToken();
        boolean z = false;
        do {
            int eventType = xmlPullParser.getEventType();
            switch (eventType) {
                case 0:
                case 10:
                    break;
                case 1:
                case 3:
                    z = true;
                    break;
                case 2:
                    createElementNS.appendChild(d(document, xmlPullParser));
                    xmlPullParser.nextToken();
                    break;
                case 4:
                case 7:
                    createElementNS.appendChild(document.createTextNode(xmlPullParser.getText()));
                    xmlPullParser.nextToken();
                    break;
                case 5:
                    createElementNS.appendChild(document.createCDATASection(xmlPullParser.getText()));
                    xmlPullParser.nextToken();
                    break;
                case 6:
                    createElementNS.appendChild(document.createEntityReference(xmlPullParser.getName()));
                    xmlPullParser.nextToken();
                    break;
                case 8:
                    String text = xmlPullParser.getText();
                    int indexOf = text.indexOf(32);
                    if (indexOf > 0) {
                        str = text.substring(indexOf + 1);
                        text = text.substring(0, indexOf);
                    } else {
                        str = "";
                    }
                    createElementNS.appendChild(document.createProcessingInstruction(text, str));
                    xmlPullParser.nextToken();
                    break;
                case 9:
                    createElementNS.appendChild(document.createComment(xmlPullParser.getText()));
                    xmlPullParser.nextToken();
                    break;
                default:
                    throw new IOException(a.h(eventType, "Unexpected node type "));
            }
        } while (!z);
        return createElementNS;
    }

    public static void e(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException("Parser is not on START_TAG.");
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void f(Element element, XmlSerializer xmlSerializer) {
        NamedNodeMap attributes = element.getAttributes();
        if (Objects.isNull(attributes)) {
            throw new IOException("Element should contain at least one element.");
        }
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = attributes.item(i);
            if (!Objects.isNull(item) && "xmlns".equals(item.getPrefix())) {
                xmlSerializer.setPrefix(item.getLocalName(), item.getNodeValue());
            }
        }
        xmlSerializer.startTag(element.getNamespaceURI(), element.getLocalName());
        for (int i2 = 0; i2 < length; i2++) {
            Node item2 = attributes.item(i2);
            if (!Objects.isNull(item2) && !"xmlns".equals(item2.getPrefix())) {
                xmlSerializer.attribute(item2.getNamespaceURI(), item2.getLocalName(), item2.getNodeValue());
            }
        }
        if (element.getChildNodes() != null) {
            NodeList childNodes = element.getChildNodes();
            int length2 = childNodes.getLength();
            for (int i3 = 0; i3 < length2; i3++) {
                Node item3 = childNodes.item(i3);
                item3.getClass();
                short nodeType = item3.getNodeType();
                switch (nodeType) {
                    case 1:
                        f((Element) item3, xmlSerializer);
                        break;
                    case 2:
                    case 6:
                    default:
                        throw new IOException(a.h(nodeType, "Illegal XML node type: "));
                    case 3:
                        String textContent = item3.getTextContent();
                        textContent.getClass();
                        xmlSerializer.text(textContent);
                        break;
                    case 4:
                        String textContent2 = item3.getTextContent();
                        textContent2.getClass();
                        xmlSerializer.cdsect(textContent2);
                        break;
                    case 5:
                        xmlSerializer.entityRef(item3.getNodeName());
                        break;
                    case 7:
                        xmlSerializer.processingInstruction(item3.getNodeName() + " " + item3.getNodeValue());
                        break;
                    case 8:
                    case 12:
                        String textContent3 = item3.getTextContent();
                        textContent3.getClass();
                        xmlSerializer.comment(textContent3);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        String textContent4 = item3.getTextContent();
                        textContent4.getClass();
                        xmlSerializer.docdecl(textContent4);
                        break;
                }
            }
        }
        xmlSerializer.endTag(element.getNamespaceURI(), element.getLocalName());
    }
}

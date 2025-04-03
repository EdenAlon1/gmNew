package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyl extends dkyf {
    public final List b = new ArrayList();
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private String e;

    public final void a(Document document, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("name")) {
                this.e = xmlPullParser.getAttributeValue(i);
            } else {
                this.d.put(new QName(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i)), xmlPullParser.getAttributeValue(i));
            }
        }
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        while (true) {
            if ((nextTag == 3) && name.equals("list")) {
                return;
            }
            if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace)) {
                this.c.add(dkwd.d(document, xmlPullParser));
            } else if (name.equals("list")) {
                dkyl dkylVar = new dkyl();
                dkylVar.a(document, xmlPullParser);
                this.b.add(dkylVar);
            } else if (name.equals("entry")) {
                dkyj dkyjVar = new dkyj();
                for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                    if (xmlPullParser.getAttributeName(i2).equals(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                        dkyjVar.d = xmlPullParser.getAttributeValue(i2);
                    } else {
                        if (dkyjVar.e == null) {
                            dkyjVar.e = new HashMap();
                        }
                        dkyjVar.e.put(new QName(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2)), xmlPullParser.getAttributeValue(i2));
                    }
                }
                int nextTag2 = xmlPullParser.nextTag();
                String namespace2 = xmlPullParser.getNamespace();
                String name2 = xmlPullParser.getName();
                while (true) {
                    if ((nextTag2 == 3) && name2.equals("entry")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace2)) {
                        Element d = dkwd.d(document, xmlPullParser);
                        if (dkyjVar.c == null) {
                            dkyjVar.c = new ArrayList(1);
                        }
                        dkyjVar.c.add(d);
                    } else if (name2.equals("display-name")) {
                        dkyjVar.b = new dkyh();
                        dkyjVar.b.b(xmlPullParser);
                    }
                    nextTag2 = xmlPullParser.nextTag();
                    namespace2 = xmlPullParser.getNamespace();
                    name2 = xmlPullParser.getName();
                }
                this.b.add(dkyjVar);
            } else if (name.equals("external")) {
                dkyk dkykVar = new dkyk();
                for (int i3 = 0; i3 < xmlPullParser.getAttributeCount(); i3++) {
                    if (!xmlPullParser.getAttributeName(i3).equals("anchor")) {
                        new QName(xmlPullParser.getAttributeNamespace(i3), xmlPullParser.getAttributeName(i3));
                        xmlPullParser.getAttributeValue(i3);
                        throw null;
                    }
                    dkykVar.c = xmlPullParser.getAttributeValue(i3);
                }
                int nextTag3 = xmlPullParser.nextTag();
                String namespace3 = xmlPullParser.getNamespace();
                String name3 = xmlPullParser.getName();
                while (true) {
                    if ((nextTag3 == 3) && name3.equals("external")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace3)) {
                        Element d2 = dkwd.d(document, xmlPullParser);
                        if (dkykVar.b == null) {
                            dkykVar.b = new ArrayList();
                        }
                        dkykVar.b.add(d2);
                    } else if (name3.equals("display-name")) {
                        dkyh dkyhVar = new dkyh();
                        dkyhVar.b(xmlPullParser);
                        dkykVar.a = dkyhVar;
                    }
                    nextTag3 = xmlPullParser.nextTag();
                    namespace3 = xmlPullParser.getNamespace();
                    name3 = xmlPullParser.getName();
                }
                this.b.add(dkykVar);
            } else if (name.equals("entry-ref")) {
                dkyi dkyiVar = new dkyi();
                for (int i4 = 0; i4 < xmlPullParser.getAttributeCount(); i4++) {
                    if (!xmlPullParser.getAttributeName(i4).equals("ref")) {
                        new QName(xmlPullParser.getAttributeNamespace(i4), xmlPullParser.getAttributeName(i4));
                        xmlPullParser.getAttributeValue(i4);
                        throw null;
                    }
                    dkyiVar.c = xmlPullParser.getAttributeValue(i4);
                }
                int nextTag4 = xmlPullParser.nextTag();
                String namespace4 = xmlPullParser.getNamespace();
                String name4 = xmlPullParser.getName();
                while (true) {
                    if ((nextTag4 == 3) && name4.equals("entry-ref")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace4)) {
                        Element d3 = dkwd.d(document, xmlPullParser);
                        if (dkyiVar.b == null) {
                            dkyiVar.b = new ArrayList();
                        }
                        dkyiVar.b.add(d3);
                    } else if (name4.equals("display-name")) {
                        dkyh dkyhVar2 = new dkyh();
                        dkyhVar2.b(xmlPullParser);
                        dkyiVar.a = dkyhVar2;
                    }
                    nextTag4 = xmlPullParser.nextTag();
                    namespace4 = xmlPullParser.getNamespace();
                    name4 = xmlPullParser.getName();
                }
                this.b.add(dkyiVar);
            } else if (name.equals("display-name")) {
                dkyh dkyhVar3 = new dkyh();
                dkyhVar3.b(xmlPullParser);
                this.a = dkyhVar3;
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
    }

    public final void b(XmlSerializer xmlSerializer) {
        String str = this.e;
        if (str != null) {
            xmlSerializer.attribute("", "name", str);
        }
        dkyh dkyhVar = this.a;
        if (dkyhVar != null) {
            dkyhVar.a(xmlSerializer);
        }
        for (int i = 0; i < this.b.size(); i++) {
            Object obj = this.b.get(i);
            if (obj instanceof dkyl) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "list");
                ((dkyl) obj).b(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "list");
            } else if (obj instanceof dkyj) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry");
                dkyj dkyjVar = (dkyj) obj;
                if (dkyjVar.f != dkyg.NONE) {
                    xmlSerializer.attribute("urn:ietf:params:xml:ns:copycontrol", "copyControl", dkyjVar.f.e);
                }
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, dkyjVar.d);
                Map map = dkyjVar.e;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        xmlSerializer.attribute(((QName) entry.getKey()).getPrefix(), ((QName) entry.getKey()).getLocalPart(), (String) entry.getValue());
                    }
                }
                dkyh dkyhVar2 = dkyjVar.b;
                if (dkyhVar2 != null) {
                    dkyhVar2.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry");
            } else if (obj instanceof dkyi) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
                dkyi dkyiVar = (dkyi) obj;
                xmlSerializer.attribute("", "ref", dkyiVar.c);
                dkyh dkyhVar3 = dkyiVar.a;
                if (dkyhVar3 != null) {
                    dkyhVar3.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
            } else if (obj instanceof dkyk) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "external");
                dkyk dkykVar = (dkyk) obj;
                xmlSerializer.attribute("", "anchor", dkykVar.c);
                dkyh dkyhVar4 = dkykVar.a;
                if (dkyhVar4 != null) {
                    dkyhVar4.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "external");
            }
        }
    }
}

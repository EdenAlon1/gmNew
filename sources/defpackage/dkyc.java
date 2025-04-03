package defpackage;

import java.util.HashMap;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyc implements dkwb {
    public static final enip a = enip.s(new QName("urn:ietf:params:xml:ns:pidf:rpid", "status-icon"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "class"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "place-type"));
    public static final enip b = enip.s(dkyd.class, dkya.class, dkyb.class);
    private final ffbr c;

    public dkyc(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (!qName.getLocalPart().equals("status-icon")) {
            if (qName.getLocalPart().equals("class")) {
                dkya dkyaVar = new dkya();
                dkyaVar.a = xmlPullParser.nextText();
                return dkyaVar;
            }
            if (!qName.getLocalPart().equals("place-type")) {
                throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
            }
            dkyb dkybVar = (dkyb) this.c.b();
            dkybVar.e(document, xmlPullParser);
            return dkybVar;
        }
        dkyd dkydVar = new dkyd();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeNamespace = xmlPullParser.getAttributeNamespace(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName.equals("id")) {
                dkydVar.c = attributeValue;
            } else if (attributeName.equals("from")) {
                dkydVar.a = dkwd.b(attributeValue);
            } else if (attributeName.equals("until")) {
                dkydVar.b = dkwd.b(attributeValue);
            } else {
                if (dkydVar.e == null) {
                    dkydVar.e = new HashMap();
                }
                dkydVar.e.put(new QName(attributeNamespace, attributeName), attributeValue);
            }
        }
        dkydVar.d = xmlPullParser.nextText();
        return dkydVar;
    }

    @Override // defpackage.dkwb
    public final Set b() {
        return a;
    }

    @Override // defpackage.dkwb
    public final Set c() {
        return b;
    }

    @Override // defpackage.dkwb
    public final void d(Object obj, XmlSerializer xmlSerializer) {
        if (obj instanceof dkyd) {
            ((dkyd) obj).c(xmlSerializer);
        } else if (obj instanceof dkya) {
            ((dkya) obj).c(xmlSerializer);
        } else if (obj instanceof dkyb) {
            ((dkyb) obj).c(xmlSerializer);
        }
    }
}

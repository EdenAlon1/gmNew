package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwf implements dkwb {
    private static final enip a = enip.s(new QName("urn:oma:xml:xdm:common-policy", "external-list"), new QName("urn:oma:xml:xdm:common-policy", "anonymous-request"), new QName("urn:oma:xml:xdm:common-policy", "other-identity"));
    private static final enip b = enip.s(dkwe.class, dkwh.class, dkwi.class);

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        String attributeValue;
        if (!"external-list".equals(qName.getLocalPart())) {
            if ("other-identity".equals(qName.getLocalPart())) {
                return new dkwi();
            }
            if ("anonymous-request".equals(qName.getLocalPart())) {
                return new dkwe();
            }
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dkwh dkwhVar = new dkwh();
        String name = xmlPullParser.getName();
        int nextTag = xmlPullParser.nextTag();
        String name2 = xmlPullParser.getName();
        while (true) {
            if ((nextTag == 3) && name2.equals(name)) {
                return dkwhVar;
            }
            if (name2.equals("entry") && (attributeValue = xmlPullParser.getAttributeValue("", "anc")) != null) {
                dkwhVar.a.add(new dkwg(attributeValue));
            }
            nextTag = xmlPullParser.nextTag();
            name2 = xmlPullParser.getName();
        }
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
        if (obj instanceof dkwh) {
            ((dkwh) obj).c(xmlSerializer);
            return;
        }
        if (obj instanceof dkwi) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "other-identity");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "other-identity");
        } else if (obj instanceof dkwe) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
        }
    }
}

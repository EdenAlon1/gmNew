package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwq implements dkwb {
    private static final enip a = new enpx(new QName("urn:ietf:params:xml:ns:pidf:cipid", "display-name"));
    private static final enip b = new enpx(dkwr.class);

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (!"display-name".equals(qName.getLocalPart())) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dkwr dkwrVar = new dkwr();
        dkwrVar.a = xmlPullParser.nextText();
        return dkwrVar;
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
        if (obj instanceof dkwr) {
            ((dkwr) obj).c(xmlSerializer);
        }
    }
}

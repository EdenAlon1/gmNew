package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxp implements dkwb {
    public static final enip a = new enpx(new QName("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv"));
    public static final enip b = new enpx(dkxl.class);
    private final ffbr c;

    public dkxp(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.dkwb
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (!qName.getLocalPart().equals("geopriv")) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dkxl dkxlVar = (dkxl) this.c.b();
        dkxlVar.b(document, xmlPullParser);
        return dkxlVar;
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
        if (obj instanceof dkxl) {
            ((dkxl) obj).c(xmlSerializer);
        }
    }
}

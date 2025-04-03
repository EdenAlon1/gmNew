package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxm {
    public Double a;
    private final String b;
    private String c;

    public dkxm(Double d) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = "radius";
        this.a = d;
    }

    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", this.b);
        xmlSerializer.attribute("", "uom", String.valueOf(this.c));
        Double d = this.a;
        if (d != null) {
            xmlSerializer.text(d.toString());
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", this.b);
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue("", "uom");
        this.a = Double.valueOf(xmlPullParser.nextText());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxm)) {
            return false;
        }
        dkxm dkxmVar = (dkxm) obj;
        return this.b.equals(dkxmVar.b) && erkx.b(this.a.doubleValue(), dkxmVar.a.doubleValue(), 1.0E-5d) && Objects.equals(this.c, dkxmVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, Objects.toString(this.c, "")});
    }

    public dkxm(String str) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = str;
    }
}

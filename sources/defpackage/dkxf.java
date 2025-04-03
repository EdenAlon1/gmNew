package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxf {
    private final String a;
    private Double b;
    private String c;

    public dkxf(String str) {
        this.a = str;
    }

    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", this.a);
        xmlSerializer.attribute("", "uom", String.valueOf(this.c));
        if (!Objects.isNull(this.b)) {
            xmlSerializer.text(String.valueOf(this.b));
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", this.a);
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue("", "uom");
        this.b = Double.valueOf(xmlPullParser.nextText());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxf)) {
            return false;
        }
        dkxf dkxfVar = (dkxf) obj;
        return this.a.equals(dkxfVar.a) && erkx.b(this.b.doubleValue(), dkxfVar.b.doubleValue(), 1.0E-5d) && Objects.equals(this.c, dkxfVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, String.valueOf(this.c)});
    }
}

package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxy extends dkxu {
    public Double a;
    private String b;
    private String c;

    public dkxy() {
    }

    public final Double a() {
        String str = this.c;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final Double b() {
        String str = this.b;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "pos");
        String str = this.c;
        String concat = str != null ? "".concat(str) : "";
        String str2 = this.b;
        if (str2 != null) {
            concat = a.w(str2, concat, " ");
        }
        Double d = this.a;
        if (d != null) {
            concat = concat + " " + d;
        }
        xmlSerializer.text(concat);
        xmlSerializer.endTag("http://www.opengis.net/gml", "pos");
    }

    public final void d(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        String[] split = nextText.contains(",") ? nextText.split(",") : nextText.split("\\s");
        int length = split.length;
        if (length >= 2) {
            this.c = split[0];
            this.b = split[1];
            if (length == 3) {
                this.a = Double.valueOf(split[2]);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxy)) {
            return false;
        }
        dkxy dkxyVar = (dkxy) obj;
        Double b = b();
        Double a = a();
        Double a2 = dkxyVar.a();
        Double b2 = dkxyVar.b();
        Double d = dkxyVar.a;
        if (a == null && dkxyVar.a() != null) {
            return false;
        }
        if (a != null && (Objects.isNull(a2) || !erkx.b(a.doubleValue(), a2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        if (b == null && dkxyVar.b() != null) {
            return false;
        }
        if (b != null && (Objects.isNull(b2) || !erkx.b(b.doubleValue(), b2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        Double d2 = this.a;
        if (d2 == null && d == null) {
            return true;
        }
        return (d2 == null || d == null || !erkx.b(d2.doubleValue(), d.doubleValue(), 1.0E-5d)) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public dkxy(Double d, Double d2) {
        this.b = d2.toString();
        this.c = d.toString();
    }
}

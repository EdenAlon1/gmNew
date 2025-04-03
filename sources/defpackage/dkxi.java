package defpackage;

import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxi implements dkxo {
    public dkxy a;
    public dkxm b;
    private final String c = "urn:ogc:def:crs:EPSG::4326";

    public dkxi() {
    }

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
        xmlSerializer.attribute("", "srsName", this.c);
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxi)) {
            return false;
        }
        dkxi dkxiVar = (dkxi) obj;
        return this.a.equals(dkxiVar.a) && this.b.equals(dkxiVar.b) && this.c.equals(dkxiVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.valueOf(String.valueOf(this.a)).concat(String.valueOf(String.valueOf(this.b)));
    }

    public dkxi(dkxy dkxyVar, Double d) {
        this.a = dkxyVar;
        this.b = new dkxm(d);
    }
}

package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxj implements dkxo {
    public dkxy a;
    public dkxm b;
    public dkxm c;
    public dkxf d;
    public String e = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
        xmlSerializer.attribute("", "srsName", String.valueOf(this.e));
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        dkxm dkxmVar2 = this.c;
        if (dkxmVar2 != null) {
            dkxmVar2.a(xmlSerializer);
        }
        dkxf dkxfVar = this.d;
        if (dkxfVar != null) {
            dkxfVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxj)) {
            return false;
        }
        dkxj dkxjVar = (dkxj) obj;
        return this.d.equals(dkxjVar.d) && this.a.equals(dkxjVar.a) && this.b.equals(dkxjVar.b) && this.c.equals(dkxjVar.c) && Objects.equals(this.e, dkxjVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c, Objects.toString(this.e, "")});
    }
}

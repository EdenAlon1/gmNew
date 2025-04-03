package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxk implements dkxo {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public dkxy b;
    public dkxm c;
    public dkxm d;
    public dkxm e;
    public dkxf f;

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dkxy dkxyVar = this.b;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        dkxm dkxmVar = this.c;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        dkxm dkxmVar2 = this.d;
        if (dkxmVar2 != null) {
            dkxmVar2.a(xmlSerializer);
        }
        dkxm dkxmVar3 = this.e;
        if (dkxmVar3 != null) {
            dkxmVar3.a(xmlSerializer);
        }
        dkxf dkxfVar = this.f;
        if (dkxfVar != null) {
            dkxfVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxk)) {
            return false;
        }
        dkxk dkxkVar = (dkxk) obj;
        return this.f.equals(dkxkVar.f) && this.b.equals(dkxkVar.b) && this.c.equals(dkxkVar.c) && this.d.equals(dkxkVar.d) && this.e.equals(dkxkVar.e) && Objects.equals(this.a, dkxkVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.b, this.c, this.d, this.e, Objects.toString(this.a, "")});
    }
}

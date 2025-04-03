package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxq implements dkxo {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public dkxh b;
    public dkxm c;

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Prism");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dkxh dkxhVar = this.b;
        if (dkxhVar != null) {
            dkxhVar.a(xmlSerializer);
        }
        dkxm dkxmVar = this.c;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Prism");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxq)) {
            return false;
        }
        dkxq dkxqVar = (dkxq) obj;
        return this.b.equals(dkxqVar.b) && this.c.equals(dkxqVar.c) && Objects.equals(this.a, dkxqVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Objects.toString(this.a, "")});
    }
}

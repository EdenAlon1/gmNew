package defpackage;

import j$.util.Objects;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxw extends dkxu implements dkxo {
    public dkxy a;
    public String b = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Point");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Point");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkxw) {
            return this.a.equals(((dkxw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}

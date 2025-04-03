package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxs implements dkxo {
    public dkxy a;
    public dkxm b;
    public String c = "urn:ogc:def:crs:EPSG::4979";

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Sphere");
        xmlSerializer.attribute("", "srsName", Objects.toString(this.c, ""));
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            dkxyVar.c(xmlSerializer);
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null) {
            dkxmVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Sphere");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxs)) {
            return false;
        }
        dkxs dkxsVar = (dkxs) obj;
        dkxy dkxyVar = this.a;
        if (dkxyVar == null && dkxsVar.a != null) {
            return false;
        }
        if (dkxyVar != null && !dkxyVar.equals(dkxsVar.a)) {
            return false;
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null || dkxsVar.a == null) {
            return (dkxmVar == null || dkxmVar.equals(dkxsVar.b)) && Objects.equals(this.c, dkxsVar.c);
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        dkxy dkxyVar = this.a;
        if (dkxyVar != null) {
            arrayList.add(dkxyVar);
        }
        dkxm dkxmVar = this.b;
        if (dkxmVar != null) {
            arrayList.add(dkxmVar);
        }
        String str = this.c;
        if (str != null) {
            arrayList.add(str);
        }
        return Arrays.hashCode(arrayList.toArray());
    }
}

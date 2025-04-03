package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxv extends dkxu implements dkxo {
    public List a;
    public dkxz b;

    public final List a() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // defpackage.dkxo, defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "LinearRing");
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkxy) it.next()).c(xmlSerializer);
            }
        }
        dkxz dkxzVar = this.b;
        if (dkxzVar != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "posList");
            List<dkxy> list2 = dkxzVar.a;
            if (list2 != null) {
                String str = "";
                for (dkxy dkxyVar : list2) {
                    String str2 = str.concat("\n") + dkxyVar.a() + " ";
                    Double b = dkxyVar.b();
                    Objects.toString(b);
                    String concat = str2.concat(String.valueOf(b));
                    Double d = dkxyVar.a;
                    str = d != null ? concat + " " + d : concat;
                }
                xmlSerializer.text(str);
            }
            xmlSerializer.endTag("http://www.opengis.net/gml", "posList");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "LinearRing");
    }
}

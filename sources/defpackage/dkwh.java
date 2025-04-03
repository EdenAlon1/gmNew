package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwh implements dkwc {
    public final List a = new ArrayList(1);

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "external-list");
        for (dkwg dkwgVar : this.a) {
            String str = dkwgVar.a;
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "entry");
            xmlSerializer.attribute("", "anc", dkwgVar.a);
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "entry");
        }
        xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "external-list");
    }
}

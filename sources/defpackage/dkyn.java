package defpackage;

import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyn implements dkwc {
    public String a;
    public dkys b;
    public String c;
    public String d;
    public List e;
    public final ffbr f;

    public dkyn(ffbr ffbrVar) {
        this.f = ffbrVar;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "instance");
        xmlSerializer.attribute("", "id", this.a);
        xmlSerializer.attribute("", "state", this.b.d);
        String str = this.c;
        if (str != null) {
            xmlSerializer.attribute("", "reason", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            xmlSerializer.attribute("", "cid", str2);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "instance");
    }
}

package defpackage;

import j$.util.Objects;
import java.util.Date;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkye implements dkwc {
    public String a;
    public Date b;
    public long c;

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "time-offset");
        if (!Objects.isNull(this.b)) {
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "until", dkwd.a(this.b));
        }
        if (!Objects.isNull(this.a)) {
            xmlSerializer.attribute("", "id", this.a);
        }
        xmlSerializer.text(String.valueOf(this.c));
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "time-offset");
    }
}

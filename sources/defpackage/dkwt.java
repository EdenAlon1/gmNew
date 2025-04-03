package defpackage;

import j$.util.Objects;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwt implements dkwc {
    public List a;
    public dkww b;
    public Date c;
    public final ffbr d;

    public dkwt(ffbr ffbrVar) {
        this.d = ffbrVar;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
        Date date = this.c;
        if (date != null) {
            xmlSerializer.attribute("urn:oma:xml:pde:pidf:ext", "until", dkwd.a(date));
        }
        if (!Objects.isNull(this.b)) {
            String str = this.b.c;
            xmlSerializer.startTag("urn:oma:xml:pde:pidf:ext", "basic");
            xmlSerializer.text(str);
            xmlSerializer.endTag("urn:oma:xml:pde:pidf:ext", "basic");
        }
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkwo) this.d.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
    }
}

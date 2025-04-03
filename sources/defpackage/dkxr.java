package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxr implements dkwc {
    public final ffbr a;
    private List b;

    public dkxr(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkwo) this.a.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dkxr) && a().size() == ((dkxr) obj).a().size();
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(a().size()));
    }
}

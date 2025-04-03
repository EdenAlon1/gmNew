package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxn implements dkwc {
    public List a;
    public final ffbr b;
    private List c;

    public dkxn(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dkxo) it.next()).c(xmlSerializer);
            }
        }
        List list2 = this.a;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((dkwo) this.b.b()).b(it2.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxn)) {
            return false;
        }
        dkxn dkxnVar = (dkxn) obj;
        if (a().size() != dkxnVar.a().size()) {
            return false;
        }
        for (int i = 0; i < a().size(); i++) {
            if (!Objects.equals((dkxo) a().get(i), (dkxo) dkxnVar.a().get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = a().size() * 37;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            size += ((dkxo) it.next()).hashCode() * 37;
        }
        return size;
    }
}

package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxe implements dkwc {
    public dkxd b;
    public dkwu c;
    public dkwx d;
    public List e;
    public dktc f;
    public final dkwv h;
    public final ffbr i;
    public final ffbr j;
    private List k;
    public List g = new ArrayList();
    public String a = "i".concat(eeja.a());

    public dkxe(dkwv dkwvVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.h = dkwvVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
    }

    public final List a() {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        return this.k;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.attribute("", "id", String.valueOf(this.a));
        dkxd dkxdVar = this.b;
        if (dkxdVar != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "status");
            if (!Objects.isNull(dkxdVar.a)) {
                String str = dkxdVar.a.c;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "basic");
                xmlSerializer.text(str);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "basic");
            }
            List list = dkxdVar.b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dkwo) dkxdVar.c.b()).b(it.next(), xmlSerializer);
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "status");
        }
        dkwu dkwuVar = this.c;
        if (dkwuVar != null) {
            dkwuVar.c(xmlSerializer);
        }
        List list2 = this.k;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((dkwo) this.j.b()).b(it2.next(), xmlSerializer);
            }
        }
        dkwx dkwxVar = this.d;
        if (dkwxVar != null) {
            dkwxVar.c(xmlSerializer);
        }
        List list3 = this.e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((dkwy) it3.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf");
            }
        }
        if (this.f != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "timestamp");
            xmlSerializer.text(this.f.toString());
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "timestamp");
        }
    }

    public final String toString() {
        return "TupleType{id='" + this.a + "', status=" + String.valueOf(this.b) + ", serviceDescription=" + String.valueOf(this.c) + "}";
    }
}

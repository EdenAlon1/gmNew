package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhas extends fgzi {
    private static final long serialVersionUID = -269658210065896668L;
    public final fguv c;
    private final Map d;

    public fhas() {
        super("VTODO");
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put(fhdb.f, new fhak());
        hashMap.put(fhdb.g, new fhal());
        hashMap.put(fhdb.i, new fham());
        hashMap.put(fhdb.j, new fhan());
        hashMap.put(fhdb.c, new fhao());
        hashMap.put(fhdb.h, new fhap());
        hashMap.put(fhdb.e, new fhaq());
        hashMap.put(fhdb.d, new fhar());
        this.c = new fguv();
        this.b.add(new fhcn());
    }

    @Override // defpackage.fgut
    public final boolean equals(Object obj) {
        return obj instanceof fhas ? super.equals(obj) && fhox.a(this.c, ((fhas) obj).c) : super.equals(obj);
    }

    @Override // defpackage.fgut
    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a);
        fhpaVar.c(this.b);
        fhpaVar.c(this.c);
        return fhpaVar.a;
    }

    @Override // defpackage.fgut
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append(this.c);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    public fhas(fgyw fgywVar) {
        super("VTODO", fgywVar);
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put(fhdb.f, new fhak());
        hashMap.put(fhdb.g, new fhal());
        hashMap.put(fhdb.i, new fham());
        hashMap.put(fhdb.j, new fhan());
        hashMap.put(fhdb.c, new fhao());
        hashMap.put(fhdb.h, new fhap());
        hashMap.put(fhdb.e, new fhaq());
        hashMap.put(fhdb.d, new fhar());
        this.c = new fguv();
    }
}

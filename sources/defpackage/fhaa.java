package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhaa extends fgzi {
    private static final long serialVersionUID = 2547948989200697335L;
    public final fguv c;
    private final Map d;

    public fhaa() {
        super("VEVENT");
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put(fhdb.f, new fgzs());
        hashMap.put(fhdb.g, new fgzt());
        hashMap.put(fhdb.i, new fgzu());
        hashMap.put(fhdb.j, new fgzv());
        hashMap.put(fhdb.c, new fgzw());
        hashMap.put(fhdb.h, new fgzx());
        hashMap.put(fhdb.e, new fgzy());
        hashMap.put(fhdb.d, new fgzz());
        this.c = new fguv();
        this.b.add(new fhcn());
    }

    public final fhco c() {
        return (fhco) a("DTSTART");
    }

    public final fhcq d() {
        return (fhcq) a("DURATION");
    }

    @Override // defpackage.fgut
    public final boolean equals(Object obj) {
        return obj instanceof fhaa ? super.equals(obj) && fhox.a(this.c, ((fhaa) obj).c) : super.equals(obj);
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

    public fhaa(fgyw fgywVar) {
        super("VEVENT", fgywVar);
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put(fhdb.f, new fgzs());
        hashMap.put(fhdb.g, new fgzt());
        hashMap.put(fhdb.i, new fgzu());
        hashMap.put(fhdb.j, new fgzv());
        hashMap.put(fhdb.c, new fgzw());
        hashMap.put(fhdb.h, new fgzx());
        hashMap.put(fhdb.e, new fgzy());
        hashMap.put(fhdb.d, new fgzz());
        this.c = new fguv();
    }
}

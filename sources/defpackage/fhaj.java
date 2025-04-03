package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhaj extends fgzi {
    private static final long serialVersionUID = 5629679741050917815L;
    public final fguv c;

    public fhaj() {
        super("VTIMEZONE");
        this.c = new fguv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fgzk c(fgux fguxVar) {
        fguv fguvVar = this.c;
        int size = fguvVar.size();
        fgzk fgzkVar = null;
        fgux fguxVar2 = null;
        for (int i = 0; i < size; i++) {
            fgzk fgzkVar2 = (fgzk) fguvVar.get(i);
            fgux c = fgzkVar2.c(fguxVar);
            if (fguxVar2 == null || (c != null && c.after(fguxVar2))) {
                fgzkVar = fgzkVar2;
                fguxVar2 = c;
            }
        }
        return fgzkVar;
    }

    @Override // defpackage.fgut
    public final boolean equals(Object obj) {
        return obj instanceof fhaj ? super.equals(obj) && fhox.a(this.c, ((fhaj) obj).c) : super.equals(obj);
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

    public fhaj(fgyw fgywVar) {
        super("VTIMEZONE", fgywVar);
        this.c = new fguv();
    }
}

package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzr extends fgzi {
    private static final long serialVersionUID = -3001603309266267258L;
    public final fguv c;

    public fgzr() {
        super("VAVAILABILITY");
        this.c = new fguv();
        this.b.add(new fhcn());
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

    public fgzr(fgyw fgywVar) {
        super("VAVAILABILITY", fgywVar);
        this.c = new fguv();
    }
}

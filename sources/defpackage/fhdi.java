package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdi extends fgwo implements fgve {
    private static final long serialVersionUID = -2433059917714523286L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdi() {
        super(VCardConstants.PROPERTY_PRODID);
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c;
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = str;
    }
}

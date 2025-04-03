package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdc extends fgwo implements fgve {
    private static final long serialVersionUID = -6930099834219160086L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdc() {
        super(VCardConstants.PROPERTY_NAME);
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

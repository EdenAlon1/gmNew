package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcb extends fgwo {
    private static final long serialVersionUID = -7769987073466681634L;
    private fgyy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcb() {
        super(VCardConstants.PROPERTY_CATEGORIES);
        fgyu fgyuVar = fgyu.a;
        this.c = new fgyy();
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgyy(str);
    }
}

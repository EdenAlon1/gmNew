package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbg extends fgvi {
    private static final long serialVersionUID = 287348849443687499L;
    private final fgul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbg(String str) {
        super(VCardConstants.PROPERTY_MEMBER);
        fgul fgulVar = new fgul(fhev.e(str));
        int i = fgwj.a;
        this.b = fgulVar;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.fgvi
    protected final boolean b() {
        return false;
    }
}

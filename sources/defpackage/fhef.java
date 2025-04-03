package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhef extends fgwo implements fgve {
    private static final long serialVersionUID = -7139407612536588584L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhef() {
        super(VCardConstants.PROPERTY_UID);
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

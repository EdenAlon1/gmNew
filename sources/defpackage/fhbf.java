package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbf extends fgvi {
    private static final long serialVersionUID = 4864176270266226608L;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbf(String str) {
        super(VCardConstants.PARAM_LANGUAGE);
        int i = fgwj.a;
        this.b = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.b;
    }
}

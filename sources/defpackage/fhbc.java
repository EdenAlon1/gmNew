package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbc extends fgvi {
    public static final fhbc b;
    public static final fhbc c;
    public static final fhbc d;
    private static final long serialVersionUID = 7536336461076399077L;
    private final String e;

    static {
        new fhbc(VCardConstants.PARAM_ENCODING_7BIT);
        b = new fhbc(VCardConstants.PARAM_ENCODING_8BIT);
        new fhbc("BINARY");
        c = new fhbc(VCardConstants.PARAM_ENCODING_QP);
        d = new fhbc(VCardConstants.PARAM_ENCODING_BASE64);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbc(String str) {
        super(VCardConstants.PARAM_ENCODING);
        int i = fgwj.a;
        this.e = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.e;
    }
}

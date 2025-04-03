package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbs extends fgvi {
    public static final fhbs b = new fhbs("BINARY");
    public static final fhbs c = new fhbs("BOOLEAN");
    public static final fhbs d = new fhbs("CAL-ADDRESS");
    public static final fhbs e = new fhbs("DATE");
    public static final fhbs f = new fhbs("DATE-TIME");
    public static final fhbs g = new fhbs("DURATION");
    public static final fhbs h = new fhbs("FLOAT");
    public static final fhbs i = new fhbs("INTEGER");
    public static final fhbs j = new fhbs("PERIOD");
    public static final fhbs k = new fhbs("RECUR");
    public static final fhbs l = new fhbs("TEXT");
    public static final fhbs m = new fhbs("TIME");
    public static final fhbs n = new fhbs("URI");
    public static final fhbs o = new fhbs("UTC-OFFSET");
    private static final long serialVersionUID = -7238642734500301768L;
    private final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbs(String str) {
        super(VCardConstants.PARAM_VALUE);
        int i2 = fgwj.a;
        this.p = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.p;
    }
}

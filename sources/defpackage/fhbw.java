package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhbw extends fgwo {
    public static final fhbw c = new fhbv("AUDIO");
    public static final fhbw d = new fhbv("DISPLAY");
    public static final fhbw e = new fhbv(VCardConstants.PROPERTY_EMAIL);
    public static final fhbw f = new fhbv("PROCEDURE");
    private static final long serialVersionUID = -2353353838411753712L;
    private String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbw() {
        super("ACTION");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.g;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbw(fgwl fgwlVar, String str) {
        super("ACTION", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.g = str;
    }
}

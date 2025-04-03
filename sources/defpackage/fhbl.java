package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbl extends fgvi {
    public static final fhbl b = new fhbl("CHAIR");
    public static final fhbl c = new fhbl("REQ-PARTICIPANT");
    public static final fhbl d = new fhbl("OPT-PARTICIPANT");
    public static final fhbl e = new fhbl("NON-PARTICIPANT");
    private static final long serialVersionUID = 1438225631470825963L;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbl(String str) {
        super(VCardConstants.PROPERTY_ROLE);
        int i = fgwj.a;
        this.f = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.f;
    }
}

package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbk extends fgvi {
    public static final fhbk b = new fhbk("START");
    public static final fhbk c = new fhbk(VCardConstants.PROPERTY_END);
    private static final long serialVersionUID = 1570525804115869565L;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbk(String str) {
        super(VCardConstants.PROPERTY_RELATED);
        int i = fgwj.a;
        String e = fhev.e(str);
        this.d = e;
        if ("START".equals(e) || VCardConstants.PROPERTY_END.equals(e)) {
            return;
        }
        throw new IllegalArgumentException("Invalid value [" + e + "]");
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.d;
    }
}

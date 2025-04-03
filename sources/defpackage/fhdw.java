package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdw extends fgwo implements fgve {
    private static final long serialVersionUID = 3159826142152932485L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdw() {
        super(VCardConstants.PROPERTY_TEL);
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

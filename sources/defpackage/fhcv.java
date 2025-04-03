package defpackage;

import com.android.vcard.VCardConstants;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcv extends fgwo {
    private static final long serialVersionUID = -902100715801867636L;
    private BigDecimal c;
    private BigDecimal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcv() {
        super(VCardConstants.PROPERTY_GEO);
        fgyu fgyuVar = fgyu.a;
        this.c = BigDecimal.valueOf(0L);
        this.d = BigDecimal.valueOf(0L);
    }

    @Override // defpackage.fguw
    public final String a() {
        return String.valueOf(this.c) + ";" + String.valueOf(this.d);
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        String substring = str.substring(0, str.indexOf(59));
        if (fhoy.a(substring)) {
            this.c = new BigDecimal(substring);
        } else {
            this.c = BigDecimal.valueOf(0L);
        }
        String substring2 = str.substring(str.indexOf(59) + 1);
        if (fhoy.a(substring2)) {
            this.d = new BigDecimal(substring2);
        } else {
            this.d = BigDecimal.valueOf(0L);
        }
    }
}

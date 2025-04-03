package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aitq implements aeev {
    private final aitz a;
    private final aitt b;
    private final aitp c;
    private final aiuv d;
    private final Context e;

    public aitq(aitz aitzVar, aitt aittVar, aitp aitpVar, aiuv aiuvVar, Context context) {
        this.a = aitzVar;
        this.b = aittVar;
        this.c = aitpVar;
        this.d = aiuvVar;
        this.e = context;
    }

    @Override // defpackage.aeev
    public final elfl a() {
        aeey l = aefb.l();
        aees aeesVar = (aees) l;
        aeesVar.a = "otp_deletion_banner";
        l.c(R.drawable.quantum_gm_ic_auto_delete_black_24);
        aeesVar.b = this.e.getString(R.string.otp_auto_deletion_promo_banner_title_text);
        l.e(this.e.getString(R.string.otp_auto_deletion_promo_banner_negative_button_text));
        aeesVar.d = this.e.getString(R.string.otp_auto_deletion_promo_banner_positive_button_text);
        aeesVar.e = this.c;
        aeesVar.f = this.b;
        l.d(this.d);
        return elfo.e(l.a());
    }

    @Override // defpackage.aeev
    public final elfl b() {
        return this.a.b();
    }

    @Override // defpackage.aeev
    public final /* synthetic */ Set c() {
        return new enpx(cgix.HOME);
    }

    @Override // defpackage.aeev
    public final int d() {
        return 6;
    }
}

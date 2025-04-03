package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szc implements szn {
    public final ffsk a;
    public final ffhd b;
    public final aigz c;
    public final ffbr d;
    public final sxq e;
    private final Context f;

    public szc(Context context, ffsk ffskVar, ffhd ffhdVar, aigz aigzVar, ffbr ffbrVar, sxq sxqVar) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        sxqVar.getClass();
        this.f = context;
        this.a = ffskVar;
        this.b = ffhdVar;
        this.c = aigzVar;
        this.d = ffbrVar;
        this.e = sxqVar;
    }

    @Override // defpackage.szn
    public final dmvt a(ajiy ajiyVar, final tad tadVar) {
        String a = crmi.a(this.f);
        String string = this.f.getString(R.string.report_group_spam_body_2024_05_10, a);
        string.getClass();
        Object e = szx.b.e();
        e.getClass();
        a.getClass();
        dltp dltpVar = new dltp((String) e, ffpc.Q(string, a, 0, false, 6), ffpc.Q(string, a, 0, false, 6) + a.length(), new ffji() { // from class: syx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Object e2 = szx.c.e();
                e2.getClass();
                szc.this.c.h(new aikx((String) e2, null, 2));
                return true;
            }
        }, 24);
        String string2 = this.f.getString(R.string.spam_dialog_title_2024_05_10);
        List b = ffdx.b(dltpVar);
        String string3 = this.f.getString(R.string.block_spam_dialog_positive_button_label);
        string3.getClass();
        doas doasVar = new doas(string3, new ffix() { // from class: syw
            @Override // defpackage.ffix
            public final Object invoke() {
                szc szcVar = szc.this;
                axol.k(szcVar.a, null, new sza(szcVar, tadVar, null), 3);
                return ffcu.a;
            }
        });
        String string4 = this.f.getString(android.R.string.cancel);
        string4.getClass();
        return new dmve(string, b, null, string2, false, false, doasVar, new doas(string4, new ffix() { // from class: syy
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, 308);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szm implements szn {
    public final ffsk a;
    public final ffhd b;
    public final aigz c;
    public final ffbr d;
    public dnem e;
    public dmvi f;
    public final sxq g;
    private final Context h;
    private final String i;
    private final String j;
    private final dltp k;
    private final String l;

    public szm(Context context, ffsk ffskVar, ffhd ffhdVar, aigz aigzVar, ffbr ffbrVar, sxq sxqVar) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        sxqVar.getClass();
        this.h = context;
        this.a = ffskVar;
        this.b = ffhdVar;
        this.c = aigzVar;
        this.d = ffbrVar;
        this.g = sxqVar;
        String a = crmi.a(context);
        a.getClass();
        this.i = a;
        String string = context.getString(R.string.spam_dialog_body_2024_05_10, a);
        string.getClass();
        this.j = string;
        Object e = szx.f.e();
        e.getClass();
        dltp dltpVar = new dltp((String) e, ffpc.Q(string, a, 0, false, 6), ffpc.Q(string, a, 0, false, 6) + a.length(), new ffji() { // from class: szh
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Object e2 = szx.g.e();
                e2.getClass();
                szm.this.c.h(new aikx((String) e2, null, 2));
                return true;
            }
        }, 24);
        this.k = dltpVar;
        String string2 = context.getString(R.string.block_spam_dialog_positive_button_label);
        string2.getClass();
        this.l = string2;
        this.e = new dnem("", context.getString(R.string.spam_dialog_block_checkbox_body), null, false, false, null, null, 0, 252);
        String string3 = context.getString(R.string.spam_dialog_title_2024_05_10);
        string3.getClass();
        this.f = new dmvi(string3, ffel.a, string, ffdx.b(dltpVar), null, null, null, 112);
    }

    @Override // defpackage.szn
    public final dmvt a(final ajiy ajiyVar, final tad tadVar) {
        ResolvedRecipient resolvedRecipient = tadVar.a;
        if (resolvedRecipient == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dnem dnemVar = this.e;
        String string = this.h.getString(R.string.spam_dialog_block_checkbox_title, resolvedRecipient.g().H(true).toString());
        string.getClass();
        this.e = dnem.a(dnemVar, string, null, null, false, new ffix() { // from class: sze
            @Override // defpackage.ffix
            public final Object invoke() {
                szm szmVar = szm.this;
                szmVar.e = dnem.a(szmVar.e, null, null, null, !r1.d, null, null, 247);
                dmvi dmviVar = szmVar.f;
                tad tadVar2 = tadVar;
                ResolvedRecipient resolvedRecipient2 = tadVar2.a;
                resolvedRecipient2.getClass();
                List c = szmVar.c(resolvedRecipient2.z());
                ajiy ajiyVar2 = ajiyVar;
                szmVar.f = dmvi.b(dmviVar, null, c, null, szmVar.b(ajiyVar2, tadVar2), null, null, 109);
                ajiyVar2.b(szmVar.f);
                return ffcu.a;
            }
        }, null, 222);
        dmvi dmviVar = this.f;
        ResolvedRecipient resolvedRecipient2 = tadVar.a;
        resolvedRecipient2.getClass();
        List c = c(resolvedRecipient2.z());
        doas b = b(ajiyVar, tadVar);
        String string2 = this.h.getString(android.R.string.cancel);
        string2.getClass();
        dmvi b2 = dmvi.b(dmviVar, null, c, null, b, new doas(string2, new ffix() { // from class: szf
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }), new ffix() { // from class: szg
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }, 13);
        this.f = b2;
        return b2;
    }

    public final doas b(final ajiy ajiyVar, final tad tadVar) {
        return new doas(this.l, new ffix() { // from class: szd
            @Override // defpackage.ffix
            public final Object invoke() {
                szm szmVar = szm.this;
                axol.k(szmVar.a, null, new szk(szmVar, tadVar, ajiyVar, null), 3);
                return ffcu.a;
            }
        });
    }

    public final List c(boolean z) {
        return z ? ffel.a : ffdx.b(this.e);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syv implements szn {
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

    public syv(Context context, ffsk ffskVar, ffhd ffhdVar, aigz aigzVar, ffbr ffbrVar, sxq sxqVar) {
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
        this.i = crmi.a(context);
        String string = context.getString(R.string.action_report_spam);
        string.getClass();
        this.j = string;
        this.e = new dnem(string, "", ffel.a, false, false, null, null, 0, 248);
        this.f = new dmvi("", ffel.a, null, null, null, null, null, 124);
    }

    @Override // defpackage.szn
    public final dmvt a(final ajiy ajiyVar, final tad tadVar) {
        String string;
        String string2;
        String string3;
        if (tadVar.a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = tadVar.c;
        int i2 = i - 1;
        if (i2 == 0) {
            string = this.h.getString(R.string.report_spam_checkbox_body_2024_05_10, this.i);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tal.a(i)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string = this.h.getString(R.string.rbm_report_spam_checkbox_body, this.i);
        }
        String str = string;
        str.getClass();
        dnem dnemVar = this.e;
        Object e = szx.f.e();
        e.getClass();
        String str2 = this.i;
        str2.getClass();
        int Q = ffpc.Q(str, str2, 0, false, 6);
        str2.getClass();
        List b = ffdx.b(new dltp((String) e, Q, ffpc.Q(str, str2, 0, false, 6) + this.i.length(), new ffji() { // from class: sym
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Object e2 = szx.g.e();
                e2.getClass();
                syv.this.c.h(new aikx((String) e2, null, 2));
                return true;
            }
        }, 24));
        Object e2 = szx.e.e();
        e2.getClass();
        this.e = dnem.a(dnemVar, null, str, b, ((Boolean) e2).booleanValue(), new ffix() { // from class: syo
            @Override // defpackage.ffix
            public final Object invoke() {
                syv syvVar = syv.this;
                syvVar.e = dnem.a(syvVar.e, null, null, null, !r1.d, null, null, 247);
                dmvi dmviVar = syvVar.f;
                ResolvedRecipient resolvedRecipient = tadVar.a;
                resolvedRecipient.getClass();
                syvVar.f = dmvi.b(dmviVar, null, syvVar.b(resolvedRecipient.H().b()), null, null, null, null, 125);
                ajiyVar.b(syvVar.f);
                return ffcu.a;
            }
        }, null, 209);
        dmvi dmviVar = this.f;
        Context context = this.h;
        ResolvedRecipient resolvedRecipient = tadVar.a;
        resolvedRecipient.getClass();
        String string4 = context.getString(R.string.block_dialog_title_2024_05_10, cuxh.b(resolvedRecipient.x(true)));
        string4.getClass();
        int i3 = tadVar.c;
        int i4 = i3 - 1;
        if (i4 == 0) {
            string2 = this.h.getString(R.string.block_dialog_body_2024_05_10);
        } else {
            if (i4 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tal.a(i3)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string2 = this.h.getString(R.string.rbm_block_dialog_body);
        }
        String str3 = string2;
        str3.getClass();
        int i5 = tadVar.c;
        int i6 = i5 - 1;
        if (i6 == 0) {
            string3 = this.h.getString(R.string.block_spam_dialog_positive_button_label);
        } else {
            if (i6 != 3) {
                throw new IllegalStateException("Unexpected dialog type (" + ((Object) tal.a(i5)) + ") in BlockAndReportDialog2BlockUiAdapter");
            }
            string3 = this.h.getString(R.string.rbm_block_dialog_positive_button_label);
        }
        string3.getClass();
        doas doasVar = new doas(string3, new ffix() { // from class: syn
            @Override // defpackage.ffix
            public final Object invoke() {
                syv syvVar = syv.this;
                axol.k(syvVar.a, null, new syt(syvVar, tadVar, ajiyVar, null), 3);
                return ffcu.a;
            }
        });
        String string5 = this.h.getString(android.R.string.cancel);
        string5.getClass();
        doas doasVar2 = new doas(string5, new ffix() { // from class: syp
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        });
        ResolvedRecipient resolvedRecipient2 = tadVar.a;
        resolvedRecipient2.getClass();
        dmvi b2 = dmvi.b(dmviVar, string4, b(resolvedRecipient2.H().b()), str3, doasVar, doasVar2, new ffix() { // from class: syq
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }, 8);
        this.f = b2;
        return b2;
    }

    public final List b(boolean z) {
        return z ? ffel.a : ffdx.b(this.e);
    }
}

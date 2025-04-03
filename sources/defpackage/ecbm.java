package defpackage;

import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbm {
    public final ecba a;
    public final ecbl b = new ecbl(this);
    public final PopupWindow.OnDismissListener c;
    public TooltipView d;

    public ecbm(ecba ecbaVar, ecbn ecbnVar, PopupWindow.OnDismissListener onDismissListener) {
        this.a = ecbaVar;
        this.c = onDismissListener;
        ecbc ecbcVar = (ecbc) ecbnVar;
        TooltipView tooltipView = new TooltipView(ecbcVar.c, ecbaVar, ecbcVar.e);
        this.d = tooltipView;
        tooltipView.c(((Integer) ((emxn) ecbcVar.a).a).intValue());
        TooltipView tooltipView2 = this.d;
        emxc emxcVar = ecbcVar.b;
        ecbo ecboVar = tooltipView2.i;
        if (emxcVar.g()) {
            ecboVar.b = true;
            ecboVar.a.setColor(((Integer) emxcVar.c()).intValue());
        }
    }

    final void a() {
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.a).c;
        ecbl ecblVar = this.b;
        accountParticleDisc.removeOnAttachStateChangeListener(ecblVar);
        ebot.a(accountParticleDisc, ecblVar);
        TooltipView tooltipView = this.d;
        if (tooltipView == null || !tooltipView.isShown()) {
            return;
        }
        TooltipView tooltipView2 = this.d;
        tooltipView2.c.dismiss();
        tooltipView2.b.removeView(tooltipView2.i);
        this.d = null;
    }
}

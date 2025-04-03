package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbt extends AnimatorListenerAdapter {
    final /* synthetic */ ecbu a;

    public ecbt(ecbu ecbuVar) {
        this.a = ecbuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        final TooltipView tooltipView = this.a.a;
        ebkg ebkgVar = tooltipView.j;
        if (ebkgVar != null) {
            ecbo ecboVar = tooltipView.i;
            final ebkh ebkhVar = ebkgVar.a;
            ebkhVar.e(tooltipView, 105604);
            ebkhVar.e(ecboVar, 90573);
            ecboVar.setOnClickListener(new View.OnClickListener() { // from class: ebkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebkh.this.f(view);
                }
            });
            final ecbi ecbiVar = ebkgVar.d;
            final ecba ecbaVar = ebkgVar.c;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ebkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebkh ebkhVar2 = ebkh.this;
                    if (((ebkb) ebkhVar2.a).e) {
                        ((SelectedAccountDisc) ecbaVar).performClick();
                    }
                    ecbi ecbiVar2 = ecbiVar;
                    ebkhVar2.f(tooltipView);
                    ecbiVar2.a();
                }
            };
            ebko ebkoVar = ebkgVar.b;
            ebkoVar.setOnClickListener(onClickListener);
            ebkoVar.findViewById(R.id.og_tooltip_dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: ebke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebkh.this.f(tooltipView);
                    ecbiVar.a();
                }
            });
        }
    }
}

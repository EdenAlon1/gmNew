package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcpm extends dwdv {
    final /* synthetic */ dcpn a;

    public dcpm(dcpn dcpnVar) {
        this.a = dcpnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        dcpn dcpnVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(dcpnVar.b, false);
        this.a.a();
    }
}

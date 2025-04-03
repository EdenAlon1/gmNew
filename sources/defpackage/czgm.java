package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgm extends czgv {
    private Animator a;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.emoji_empty_fragment, viewGroup, false);
    }

    @Override // defpackage.ea
    public final void j() {
        super.j();
        Animator animator = this.a;
        if (animator != null) {
            animator.removeAllListeners();
            this.a.end();
            this.a = null;
        }
    }

    @Override // defpackage.ea
    public final Animator y(int i, boolean z, int i2) {
        if (z) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(G(), android.R.animator.fade_in);
            this.a = loadAnimator;
            loadAnimator.setDuration(G().getResources().getInteger(R.integer.emoji_gallery_animation_time_millis));
            this.a.addListener(new czgl(this));
        } else {
            this.a = null;
        }
        return this.a;
    }
}

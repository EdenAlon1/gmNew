package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgt extends ehgf {
    final /* synthetic */ ExtendedFloatingActionButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehgt(ExtendedFloatingActionButton extendedFloatingActionButton, ehgd ehgdVar) {
        super(extendedFloatingActionButton, ehgdVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void f() {
        super.f();
        this.c.o = 0;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void g(Animator animator) {
        super.g(animator);
        this.c.setVisibility(0);
        this.c.o = 2;
    }

    @Override // defpackage.ehhj
    public final int h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.ehhj
    public final void i() {
        this.c.setVisibility(0);
        this.c.setAlpha(1.0f);
        this.c.setScaleY(1.0f);
        this.c.setScaleX(1.0f);
    }

    @Override // defpackage.ehhj
    public final boolean j() {
        return this.c.s();
    }

    @Override // defpackage.ehhj
    public final void k() {
    }
}

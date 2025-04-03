package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgs extends ehgf {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehgs(ExtendedFloatingActionButton extendedFloatingActionButton, ehgd ehgdVar) {
        super(extendedFloatingActionButton, ehgdVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void e() {
        super.e();
        this.d = true;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.o = 0;
        if (this.d) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void g(Animator animator) {
        super.g(animator);
        this.d = false;
        this.c.setVisibility(0);
        this.c.o = 1;
    }

    @Override // defpackage.ehhj
    public final int h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.ehhj
    public final void i() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.ehhj
    public final boolean j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.o;
        return visibility == 0 ? i == 1 : i != 2;
    }

    @Override // defpackage.ehhj
    public final void k() {
    }
}

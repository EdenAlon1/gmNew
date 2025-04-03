package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uw extends uy {
    public uw(vx vxVar) {
        super(vxVar);
    }

    @Override // defpackage.uy
    public final int a(View view) {
        return vx.bJ(view) + ((vy) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.uy
    public final int b(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        return vx.bt(view) + vyVar.leftMargin + vyVar.rightMargin;
    }

    @Override // defpackage.uy
    public final int c(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        return vx.bs(view) + vyVar.topMargin + vyVar.bottomMargin;
    }

    @Override // defpackage.uy
    public final int d(View view) {
        return vx.bI(view) - ((vy) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.uy
    public final int e() {
        return this.a.H;
    }

    @Override // defpackage.uy
    public final int f() {
        vx vxVar = this.a;
        return vxVar.H - vxVar.aC();
    }

    @Override // defpackage.uy
    public final int g() {
        return this.a.aC();
    }

    @Override // defpackage.uy
    public final int h() {
        return this.a.F;
    }

    @Override // defpackage.uy
    public final int i() {
        return this.a.G;
    }

    @Override // defpackage.uy
    public final int j() {
        return this.a.aB();
    }

    @Override // defpackage.uy
    public final int k() {
        vx vxVar = this.a;
        return (vxVar.H - vxVar.aB()) - this.a.aC();
    }

    @Override // defpackage.uy
    public final int l(View view) {
        this.a.by(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.uy
    public final int m(View view) {
        this.a.by(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.uy
    public final void n(int i) {
        this.a.aT(i);
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ux extends uy {
    public ux(vx vxVar) {
        super(vxVar);
    }

    @Override // defpackage.uy
    public final int a(View view) {
        return vx.bH(view) + ((vy) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.uy
    public final int b(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        return vx.bs(view) + vyVar.topMargin + vyVar.bottomMargin;
    }

    @Override // defpackage.uy
    public final int c(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        return vx.bt(view) + vyVar.leftMargin + vyVar.rightMargin;
    }

    @Override // defpackage.uy
    public final int d(View view) {
        return vx.bK(view) - ((vy) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.uy
    public final int e() {
        return this.a.I;
    }

    @Override // defpackage.uy
    public final int f() {
        vx vxVar = this.a;
        return vxVar.I - vxVar.az();
    }

    @Override // defpackage.uy
    public final int g() {
        return this.a.az();
    }

    @Override // defpackage.uy
    public final int h() {
        return this.a.G;
    }

    @Override // defpackage.uy
    public final int i() {
        return this.a.F;
    }

    @Override // defpackage.uy
    public final int j() {
        return this.a.aE();
    }

    @Override // defpackage.uy
    public final int k() {
        vx vxVar = this.a;
        return (vxVar.I - vxVar.aE()) - this.a.az();
    }

    @Override // defpackage.uy
    public final int l(View view) {
        this.a.by(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.uy
    public final int m(View view) {
        this.a.by(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.uy
    public final void n(int i) {
        this.a.aU(i);
    }
}

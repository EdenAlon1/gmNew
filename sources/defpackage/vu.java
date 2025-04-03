package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vu implements zk {
    final /* synthetic */ vx a;

    public vu(vx vxVar) {
        this.a = vxVar;
    }

    @Override // defpackage.zk
    public final int a(View view) {
        return vx.bJ(view) + ((vy) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.zk
    public final int b(View view) {
        return vx.bI(view) - ((vy) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.zk
    public final int c() {
        vx vxVar = this.a;
        return vxVar.H - vxVar.aC();
    }

    @Override // defpackage.zk
    public final int d() {
        return this.a.aB();
    }

    @Override // defpackage.zk
    public final View e(int i) {
        return this.a.aH(i);
    }
}

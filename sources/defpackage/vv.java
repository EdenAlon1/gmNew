package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vv implements zk {
    final /* synthetic */ vx a;

    public vv(vx vxVar) {
        this.a = vxVar;
    }

    @Override // defpackage.zk
    public final int a(View view) {
        return vx.bH(view) + ((vy) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.zk
    public final int b(View view) {
        return vx.bK(view) - ((vy) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.zk
    public final int c() {
        vx vxVar = this.a;
        return vxVar.I - vxVar.az();
    }

    @Override // defpackage.zk
    public final int d() {
        return this.a.aE();
    }

    @Override // defpackage.zk
    public final View e(int i) {
        return this.a.aH(i);
    }
}

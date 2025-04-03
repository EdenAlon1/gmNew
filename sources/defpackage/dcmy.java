package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcmy extends cxpz {
    final /* synthetic */ dcnd b;

    public dcmy(dcnd dcndVar) {
        this.b = dcndVar;
    }

    @Override // defpackage.cxpz
    public final void a() {
        if (this.b.j != dcnb.VIDEO) {
            this.b.d();
        } else if (this.b.i()) {
            this.b.c();
        } else {
            this.b.b();
        }
    }

    @Override // defpackage.cxpz
    public final void b() {
        if (this.b.j == dcnb.VIDEO && this.b.i()) {
            this.b.c();
        }
    }

    @Override // defpackage.cxpz, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        if (this.b.j == dcnb.VIDEO) {
            this.b.w.performHapticFeedback(0);
        }
        dcnd dcndVar = this.b;
        if (dcndVar.j == dcnb.PHOTO) {
            dcndVar.k(dcnb.VIDEO, 5);
        }
        this.b.b();
        this.b.D.setPressed(false);
    }
}

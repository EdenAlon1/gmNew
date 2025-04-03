package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqp implements wb {
    final /* synthetic */ oqr a;

    public oqp(oqr oqrVar) {
        this.a = oqrVar;
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 3) {
            return false;
        }
        this.a.b();
        return false;
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}

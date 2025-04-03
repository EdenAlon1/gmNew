package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ops implements wb, oqs {
    public boolean a;

    @Override // defpackage.wb
    public final void c(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    @Override // defpackage.oqs
    public final void g() {
        this.a = false;
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (oqg.d(motionEvent) && this.a) {
            this.a = false;
            return true;
        }
        if (oqg.b(motionEvent) && this.a) {
            g();
        }
        return false;
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return this.a;
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}

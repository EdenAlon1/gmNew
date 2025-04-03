package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opr implements wb, oqs {
    private final wb a;
    private boolean b;

    public opr(wb wbVar) {
        this.a = wbVar;
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
        this.b = true;
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.j(recyclerView, motionEvent);
    }

    @Override // defpackage.oqs
    public final void g() {
        this.b = false;
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && oqg.b(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.j(recyclerView, motionEvent);
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return this.b;
    }
}

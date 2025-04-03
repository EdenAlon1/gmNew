package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opv implements wb, oqs {
    private final org a = new org(new orf());
    private boolean b;

    public final void a(orh orhVar, wb wbVar) {
        ksw.a(wbVar != null);
        this.a.b(orhVar, wbVar);
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
        if (z) {
            this.b = true;
        }
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            return;
        }
        ((wb) this.a.a(motionEvent)).d(recyclerView, motionEvent);
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
        return !this.b && ((wb) this.a.a(motionEvent)).j(recyclerView, motionEvent);
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return this.b;
    }
}

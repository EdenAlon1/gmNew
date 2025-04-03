package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqm implements wb {
    private final oqe a;

    public oqm(oqe oqeVar, oqx oqxVar) {
        ksw.a(true);
        ksw.a(oqxVar != null);
        this.a = oqeVar;
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (oqg.g(motionEvent) && oqg.c(motionEvent)) {
            oqe oqeVar = this.a;
            if (oqeVar.b(motionEvent)) {
                oqeVar.a(motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}

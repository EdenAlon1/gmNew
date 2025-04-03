package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeim extends oqe {
    private final RecyclerView a;
    private final aehw b;

    public aeim(RecyclerView recyclerView, aehw aehwVar) {
        this.a = recyclerView;
        this.b = aehwVar;
    }

    @Override // defpackage.oqe
    public final oqd a(MotionEvent motionEvent) {
        View n = this.a.n(motionEvent.getX(), motionEvent.getY());
        if (n == null) {
            return null;
        }
        wr k = this.a.k(n);
        if (!(k instanceof aehv)) {
            return null;
        }
        aely I = this.b.I(k.fr());
        if (I == null) {
            return null;
        }
        return new aeil(k.gz(), I.k().w().a());
    }
}

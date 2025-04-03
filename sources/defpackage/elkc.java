package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elkc implements elcg, ejzt {
    private final ArrayDeque a = new ArrayDeque(20);

    @Override // defpackage.elcg
    public final void b(eldq eldqVar, SparseArray sparseArray) {
        synchronized (this.a) {
            if (this.a.size() == 20) {
                this.a.removeFirst();
            }
            this.a.addLast(eldqVar);
        }
    }
}

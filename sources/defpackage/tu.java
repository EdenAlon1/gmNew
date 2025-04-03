package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tu implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new tr();
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final wr b(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            wr l = RecyclerView.l(recyclerView.h.e(i2));
            if (l.c == i && !l.t()) {
                return null;
            }
        }
        wf wfVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (kra.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.Y(false);
                Trace.endSection();
            }
        }
        recyclerView.W();
        wr q = wfVar.q(i, j);
        if (q != null) {
            if (!q.s() || q.t()) {
                wfVar.d(q, false);
            } else {
                wfVar.l(q.a);
            }
        }
        return q;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = RecyclerView.aI();
            recyclerView.post(this);
        }
        ts tsVar = recyclerView.N;
        tsVar.a = i;
        tsVar.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.run():void");
    }
}

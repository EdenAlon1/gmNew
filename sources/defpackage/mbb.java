package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbb implements mbh {
    public final lqg a;
    public final mbj b;
    private final mdt c;
    private final Queue d = new ArrayDeque();
    private int e;

    public mbb(lqg lqgVar, mbj mbjVar, mdt mdtVar) {
        this.a = lqgVar;
        this.b = mbjVar;
        this.c = mdtVar;
    }

    @Override // defpackage.mbh
    public final synchronized void c() {
        final Pair pair = (Pair) this.d.poll();
        if (pair == null) {
            this.e++;
            return;
        }
        this.c.d(new mds() { // from class: mba
            @Override // defpackage.mds
            public final void a() {
                Pair pair2 = pair;
                lqh lqhVar = (lqh) pair2.first;
                long longValue = ((Long) pair2.second).longValue();
                mbb mbbVar = mbb.this;
                mbbVar.b.d(mbbVar.a, lqhVar, longValue);
            }
        });
        Pair pair2 = (Pair) this.d.peek();
        if (pair2 == null || ((Long) pair2.second).longValue() != Long.MIN_VALUE) {
            return;
        }
        mdt mdtVar = this.c;
        mbj mbjVar = this.b;
        mbjVar.getClass();
        mdtVar.d(new may(mbjVar));
        this.d.remove();
    }

    public final synchronized int d() {
        return this.d.size();
    }

    public final synchronized void e(final lqh lqhVar, final long j) {
        if (this.e <= 0) {
            this.d.add(Pair.create(lqhVar, Long.valueOf(j)));
        } else {
            this.c.d(new mds() { // from class: maz
                @Override // defpackage.mds
                public final void a() {
                    mbb mbbVar = mbb.this;
                    mbbVar.b.d(mbbVar.a, lqhVar, j);
                }
            });
            this.e--;
        }
    }

    public final synchronized void f() {
        if (!this.d.isEmpty()) {
            this.d.add(Pair.create(lqh.a, Long.MIN_VALUE));
            return;
        }
        mdt mdtVar = this.c;
        mbj mbjVar = this.b;
        mbjVar.getClass();
        mdtVar.d(new may(mbjVar));
    }

    @Override // defpackage.mbh
    public final synchronized void w() {
        this.e = 0;
        this.d.clear();
    }

    @Override // defpackage.mbh
    public final /* synthetic */ void b(lqh lqhVar) {
    }
}

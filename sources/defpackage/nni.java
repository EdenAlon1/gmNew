package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nni {
    public final byte[] c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    private final ndu n;
    public final boolean a = false;
    public final boolean b = false;
    private final SparseArray o = new SparseArray();
    private final SparseArray p = new SparseArray();
    public final nnh h = new nnh();

    public nni(ndu nduVar) {
        this.n = nduVar;
        byte[] bArr = new byte[128];
        this.c = bArr;
        new lwb(bArr, 0, 0);
        d();
    }

    public final void a(int i) {
        long j = this.k;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.l;
        long j2 = this.e - this.j;
        this.n.o(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void b(lvy lvyVar) {
        this.p.append(lvyVar.a, lvyVar);
    }

    public final void c(lvz lvzVar) {
        this.o.append(lvzVar.d, lvzVar);
    }

    public final void d() {
        this.f = false;
        this.i = false;
    }

    public final void e() {
        boolean z = this.m;
        boolean z2 = this.l;
        int i = this.d;
        boolean z3 = true;
        if (i != 5 && (!z || i != 1)) {
            z3 = false;
        }
        this.l = z2 | z3;
    }
}

package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noj implements nco {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public ncr e;
    public int f;
    public boolean g;
    public int h;
    public final nmy i;
    private final int j;
    private final luv k;
    private final SparseIntArray l;
    private final nkh m;
    private final nog n;
    private nof o;
    private boolean p;
    private boolean q;
    private int r;

    @Deprecated
    public noj() {
        this(1, nkh.a, new lvc(0L), new nmy((byte[]) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0276, code lost:
    
        if (r1 == false) goto L154;
     */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r22, defpackage.ndk r23) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noj.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        if (this.j == 0) {
            ncrVar = new nkk(ncrVar, this.m);
        }
        this.e = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        nof nofVar;
        lti.c(true);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            lvc lvcVar = (lvc) this.a.get(i);
            if (lvcVar.f() != -9223372036854775807L) {
                long d = lvcVar.d();
                if (d != -9223372036854775807L) {
                    if (d != 0) {
                        if (d == j2) {
                        }
                    }
                }
            }
            lvcVar.i(j2);
        }
        if (j2 != 0 && (nofVar = this.o) != null) {
            nofVar.b(j2);
        }
        this.k.G(0);
        this.l.clear();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            ((non) this.b.valueAt(i2)).c();
        }
        this.r = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.ncp r7) {
        /*
            r6 = this;
            luv r0 = r6.k
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.i(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.l(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noj.f(ncp):boolean");
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public noj(int i, nkh nkhVar, lvc lvcVar, nmy nmyVar) {
        this.i = nmyVar;
        this.j = i;
        this.m = nkhVar;
        this.a = Collections.singletonList(lvcVar);
        this.k = new luv(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.l = new SparseIntArray();
        this.n = new nog();
        this.e = ncr.y;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.put(sparseArray2.keyAt(i2), (non) sparseArray2.valueAt(i2));
        }
        this.b.put(0, new nob(new noh(this)));
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}

package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwo extends mwz implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final mws h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[LOOP:1: B:28:0x00f2->B:30:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137 A[EDGE_INSN: B:82:0x0137->B:48:0x0137 BREAK  A[LOOP:3: B:40:0x0119->B:80:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mwo(int r8, defpackage.lrv r9, int r10, defpackage.mws r11, int r12, boolean r13, defpackage.emxg r14) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwo.<init>(int, lrv, int, mws, int, boolean, emxg):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mwo mwoVar) {
        enom c = (this.f && this.i) ? mxd.a : mxd.a.c();
        enem d = enem.b.e(this.i, mwoVar.i).d(Integer.valueOf(this.k), Integer.valueOf(mwoVar.k), enpf.a).b(this.j, mwoVar.j).b(this.l, mwoVar.l).e(this.p, mwoVar.p).e(this.m, mwoVar.m).d(Integer.valueOf(this.n), Integer.valueOf(mwoVar.n), enpf.a).b(this.o, mwoVar.o).e(this.f, mwoVar.f).d(Integer.valueOf(this.t), Integer.valueOf(mwoVar.t), enpf.a);
        boolean z = this.h.B;
        enem d2 = d.e(this.u, mwoVar.u).e(this.v, mwoVar.v).e(this.w, mwoVar.w).d(Integer.valueOf(this.q), Integer.valueOf(mwoVar.q), c).d(Integer.valueOf(this.r), Integer.valueOf(mwoVar.r), c);
        String str = this.g;
        String str2 = mwoVar.g;
        int i = lvf.a;
        if (Objects.equals(str, str2)) {
            d2 = d2.d(Integer.valueOf(this.s), Integer.valueOf(mwoVar.s), c);
        }
        return d2.a();
    }

    @Override // defpackage.mwz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.mwz
    public final /* bridge */ /* synthetic */ boolean c(mwz mwzVar) {
        String str;
        mwo mwoVar = (mwo) mwzVar;
        boolean z = this.h.N;
        lqc lqcVar = this.d;
        int i = lqcVar.E;
        if (i == -1) {
            return false;
        }
        lqc lqcVar2 = mwoVar.d;
        if (i != lqcVar2.E || (str = lqcVar.o) == null || !TextUtils.equals(str, lqcVar2.o)) {
            return false;
        }
        mws mwsVar = this.h;
        boolean z2 = mwsVar.M;
        int i2 = this.d.F;
        if (i2 == -1 || i2 != mwoVar.d.F) {
            return false;
        }
        boolean z3 = mwsVar.O;
        return this.u == mwoVar.u && this.v == mwoVar.v;
    }
}

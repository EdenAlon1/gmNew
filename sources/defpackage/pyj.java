package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyj {
    public static final String a = ppt.d("WorkSpec");
    public static final afd b = new afd() { // from class: pye
        @Override // defpackage.afd
        public final Object a(Object obj) {
            Iterator it;
            ArrayList arrayList;
            pqo pqoVar;
            pqo pqoVar2;
            poj pojVar;
            long j;
            long j2;
            long j3;
            boolean z;
            List list = (List) obj;
            String str = pyj.a;
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pyi pyiVar = (pyi) it2.next();
                pot potVar = !pyiVar.q.isEmpty() ? (pot) pyiVar.q.get(0) : pot.a;
                UUID fromString = UUID.fromString(pyiVar.a);
                fromString.getClass();
                pqp pqpVar = pyiVar.b;
                HashSet hashSet = new HashSet(pyiVar.p);
                pot potVar2 = pyiVar.c;
                int i = pyiVar.h;
                int i2 = pyiVar.m;
                poj pojVar2 = pyiVar.g;
                long j4 = pyiVar.d;
                long j5 = pyiVar.e;
                boolean z2 = j5 == 0;
                if (j5 != 0) {
                    arrayList = arrayList2;
                    it = it2;
                    pqoVar = new pqo(j5, pyiVar.f);
                } else {
                    it = it2;
                    arrayList = arrayList2;
                    pqoVar = null;
                }
                pqp pqpVar2 = pyiVar.b;
                pqp pqpVar3 = pqp.ENQUEUED;
                if (pqpVar2 == pqpVar3) {
                    if (pqpVar2 != pqpVar3 || i <= 0) {
                        j3 = j4;
                        z = false;
                    } else {
                        j3 = j4;
                        z = true;
                    }
                    pqoVar2 = pqoVar;
                    pojVar = pojVar2;
                    long j6 = j3;
                    j2 = pyf.a(z, i, pyiVar.i, pyiVar.j, pyiVar.k, pyiVar.l, !z2, j6, pyiVar.f, j5, pyiVar.n);
                    i = i;
                    j = j6;
                } else {
                    pqoVar2 = pqoVar;
                    pojVar = pojVar2;
                    j = j4;
                    j2 = Long.MAX_VALUE;
                }
                poj pojVar3 = pojVar;
                ArrayList arrayList3 = arrayList;
                arrayList3.add(new pqq(fromString, pqpVar, hashSet, potVar2, potVar, i, i2, pojVar3, j, pqoVar2, j2, pyiVar.o));
                arrayList2 = arrayList3;
                it2 = it;
            }
            return arrayList2;
        }
    };
    public final String c;
    public pqp d;
    public String e;
    public String f;
    public pot g;
    public pot h;
    public long i;
    public long j;
    public long k;
    public poj l;
    public int m;
    public poa n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public pqg t;
    public int u;
    public final int v;
    public long w;
    public int x;
    public final int y;
    public String z;

    public pyj(String str, pqp pqpVar, String str2, String str3, pot potVar, pot potVar2, long j, long j2, long j3, poj pojVar, int i, poa poaVar, long j4, long j5, long j6, long j7, boolean z, pqg pqgVar, int i2, int i3, long j8, int i4, int i5, String str4) {
        str.getClass();
        pqpVar.getClass();
        str2.getClass();
        str3.getClass();
        potVar.getClass();
        potVar2.getClass();
        pojVar.getClass();
        poaVar.getClass();
        pqgVar.getClass();
        this.c = str;
        this.d = pqpVar;
        this.e = str2;
        this.f = str3;
        this.g = potVar;
        this.h = potVar2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = pojVar;
        this.m = i;
        this.n = poaVar;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = z;
        this.t = pqgVar;
        this.u = i2;
        this.v = i3;
        this.w = j8;
        this.x = i4;
        this.y = i5;
        this.z = str4;
    }

    public static /* synthetic */ pyj g(pyj pyjVar, String str, pqp pqpVar, String str2, pot potVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3;
        long j3;
        String str4 = (i5 & 1) != 0 ? pyjVar.c : str;
        pqp pqpVar2 = (i5 & 2) != 0 ? pyjVar.d : pqpVar;
        String str5 = (i5 & 4) != 0 ? pyjVar.e : str2;
        String str6 = (i5 & 8) != 0 ? pyjVar.f : null;
        pot potVar2 = (i5 & 16) != 0 ? pyjVar.g : potVar;
        pot potVar3 = (i5 & 32) != 0 ? pyjVar.h : null;
        long j4 = (i5 & 64) != 0 ? pyjVar.i : 0L;
        long j5 = (i5 & 128) != 0 ? pyjVar.j : 0L;
        if ((i5 & 256) != 0) {
            str3 = str4;
            j3 = pyjVar.k;
        } else {
            str3 = str4;
            j3 = 0;
        }
        poj pojVar = (i5 & 512) != 0 ? pyjVar.l : null;
        int i6 = (i5 & 1024) != 0 ? pyjVar.m : i;
        poa poaVar = (i5 & 2048) != 0 ? pyjVar.n : null;
        long j6 = (i5 & 4096) != 0 ? pyjVar.o : 0L;
        long j7 = (i5 & 8192) != 0 ? pyjVar.p : j;
        long j8 = (i5 & 16384) != 0 ? pyjVar.q : 0L;
        long j9 = (32768 & i5) != 0 ? pyjVar.r : 0L;
        boolean z = (65536 & i5) != 0 ? pyjVar.s : false;
        pqg pqgVar = (131072 & i5) != 0 ? pyjVar.t : null;
        int i7 = (262144 & i5) != 0 ? pyjVar.u : i2;
        int i8 = (524288 & i5) != 0 ? pyjVar.v : i3;
        long j10 = (1048576 & i5) != 0 ? pyjVar.w : j2;
        int i9 = (i5 & 2097152) != 0 ? pyjVar.x : i4;
        int i10 = pyjVar.y;
        String str7 = pyjVar.z;
        str3.getClass();
        pqpVar2.getClass();
        str5.getClass();
        str6.getClass();
        potVar2.getClass();
        potVar3.getClass();
        pojVar.getClass();
        poaVar.getClass();
        pqgVar.getClass();
        return new pyj(str3, pqpVar2, str5, str6, potVar2, potVar3, j4, j5, j3, pojVar, i6, poaVar, j6, j7, j8, j9, z, pqgVar, i7, i8, j10, i9, i10, str7);
    }

    public final long a() {
        return pyf.a(e(), this.m, this.n, this.o, this.p, this.u, f(), this.i, this.k, this.j, this.w);
    }

    public final void b(long j) {
        if (j < 900000) {
            ppt.c();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        c(ffmk.j(j, 900000L), ffmk.j(j, 900000L));
    }

    public final void c(long j, long j2) {
        if (j < 900000) {
            ppt.c();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.j = ffmk.j(j, 900000L);
        if (j2 < 300000) {
            ppt.c();
            Log.w(a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.j) {
            ppt.c();
            Log.w(a, a.s(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.k = ffmk.l(j2, 300000L, this.j);
    }

    public final boolean d() {
        return !ffkj.e(poj.a, this.l);
    }

    public final boolean e() {
        return this.d == pqp.ENQUEUED && this.m > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyj)) {
            return false;
        }
        pyj pyjVar = (pyj) obj;
        return ffkj.e(this.c, pyjVar.c) && this.d == pyjVar.d && ffkj.e(this.e, pyjVar.e) && ffkj.e(this.f, pyjVar.f) && ffkj.e(this.g, pyjVar.g) && ffkj.e(this.h, pyjVar.h) && this.i == pyjVar.i && this.j == pyjVar.j && this.k == pyjVar.k && ffkj.e(this.l, pyjVar.l) && this.m == pyjVar.m && this.n == pyjVar.n && this.o == pyjVar.o && this.p == pyjVar.p && this.q == pyjVar.q && this.r == pyjVar.r && this.s == pyjVar.s && this.t == pyjVar.t && this.u == pyjVar.u && this.v == pyjVar.v && this.w == pyjVar.w && this.x == pyjVar.x && this.y == pyjVar.y && ffkj.e(this.z, pyjVar.z);
    }

    public final boolean f() {
        return this.j != 0;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        int a2 = pyd.a(this.i);
        int a3 = (((((((((((hashCode * 31) + a2) * 31) + pyd.a(this.j)) * 31) + pyd.a(this.k)) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode();
        int a4 = pyd.a(this.o);
        int a5 = pyd.a(this.p);
        int a6 = pyd.a(this.q);
        int a7 = (((((((((((((a3 * 31) + a4) * 31) + a5) * 31) + a6) * 31) + pyd.a(this.r)) * 31) + (true != this.s ? 1237 : 1231)) * 31) + this.t.hashCode()) * 31) + this.u;
        int a8 = (((((a7 * 31) + this.v) * 31) + pyd.a(this.w)) * 31) + this.x;
        String str = this.z;
        return (((a8 * 31) + this.y) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ pyj(java.lang.String r36, defpackage.pqp r37, java.lang.String r38, java.lang.String r39, defpackage.pot r40, defpackage.pot r41, long r42, long r44, long r46, defpackage.poj r48, int r49, defpackage.poa r50, long r51, long r53, long r55, long r57, boolean r59, defpackage.pqg r60, int r61, long r62, int r64, int r65, java.lang.String r66, int r67) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyj.<init>(java.lang.String, pqp, java.lang.String, java.lang.String, pot, pot, long, long, long, poj, int, poa, long, long, long, long, boolean, pqg, int, long, int, int, java.lang.String, int):void");
    }
}

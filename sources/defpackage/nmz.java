package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmz implements nnb {
    private final luv a;
    private final String c;
    private final int d;
    private String f;
    private ndu g;
    private int i;
    private int j;
    private long k;
    private lqc l;
    private int m;
    private int n;
    private int h = 0;
    private long q = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int o = -1;
    private int p = -1;
    private final String e = "video/mp2t";

    public nmz(String str, int i, int i2) {
        this.a = new luv(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void f(ncm ncmVar) {
        int i;
        int i2 = ncmVar.b;
        if (i2 == -2147483647 || (i = ncmVar.c) == -1) {
            return;
        }
        lqc lqcVar = this.l;
        if (lqcVar != null && i == lqcVar.E && i2 == lqcVar.F) {
            String str = ncmVar.a;
            String str2 = lqcVar.o;
            int i3 = lvf.a;
            if (Objects.equals(str, str2)) {
                return;
            }
        }
        lqc lqcVar2 = this.l;
        lqb lqbVar = lqcVar2 == null ? new lqb() : new lqb(lqcVar2);
        lqbVar.a = this.f;
        lqbVar.a(this.e);
        lqbVar.c(ncmVar.a);
        lqbVar.C = ncmVar.c;
        lqbVar.D = ncmVar.b;
        lqbVar.d = this.c;
        lqbVar.f = this.d;
        lqc lqcVar3 = new lqc(lqbVar);
        this.l = lqcVar3;
        this.g.i(lqcVar3);
    }

    private final boolean g(luv luvVar, byte[] bArr, int i) {
        int min = Math.min(luvVar.b(), i - this.i);
        luvVar.F(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04aa  */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r30) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmz.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.f = nomVar.b();
        this.g = ncrVar.p(nomVar.a(), 1);
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.q = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efk implements eig {
    private final ehh a;

    public efk(ehh ehhVar) {
        this.a = ehhVar;
    }

    @Override // defpackage.eig
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.eig
    public final int b() {
        return this.a.d().d();
    }

    @Override // defpackage.eig
    public final int c() {
        return ((egn) ffdx.P(this.a.d().i())).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eig
    public final int d() {
        long j;
        long j2;
        int i = 0;
        if (this.a.d().i().isEmpty()) {
            return 0;
        }
        egf d = this.a.d();
        long j3 = 4294967295L;
        int g = (int) (d.h() == dqs.a ? d.g() & 4294967295L : d.g() >> 32);
        egf d2 = this.a.d();
        dqs h = d2.h();
        dqs dqsVar = dqs.a;
        List i2 = d2.i();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= i2.size()) {
                return ffmk.f(g / ((i4 / i5) + d2.c()), 1);
            }
            boolean z = h != dqsVar ? i : 1;
            int a = egg.a(z, d2, i3);
            if (a == -1) {
                i3++;
            } else {
                int i6 = i;
                while (i3 < i2.size() && egg.a(z, d2, i3) == a) {
                    if (z != 0) {
                        j = j3;
                        j2 = ((egn) i2.get(i3)).i & j;
                    } else {
                        j = j3;
                        j2 = ((egn) i2.get(i3)).i >> 32;
                    }
                    i6 = Math.max(i6, (int) j2);
                    i3++;
                    j3 = j;
                }
                i4 += i6;
                i5++;
                j3 = j3;
                i = 0;
            }
        }
    }

    @Override // defpackage.eig
    public final boolean e() {
        return !this.a.d().i().isEmpty();
    }
}

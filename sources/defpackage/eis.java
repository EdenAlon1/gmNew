package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eis {
    public jzk b;
    public int c;
    public int d;
    public int f;
    public int g;
    public eiq[] a = eix.a;
    public int e = 1;

    public static /* synthetic */ void b(eis eisVar, ejs ejsVar, ffsk ffskVar, iaw iawVar, int i, int i2) {
        long g = ejsVar.g(0);
        eisVar.a(ejsVar, ffskVar, iawVar, i, i2, !ejsVar.m() ? kaa.b(g) : kaa.a(g));
    }

    public final void a(ejs ejsVar, ffsk ffskVar, iaw iawVar, int i, int i2, int i3) {
        for (eiq eiqVar : this.a) {
        }
        this.f = i;
        this.g = i2;
        int length = this.a.length;
        for (int d = ejsVar.d(); d < length; d++) {
            eiq eiqVar2 = this.a[d];
            if (eiqVar2 != null) {
                eiqVar2.d();
            }
        }
        if (this.a.length != ejsVar.d()) {
            Object[] copyOf = Arrays.copyOf(this.a, ejsVar.d());
            copyOf.getClass();
            this.a = (eiq[]) copyOf;
        }
        this.b = new jzk(ejsVar.f());
        this.c = i3;
        this.d = ejsVar.b();
        this.e = ejsVar.e();
        int d2 = ejsVar.d();
        for (int i4 = 0; i4 < d2; i4++) {
            if (eix.a(ejsVar.i(i4)) != null) {
                if (this.a[i4] != null) {
                    throw null;
                }
                this.a[i4] = new eiq(ffskVar, iawVar);
                throw null;
            }
            eiq eiqVar3 = this.a[i4];
            if (eiqVar3 != null) {
                eiqVar3.d();
            }
            this.a[i4] = null;
        }
    }
}

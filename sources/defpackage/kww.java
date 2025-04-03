package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kww {
    private final kxh a;
    kpt[] b;

    public kww(kxh kxhVar) {
        this.a = kxhVar;
    }

    public kxh a() {
        h();
        return this.a;
    }

    public void g(int i, kpt kptVar) {
        if (this.b == null) {
            this.b = new kpt[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[kxe.a(i2)] = kptVar;
            }
        }
    }

    protected final void h() {
        kpt[] kptVarArr = this.b;
        if (kptVarArr != null) {
            kpt kptVar = kptVarArr[kxe.a(1)];
            kpt kptVar2 = this.b[kxe.a(2)];
            if (kptVar2 == null) {
                kptVar2 = this.a.f(2);
            }
            if (kptVar == null) {
                kptVar = this.a.f(1);
            }
            c(kpt.b(kptVar, kptVar2));
            kpt kptVar3 = this.b[kxe.a(16)];
            if (kptVar3 != null) {
                e(kptVar3);
            }
            kpt kptVar4 = this.b[kxe.a(32)];
            if (kptVar4 != null) {
                d(kptVar4);
            }
            kpt kptVar5 = this.b[kxe.a(64)];
            if (kptVar5 != null) {
                f(kptVar5);
            }
        }
    }

    public kww() {
        this(new kxh());
    }

    public void b(kpt kptVar) {
    }

    public void c(kpt kptVar) {
    }

    public void d(kpt kptVar) {
    }

    public void e(kpt kptVar) {
    }

    public void f(kpt kptVar) {
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fitj extends fitk {
    private final int b;
    private final firl c;

    public fitj(firf firfVar, firl firlVar, firl firlVar2) {
        super(firfVar, firlVar);
        if (!firlVar2.e()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int c = (int) (firlVar2.c() / this.a);
        this.b = c;
        if (c < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = firlVar2;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.fitk, defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.c;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fghl extends fgge implements ffuy {
    public final long b;
    private final ffql c;

    public fghl(long j, fghl fghlVar, int i) {
        super(fghlVar);
        this.b = j;
        this.c = new ffql(i << 16, ffqo.a);
    }

    public abstract int a();

    public abstract void l(int i);

    @Override // defpackage.fgge
    public final boolean r() {
        return this.c.c == a() && !s();
    }

    public final void t() {
        if (this.c.b() == a()) {
            q();
        }
    }

    public final boolean u() {
        return ffql.a.addAndGet(this.c, -65536) == a() && !s();
    }

    public final boolean v() {
        ffql ffqlVar;
        int i;
        do {
            ffqlVar = this.c;
            i = ffqlVar.c;
            if (i == a() && !s()) {
                return false;
            }
        } while (!ffqlVar.c(i, 65536 + i));
        return true;
    }
}

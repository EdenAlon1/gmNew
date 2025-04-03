package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fire extends firf {
    private static final long serialVersionUID = -9937958251642L;
    public final transient firn a;
    private final byte z;

    public fire(String str, byte b, firn firnVar) {
        super(str);
        this.z = b;
        this.a = firnVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return firf.b;
            case 2:
                return firf.c;
            case 3:
                return firf.d;
            case 4:
                return firf.e;
            case 5:
                return firf.f;
            case 6:
                return firf.g;
            case 7:
                return firf.h;
            case 8:
                return firf.i;
            case 9:
                return firf.j;
            case 10:
                return firf.k;
            case 11:
                return firf.l;
            case 12:
                return firf.m;
            case 13:
                return firf.n;
            case 14:
                return firf.o;
            case 15:
                return firf.p;
            case 16:
                return firf.q;
            case 17:
                return firf.r;
            case 18:
                return firf.s;
            case 19:
                return firf.t;
            case 20:
                return firf.u;
            case 21:
                return firf.v;
            case 22:
                return firf.w;
            default:
                return firf.x;
        }
    }

    @Override // defpackage.firf
    public final fird a(firb firbVar) {
        byte b = this.z;
        firb c = firh.c(firbVar);
        switch (b) {
            case 1:
                return c.i();
            case 2:
                return c.y();
            case 3:
                return c.c();
            case 4:
                return c.x();
            case 5:
                return c.w();
            case 6:
                return c.h();
            case 7:
                return c.q();
            case 8:
                return c.f();
            case 9:
                return c.v();
            case 10:
                return c.u();
            case 11:
                return c.t();
            case 12:
                return c.g();
            case 13:
                return c.j();
            case 14:
                return c.l();
            case 15:
                return c.e();
            case 16:
                return c.d();
            case 17:
                return c.k();
            case 18:
                return c.o();
            case 19:
                return c.p();
            case 20:
                return c.r();
            case 21:
                return c.s();
            case 22:
                return c.m();
            default:
                return c.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fire) && this.z == ((fire) obj).z;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}

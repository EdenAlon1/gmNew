package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nca {
    public final nbu a;
    protected final nbz b;
    protected nbw c;
    private final int d;

    protected nca(nbx nbxVar, nbz nbzVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = nbzVar;
        this.d = i;
        this.a = new nbu(nbxVar, j, j2, j3, j4, j5);
    }

    protected static final int e(ncp ncpVar, long j, ndk ndkVar) {
        if (j == ((nce) ncpVar).b) {
            return 0;
        }
        ndkVar.a = j;
        return 1;
    }

    protected static final boolean f(ncp ncpVar, long j) {
        long j2 = j - ((nce) ncpVar).b;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        ncpVar.l((int) j2);
        return true;
    }

    public final int a(ncp ncpVar, ndk ndkVar) {
        while (true) {
            nbw nbwVar = this.c;
            lti.g(nbwVar);
            long j = nbwVar.e;
            long j2 = nbwVar.f - j;
            int i = this.d;
            long j3 = nbwVar.g;
            if (j2 <= i) {
                d();
                return e(ncpVar, j, ndkVar);
            }
            if (!f(ncpVar, j3)) {
                return e(ncpVar, j3, ndkVar);
            }
            ncpVar.k();
            nby a = this.b.a(ncpVar, nbwVar.b);
            int i2 = a.b;
            if (i2 == -3) {
                d();
                return e(ncpVar, j3, ndkVar);
            }
            if (i2 == -2) {
                long j4 = a.c;
                long j5 = a.d;
                nbwVar.c = j4;
                nbwVar.e = j5;
                nbwVar.b();
            } else {
                if (i2 != -1) {
                    f(ncpVar, a.d);
                    d();
                    return e(ncpVar, a.d, ndkVar);
                }
                long j6 = a.c;
                long j7 = a.d;
                nbwVar.d = j6;
                nbwVar.f = j7;
                nbwVar.b();
            }
        }
    }

    public final void b(long j) {
        nbw nbwVar = this.c;
        if (nbwVar == null || nbwVar.a != j) {
            nbu nbuVar = this.a;
            this.c = new nbw(j, nbuVar.a.a(j), nbuVar.b, nbuVar.c, nbuVar.d, nbuVar.e);
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    protected final void d() {
        this.c = null;
        this.b.b();
    }
}

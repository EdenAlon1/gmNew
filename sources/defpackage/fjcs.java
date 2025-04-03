package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcs implements fjbj {
    public final fjbu a;
    private final fjdt b;
    private final Object[] c;
    private final fhfd d;
    private volatile boolean e;
    private fhfe f;
    private Throwable g;
    private boolean h;

    public fjcs(fjdt fjdtVar, Object[] objArr, fhfd fhfdVar, fjbu fjbuVar) {
        this.b = fjdtVar;
        this.c = objArr;
        this.d = fhfdVar;
        this.a = fjbuVar;
    }

    private final fhfe g() {
        fhgk j;
        fhgz fhgqVar;
        Object[] objArr = this.c;
        fjdt fjdtVar = this.b;
        fjdm[] fjdmVarArr = fjdtVar.j;
        int length = fjdmVarArr.length;
        int length2 = objArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(a.x(length, length2, "Argument count (", ") doesn't match expected count (", ")"));
        }
        fjdr fjdrVar = new fjdr(fjdtVar.c, fjdtVar.b, fjdtVar.d, fjdtVar.e, fjdtVar.f, fjdtVar.g, fjdtVar.h, fjdtVar.i);
        if (fjdtVar.k) {
            length2--;
        }
        ArrayList arrayList = new ArrayList(length2);
        for (int i = 0; i < length2; i++) {
            arrayList.add(objArr[i]);
            fjdmVarArr[i].a(fjdrVar, objArr[i]);
        }
        fhgi fhgiVar = fjdrVar.f;
        if (fhgiVar != null) {
            j = fhgiVar.a();
        } else {
            j = fjdrVar.d.j(fjdrVar.e);
            if (j == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + String.valueOf(fjdrVar.d) + ", Relative: " + fjdrVar.e);
            }
        }
        fhgz fhgzVar = fjdrVar.m;
        if (fhgzVar == null) {
            fhfz fhfzVar = fjdrVar.l;
            if (fhfzVar != null) {
                fhgqVar = new fhga(fhfzVar.a, fhfzVar.b);
            } else {
                fhgo fhgoVar = fjdrVar.k;
                if (fhgoVar != null) {
                    if (fhgoVar.c.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    fhgqVar = new fhgq(fhgoVar.a, fhgoVar.b, fhhl.o(fhgoVar.c));
                } else if (fjdrVar.j) {
                    fhgzVar = fhgy.a(new byte[0]);
                }
            }
            fhgzVar = fhgqVar;
        }
        fhgn fhgnVar = fjdrVar.i;
        if (fhgnVar != null) {
            if (fhgzVar != null) {
                fhgzVar = new fjdq(fhgzVar, fhgnVar);
            } else {
                fjdrVar.h.e(fhpi.a, fhgnVar.c);
            }
        }
        fhfd fhfdVar = this.d;
        fhgu fhguVar = fjdrVar.g;
        fhguVar.g(j);
        fhguVar.c(fjdrVar.h.b());
        fhguVar.d(fjdrVar.c, fhgzVar);
        fhguVar.f(fjcg.class, new fjcg(fjdtVar.a, arrayList));
        return new fhid((fhgs) fhfdVar, fhguVar.a());
    }

    private final fhfe h() {
        fhfe fhfeVar = this.f;
        if (fhfeVar != null) {
            return fhfeVar;
        }
        Throwable th = this.g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            fhfe g = g();
            this.f = g;
            return g;
        } catch (IOException | Error | RuntimeException e) {
            fjee.m(e);
            this.g = e;
            throw e;
        }
    }

    @Override // defpackage.fjbj
    public final synchronized fhgv a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((fhid) h()).b;
    }

    @Override // defpackage.fjbj
    public final void c() {
        fhfe fhfeVar;
        this.e = true;
        synchronized (this) {
            fhfeVar = this.f;
        }
        if (fhfeVar != null) {
            fhfeVar.b();
        }
    }

    @Override // defpackage.fjbj
    public final void d(fjbm fjbmVar) {
        fhfe fhfeVar;
        Throwable th;
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already executed.");
            }
            this.h = true;
            fhfeVar = this.f;
            th = this.g;
            if (fhfeVar == null && th == null) {
                try {
                    fhfe g = g();
                    this.f = g;
                    fhfeVar = g;
                } catch (Throwable th2) {
                    th = th2;
                    fjee.m(th);
                    this.g = th;
                }
            }
        }
        if (th != null) {
            fjbmVar.onFailure(this, th);
            return;
        }
        if (this.e) {
            fhfeVar.b();
        }
        fhfeVar.c(new fjco(this, fjbmVar));
    }

    @Override // defpackage.fjbj
    public final boolean e() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            fhfe fhfeVar = this.f;
            if (fhfeVar == null || !((fhid) fhfeVar).l) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fjbj
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fjcs clone() {
        return new fjcs(this.b, this.c, this.d, this.a);
    }
}

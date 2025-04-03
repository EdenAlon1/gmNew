package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mph {
    public final int a;
    public final mtl b;
    public final CopyOnWriteArrayList c;

    public mph(CopyOnWriteArrayList copyOnWriteArrayList, mtl mtlVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = mtlVar;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            final mpi mpiVar = mpgVar.b;
            lvf.am(mpgVar.a, new Runnable() { // from class: mpe
                @Override // java.lang.Runnable
                public final void run() {
                    mpiVar.eF(0, mph.this.b);
                }
            });
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            final mpi mpiVar = mpgVar.b;
            lvf.am(mpgVar.a, new Runnable() { // from class: mpc
                @Override // java.lang.Runnable
                public final void run() {
                    mpiVar.eG(0, mph.this.b);
                }
            });
        }
    }

    public final void c(final int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            final mpi mpiVar = mpgVar.b;
            lvf.am(mpgVar.a, new Runnable() { // from class: mpd
                @Override // java.lang.Runnable
                public final void run() {
                    mpiVar.eH(0, mph.this.b, i);
                }
            });
        }
    }

    public final void d(final Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            final mpi mpiVar = mpgVar.b;
            lvf.am(mpgVar.a, new Runnable() { // from class: mpb
                @Override // java.lang.Runnable
                public final void run() {
                    mpiVar.eI(0, mph.this.b, exc);
                }
            });
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            final mpi mpiVar = mpgVar.b;
            lvf.am(mpgVar.a, new Runnable() { // from class: mpf
                @Override // java.lang.Runnable
                public final void run() {
                    mpiVar.eJ(0, mph.this.b);
                }
            });
        }
    }

    public final mph f(mtl mtlVar) {
        return new mph(this.c, mtlVar);
    }

    public mph() {
        this(new CopyOnWriteArrayList(), null);
    }
}

package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtv {
    public final int a;
    public final mtl b;
    public final CopyOnWriteArrayList c;

    public mtv(CopyOnWriteArrayList copyOnWriteArrayList, mtl mtlVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = mtlVar;
    }

    public final void a(final lts ltsVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            mtu mtuVar = (mtu) it.next();
            final mtw mtwVar = mtuVar.b;
            lvf.am(mtuVar.a, new Runnable() { // from class: mtt
                @Override // java.lang.Runnable
                public final void run() {
                    lts.this.a(mtwVar);
                }
            });
        }
    }

    public final void b(final mth mthVar) {
        a(new lts() { // from class: mto
            @Override // defpackage.lts
            public final void a(Object obj) {
                ((mtw) obj).eA(0, mtv.this.b, mthVar);
            }
        });
    }

    public final void c(final mtc mtcVar, final mth mthVar) {
        a(new lts() { // from class: mts
            @Override // defpackage.lts
            public final void a(Object obj) {
                ((mtw) obj).eB(0, mtv.this.b, mtcVar, mthVar);
            }
        });
    }

    public final void d(final mtc mtcVar, final mth mthVar) {
        a(new lts() { // from class: mtq
            @Override // defpackage.lts
            public final void a(Object obj) {
                ((mtw) obj).eC(0, mtv.this.b, mtcVar, mthVar);
            }
        });
    }

    public final void e(final mtc mtcVar, final mth mthVar, final IOException iOException, final boolean z) {
        a(new lts() { // from class: mtr
            @Override // defpackage.lts
            public final void a(Object obj) {
                ((mtw) obj).eD(0, mtv.this.b, mtcVar, mthVar, iOException, z);
            }
        });
    }

    public final void f(final mtc mtcVar, final mth mthVar, final int i) {
        a(new lts() { // from class: mtp
            @Override // defpackage.lts
            public final void a(Object obj) {
                ((mtw) obj).eE(0, mtv.this.b, mtcVar, mthVar, i);
            }
        });
    }

    public final mtv g(mtl mtlVar) {
        return new mtv(this.c, mtlVar);
    }

    public mtv() {
        this(new CopyOnWriteArrayList(), null);
    }
}

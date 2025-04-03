package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevo {
    public static final fevo a = new fevo(new fedo[0]);
    public final fedo[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fevo(fedo[] fedoVarArr) {
        this.b = fedoVarArr;
    }

    public static fevo l(fdxt[] fdxtVarArr, fdxd fdxdVar) {
        fevo fevoVar = new fevo(fdxtVarArr);
        for (fdxt fdxtVar : fdxtVarArr) {
            fdxtVar.d(fdxdVar);
        }
        return fevoVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedoVarArr[i].b(j);
            i++;
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedoVarArr[i].c(j);
            i++;
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            ((fdxt) fedoVarArr[i]).a();
            i++;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void g() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void h() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void i() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void j() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void k() {
        int i = 0;
        while (true) {
            fedo[] fedoVarArr = this.b;
            if (i >= fedoVarArr.length) {
                return;
            }
            fedo fedoVar = fedoVarArr[i];
            i++;
        }
    }

    public final void m() {
        if (this.c.compareAndSet(false, true)) {
            for (fedo fedoVar : this.b) {
                fedoVar.e();
            }
        }
    }
}

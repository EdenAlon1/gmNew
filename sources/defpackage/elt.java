package defpackage;

import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elt implements ekg, elw, eke {
    public boolean a;
    final /* synthetic */ elu b;
    private final int c;
    private final long d;
    private final elv e;
    private final ffji f;
    private irb g;
    private boolean h;
    private boolean i;
    private elr j;
    private boolean k;
    private long l;
    private long m;
    private long n;

    public elt(elu eluVar, int i, long j, elv elvVar, ffji ffjiVar) {
        this.b = eluVar;
        this.c = i;
        this.d = j;
        this.e = elvVar;
        this.f = ffjiVar;
        int i2 = ffqe.a;
        this.n = ffqe.b();
    }

    private final void d() {
        int i = ffqe.a;
        long b = ffqe.b();
        long c = ffqf.c(b, this.n);
        long i2 = ffpw.i(c);
        if (!ffpw.p(c)) {
            i2 = i2 > 9223372036854L ? Long.MAX_VALUE : i2 < -9223372036854L ? Long.MIN_VALUE : ffpy.b(i2);
        }
        this.m = i2;
        this.l -= i2;
        this.n = b;
    }

    private final boolean e() {
        return this.g != null;
    }

    private final boolean f(long j, long j2) {
        return (this.k && j > 0) || j2 < j;
    }

    @Override // defpackage.ekg
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        irb irbVar = this.g;
        if (irbVar != null) {
            irbVar.b();
        }
        this.g = null;
    }

    @Override // defpackage.ekg
    public final void b() {
        this.k = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ejg, java.lang.Object] */
    @Override // defpackage.elw
    public final boolean c(ehn ehnVar) {
        List list;
        ?? invoke = this.b.a.b.invoke();
        if (!this.a) {
            int b = invoke.b();
            int i = this.c;
            if (i >= 0 && i < b) {
                Object c = invoke.c(i);
                this.l = ehnVar.a();
                int i2 = ffqe.a;
                this.n = ffqe.b();
                this.m = 0L;
                if (!e()) {
                    if (!f(this.l, this.e.a(c).a)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:compose");
                    try {
                        if (this.g != null) {
                            dwv.c("Request was already composed!");
                        }
                        Object d = invoke.d(this.c);
                        this.g = this.b.b.a().a(d, this.b.a.b(this.c, d, c));
                        Trace.endSection();
                        d();
                        elv elvVar = this.e;
                        long j = this.m;
                        elvVar.a.a(j);
                        elvVar.a(c).a(j);
                    } finally {
                    }
                }
                if (!this.k) {
                    if (!this.i) {
                        if (this.l <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            irb irbVar = this.g;
                            if (irbVar == null) {
                                dwv.a("Should precompose before resolving nested prefetch states");
                                throw new ffbx();
                            }
                            fflb fflbVar = new fflb();
                            irbVar.d(new els(fflbVar));
                            List list2 = (List) fflbVar.a;
                            this.j = list2 != null ? new elr(this, list2) : null;
                            this.i = true;
                        } finally {
                        }
                    }
                    elr elrVar = this.j;
                    if (elrVar != null && elrVar.c < elrVar.a.size()) {
                        if (elrVar.e.a) {
                            dwv.d("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (elrVar.c < elrVar.a.size()) {
                            try {
                                if (elrVar.b[elrVar.c] == null) {
                                    if (ehnVar.a() <= 0) {
                                        return true;
                                    }
                                    List[] listArr = elrVar.b;
                                    int i3 = elrVar.c;
                                    ekh ekhVar = (ekh) elrVar.a.get(i3);
                                    ffji ffjiVar = ekhVar.a;
                                    if (ffjiVar == null) {
                                        list = ffel.a;
                                    } else {
                                        ekf ekfVar = new ekf(ekhVar);
                                        ffjiVar.invoke(ekfVar);
                                        list = ekfVar.a;
                                    }
                                    listArr[i3] = list;
                                }
                                List list3 = elrVar.b[elrVar.c];
                                list3.getClass();
                                while (elrVar.d < list3.size()) {
                                    if (((elw) list3.get(elrVar.d)).c(ehnVar)) {
                                        return true;
                                    }
                                    elrVar.d++;
                                }
                                elrVar.d = 0;
                                elrVar.c++;
                            } finally {
                            }
                        }
                    }
                    d();
                }
                if (!this.h) {
                    long j2 = this.d;
                    int i4 = (int) (3 & j2);
                    int i5 = (i4 & 2) >> 1;
                    int i6 = i4 & 1;
                    int i7 = i6 + i6 + (i5 * 3);
                    if (!(((((1 << (i7 + 13)) + (-1)) & ((int) (j2 >> 33))) + (-1) == 0) | ((((1 << (18 - i7)) + (-1)) & ((int) (j2 >> (i7 + 46)))) + (-1) == 0))) {
                        if (!f(this.l, this.e.a(c).b)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            long j3 = this.d;
                            if (this.a) {
                                dwv.c("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.h) {
                                dwv.c("Request was already measured!");
                            }
                            this.h = true;
                            irb irbVar2 = this.g;
                            if (irbVar2 == null) {
                                dwv.a("performComposition() must be called before performMeasure()");
                                throw new ffbx();
                            }
                            int a = irbVar2.a();
                            for (int i8 = 0; i8 < a; i8++) {
                                irbVar2.c(i8, j3);
                            }
                            Trace.endSection();
                            d();
                            elv elvVar2 = this.e;
                            long j4 = this.m;
                            elvVar2.a.b(j4);
                            elvVar2.a(c).b(j4);
                            ffji ffjiVar2 = this.f;
                            if (ffjiVar2 != null) {
                                ffjiVar2.invoke(this);
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.c + ", constraints = " + ((Object) jzk.e(this.d)) + ", isComposed = " + e() + ", isMeasured = " + this.h + ", isCanceled = " + this.a + " }";
    }
}

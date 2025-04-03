package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvd {
    public final Object a;
    public final cwb b;
    public cvf c;
    private final hho g = new hic(null, hla.a);
    private final hho h = new hic(false, hla.a);
    private final hho i = new hic(null, hla.a);
    public final hss d = new hss();
    public final ffji e = new cvc(this);
    public final ffix f = new cvb(this);

    public cvd(Object obj, cwb cwbVar) {
        this.a = obj;
        this.b = cwbVar;
    }

    public final iam a() {
        return (iam) this.i.a();
    }

    public final iam b() {
        iam iamVar;
        cvf cvfVar = this.c;
        if (cvfVar != null) {
            Object invoke = cvfVar.j.invoke();
            if (invoke == null) {
                throw new IllegalArgumentException("Error: lookahead coordinates is null.");
            }
            long h = cvfVar.d().b.d().h((ioc) invoke, 0L);
            Object invoke2 = cvfVar.j.invoke();
            if (invoke2 == null) {
                throw new IllegalArgumentException("Error: lookahead coordinates is null for " + cvfVar.d().a + '.');
            }
            iamVar = ian.a(h, kag.d(((ioc) invoke2).g()));
        } else {
            iamVar = null;
        }
        f(iamVar);
        return c();
    }

    public final iam c() {
        return (iam) this.g.a();
    }

    public final void d(iam iamVar) {
        this.i.b(iamVar);
    }

    public final void e(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void f(iam iamVar) {
        this.g.b(iamVar);
    }

    public final void g() {
        boolean j = j();
        if (this.d.a() > 1 && j) {
            e(true);
        } else if (!this.b.a()) {
            e(false);
        } else if (!j) {
            e(false);
        }
        if (this.d.isEmpty()) {
            return;
        }
        this.b.g(this, this.e, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        cvf cvfVar;
        hss hssVar = this.d;
        int a = hssVar.a() - 1;
        if (a >= 0) {
            cvfVar = null;
            while (true) {
                int i = a - 1;
                cvf cvfVar2 = (cvf) hssVar.get(a);
                if (true == cvfVar2.c().f()) {
                    cvfVar = cvfVar2;
                }
                if (i < 0) {
                    break;
                } else {
                    a = i;
                }
            }
        } else {
            cvfVar = null;
        }
        if (ffkj.e(cvfVar, this.c)) {
            return;
        }
        this.c = cvfVar;
        f(null);
    }

    public final boolean i() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        hss hssVar = this.d;
        int a = hssVar.a();
        for (int i = 0; i < a; i++) {
            if (((cvf) hssVar.get(i)).c().f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        hss hssVar = this.d;
        int a = hssVar.a();
        int i = 0;
        while (true) {
            if (i >= a) {
                break;
            }
            dbe dbeVar = ((cvf) hssVar.get(i)).c().a;
            while (true) {
                dbe dbeVar2 = dbeVar.a;
                if (dbeVar2 == null) {
                    break;
                }
                dbeVar = dbeVar2;
            }
            if (ffkj.e(dbeVar.e(), dbeVar.f())) {
                i++;
            } else if (i()) {
                return true;
            }
        }
        return false;
    }
}

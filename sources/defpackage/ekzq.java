package defpackage;

import android.app.Service;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzq {
    elav a;
    private final Service b;

    public ekzq(Service service) {
        this.b = service;
    }

    private final elae d() {
        return ekyf.v() ? elae.d(elcb.c(this.b)) : elad.a;
    }

    private final String e(String str) {
        return str + " " + this.b.getClass().getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elav a(android.content.Intent r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L18
            long r0 = defpackage.eldl.a
            elat r0 = defpackage.eldl.t(r7)
            if (r0 == 0) goto L18
            android.app.Service r0 = r6.b
            java.util.Set r0 = defpackage.elcb.c(r0)
            elae r0 = defpackage.elae.d(r0)
            r0.getClass()
            goto L1d
        L18:
            elae r0 = defpackage.elad.a
            r0.getClass()
        L1d:
            android.app.Service r1 = r6.b
            java.lang.Class r2 = r1.getClass()
            elat r3 = defpackage.ekyf.c()
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = ".onBind"
            java.lang.String r2 = r2.concat(r4)
            if (r7 != 0) goto L3c
            elav r7 = defpackage.ekzs.a(r1, r2)
            goto L51
        L3c:
            long r4 = defpackage.eldl.a
            elat r7 = defpackage.eldl.t(r7)
            if (r7 != 0) goto L49
            elav r7 = defpackage.ekzs.a(r1, r2)
            goto L51
        L49:
            defpackage.ekyf.g(r7)
            ekzr r7 = new ekzr
            r7.<init>()
        L51:
            java.lang.String r1 = "onBind"
            java.lang.String r1 = r6.e(r1)
            ekzz r0 = defpackage.eleg.g(r1, r0)
            ekzn r1 = new ekzn
            r1.<init>(r0, r7, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekzq.a(android.content.Intent):elav");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elav b() {
        final ekzm ekzmVar;
        elae d = d();
        final elat c = ekyf.c();
        if (ekyf.v()) {
            ekzmVar = null;
        } else {
            elat f = ekyf.f();
            if (f != null) {
                ekzp ekzpVar = new ekzp();
                ekyf.g(f);
                elac b = elae.b();
                b.a(elam.c, ekzpVar);
                this.a = eleg.g("Creating ".concat(String.valueOf(this.b.getClass().getSimpleName())), ((elae) b).f());
                ekzmVar = f;
            } else {
                Service service = this.b;
                ekzmVar = elcb.b(service).c("Creating ".concat(String.valueOf(service.getClass().getSimpleName())), elam.b);
            }
        }
        final ekzz g = eleg.g(e("onCreate"), d);
        return new elav() { // from class: ekzo
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                g.close();
                elav elavVar = ekzq.this.a;
                if (elavVar != null) {
                    elavVar.close();
                }
                elav elavVar2 = ekzmVar;
                if (elavVar2 != null) {
                    elavVar2.close();
                }
                ekyf.g(c);
            }
        };
    }

    public final elav c() {
        ekzm ekzmVar;
        elae d = d();
        elat c = ekyf.c();
        if (ekyf.v()) {
            ekzmVar = null;
        } else {
            Service service = this.b;
            ekzmVar = elcb.b(service).c("Destroying ".concat(String.valueOf(service.getClass().getSimpleName())), elam.b);
        }
        return new ekzn(eleg.g(e("onDestroy"), d), ekzmVar, c);
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvr extends ejvp implements ejvw {
    public final Object a = new Object();
    public final Map b = new cmh();
    private final enny c = new engb();

    private final void f(Object obj, ejvv ejvvVar) {
        enib enibVar = new enib();
        enie enieVar = (enie) this.b.get(obj);
        if (enieVar != null) {
            enibVar.b(enieVar);
        }
        enibVar.c(ejvvVar);
        this.b.put(obj, enibVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.lang.Object r6, defpackage.ejvv r7) {
        /*
            r5 = this;
            java.util.Map r0 = r5.b
            java.lang.Object r0 = r0.get(r6)
            enie r0 = (defpackage.enie) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r2
        Lf:
            java.lang.String r4 = "Failed to remove a subscription key. State is corrupted."
            defpackage.emxf.m(r3, r4)
            enib r3 = new enib
            r3.<init>()
            r3.b(r0)
            int r0 = r0.b(r7)
            int r0 = r0 + (-1)
            enoj r4 = r3.a
            r4.getClass()
            if (r0 != 0) goto L39
            boolean r0 = r3.c
            if (r0 != 0) goto L38
            enok r0 = new enok
            r0.<init>(r4)
            r3.a = r0
            r3.c = r1
            r0 = r2
            goto L46
        L38:
            r0 = r2
        L39:
            boolean r1 = r3.b
            if (r1 == 0) goto L46
            enoj r1 = new enoj
            r1.<init>(r4)
            r3.a = r1
            r3.c = r2
        L46:
            r3.b = r2
            r7.getClass()
            if (r0 != 0) goto L57
            enoj r0 = r3.a
            int r1 = defpackage.engc.b(r7)
            r0.f(r7, r1)
            goto L5c
        L57:
            enoj r1 = r3.a
            r1.p(r7, r0)
        L5c:
            java.util.Map r7 = r5.b
            enie r0 = r3.a()
            r7.put(r6, r0)
            java.util.Map r7 = r5.b
            java.lang.Object r7 = r7.get(r6)
            enie r7 = (defpackage.enie) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L78
            java.util.Map r7 = r5.b
            r7.remove(r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejvr.g(java.lang.Object, ejvv):void");
    }

    private final boolean h(ejvt ejvtVar) {
        return this.c.a(ejvtVar, 1) == 0;
    }

    private final boolean i(ejvt ejvtVar) {
        int d = this.c.d(ejvtVar, 1);
        emxf.l(d > 0);
        return d == 1;
    }

    @Override // defpackage.ejvp
    public final void a(ListenableFuture listenableFuture, Object obj) {
        c(listenableFuture, obj, ejvu.a, emux.a, erpp.a);
    }

    @Override // defpackage.ejvp
    public final void b(ListenableFuture listenableFuture, Object obj) {
        c(listenableFuture, obj, ejvu.b, emux.a, erpp.a);
    }

    public final void c(ListenableFuture listenableFuture, Object obj, ejvu ejvuVar, emxc emxcVar, Executor executor) {
        eleg.d();
        erqt.r(listenableFuture, eldl.i(new ejvq(this, obj, ejvuVar, emxcVar)), executor);
    }

    @Override // defpackage.ejvw
    public final void d(Object obj, ejvv ejvvVar) {
        efbd.c();
        obj.getClass();
        cmj cmjVar = new cmj();
        synchronized (this.a) {
            if (obj instanceof ejuj) {
                enqu listIterator = ((ejuj) obj).b().listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    f(next, ejvvVar);
                    if (next instanceof ejvt) {
                        ejvt ejvtVar = (ejvt) next;
                        if (h(ejvtVar)) {
                            cmjVar.add(ejvtVar);
                        }
                    }
                }
            } else {
                f(obj, ejvvVar);
                if (obj instanceof ejvt) {
                    ejvt ejvtVar2 = (ejvt) obj;
                    if (h(ejvtVar2)) {
                        cmjVar.add(ejvtVar2);
                    }
                }
            }
        }
        cmi cmiVar = new cmi(cmjVar);
        while (cmiVar.hasNext()) {
            ((ejvt) cmiVar.next()).d();
        }
    }

    @Override // defpackage.ejvw
    public final void e(Object obj, ejvv ejvvVar) {
        efbd.c();
        obj.getClass();
        cmj cmjVar = new cmj();
        synchronized (this.a) {
            if (obj instanceof ejuj) {
                enqu listIterator = ((ejuj) obj).b().listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    g(next, ejvvVar);
                    if (next instanceof ejvt) {
                        ejvt ejvtVar = (ejvt) next;
                        if (i(ejvtVar)) {
                            cmjVar.add(ejvtVar);
                        }
                    }
                }
            } else {
                g(obj, ejvvVar);
                if (obj instanceof ejvt) {
                    ejvt ejvtVar2 = (ejvt) obj;
                    if (i(ejvtVar2)) {
                        cmjVar.add(ejvtVar2);
                    }
                }
            }
        }
        cmi cmiVar = new cmi(cmjVar);
        while (cmiVar.hasNext()) {
            ((ejvt) cmiVar.next()).c();
        }
    }
}

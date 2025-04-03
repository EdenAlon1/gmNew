package defpackage;

import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class comt implements comc {
    public static final /* synthetic */ int d = 0;
    private static final entd e = entd.c("Bugle");
    public final String a;
    public final AtomicBoolean b;
    public final ConcurrentHashMap c;
    private final comc f;
    private final comb g;

    public comt(comc comcVar, comv comvVar, conb conbVar) {
        this.f = comcVar;
        coma comaVar = (coma) comvVar;
        this.g = comaVar.a;
        this.a = (String) comaVar.b.orElse("");
        this.b = conbVar.a;
        this.c = conbVar.b;
    }

    @Override // defpackage.comc
    public final eyhs a(ffji ffjiVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        eyhs a = this.f.a(ffjiVar);
        concurrentHashMap.put(str, a);
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.comc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.comq
            if (r0 == 0) goto L13
            r0 = r5
            comq r0 = (defpackage.comq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            comq r0 = new comq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            comt r0 = r0.d
            defpackage.ffci.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            comc r5 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            j$.util.concurrent.ConcurrentHashMap r5 = r0.c
            java.lang.String r0 = r0.a
            r5.remove(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.comt.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.comc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.comr
            if (r0 == 0) goto L13
            r0 = r5
            comr r0 = (defpackage.comr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            comr r0 = new comr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            comt r0 = r0.d
            defpackage.ffci.b(r5)
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            j$.util.concurrent.ConcurrentHashMap r5 = r4.c
            java.lang.String r2 = r4.a
            java.lang.Object r5 = r5.get(r2)
            eyhs r5 = (defpackage.eyhs) r5
            if (r5 == 0) goto L54
            entd r0 = defpackage.comt.e
            ensk r0 = r0.n()
            comb r1 = r4.g
            java.lang.String r2 = r4.a
            java.lang.String r2 = defpackage.cskt.e(r2)
            java.lang.String r3 = "Reading from cache. key = %s, subkey = %s"
            r0.D(r3, r1, r2)
            return r5
        L54:
            comc r5 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            r0 = r4
        L62:
            r1 = r5
            eyhs r1 = (defpackage.eyhs) r1
            j$.util.concurrent.ConcurrentHashMap r2 = r0.c
            java.lang.String r0 = r0.a
            r2.put(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.comt.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.comc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.coms
            if (r0 == 0) goto L13
            r0 = r6
            coms r0 = (defpackage.coms) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coms r0 = new coms
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            comt r5 = r0.d
            defpackage.ffci.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            r0 = r6
            eyhs r0 = (defpackage.eyhs) r0
            j$.util.concurrent.ConcurrentHashMap r1 = r5.c
            java.lang.String r5 = r5.a
            r1.put(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.comt.d(ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.comc
    public final ffxx e() {
        return this.f.e();
    }

    @Override // defpackage.copd
    public final elfl f() {
        elfl f = this.f.f();
        final ffji ffjiVar = new ffji() { // from class: comd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                comt comtVar = comt.this;
                Void r3 = (Void) obj;
                comtVar.c.remove(comtVar.a);
                return r3;
            }
        };
        return f.h(new emwl() { // from class: comh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = comt.d;
                return ffji.this.invoke(obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.copd
    public final elfl g() {
        if (!this.b.get()) {
            elfl g = this.f.g();
            final ffji ffjiVar = new ffji() { // from class: comf
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    comt comtVar = comt.this;
                    enhk enhkVar = (enhk) obj;
                    comtVar.c.putAll(enhkVar);
                    comtVar.b.set(true);
                    return enhkVar;
                }
            };
            return g.h(new emwl() { // from class: comg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = comt.d;
                    return ffji.this.invoke(obj);
                }
            }, erpp.a);
        }
        e.n().D("Reading all data from cache. key = %s, subkey = %s", this.g, cskt.e(this.a));
        elfl e2 = elfo.e(engq.e(this.c));
        e2.getClass();
        return e2;
    }

    @Override // defpackage.copd
    public final elfl h() {
        eyhs eyhsVar = (eyhs) this.c.get(this.a);
        if (eyhsVar == null) {
            elfl h = this.f.h();
            final ffji ffjiVar = new ffji() { // from class: comi
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    comt comtVar = comt.this;
                    eyhs eyhsVar2 = (eyhs) obj;
                    comtVar.c.put(comtVar.a, eyhsVar2);
                    return eyhsVar2;
                }
            };
            return h.h(new emwl() { // from class: comj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = comt.d;
                    return ffji.this.invoke(obj);
                }
            }, erpp.a);
        }
        e.n().D("Reading from cache. key = %s, subkey = %s", this.g, cskt.e(this.a));
        elfl e2 = elfo.e(eyhsVar);
        e2.getClass();
        return e2;
    }

    @Override // defpackage.copd
    public final elfl i(final String str) {
        elfl i = this.f.i(str);
        final ffji ffjiVar = new ffji() { // from class: comp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Optional optional = (Optional) obj;
                final comt comtVar = comt.this;
                final ffji ffjiVar2 = new ffji() { // from class: comm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        comt comtVar2 = comt.this;
                        comtVar2.c.put(comtVar2.a, (eyhs) obj2);
                        return ffcu.a;
                    }
                };
                optional.ifPresentOrElse(new Consumer() { // from class: comn
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        int i2 = comt.d;
                        ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: como
                    @Override // java.lang.Runnable
                    public final void run() {
                        comt comtVar2 = comt.this;
                        comtVar2.c.remove(comtVar2.a);
                    }
                });
                Object orElse = optional.orElse(null);
                ConcurrentHashMap concurrentHashMap = comtVar.c;
                fflf.g(concurrentHashMap);
                Map.EL.remove(concurrentHashMap, str, orElse);
                return optional;
            }
        };
        return i.h(new emwl() { // from class: come
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = comt.d;
                return ffji.this.invoke(obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.copd
    public final elfl j(emwl emwlVar) {
        elfl j = this.f.j(emwlVar);
        final ffji ffjiVar = new ffji() { // from class: comk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                comt comtVar = comt.this;
                eyhs eyhsVar = (eyhs) obj;
                comtVar.c.put(comtVar.a, eyhsVar);
                return eyhsVar;
            }
        };
        return j.h(new emwl() { // from class: coml
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = comt.d;
                return ffji.this.invoke(obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.copd
    public final enhk k() {
        if (this.b.get()) {
            e.n().D("Reading all data from cache. key = %s, subkey = %s", this.g, cskt.e(this.a));
            return engq.e(this.c);
        }
        comc comcVar = this.f;
        ConcurrentHashMap concurrentHashMap = this.c;
        enhk k = comcVar.k();
        concurrentHashMap.putAll(k);
        this.b.set(true);
        return k;
    }

    @Override // defpackage.copd
    public final eyhs l() {
        eyhs eyhsVar = (eyhs) this.c.get(this.a);
        if (eyhsVar != null) {
            e.n().D("Reading from cache. key = %s, subkey = %s", this.g, cskt.e(this.a));
            return eyhsVar;
        }
        comc comcVar = this.f;
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        eyhs l = comcVar.l();
        concurrentHashMap.put(str, l);
        return l;
    }

    @Override // defpackage.copd
    public final eyhs m(emwl emwlVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        eyhs m = this.f.m(emwlVar);
        concurrentHashMap.put(str, m);
        return m;
    }

    @Override // defpackage.copd
    public final void n() {
        this.f.n();
        this.c.remove(this.a);
    }
}

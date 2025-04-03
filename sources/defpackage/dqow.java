package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqow implements dqok, dqoh {
    public final ffsk a;
    public List b;
    public Map c;
    private final ffbz d;
    private final ffbz e;

    public dqow(ffsk ffskVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        this.d = ffca.a(new ffix() { // from class: dqol
            @Override // defpackage.ffix
            public final Object invoke() {
                dqow dqowVar = dqow.this;
                return ffqy.d(dqowVar.a, null, null, new dqoq(dqowVar, null), 3);
            }
        });
        this.e = ffca.a(new ffix() { // from class: dqom
            @Override // defpackage.ffix
            public final Object invoke() {
                dqow dqowVar = dqow.this;
                return ffqy.d(dqowVar.a, null, null, new dqos(dqowVar, null), 3);
            }
        });
    }

    @Override // defpackage.dqoh
    public final Object a(final dqqj dqqjVar, ffgu ffguVar) {
        return f(new ffji() { // from class: dqon
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Object obj2;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    dqqj dqqjVar2 = dqqj.this;
                    obj2 = it.next();
                    if (((dqog) obj2).b.contains(dqqjVar2)) {
                        break;
                    }
                }
                return (dqog) obj2;
            }
        }, ffguVar);
    }

    @Override // defpackage.dqoh
    public final Object b(ffgu ffguVar) {
        return f(new ffji() { // from class: dqop
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                return list;
            }
        }, ffguVar);
    }

    @Override // defpackage.dqok
    public final Object c(ffgu ffguVar) {
        Object o = ((ffud) this.e.a()).o(ffguVar);
        return o == ffhh.a ? o : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dqok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.CharSequence r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dqot
            if (r0 == 0) goto L13
            r0 = r6
            dqot r0 = (defpackage.dqot) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqot r0 = new dqot
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 == r1) goto L79
        L3e:
            dqqj r6 = (defpackage.dqqj) r6
            r0 = 0
            if (r6 == 0) goto L78
            dqns r1 = r6.a()
            java.lang.CharSequence r1 = r1.a()
            boolean r1 = defpackage.ffkj.e(r1, r5)
            if (r1 == 0) goto L56
            dqns r5 = r6.a()
            return r5
        L56:
            java.util.Set r6 = r6.i()
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            r2 = r1
            dqoe r2 = (defpackage.dqoe) r2
            java.lang.CharSequence r2 = r2.a()
            boolean r2 = defpackage.ffkj.e(r2, r5)
            if (r2 == 0) goto L5e
            r0 = r1
        L76:
            dqof r0 = (defpackage.dqof) r0
        L78:
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqow.d(java.lang.CharSequence, ffgu):java.lang.Object");
    }

    @Override // defpackage.dqok
    public final Object e(final CharSequence charSequence, ffgu ffguVar) {
        return g(new ffji() { // from class: dqoo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.getClass();
                return (dqqj) map.get(charSequence);
            }
        }, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dqou
            if (r0 == 0) goto L13
            r0 = r6
            dqou r0 = (defpackage.dqou) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqou r0 = new dqou
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            dqow r0 = r0.e
            defpackage.ffci.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffbz r6 = r4.d
            java.lang.Object r6 = r6.a()
            ffud r6 = (defpackage.ffud) r6
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 == r1) goto L5a
            r0 = r4
        L4b:
            java.util.List r6 = r0.b
            if (r6 != 0) goto L55
            java.lang.String r6 = "categories"
            defpackage.ffkj.c(r6)
            r6 = 0
        L55:
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqow.f(ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dqov
            if (r0 == 0) goto L13
            r0 = r6
            dqov r0 = (defpackage.dqov) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqov r0 = new dqov
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dqoo r5 = r0.e
            dqow r0 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.d = r4
            r6 = r5
            dqoo r6 = (defpackage.dqoo) r6
            r0.e = r6
            r0.c = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 == r1) goto L55
            r0 = r4
        L46:
            java.util.Map r6 = r0.c
            if (r6 != 0) goto L50
            java.lang.String r6 = "literalsToEmoji"
            defpackage.ffkj.c(r6)
            r6 = 0
        L50:
            java.lang.Object r5 = r5.invoke(r6)
            return r5
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqow.g(ffji, ffgu):java.lang.Object");
    }
}

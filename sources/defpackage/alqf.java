package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqf {
    public final effy a;
    public final ffsk b;
    public final emar c;
    public final alol d;
    private final ffbr e;

    public alqf(effy effyVar, ffbr ffbrVar, ffsk ffskVar, emar emarVar, alol alolVar) {
        effyVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        emarVar.getClass();
        this.a = effyVar;
        this.e = ffbrVar;
        this.b = ffskVar;
        this.c = emarVar;
        this.d = alolVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.alph
            if (r0 == 0) goto L13
            r0 = r5
            alph r0 = (defpackage.alph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alph r0 = new alph
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.e
            java.lang.Object r5 = r5.b()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            aloc r5 = (defpackage.aloc) r5
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L58
        L48:
            eisx r5 = (defpackage.eisx) r5
            if (r5 == 0) goto L56
            int r5 = r5.a()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        L56:
            r5 = 0
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqf.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.alpi
            if (r0 == 0) goto L13
            r0 = r6
            alpi r0 = (defpackage.alpi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alpi r0 = new alpi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffsk r6 = r5.b
            ffhd r6 = r6.hT()
            alpj r2 = new alpj
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.ekxl.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqf.b(ffgu):java.lang.Object");
    }

    public final Object c(ffgu ffguVar) {
        return ekxl.a(this.b.hT(), new alpk(this, null), ffguVar);
    }

    public final Object d(final int i, final boolean z, ffgu ffguVar) {
        final int a = this.d.a();
        Object b = ctzl.b(this.a, new ffji() { // from class: alpc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aloy aloyVar = (aloy) obj;
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((alpb) aloyVar.instance).c));
                int i2 = i;
                alov alovVar = (alov) Map.EL.getOrDefault(unmodifiableMap, Integer.valueOf(i2), alov.a);
                java.util.Map unmodifiableMap2 = DesugarCollections.unmodifiableMap(alovVar.c);
                int i3 = a;
                alox aloxVar = (alox) Map.EL.getOrDefault(unmodifiableMap2, Integer.valueOf(i3), alox.a);
                int i4 = aloxVar.b & 4;
                boolean z2 = z;
                if (i4 != 0) {
                    if (aloxVar.e || !z2) {
                        return ffcu.a;
                    }
                    z2 = true;
                }
                alot alotVar = (alot) alovVar.toBuilder();
                alow alowVar = (alow) aloxVar.toBuilder();
                alowVar.copyOnWrite();
                alox aloxVar2 = (alox) alowVar.instance;
                aloxVar2.b |= 4;
                aloxVar2.e = z2;
                alotVar.a(i3, (alox) alowVar.build());
                aloyVar.a(i2, (alov) alotVar.build());
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    public final void e(int i, int i2) {
        emau.a(ffsl.b(ekxi.a(this.b.hT())), this.c, new alpd(null, this, i2, i));
    }

    public final void f(Instant instant) {
        instant.getClass();
        ffsk ffskVar = this.b;
        int b = alol.b(instant);
        emau.a(ffsl.b(ekxi.a(ffskVar.hT())), this.c, new alpr(null, this, b));
    }

    public final void g(Instant instant) {
        instant.getClass();
        ffsk ffskVar = this.b;
        int b = alol.b(instant);
        emau.a(ffsl.b(ekxi.a(ffskVar.hT())), this.c, new alpt(null, this, b));
    }

    public final void h(Instant instant) {
        instant.getClass();
        ffsk ffskVar = this.b;
        int b = alol.b(instant);
        emau.a(ffsl.b(ekxi.a(ffskVar.hT())), this.c, new alpv(null, this, b));
    }
}

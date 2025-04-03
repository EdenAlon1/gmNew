package defpackage;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alex implements aleq {
    public final alff a;
    private final ffsk b;
    private final dvxo c;
    private final cqoh d;
    private final ffbr e;
    private final ffbr f;
    private final entd g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;
    private final AtomicInteger j;

    public alex(ffsk ffskVar, dvxo dvxoVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, alff alffVar) {
        ffskVar.getClass();
        dvxoVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        alffVar.getClass();
        this.b = ffskVar;
        this.c = dvxoVar;
        this.d = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.a = alffVar;
        this.g = entd.c("BugleSemanticLogger");
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new AtomicInteger(1);
    }

    @Override // defpackage.aleq
    public final void a(int i, eqkv eqkvVar) {
        axol.k(this.b, null, new alet(i, eqkvVar, this, null), 3);
    }

    @Override // defpackage.aleq
    public final aler b(int i, Duration duration) {
        int andIncrement = this.j.getAndIncrement();
        aler alerVar = new aler(this, andIncrement, i, this.d.a());
        this.h.put(Integer.valueOf(andIncrement), alerVar);
        this.i.put(Integer.valueOf(alerVar.a), axol.k(this.b, null, new alev(this, alerVar, duration != null ? Long.valueOf(duration.toMillis()) : (Long) this.e.b(), null), 3));
        return alerVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dvxn r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aleu
            if (r0 == 0) goto L13
            r0 = r6
            aleu r0 = (defpackage.aleu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aleu r0 = new aleu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dvxn r5 = r0.e
            alex r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.f
            java.lang.Object r6 = r6.b()
            aleo r6 = (defpackage.aleo) r6
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 == r1) goto L5b
            r0 = r4
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            dvxo r6 = r0.c
            r6.a(r5)
        L58:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alex.c(dvxn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aler r5, long r6, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.alew
            if (r0 == 0) goto L13
            r0 = r8
            alew r0 = (defpackage.alew) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alew r0 = new alew
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aler r5 = r0.e
            alex r6 = r0.d
            defpackage.ffci.b(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r8)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ffsw.c(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6 = r4
        L44:
            fagh r7 = defpackage.fagh.DEADLINE_EXCEEDED
            r6.f(r5, r7)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alex.d(aler, long, ffgu):java.lang.Object");
    }

    public final void f(aler alerVar, fagh faghVar) {
        ffud ffudVar = (ffud) this.i.remove(Integer.valueOf(alerVar.b));
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        if (((aler) this.h.remove(Integer.valueOf(alerVar.a))) == null) {
            ((ensz) this.g.j()).q("Received stop event for a CUI tracker that was not started or is already stopped!");
            return;
        }
        cqoh cqohVar = this.d;
        long a = cqohVar.a() - alerVar.c;
        axol.k(this.b, null, new ales(alerVar.b, faghVar, a, this, null), 3);
    }
}

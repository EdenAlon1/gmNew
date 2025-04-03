package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjr implements eivn, eivo {
    public static final adjn g = new adjn();
    public final eiyk a;
    public final adke b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final eixo h;
    private final ffsk i;
    private final ejvb j;
    private final ffsk k;

    public adjr(eixo eixoVar, eiyk eiykVar, adke adkeVar, ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2, ejvb ejvbVar, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar2) {
        eixoVar.getClass();
        eiykVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        ejvbVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar2.getClass();
        this.h = eixoVar;
        this.a = eiykVar;
        this.b = adkeVar;
        this.c = ffbrVar;
        this.i = ffskVar;
        this.d = ffbrVar2;
        this.j = ejvbVar;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.k = ffskVar2;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        elfl c;
        ekzz f = eleg.f("AutoSelect Account");
        try {
            c = axol.c(this.k, ffhe.a, ffsm.a, new adjo(this, null));
            f.b(c);
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new adjq(this, eisxVar, null));
        return c;
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ejwa r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.adjp
            if (r0 == 0) goto L13
            r0 = r6
            adjp r0 = (defpackage.adjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            adjp r0 = new adjp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ejvb r6 = r4.j
            eixo r2 = r4.h
            ejuh r2 = r2.b()
            com.google.common.util.concurrent.ListenableFuture r5 = r6.b(r2, r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L90
        L49:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r6.next()
            eixn r0 = (defpackage.eixn) r0
            int r1 = r0.c()
            r2 = 3
            if (r1 == r2) goto L54
            eixz r1 = r0.b()
            java.lang.String r1 = r1.k
            java.lang.String r2 = "pseudonymous"
            boolean r1 = defpackage.ffkj.e(r2, r1)
            if (r1 != 0) goto L54
            r0.getClass()
            r5.add(r0)
            goto L54
        L7c:
            int r6 = r5.size()
            if (r6 != r3) goto L8e
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            eixn r5 = (defpackage.eixn) r5
            eisx r5 = r5.a()
            return r5
        L8e:
            r5 = 0
            return r5
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjr.d(ejwa, ffgu):java.lang.Object");
    }
}

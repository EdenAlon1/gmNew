package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprn implements ekrm {
    public final ffbr a;
    public final ffbr b;
    public final enru c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffsk g;
    private final ffsk h;

    public cprn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffsk ffskVar, ffsk ffskVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.d = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffskVar;
        this.h = ffskVar2;
        this.c = enru.c("com/google/android/apps/messaging/shared/tachygram/synclet/TachygramPullMessagesSynclet");
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new cprm(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cprn r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cprl
            if (r0 == 0) goto L13
            r0 = r6
            cprl r0 = (defpackage.cprl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cprl r0 = new cprl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cprn r5 = r0.d
            defpackage.ffci.b(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.f
            java.lang.Object r6 = r6.b()
            atsk r6 = (defpackage.atsk) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L5c
            r0.d = r5
            r0.c = r3
            ffsk r6 = r5.h
            ffhd r6 = r6.hT()
            cprk r2 = new cprk
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r6 = defpackage.ekxl.a(r6, r2, r0)
            if (r6 == r1) goto L5b
        L58:
            java.util.Set r6 = (java.util.Set) r6
            goto L60
        L5b:
            return r1
        L5c:
            java.util.Set r6 = r5.c()
        L60:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r6.next()
            r2 = r1
            awui r2 = (defpackage.awui) r2
            ffbr r3 = r5.e
            java.lang.Object r3 = r3.b()
            djrv r3 = (defpackage.djrv) r3
            java.lang.String r2 = r2.d
            boolean r2 = r3.w(r2)
            if (r2 == 0) goto L69
            r0.add(r1)
            goto L69
        L8a:
            java.util.Set r5 = defpackage.ffdx.ar(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprn.b(cprn, ffgu):java.lang.Object");
    }

    public final Set c() {
        return ((crgh) this.d.b()).f(crgf.c);
    }
}

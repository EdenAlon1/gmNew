package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwj implements djrw, djry, djrv, dkay {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/provisioning/RcsProvisioningManagerKt");
    private final dkaw b;
    private final azpx c;
    private final azpo d;

    public clwj(dkaw dkawVar, azpx azpxVar, azpo azpoVar) {
        this.b = dkawVar;
        this.c = azpxVar;
        this.d = azpoVar;
    }

    @Override // defpackage.djrv
    public final djtc a(djrj djrjVar) {
        return this.b.a(djrjVar);
    }

    @Override // defpackage.djrv
    public final djtc b(String str) {
        return this.b.b(str);
    }

    @Override // defpackage.djrv
    @ffbs
    public final djtc c() {
        return this.b.c();
    }

    @Override // defpackage.djrv
    @ffbs
    public final djtc d(int i) {
        return this.b.d(i);
    }

    @Override // defpackage.djrv
    public final elfl e(int i) {
        return this.b.e(i);
    }

    @Override // defpackage.djrv
    public final elfl f() {
        return this.b.f();
    }

    @Override // defpackage.djrv
    public final elfl g(String str) {
        return this.b.g(str);
    }

    @Override // defpackage.djrv
    public final ListenableFuture h() {
        return this.b.h();
    }

    @Override // defpackage.djry
    public final Optional i(djrm djrmVar) {
        return this.b.i(djrmVar);
    }

    @Override // defpackage.djry
    @ffbs
    public final Optional j(String str) {
        return this.b.j(str);
    }

    @Override // defpackage.djry
    public final Optional k(djrj djrjVar) {
        return this.b.k(djrjVar);
    }

    @Override // defpackage.djry
    @ffbs
    public final Optional l(int i) {
        return this.b.l(i);
    }

    @Override // defpackage.djry
    @ffbs
    public final Optional m() {
        return this.b.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.djrw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.azsu r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.clwh
            if (r0 == 0) goto L13
            r0 = r6
            clwh r0 = (defpackage.clwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clwh r0 = new clwh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            azsu r5 = r0.e
            clwj r0 = r0.d
            defpackage.ffci.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r4.o(r5, r0)
            if (r6 == r1) goto L61
            r0 = r4
        L43:
            if (r6 == 0) goto L4e
            java.lang.String r6 = (java.lang.String) r6
            dkaw r5 = r0.b
            djtc r5 = r5.b(r6)
            return r5
        L4e:
            java.util.Objects.toString(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProvisioningId is empty for myIdentityToken: "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwj.n(azsu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.azsu r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.clwi
            if (r0 == 0) goto L13
            r0 = r7
            clwi r0 = (defpackage.clwi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clwi r0 = new clwi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            azsu r6 = r0.e
            clwj r0 = r0.d
            defpackage.ffci.b(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            azpx r7 = r5.c
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 == r1) goto L7e
            r0 = r5
        L45:
            azop r7 = (defpackage.azop) r7
            azpo r0 = r0.d
            azpp r7 = r0.a(r7)
            j$.util.Optional r7 = r7.d()
            r7.getClass()
            java.lang.Object r7 = defpackage.fflm.b(r7)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L7d
            enru r0 = defpackage.clwj.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "RcsProvisioning"
            r0.Y(r1, r2)
            java.lang.String r1 = "getProvisioningId"
            r2 = 115(0x73, float:1.61E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/provisioning/RcsProvisioningManagerKt"
            java.lang.String r4 = "RcsProvisioningManagerKt.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "ProvisioningId is empty for myIdentityToken: %s"
            r0.t(r1, r6)
        L7d:
            return r7
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwj.o(azsu, ffgu):java.lang.Object");
    }

    @Override // defpackage.djrv
    @ffbs
    public final Set p() {
        return this.b.p();
    }

    @Override // defpackage.djrv
    public final Set q() {
        return this.b.q();
    }

    @Override // defpackage.djrv
    public final void r(String str, djru djruVar, Executor executor) {
        this.b.r(str, djruVar, executor);
    }

    @Override // defpackage.dkay
    public final void s(String str, djtc djtcVar) {
        this.b.s(str, djtcVar);
    }

    @Override // defpackage.dkay
    public final void t(String str, Optional optional) {
        this.b.t(str, optional);
    }

    @Override // defpackage.djrv
    public final void u(djru djruVar) {
        this.b.u(djruVar);
    }

    @Override // defpackage.djrv
    public final boolean v(djrj djrjVar) {
        return this.b.v(djrjVar);
    }

    @Override // defpackage.djrv
    public final boolean w(String str) {
        return this.b.w(str);
    }

    @Override // defpackage.djrv
    public final boolean x(int i) {
        return this.b.x(i);
    }

    @Override // defpackage.djrv
    public final boolean y(int i) {
        return this.b.y(i);
    }
}

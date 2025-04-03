package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvdw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cvdy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdw(List list, cvdy cvdyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = cvdyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r5 != r0) goto L21;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L54
        Ld:
            defpackage.ffci.b(r5)     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L43
        L11:
            r5 = move-exception
            goto L73
        L13:
            defpackage.ffci.b(r5)
            cfup r5 = defpackage.cvfg.h     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r5.e()     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            boolean r5 = r5.booleanValue()     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 == 0) goto L27
            java.util.List r5 = r4.b     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L45
        L27:
            cvdy r5 = r4.c     // Catch: java.util.concurrent.TimeoutException -> L11
            ffbr r5 = r5.b     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r5.b()     // Catch: java.util.concurrent.TimeoutException -> L11
            cvgd r5 = (defpackage.cvgd) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            java.util.List r1 = r4.b     // Catch: java.util.concurrent.TimeoutException -> L11
            elfl r5 = r5.a(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.getClass()     // Catch: java.util.concurrent.TimeoutException -> L11
            r4.a = r2     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 != r0) goto L43
            goto L53
        L43:
            java.util.List r5 = (java.util.List) r5     // Catch: java.util.concurrent.TimeoutException -> L11
        L45:
            cvdy r1 = r4.c     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.getClass()     // Catch: java.util.concurrent.TimeoutException -> L11
            r2 = 2
            r4.a = r2     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.Object r5 = r1.a(r5, r4)     // Catch: java.util.concurrent.TimeoutException -> L11
            if (r5 != r0) goto L54
        L53:
            return r0
        L54:
            java.util.List r5 = (java.util.List) r5     // Catch: java.util.concurrent.TimeoutException -> L11
            bvvr r0 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.f()     // Catch: java.util.concurrent.TimeoutException -> L11
            java.lang.String r1 = "updateReachabilityOnlyForDuoKitAndViLTE"
            r0.ap(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            r1 = 6
            r0.T(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            cvdv r1 = new cvdv     // Catch: java.util.concurrent.TimeoutException -> L11
            r1.<init>()     // Catch: java.util.concurrent.TimeoutException -> L11
            r0.V(r1)     // Catch: java.util.concurrent.TimeoutException -> L11
            bvvq r5 = r0.b()     // Catch: java.util.concurrent.TimeoutException -> L11
            r5.e()     // Catch: java.util.concurrent.TimeoutException -> L11
            goto L99
        L73:
            enru r0 = defpackage.cvdy.a
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "Bugle"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r5 = r0.g(r5)
            java.lang.String r0 = "invokeSuspend"
            r1 = 100
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCallingReachabilityUpdater$updateReachability$1"
            java.lang.String r3 = "BugleVideoCallingReachabilityUpdater.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "skipping reachability update"
            r5.q(r0)
        L99:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvdw(this.b, this.c, ffguVar);
    }
}

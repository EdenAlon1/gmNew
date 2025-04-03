package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzs extends ffhv implements ffji {
    int a;
    final /* synthetic */ akag b;
    final /* synthetic */ UUID c;
    final /* synthetic */ akci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzs(akag akagVar, UUID uuid, akci akciVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akagVar;
        this.c = uuid;
        this.d = akciVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        if (r7.f(r1, r2, r6) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r7.s(r1, r3, r6) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Lb
            goto L6f
        Lb:
            akag r7 = r6.b
            java.util.UUID r1 = r6.c
            eqza r3 = defpackage.eqza.DO_COMPLETE_RESTORE
            defpackage.akag.l(r7, r3, r1)
            enru r7 = defpackage.akag.a
            ensk r7 = r7.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleBackup"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 249(0xf9, float:3.49E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$doCompleteRestore$2"
            java.lang.String r5 = "BasicRestoreWorkflowSteps.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.util.UUID r1 = r6.c
            java.lang.String r3 = "Finalizing restore execution [%s]"
            r7.t(r3, r1)
            entd r7 = defpackage.ajyr.a
            akci r7 = r6.d
            boolean r7 = defpackage.ajwx.a(r7)
            if (r7 == 0) goto L57
            akag r7 = r6.b
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ajyr r7 = (defpackage.ajyr) r7
            java.util.UUID r1 = r6.c
            akci r3 = r6.d
            r6.a = r2
            java.lang.Object r7 = r7.s(r1, r3, r6)
            if (r7 != r0) goto L6f
            goto L6e
        L57:
            akag r7 = r6.b
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ajyr r7 = (defpackage.ajyr) r7
            java.util.UUID r1 = r6.c
            akci r2 = r6.d
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.f(r1, r2, r6)
            if (r7 != r0) goto L6f
        L6e:
            return r0
        L6f:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ajzs(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}

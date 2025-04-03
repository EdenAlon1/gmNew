package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akau extends ffhv implements ffji {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;
    final /* synthetic */ akci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akau(akbo akboVar, UUID uuid, akci akciVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akboVar;
        this.c = uuid;
        this.d = akciVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (r7.f(r1, r2, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (defpackage.akbo.o(r7, r4, r1, r6) != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r7.s(r1, r3, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007e, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Le
            defpackage.ffci.b(r7)
            if (r1 == r3) goto L1f
            goto L7b
        Le:
            defpackage.ffci.b(r7)
            akbo r7 = r6.b
            java.util.UUID r1 = r6.c
            eqza r4 = defpackage.eqza.DO_COMPLETE_RESTORE
            r6.a = r3
            java.lang.Object r7 = defpackage.akbo.o(r7, r4, r1, r6)
            if (r7 == r0) goto L7e
        L1f:
            enru r7 = defpackage.akbo.a
            ensk r7 = r7.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleBackup"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 320(0x140, float:4.48E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$doCompleteRestore$2"
            java.lang.String r5 = "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.util.UUID r1 = r6.c
            java.lang.String r3 = "Finalizing restore execution: workflowVersion: [%s] sessionId: [%s]"
            r4 = 5
            r7.w(r3, r4, r1)
            entd r7 = defpackage.ajyr.a
            akci r7 = r6.d
            boolean r7 = defpackage.ajwx.a(r7)
            if (r7 == 0) goto L63
            akbo r7 = r6.b
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ajyr r7 = (defpackage.ajyr) r7
            java.util.UUID r1 = r6.c
            akci r3 = r6.d
            r6.a = r2
            java.lang.Object r7 = r7.s(r1, r3, r6)
            if (r7 != r0) goto L7b
            goto L7e
        L63:
            akbo r7 = r6.b
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ajyr r7 = (defpackage.ajyr) r7
            java.util.UUID r1 = r6.c
            akci r2 = r6.d
            r3 = 3
            r6.a = r3
            java.lang.Object r7 = r7.f(r1, r2, r6)
            if (r7 != r0) goto L7b
            goto L7e
        L7b:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akau.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akau(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}

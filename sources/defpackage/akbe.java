package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbe extends ffhv implements ffji {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;
    final /* synthetic */ akdb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbe(akbo akboVar, UUID uuid, akdb akdbVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akboVar;
        this.c = uuid;
        this.d = akdbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r7 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0053, code lost:
    
        if (r7.r(r1, r2, r6) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L3e
            goto L56
        Ld:
            enru r7 = defpackage.akbo.a
            ensk r7 = r7.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleBackup"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 111(0x6f, float:1.56E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$initializeRestore$2"
            java.lang.String r5 = "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.util.UUID r1 = r6.c
            java.lang.String r3 = "Starting new Restore Execution: workflowVersion: [%s] sessionId: [%s]"
            r4 = 5
            r7.w(r3, r4, r1)
            akbo r7 = r6.b
            java.util.UUID r1 = r6.c
            eqza r3 = defpackage.eqza.INITIALIZE_RESTORE_WORKFLOW
            r6.a = r2
            java.lang.Object r7 = defpackage.akbo.n(r7, r3, r1, r6)
            if (r7 == r0) goto L59
        L3e:
            akbo r7 = r6.b
            ffbr r7 = r7.b
            java.lang.Object r7 = r7.b()
            ajyr r7 = (defpackage.ajyr) r7
            java.util.UUID r1 = r6.c
            akdb r2 = r6.d
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.r(r1, r2, r6)
            if (r7 != r0) goto L56
            goto L59
        L56:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akbe(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}

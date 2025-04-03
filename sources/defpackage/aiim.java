package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiim implements aiih {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/statemachine/RequestedOperation");
    private final aigx b;

    public aiim(aigx aigxVar) {
        aigxVar.getClass();
        this.b = aigxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.aiih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, defpackage.aihv r12, defpackage.aigw r13, defpackage.ffgu r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.aiil
            if (r0 == 0) goto L13
            r0 = r14
            aiil r0 = (defpackage.aiil) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aiil r0 = new aiil
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            java.lang.String r3 = "Marking navigation request as completed"
            r4 = 62
            r5 = 1
            java.lang.String r6 = "execute"
            java.lang.String r7 = "com/google/android/apps/messaging/navigation/statemachine/RequestedOperation"
            java.lang.String r8 = "RequestedState.kt"
            if (r2 == 0) goto L3f
            if (r2 != r5) goto L37
            int r11 = r0.a
            aiim r12 = r0.e
            defpackage.ffci.b(r14)     // Catch: java.lang.Throwable -> L35
            goto L81
        L35:
            r13 = move-exception
            goto L9b
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            defpackage.ffci.b(r14)
            boolean r14 = r13 instanceof defpackage.aigt
            if (r14 == 0) goto Lb0
            enru r14 = defpackage.aiim.a     // Catch: java.lang.Throwable -> L98
            ensk r2 = r14.h()     // Catch: java.lang.Throwable -> L98
            r9 = 57
            ensk r2 = r2.h(r7, r6, r9, r8)     // Catch: java.lang.Throwable -> L98
            enrr r2 = (defpackage.enrr) r2     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = "Marking navigation request as dispatched"
            r2.q(r9)     // Catch: java.lang.Throwable -> L98
            aigx r2 = r10.b     // Catch: java.lang.Throwable -> L98
            r2.d(r11)     // Catch: java.lang.Throwable -> L98
            ensk r14 = r14.h()     // Catch: java.lang.Throwable -> L98
            r2 = 59
            ensk r14 = r14.h(r7, r6, r2, r8)     // Catch: java.lang.Throwable -> L98
            enrr r14 = (defpackage.enrr) r14     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "Invoking navigation handler for target %s"
            r14.t(r2, r12)     // Catch: java.lang.Throwable -> L98
            aigt r13 = (defpackage.aigt) r13     // Catch: java.lang.Throwable -> L98
            aihs r12 = (defpackage.aihs) r12     // Catch: java.lang.Throwable -> L98
            r0.e = r10     // Catch: java.lang.Throwable -> L98
            r0.a = r11     // Catch: java.lang.Throwable -> L98
            r0.d = r5     // Catch: java.lang.Throwable -> L98
            java.lang.Object r12 = r13.a(r12, r0)     // Catch: java.lang.Throwable -> L98
            if (r12 != r1) goto L80
            return r1
        L80:
            r12 = r10
        L81:
            enru r13 = defpackage.aiim.a
            ensk r13 = r13.h()
            ensk r13 = r13.h(r7, r6, r4, r8)
            enrr r13 = (defpackage.enrr) r13
            r13.q(r3)
            aigx r12 = r12.b
            r12.b(r11)
            ffcu r11 = defpackage.ffcu.a
            return r11
        L98:
            r12 = move-exception
            r13 = r12
            r12 = r10
        L9b:
            enru r14 = defpackage.aiim.a
            ensk r14 = r14.h()
            ensk r14 = r14.h(r7, r6, r4, r8)
            enrr r14 = (defpackage.enrr) r14
            r14.q(r3)
            aigx r12 = r12.b
            r12.b(r11)
            throw r13
        Lb0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "RequestedOperation can only be executed for targets without a result."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiim.a(int, aihv, aigw, ffgu):java.lang.Object");
    }
}

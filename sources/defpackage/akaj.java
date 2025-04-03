package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akaj {
    private static final enru a = enru.c("com/google/android/apps/messaging/restore/impl/CommonRestoreFunctions");
    private final ffbr b;

    public akaj(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    public final eqyq a(ajwc ajwcVar, int i) {
        akcd akcdVar = ajwcVar.f;
        if (akcdVar != null) {
            if (akcdVar.c > 140) {
                return eqyq.BACKUP_SCHEMA_OUT_OF_DATE;
            }
            if (i < akcdVar.g) {
                return eqyq.RESTORE_WORKFLOW_OUT_OF_DATE;
            }
            throw new IllegalStateException("App update required but both backup DB schema and workflow version are up to date");
        }
        throw new IllegalStateException("No backup database metadata found for [" + ajwcVar.a + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r13, defpackage.akcd r14, defpackage.ffgu r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.akah
            if (r0 == 0) goto L13
            r0 = r15
            akah r0 = (defpackage.akah) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akah r0 = new akah
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r15)
            goto L8d
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            defpackage.ffci.b(r15)
            long r14 = r14.f
            enru r2 = defpackage.akaj.a
            ensk r4 = r2.h()
            ensn r5 = defpackage.ente.a
            java.lang.String r6 = "BugleBackup"
            r4.Y(r5, r6)
            r5 = 61
            java.lang.String r7 = "com/google/android/apps/messaging/restore/impl/CommonRestoreFunctions"
            java.lang.String r8 = "checkBackupDbSchemaOutOfDate"
            java.lang.String r9 = "CommonRestoreFunctions.kt"
            ensk r4 = r4.h(r7, r8, r5, r9)
            enrr r4 = (defpackage.enrr) r4
            r10 = 140(0x8c, double:6.9E-322)
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            r15 = 0
            if (r14 <= 0) goto L58
            r5 = r3
            goto L59
        L58:
            r5 = r15
        L59:
            java.lang.String r10 = "Backup database schema out of date: %s"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.t(r10, r5)
            if (r14 <= 0) goto L92
            ensk r14 = r2.h()
            ensn r15 = defpackage.ente.a
            r14.Y(r15, r6)
            r15 = 63
            ensk r14 = r14.h(r7, r8, r15, r9)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r15 = "Could not proceed with restore after app update [%s]"
            r14.t(r15, r13)
            ffbr r14 = r12.b
            java.lang.Object r14 = r14.b()
            ajyr r14 = (defpackage.ajyr) r14
            akci r15 = defpackage.akci.COMPLETE_FAILED_APP_UPDATE
            r0.c = r3
            java.lang.Object r13 = r14.s(r13, r15, r0)
            if (r13 != r1) goto L8d
            return r1
        L8d:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        L92:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaj.b(java.util.UUID, akcd, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r12, int r13, defpackage.akcd r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.akai
            if (r0 == 0) goto L13
            r0 = r15
            akai r0 = (defpackage.akai) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akai r0 = new akai
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r15)
            goto L8c
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.ffci.b(r15)
            long r4 = (long) r13
            long r13 = r14.g
            enru r15 = defpackage.akaj.a
            ensk r2 = r15.h()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleBackup"
            r2.Y(r6, r7)
            r6 = 45
            java.lang.String r8 = "com/google/android/apps/messaging/restore/impl/CommonRestoreFunctions"
            java.lang.String r9 = "checkRestoreWorkflowVersionOutOfDate"
            java.lang.String r10 = "CommonRestoreFunctions.kt"
            ensk r2 = r2.h(r8, r9, r6, r10)
            enrr r2 = (defpackage.enrr) r2
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r14 = 0
            if (r13 >= 0) goto L57
            r4 = r3
            goto L58
        L57:
            r4 = r14
        L58:
            java.lang.String r5 = "Restore workflow version out of date: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.t(r5, r4)
            if (r13 >= 0) goto L91
            ensk r13 = r15.h()
            ensn r14 = defpackage.ente.a
            r13.Y(r14, r7)
            r14 = 47
            ensk r13 = r13.h(r8, r9, r14, r10)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r14 = "Could not proceed with restore after app update [%s]"
            r13.t(r14, r12)
            ffbr r13 = r11.b
            java.lang.Object r13 = r13.b()
            ajyr r13 = (defpackage.ajyr) r13
            akci r14 = defpackage.akci.COMPLETE_FAILED_APP_UPDATE
            r0.c = r3
            java.lang.Object r12 = r13.s(r12, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        L91:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaj.c(java.util.UUID, int, akcd, ffgu):java.lang.Object");
    }
}

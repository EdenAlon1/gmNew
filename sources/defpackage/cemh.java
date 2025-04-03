package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemh implements cdwr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/FinishCmsRestoreAfterMessageInsertionWorkItemProcessor");

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((ceml) obj).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        if (defpackage.fgfz.c(r13, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r15 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cemi r13, defpackage.ceml r14, defpackage.ffgu r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.cemg
            if (r0 == 0) goto L13
            r0 = r15
            cemg r0 = (defpackage.cemg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cemg r0 = new cemg
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r15)
            goto Lcc
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            java.lang.Object r13 = r0.a
            defpackage.ffci.b(r15)
            goto Lb6
        L3a:
            defpackage.ffci.b(r15)
            enru r15 = defpackage.cemh.a
            ensk r2 = r15.j()
            ensn r5 = defpackage.ente.a
            java.lang.String r6 = "BugleCms"
            r2.Y(r5, r6)
            r5 = 57
            java.lang.String r7 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/simsendingfallback/FinishCmsRestoreAfterMessageInsertionWorkItemProcessor"
            java.lang.String r8 = "processCmsWorkItem"
            java.lang.String r9 = "FinishCmsRestoreAfterMessageInsertionWorkItemProcessor.kt"
            ensk r2 = r2.h(r7, r8, r5, r9)
            enrr r2 = (defpackage.enrr) r2
            long r10 = r14.c
            java.lang.String r5 = "Finishing CMS restore for message %s"
            r2.s(r5, r10)
            long r10 = r14.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = new com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType
            r2.<init>(r10)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.b(r2)
            j$.util.Optional r2 = j$.util.Optional.ofNullable(r2)
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L91
            ensk r13 = r15.j()
            ensn r15 = defpackage.ente.a
            r13.Y(r15, r6)
            r15 = 64
            ensk r13 = r13.h(r7, r8, r15, r9)
            enrr r13 = (defpackage.enrr) r13
            long r14 = r14.c
            java.lang.String r0 = "Failed to find message %s"
            r13.s(r0, r14)
            ceyt r13 = defpackage.ceyt.k()
            return r13
        L91:
            java.lang.Object r2 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r2 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData) r2
            java.lang.String r2 = r2.R()
            if (r2 == 0) goto Ld2
            int r5 = r2.length()
            if (r5 != 0) goto La4
            goto Ld2
        La4:
            crty r14 = r13.eR()
            elfl r14 = r14.q(r2)
            r0.a = r13
            r0.d = r4
            java.lang.Object r15 = defpackage.fgfz.c(r14, r0)
            if (r15 == r1) goto Ld1
        Lb6:
            eszz r15 = (defpackage.eszz) r15
            ccjm r13 = r13.bu()
            elfl r13 = r13.a(r15)
            r14 = 0
            r0.a = r14
            r0.d = r3
            java.lang.Object r13 = defpackage.fgfz.c(r13, r0)
            if (r13 != r1) goto Lcc
            goto Ld1
        Lcc:
            ceyt r13 = defpackage.ceyt.i()
            return r13
        Ld1:
            return r1
        Ld2:
            ensk r13 = r15.j()
            ensn r15 = defpackage.ente.a
            r13.Y(r15, r6)
            r15 = 70
            ensk r13 = r13.h(r7, r8, r15, r9)
            enrr r13 = (defpackage.enrr) r13
            long r14 = r14.c
            java.lang.String r0 = "Message %s has no CMS ID set"
            r13.s(r0, r14)
            ceyt r13 = defpackage.ceyt.k()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemh.b(cemi, ceml, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return b((cemi) obj, (ceml) obj2, ffguVar);
    }
}

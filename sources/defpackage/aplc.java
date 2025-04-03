package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ apkn c;
    final /* synthetic */ apld d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplc(long j, apkn apknVar, apld apldVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = apknVar;
        this.d = apldVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (defpackage.ffsw.c(r6, r9) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
    
        if (r10.a(r1, r9) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0064, code lost:
    
        r10 = r9.d;
        r0 = r9.c;
        r10.f.c(new defpackage.aplb(r0), "EmergencySessionTimeoutTracker::Notify");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        return defpackage.ffcu.a;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker$scheduleSessionTimeout$1$1"
            java.lang.String r4 = "EmergencySessionTimeoutTracker.kt"
            r5 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto L13
            if (r1 == r5) goto L3d
            goto L64
        L13:
            enru r10 = defpackage.apld.a
            ensk r10 = r10.h()
            r1 = 88
            ensk r10 = r10.h(r3, r2, r1, r4)
            enrr r10 = (defpackage.enrr) r10
            long r6 = r9.b
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            apkn r6 = r9.c
            apld r7 = r9.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r7 = r7.d
            java.lang.String r8 = "Scheduling emergency session expiry with delay %s for session %s in conversation %s"
            r10.J(r8, r1, r6, r7)
            long r6 = r9.b
            r9.a = r5
            java.lang.Object r10 = defpackage.ffsw.c(r6, r9)
            if (r10 == r0) goto L77
        L3d:
            enru r10 = defpackage.apld.a
            ensk r10 = r10.h()
            r1 = 97
            ensk r10 = r10.h(r3, r2, r1, r4)
            enrr r10 = (defpackage.enrr) r10
            apkn r1 = r9.c
            apld r2 = r9.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r2 = r2.d
            java.lang.String r3 = "Emergency session expired for %s in conversation %s"
            r10.D(r3, r1, r2)
            apld r10 = r9.d
            apkn r1 = r9.c
            r2 = 2
            r9.a = r2
            java.lang.Object r10 = r10.a(r1, r9)
            if (r10 != r0) goto L64
            goto L77
        L64:
            apld r10 = r9.d
            apkn r0 = r9.c
            aplb r1 = new aplb
            r1.<init>()
            ctbl r10 = r10.f
            java.lang.String r0 = "EmergencySessionTimeoutTracker::Notify"
            r10.c(r1, r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplc(this.b, this.c, this.d, ffguVar);
    }
}

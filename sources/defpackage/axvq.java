package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvq implements alkx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/analytics/ContactsSyncRecurringMetricsLoggerImpl");
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public axvq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.b = ffbrVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.axvp
            if (r0 == 0) goto L13
            r0 = r6
            axvp r0 = (defpackage.axvp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axvp r0 = new axvp
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axvq r0 = r0.d
            defpackage.ffci.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.c
            java.lang.Object r6 = r6.b()
            r6.getClass()
            ffhd r6 = (defpackage.ffhd) r6
            ffhd r6 = defpackage.ekxi.a(r6)
            axvo r2 = new axvo
            r4 = 0
            r2.<init>(r4, r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 == r1) goto Laa
            r0 = r5
        L54:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L76
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5f
        L76:
            java.util.Iterator r3 = r3.iterator()
        L7a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r3.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            java.lang.String r4 = r4.R()
            if (r4 == 0) goto L92
            boolean r4 = defpackage.ffpc.J(r4)
            if (r4 == 0) goto L7a
        L92:
            r1.add(r2)
            goto L5f
        L96:
            int r6 = r1.size()
            ffbr r0 = r0.e
            java.lang.Object r0 = r0.b()
            akzt r0 = (defpackage.akzt) r0
            java.lang.String r1 = "Bugle.RecentConversations.RecipientWithoutName.Count"
            r0.e(r1, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axvq.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.alkx
    public final void b() {
        Object b = this.d.b();
        b.getClass();
        axol.k((ffsk) b, null, new axvn(this, null), 3);
    }
}

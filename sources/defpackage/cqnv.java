package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqnv implements cqnw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater");
    public static final String[] b = {"_id", "chset"};
    public static final Uri c;
    public final ffbr d;
    public final ffsk e;
    public final ffbr f;
    public final Context g;
    public final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    static {
        Uri parse = Uri.parse("content://mms/part");
        parse.getClass();
        c = parse;
    }

    public cqnv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, ffbr ffbrVar4, Context context, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        ffbrVar4.getClass();
        context.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.d = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.e = ffskVar;
        this.f = ffbrVar4;
        this.g = context;
        this.k = ffbrVar5;
        this.h = ffbrVar6;
        this.l = ffbrVar7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r20, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r21, long r22, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, java.lang.String r7, int r8, defpackage.ffgu r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.cqnd
            if (r0 == 0) goto L13
            r0 = r9
            cqnd r0 = (defpackage.cqnd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqnd r0 = new cqnd
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L78
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r9)
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.String r2 = "address"
            r9.put(r2, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            java.lang.String r8 = "type"
            r9.put(r8, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r8 = 106(0x6a, float:1.49E-43)
            r7.<init>(r8)
            java.lang.String r8 = "charset"
            r9.put(r8, r7)
            ffbr r7 = r4.d
            java.lang.Object r7 = r7.b()
            ejtr r7 = (defpackage.ejtr) r7
            java.lang.String r8 = "content://mms/"
            java.lang.String r2 = "/addr"
            java.lang.String r5 = defpackage.a.y(r5, r8, r2)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            ejth r6 = new ejth
            r6.<init>()
            com.google.common.util.concurrent.ListenableFuture r5 = r7.c(r6)
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r5, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            android.net.Uri r9 = (android.net.Uri) r9
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.b(long, java.lang.String, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: all -> 0x00a5, LOOP:0: B:13:0x007f->B:15:0x0085, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00a5, blocks: (B:12:0x0079, B:13:0x007f, B:15:0x0085), top: B:11:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cqne
            if (r0 == 0) goto L13
            r0 = r12
            cqne r0 = (defpackage.cqne) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqne r0 = new cqne
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            cqnv r0 = r0.d
            defpackage.ffci.b(r12)
            goto L77
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            defpackage.ffci.b(r12)
            ffbr r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            ejtr r5 = (defpackage.ejtr) r5
            android.net.Uri r6 = defpackage.cqnv.c
            java.lang.String r12 = "DISTINCT chset"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            java.util.Locale r12 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r9 = "chset"
            r8[r3] = r9
            r8[r4] = r9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String r8 = "%s IS NOT NULL AND %s != 0"
            java.lang.String r8 = java.lang.String.format(r12, r8, r2)
            r8.getClass()
            r9 = 0
            r10 = 0
            erph r12 = r5.b(r6, r7, r8, r9, r10)
            ffsk r2 = r11.e
            ffss r12 = defpackage.axnh.b(r12, r2)
            r0.d = r11
            r0.c = r4
            ffuq r12 = (defpackage.ffuq) r12
            java.lang.Object r12 = r12.B(r0)
            if (r12 == r1) goto Lad
            r0 = r11
        L77:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r1 = r12
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> La5
            r1.getClass()     // Catch: java.lang.Throwable -> La5
        L7f:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9e
            java.lang.String r2 = r1.getString(r3)     // Catch: java.lang.Throwable -> La5
            r2.getClass()     // Catch: java.lang.Throwable -> La5
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> La5
            ffbr r4 = r0.j     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> La5
            akzt r4 = (defpackage.akzt) r4     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "Bugle.Telephony.Parts.Charset.Counts"
            r4.e(r5, r2)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L9e:
            r0 = 0
            defpackage.ffig.a(r12, r0)
            ffcu r12 = defpackage.ffcu.a
            return r12
        La5:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            defpackage.ffig.a(r12, r1)
            throw r0
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
    
        if (r12.a(r13, r14, r15, r17) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015b, code lost:
    
        if (r14.i((android.net.Uri) r15, r4, r1) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r4 = r12;
        r11 = r13;
        r12 = r14;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015d, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.database.Cursor r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.d(android.database.Cursor, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.database.Cursor r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cqng
            if (r0 == 0) goto L13
            r0 = r12
            cqng r0 = (defpackage.cqng) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cqng r0 = new cqng
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.b
            java.lang.Object r2 = r0.a
            cqnv r4 = r0.f
            defpackage.ffci.b(r12)
            r12 = r11
            r11 = r2
            goto L40
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.ffci.b(r12)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r4 = r10
        L40:
            boolean r2 = r11.moveToNext()
            if (r2 == 0) goto Le8
            r2 = 0
            long r5 = r11.getLong(r2)
            android.net.Uri r2 = android.provider.Telephony.Mms.CONTENT_URI
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            android.net.Uri$Builder r2 = r2.appendPath(r5)
            android.net.Uri r2 = r2.build()
            r2.getClass()
            buxo r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r6 = "getConversationIdByUri"
            r5.z(r6)
            cqmp r6 = new cqmp
            r6.<init>()
            r5.h(r6)
            buxm r5 = r5.b()
            dtsu r5 = r5.o()
            buuo r5 = (defpackage.buuo) r5
            dtro r5 = r5.cS()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r5 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData) r5
            if (r5 == 0) goto L89
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r5.C()
            if (r5 != 0) goto L8b
        L89:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.bdgq.a
        L8b:
            boolean r6 = r5.b()
            if (r6 == 0) goto Lb2
            enru r5 = defpackage.cqnv.a
            ensk r5 = r5.e()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleTelephony"
            r5.Y(r6, r7)
            java.lang.String r6 = "processOutgoingMmsMessagesInThreadZero"
            r7 = 170(0xaa, float:2.38E-43)
            java.lang.String r8 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater"
            java.lang.String r9 = "TelephonyDatabaseUpdater.kt"
            ensk r5 = r5.h(r8, r6, r7, r9)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Conversation not found for MMS. Skipping thread Id update: %s"
            r5.t(r6, r2)
            goto L40
        Lb2:
            cqmu r6 = new cqmu
            r6.<init>()
            cqmv r7 = new cqmv
            r7.<init>()
            java.lang.Object r5 = j$.util.Map.EL.computeIfAbsent(r12, r5, r7)
            r5.getClass()
            cpxu r5 = (defpackage.cpxu) r5
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            long r7 = r5.a()
            int r5 = (int) r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            java.lang.String r5 = "thread_id"
            r6.put(r5, r7)
            r0.f = r4
            r0.a = r11
            r0.b = r12
            r0.e = r3
            java.lang.Object r2 = r4.i(r2, r6, r0)
            if (r2 != r1) goto L40
            return r1
        Le8:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.e(android.database.Cursor, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.database.Cursor r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cqnh
            if (r0 == 0) goto L13
            r0 = r11
            cqnh r0 = (defpackage.cqnh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cqnh r0 = new cqnh
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r10 = r0.b
            java.lang.Object r2 = r0.a
            cqnv r4 = r0.f
            defpackage.ffci.b(r11)
            r11 = r10
            r10 = r2
            goto L40
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            defpackage.ffci.b(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r4 = r9
        L40:
            boolean r2 = r10.moveToNext()
            if (r2 == 0) goto La6
            cqnb r2 = new cqnb
            r5 = 0
            long r5 = r10.getLong(r5)
            java.lang.String r7 = r10.getString(r3)
            r7.getClass()
            r2.<init>(r5, r7)
            java.lang.String r5 = r2.b
            cqmx r6 = new cqmx
            r6.<init>()
            cqmy r7 = new cqmy
            r7.<init>()
            java.lang.Object r5 = j$.util.Map.EL.computeIfAbsent(r11, r5, r7)
            r5.getClass()
            cpxu r5 = (defpackage.cpxu) r5
            android.net.Uri r6 = android.provider.Telephony.Sms.CONTENT_URI
            android.net.Uri$Builder r6 = r6.buildUpon()
            long r7 = r2.a
            java.lang.String r2 = java.lang.String.valueOf(r7)
            android.net.Uri$Builder r2 = r6.appendPath(r2)
            android.net.Uri r2 = r2.build()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            long r7 = r5.a()
            int r5 = (int) r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            java.lang.String r5 = "thread_id"
            r6.put(r5, r7)
            r2.getClass()
            r0.f = r4
            r0.a = r10
            r0.b = r11
            r0.e = r3
            java.lang.Object r2 = r4.i(r2, r6, r0)
            if (r2 != r1) goto L40
            return r1
        La6:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.f(android.database.Cursor, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r6, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cqni
            if (r0 == 0) goto L13
            r0 = r8
            cqni r0 = (defpackage.cqni) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqni r0 = new cqni
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffbr r8 = r5.d
            java.lang.Object r8 = r8.b()
            ejtr r8 = (defpackage.ejtr) r8
            java.lang.String r2 = "content://mms/"
            java.lang.String r4 = "/addr"
            java.lang.String r6 = defpackage.a.y(r6, r2, r4)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r7 = "type != 137"
            com.google.common.util.concurrent.ListenableFuture r6 = r8.g(r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r6, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            java.lang.Integer r8 = (java.lang.Integer) r8
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.g(long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00db -> B:10:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.h(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.net.Uri r5, android.content.ContentValues r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cqnk
            if (r0 == 0) goto L13
            r0 = r7
            cqnk r0 = (defpackage.cqnk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqnk r0 = new cqnk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            ffbr r7 = r4.d
            java.lang.Object r7 = r7.b()
            ejtr r7 = (defpackage.ejtr) r7
            r2 = 0
            com.google.common.util.concurrent.ListenableFuture r5 = r7.h(r5, r6, r2)
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Integer r7 = (java.lang.Integer) r7
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.i(android.net.Uri, android.content.ContentValues, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r2.l(r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cqnl
            if (r0 == 0) goto L13
            r0 = r6
            cqnl r0 = (defpackage.cqnl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqnl r0 = new cqnl
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            cqnv r2 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L38:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.k(r0)
            if (r6 == r1) goto L55
            r2 = r5
        L46:
            r6 = 0
            r0.d = r6
            r0.c = r3
            java.lang.Object r6 = r2.l(r0)
            if (r6 != r1) goto L52
            goto L55
        L52:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.j(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cqnm
            if (r0 == 0) goto L13
            r0 = r12
            cqnm r0 = (defpackage.cqnm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqnm r0 = new cqnm
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L2f
            goto L83
        L2f:
            r0 = move-exception
            goto L8c
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            java.lang.Object r2 = r0.a
            cqnv r2 = (defpackage.cqnv) r2
            defpackage.ffci.b(r12)
            goto L70
        L41:
            defpackage.ffci.b(r12)
            ffbr r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            ejtr r5 = (defpackage.ejtr) r5
            android.net.Uri r6 = android.provider.Telephony.Mms.Inbox.CONTENT_URI
            java.lang.String r12 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            erph r12 = r5.b(r6, r7, r8, r9, r10)
            ffsk r2 = r11.e
            ffss r12 = defpackage.axnh.b(r12, r2)
            r0.a = r11
            r0.d = r4
            ffuq r12 = (defpackage.ffuq) r12
            java.lang.Object r12 = r12.B(r0)
            if (r12 == r1) goto L93
            r2 = r11
        L70:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r4 = r12
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L8a
            r4.getClass()     // Catch: java.lang.Throwable -> L8a
            r0.a = r12     // Catch: java.lang.Throwable -> L8a
            r0.d = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r2.d(r4, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r1) goto L93
            r1 = r12
        L83:
            r12 = 0
            defpackage.ffig.a(r1, r12)
            ffcu r12 = defpackage.ffcu.a
            return r12
        L8a:
            r0 = move-exception
            r1 = r12
        L8c:
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.ffig.a(r1, r12)
            throw r0
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cqnp
            if (r0 == 0) goto L13
            r0 = r12
            cqnp r0 = (defpackage.cqnp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqnp r0 = new cqnp
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L2f
            goto L83
        L2f:
            r0 = move-exception
            goto L8c
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            java.lang.Object r2 = r0.a
            cqnv r2 = (defpackage.cqnv) r2
            defpackage.ffci.b(r12)
            goto L70
        L41:
            defpackage.ffci.b(r12)
            ffbr r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            ejtr r5 = (defpackage.ejtr) r5
            android.net.Uri r6 = android.provider.Telephony.Mms.Sent.CONTENT_URI
            java.lang.String r12 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            erph r12 = r5.b(r6, r7, r8, r9, r10)
            ffsk r2 = r11.e
            ffss r12 = defpackage.axnh.b(r12, r2)
            r0.a = r11
            r0.d = r4
            ffuq r12 = (defpackage.ffuq) r12
            java.lang.Object r12 = r12.B(r0)
            if (r12 == r1) goto L93
            r2 = r11
        L70:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r4 = r12
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L8a
            r4.getClass()     // Catch: java.lang.Throwable -> L8a
            r0.a = r12     // Catch: java.lang.Throwable -> L8a
            r0.d = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r1) goto L93
            r1 = r12
        L83:
            r12 = 0
            defpackage.ffig.a(r1, r12)
            ffcu r12 = defpackage.ffcu.a
            return r12
        L8a:
            r0 = move-exception
            r1 = r12
        L8c:
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.ffig.a(r1, r12)
            throw r0
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.l(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cqns
            if (r0 == 0) goto L13
            r0 = r12
            cqns r0 = (defpackage.cqns) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqns r0 = new cqns
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L2f
            goto L85
        L2f:
            r0 = move-exception
            goto L8e
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            java.lang.Object r2 = r0.a
            cqnv r2 = (defpackage.cqnv) r2
            defpackage.ffci.b(r12)
            goto L72
        L41:
            defpackage.ffci.b(r12)
            ffbr r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            ejtr r5 = (defpackage.ejtr) r5
            android.net.Uri r6 = android.provider.Telephony.Sms.CONTENT_URI
            java.lang.String r12 = "_id"
            java.lang.String r2 = "address"
            java.lang.String[] r7 = new java.lang.String[]{r12, r2}
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            erph r12 = r5.b(r6, r7, r8, r9, r10)
            ffsk r2 = r11.e
            ffss r12 = defpackage.axnh.b(r12, r2)
            r0.a = r11
            r0.d = r4
            ffuq r12 = (defpackage.ffuq) r12
            java.lang.Object r12 = r12.B(r0)
            if (r12 == r1) goto L95
            r2 = r11
        L72:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r4 = r12
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L8c
            r4.getClass()     // Catch: java.lang.Throwable -> L8c
            r0.a = r12     // Catch: java.lang.Throwable -> L8c
            r0.d = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.f(r4, r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 == r1) goto L95
            r1 = r12
        L85:
            r12 = 0
            defpackage.ffig.a(r1, r12)
            ffcu r12 = defpackage.ffcu.a
            return r12
        L8c:
            r0 = move-exception
            r1 = r12
        L8e:
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
            defpackage.ffig.a(r1, r12)
            throw r0
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnv.m(ffgu):java.lang.Object");
    }

    public final void n() {
        if (((cptp) this.i.b()).a()) {
            return;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleTelephony");
        ((enrr) h.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater", "checkTelephonyPermissions", 353, "TelephonyDatabaseUpdater.kt")).q("Insufficient permissions to update Telephony. Skipping update job.");
        throw new cqmf();
    }

    @Override // defpackage.cqnw
    public final void o() {
        n();
        axol.k(this.e, null, new cqnu(this, null), 3);
    }
}

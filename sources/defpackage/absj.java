package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absj {
    private static final enru g = enru.c("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/ForkedConversationReporterV2");
    public final aolr a;
    public final ayxm b;
    public final ffsk c;
    public final emar d;
    public final albq e;
    public final bseh f;
    private final ayyn h;
    private final abrh i;
    private final ayvn j;
    private final ffbr k;
    private final abuy l;
    private final ffbr m;
    private final ffbr n;
    private final akzt o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public absj(ayyn ayynVar, abrh abrhVar, ayvn ayvnVar, ffbr ffbrVar, aolr aolrVar, abuy abuyVar, ffbr ffbrVar2, ffbr ffbrVar3, ayxm ayxmVar, ffsk ffskVar, emar emarVar, akzt akztVar, albq albqVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, bseh bsehVar) {
        this.h = ayynVar;
        this.i = abrhVar;
        this.j = ayvnVar;
        this.k = ffbrVar;
        this.a = aolrVar;
        this.l = abuyVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.b = ayxmVar;
        this.c = ffskVar;
        this.d = emarVar;
        this.o = akztVar;
        this.e = albqVar;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
        this.r = ffbrVar6;
        this.f = bsehVar;
    }

    private final boolean i(aoku aokuVar) {
        return aokuVar != null;
    }

    private final void j(int i) {
        this.o.e("Bugle.Custodian.ForkedConversationReporterV2.Outcome", i - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x010d, code lost:
    
        if (r0 != r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0128, code lost:
    
        if (r0 != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03f9, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0295, code lost:
    
        if (r0 == r3) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x018a A[Catch: all -> 0x04a2, TryCatch #1 {all -> 0x04a2, blocks: (B:141:0x0173, B:143:0x0177, B:162:0x0180, B:163:0x0184, B:165:0x018a, B:168:0x019e), top: B:140:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0368 A[Catch: all -> 0x0489, TryCatch #5 {all -> 0x0489, blocks: (B:28:0x0352, B:29:0x0362, B:31:0x0368, B:34:0x037d, B:39:0x0381, B:40:0x038a, B:42:0x0390, B:44:0x03a9, B:48:0x0404, B:52:0x03b2, B:53:0x03b6, B:55:0x03bc, B:57:0x03cb, B:58:0x03cf, B:60:0x03d5), top: B:27:0x0352 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0390 A[Catch: all -> 0x0489, TryCatch #5 {all -> 0x0489, blocks: (B:28:0x0352, B:29:0x0362, B:31:0x0368, B:34:0x037d, B:39:0x0381, B:40:0x038a, B:42:0x0390, B:44:0x03a9, B:48:0x0404, B:52:0x03b2, B:53:0x03b6, B:55:0x03bc, B:57:0x03cb, B:58:0x03cf, B:60:0x03d5), top: B:27:0x0352 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02df A[LOOP:4: B:85:0x02d9->B:87:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0311 A[LOOP:5: B:90:0x030b->B:92:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x029e, code lost:
    
        if (r2 == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024e, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0111, code lost:
    
        r19 = r8;
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01de A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:12:0x0044, B:14:0x02a1, B:16:0x01d8, B:18:0x01de, B:19:0x01fd, B:21:0x0203, B:23:0x0215, B:28:0x0223, B:30:0x022d, B:33:0x027c, B:37:0x0235, B:38:0x0239, B:40:0x023f, B:42:0x0250, B:43:0x0254, B:45:0x025a, B:54:0x02b3, B:55:0x02b9, B:59:0x02ae, B:63:0x0068, B:65:0x0175, B:67:0x017f, B:69:0x00cf, B:71:0x00d5, B:73:0x00ef, B:76:0x014c, B:79:0x00f8, B:80:0x00fc, B:82:0x0102, B:84:0x0115, B:85:0x0119, B:87:0x011f, B:99:0x018e, B:100:0x01a1, B:102:0x01a7, B:105:0x01c3, B:110:0x01c7, B:111:0x02b7, B:115:0x008b, B:116:0x009b, B:118:0x00a1, B:121:0x00b8, B:126:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b3 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:12:0x0044, B:14:0x02a1, B:16:0x01d8, B:18:0x01de, B:19:0x01fd, B:21:0x0203, B:23:0x0215, B:28:0x0223, B:30:0x022d, B:33:0x027c, B:37:0x0235, B:38:0x0239, B:40:0x023f, B:42:0x0250, B:43:0x0254, B:45:0x025a, B:54:0x02b3, B:55:0x02b9, B:59:0x02ae, B:63:0x0068, B:65:0x0175, B:67:0x017f, B:69:0x00cf, B:71:0x00d5, B:73:0x00ef, B:76:0x014c, B:79:0x00f8, B:80:0x00fc, B:82:0x0102, B:84:0x0115, B:85:0x0119, B:87:0x011f, B:99:0x018e, B:100:0x01a1, B:102:0x01a7, B:105:0x01c3, B:110:0x01c7, B:111:0x02b7, B:115:0x008b, B:116:0x009b, B:118:0x00a1, B:121:0x00b8, B:126:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:12:0x0044, B:14:0x02a1, B:16:0x01d8, B:18:0x01de, B:19:0x01fd, B:21:0x0203, B:23:0x0215, B:28:0x0223, B:30:0x022d, B:33:0x027c, B:37:0x0235, B:38:0x0239, B:40:0x023f, B:42:0x0250, B:43:0x0254, B:45:0x025a, B:54:0x02b3, B:55:0x02b9, B:59:0x02ae, B:63:0x0068, B:65:0x0175, B:67:0x017f, B:69:0x00cf, B:71:0x00d5, B:73:0x00ef, B:76:0x014c, B:79:0x00f8, B:80:0x00fc, B:82:0x0102, B:84:0x0115, B:85:0x0119, B:87:0x011f, B:99:0x018e, B:100:0x01a1, B:102:0x01a7, B:105:0x01c3, B:110:0x01c7, B:111:0x02b7, B:115:0x008b, B:116:0x009b, B:118:0x00a1, B:121:0x00b8, B:126:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:12:0x0044, B:14:0x02a1, B:16:0x01d8, B:18:0x01de, B:19:0x01fd, B:21:0x0203, B:23:0x0215, B:28:0x0223, B:30:0x022d, B:33:0x027c, B:37:0x0235, B:38:0x0239, B:40:0x023f, B:42:0x0250, B:43:0x0254, B:45:0x025a, B:54:0x02b3, B:55:0x02b9, B:59:0x02ae, B:63:0x0068, B:65:0x0175, B:67:0x017f, B:69:0x00cf, B:71:0x00d5, B:73:0x00ef, B:76:0x014c, B:79:0x00f8, B:80:0x00fc, B:82:0x0102, B:84:0x0115, B:85:0x0119, B:87:0x011f, B:99:0x018e, B:100:0x01a1, B:102:0x01a7, B:105:0x01c3, B:110:0x01c7, B:111:0x02b7, B:115:0x008b, B:116:0x009b, B:118:0x00a1, B:121:0x00b8, B:126:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x029e -> B:14:0x02a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0171 -> B:58:0x0175). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r19, defpackage.enit r20, defpackage.aoku r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.b(java.util.Map, enit, aoku, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.abru
            if (r0 == 0) goto L13
            r0 = r9
            abru r0 = (defpackage.abru) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abru r0 = new abru
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r0 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            defpackage.ffci.b(r9)
            ffhd r9 = r0.u()
            boolean r9 = defpackage.ekxi.b(r9)
            if (r9 == 0) goto L6e
            java.lang.String r9 = "ForkedConversationReporterV2#getConversationParticipantMessagingIdentities"
            ekzz r9 = defpackage.eleg.f(r9)
            albq r2 = r8.e     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "Bugle.Custodian.ForkedConversationReporterV2.GetConversationParticipants.Duration"
            abry r6 = new abry     // Catch: java.lang.Throwable -> L64
            r6.<init>(r8, r3)     // Catch: java.lang.Throwable -> L64
            r0.d = r9     // Catch: java.lang.Throwable -> L64
            r0.c = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = defpackage.albs.a(r2, r5, r6, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == r1) goto L63
            r7 = r0
            r0 = r9
            r9 = r7
        L5d:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r0, r3)
            return r9
        L63:
            return r1
        L64:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L68:
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            defpackage.ffig.a(r0, r9)
            throw r1
        L6e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.abrz
            if (r0 == 0) goto L13
            r0 = r10
            abrz r0 = (defpackage.abrz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abrz r0 = new abrz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r9 = r0.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r10 = move-exception
            goto L6b
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.ffci.b(r10)
            ffhd r10 = r0.u()
            boolean r10 = defpackage.ekxi.b(r10)
            if (r10 == 0) goto L71
            java.lang.String r10 = "ForkedConversationReporterV2#getConversationsContainingParticipants"
            ekzz r10 = defpackage.eleg.f(r10)
            albq r2 = r8.e     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Bugle.Custodian.ForkedConversationReporterV2.GetConversationsContainingParticipants.Duration"
            abse r6 = new abse     // Catch: java.lang.Throwable -> L67
            r6.<init>(r9, r8, r3)     // Catch: java.lang.Throwable -> L67
            r0.d = r10     // Catch: java.lang.Throwable -> L67
            r0.c = r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r9 = defpackage.albs.a(r2, r5, r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r9 == r1) goto L66
            r7 = r10
            r10 = r9
            r9 = r7
        L5d:
            enit r10 = (defpackage.enit) r10     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r9, r3)
            r10.getClass()
            return r10
        L66:
            return r1
        L67:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            throw r10     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.d(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        if (r9 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r9 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00fc -> B:13:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.absg
            if (r0 == 0) goto L13
            r0 = r7
            absg r0 = (defpackage.absg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            absg r0 = new absg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            absj r6 = r0.d
            defpackage.ffci.b(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            bseh r7 = r5.f
            int r7 = r7.k()
            boolean r7 = defpackage.byyr.d(r7)
            if (r7 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L46:
            ffbr r7 = r5.r
            java.lang.Object r7 = r7.b()
            amhs r7 = (defpackage.amhs) r7
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r6)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r6 = r7.H(r2, r4)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r6
            aqge r6 = r6.f
            elfl r6 = r6.b()
            r6.getClass()
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r6 = r5
        L6e:
            amfx r7 = (defpackage.amfx) r7
            int r0 = r7.v()
            boolean r0 = defpackage.byyr.d(r0)
            if (r0 != 0) goto L7f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L7f:
            boolean r0 = r7.r()
            r1 = 0
            if (r0 == 0) goto L88
            r7 = r1
            goto L8c
        L88:
            java.lang.String r7 = r7.i()
        L8c:
            bseh r0 = r6.f
            byyy r0 = r0.H()
            byyy r2 = defpackage.byyy.NAME_IS_AUTOMATIC
            if (r0 != r2) goto L97
            goto L9d
        L97:
            bseh r6 = r6.f
            java.lang.String r1 = r6.X()
        L9d:
            boolean r6 = defpackage.ffkj.e(r7, r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r7, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.absh
            if (r0 == 0) goto L13
            r0 = r9
            absh r0 = (defpackage.absh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            absh r0 = new absh
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.ffci.b(r9)
            goto L5c
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.ffci.b(r9)
            ffbr r9 = r6.r
            java.lang.Object r9 = r9.b()
            amhs r9 = (defpackage.amhs) r9
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = new com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType
            r5.<init>(r7)
            r2.<init>(r5)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r7 = r9.H(r2, r3)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r7 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r7
            aqge r7 = r7.f
            elfl r7 = r7.b()
            r7.getClass()
            r0.c = r4
            java.lang.Object r9 = defpackage.fgfz.c(r7, r0)
            if (r9 == r1) goto L73
        L5c:
            amfx r9 = (defpackage.amfx) r9
            int r7 = r9.v()
            boolean r7 = defpackage.byyr.d(r7)
            int r8 = r9.w()
            if (r8 == 0) goto L6d
            r3 = r4
        L6d:
            r7 = r7 & r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.g(long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0389, code lost:
    
        if (r0 != r3) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0142: MOVE (r8 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:323), block:B:112:0x0141 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0353 A[Catch: all -> 0x0063, TryCatch #2 {all -> 0x0063, blocks: (B:15:0x005d, B:17:0x038b, B:19:0x03a0, B:20:0x03a6, B:22:0x03e4, B:23:0x03ea, B:24:0x034d, B:26:0x0353, B:30:0x03f3, B:40:0x0327, B:45:0x02c8, B:107:0x0158), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03f3 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:15:0x005d, B:17:0x038b, B:19:0x03a0, B:20:0x03a6, B:22:0x03e4, B:23:0x03ea, B:24:0x034d, B:26:0x0353, B:30:0x03f3, B:40:0x0327, B:45:0x02c8, B:107:0x0158), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b A[Catch: all -> 0x043b, TRY_LEAVE, TryCatch #4 {all -> 0x043b, blocks: (B:70:0x0185, B:72:0x018b, B:76:0x01cd, B:79:0x0204, B:82:0x0252, B:84:0x0257, B:86:0x0269, B:87:0x027f, B:100:0x043a, B:99:0x0437, B:81:0x023f, B:95:0x0432), top: B:69:0x0185, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0389 -> B:17:0x038b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01b8 -> B:67:0x01bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.Collection r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.absj.h(java.util.Collection, ffgu):java.lang.Object");
    }
}

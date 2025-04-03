package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqev implements cqel {
    private static final cskc a = cskc.g("Bugle", "ForwardSyncEngineImpl");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl");
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final cqoh l;
    private final ecrj m;
    private final coxk n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;

    public cqev(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, cqoh cqohVar, ecrj ecrjVar, coxk coxkVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        cqohVar.getClass();
        ecrjVar.getClass();
        coxkVar.getClass();
        ffbrVar10.getClass();
        ffbrVar12.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffbrVar8;
        this.k = ffbrVar9;
        this.l = cqohVar;
        this.m = ecrjVar;
        this.n = coxkVar;
        this.o = ffbrVar10;
        this.p = ffbrVar11;
        this.q = ffbrVar12;
    }

    private final int e(Instant instant) {
        cqai a2 = ((cqaj) this.c.b()).a(instant.toEpochMilli(), 9223372036854774807L);
        try {
            a2.i(-1);
            int d = a2.d();
            ffig.a(a2, null);
            return d;
        } finally {
        }
    }

    @Override // defpackage.cqel
    public final cqgh a(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        cqai a2 = ((cqaj) this.c.b()).a(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            cqgg cqggVar = (cqgg) cqgh.a.createBuilder();
            cqggVar.getClass();
            int b2 = cqai.b(a2.d);
            cqggVar.copyOnWrite();
            ((cqgh) cqggVar.instance).c = b2;
            int e = a2.e(a2.e, a2.f);
            cqggVar.copyOnWrite();
            ((cqgh) cqggVar.instance).b = e;
            eyfy build = cqggVar.build();
            build.getClass();
            cqgh cqghVar = (cqgh) build;
            ffig.a(a2, null);
            ((enrr) b.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl", "getDatabaseMessageCounts", 523, "ForwardSyncEngineImpl.kt")).u("Found [%d] messages in Telephony and [%d] messages in BugleDb.", cqghVar.b, cqghVar.c);
            return cqghVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x029d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:670), block:B:231:0x029c */
    /* JADX WARN: Not initialized variable reg: 34, insn: 0x029f: MOVE (r7 I:??[OBJECT, ARRAY]) = (r34 I:??[OBJECT, ARRAY]) (LINE:672), block:B:231:0x029c */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e9 A[Catch: all -> 0x029b, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x029b, blocks: (B:124:0x01c8, B:126:0x01e0, B:129:0x02e9, B:173:0x01ef, B:213:0x0276, B:181:0x024b, B:182:0x024e), top: B:89:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b3 A[Catch: all -> 0x05fa, TRY_ENTER, TryCatch #9 {all -> 0x05fa, blocks: (B:134:0x02f9, B:138:0x03b5, B:141:0x03c8, B:137:0x03b3), top: B:133:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[Catch: all -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ac, blocks: (B:18:0x0099, B:85:0x00bf, B:87:0x00cd), top: B:16:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0488 A[Catch: all -> 0x05f6, TRY_LEAVE, TryCatch #7 {all -> 0x05f6, blocks: (B:22:0x03e2, B:30:0x03f6, B:31:0x043a, B:33:0x0488, B:43:0x05bf, B:66:0x05e0, B:67:0x05e3, B:68:0x05e4, B:69:0x0400, B:70:0x041e, B:71:0x041f, B:72:0x0429, B:73:0x0433, B:35:0x048e, B:37:0x0496, B:41:0x04d1, B:54:0x0579, B:55:0x057c, B:56:0x057d, B:58:0x05a7, B:59:0x05b2, B:63:0x05de), top: B:21:0x03e2, inners: #30, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05e4 A[Catch: all -> 0x05f6, TRY_LEAVE, TryCatch #7 {all -> 0x05f6, blocks: (B:22:0x03e2, B:30:0x03f6, B:31:0x043a, B:33:0x0488, B:43:0x05bf, B:66:0x05e0, B:67:0x05e3, B:68:0x05e4, B:69:0x0400, B:70:0x041e, B:71:0x041f, B:72:0x0429, B:73:0x0433, B:35:0x048e, B:37:0x0496, B:41:0x04d1, B:54:0x0579, B:55:0x057c, B:56:0x057d, B:58:0x05a7, B:59:0x05b2, B:63:0x05de), top: B:21:0x03e2, inners: #30, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0433 A[Catch: all -> 0x05f6, TryCatch #7 {all -> 0x05f6, blocks: (B:22:0x03e2, B:30:0x03f6, B:31:0x043a, B:33:0x0488, B:43:0x05bf, B:66:0x05e0, B:67:0x05e3, B:68:0x05e4, B:69:0x0400, B:70:0x041e, B:71:0x041f, B:72:0x0429, B:73:0x0433, B:35:0x048e, B:37:0x0496, B:41:0x04d1, B:54:0x0579, B:55:0x057c, B:56:0x057d, B:58:0x05a7, B:59:0x05b2, B:63:0x05de), top: B:21:0x03e2, inners: #30, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1 A[Catch: all -> 0x0612, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x0612, blocks: (B:14:0x0084, B:83:0x00b1, B:88:0x00d5), top: B:13:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r10v2, types: [j$.time.Instant] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    @Override // defpackage.cqel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cqjb r37, defpackage.ffgu r38) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqev.b(cqjb, ffgu):java.lang.Object");
    }

    @Override // defpackage.cqel
    public final boolean c(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        cqai a2 = ((cqaj) this.c.b()).a(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            boolean k = a2.k();
            ffig.a(a2, null);
            return k;
        } finally {
        }
    }

    @Override // defpackage.cqel
    public final Object d(cqgj cqgjVar) {
        int e;
        int a2 = cqjd.a(cqgjVar) - 1;
        if (a2 == 0) {
            Instant instant = Instant.EPOCH;
            instant.getClass();
            e = e(instant);
        } else if (a2 != 1) {
            e = cqjg.a(cqgjVar).size();
        } else {
            eyja eyjaVar = (cqgjVar.c == 4 ? (cqgb) cqgjVar.d : cqgb.a).c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            Instant d = eykj.d(eyjaVar);
            d.getClass();
            e = e(d);
        }
        return new Integer(e);
    }
}

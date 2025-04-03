package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcu implements aqdl {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler");
    private final cqoh b;

    public aqcu(cqoh cqohVar, akiq akiqVar, errm errmVar, elbx elbxVar) {
        cqohVar.getClass();
        akiqVar.getClass();
        errmVar.getClass();
        elbxVar.getClass();
        this.b = cqohVar;
    }

    private static final String b(Resources resources, MessagesTable.BindData bindData, int i) {
        String string = resources.getString(i);
        string.getClass();
        enrr enrrVar = (enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingCompleteStatusHandler", "getAndLogString", 175, "OutgoingCompleteStatusHandler.kt");
        Object D = bindData.D();
        if (D == null) {
            D = -1;
        }
        enrrVar.D("Message with id %x has status %s", D, string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    @Override // defpackage.aqdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aqcm a(android.content.res.Resources r18, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r19, defpackage.engw r20, defpackage.aoug r21, defpackage.apug r22, defpackage.amfx r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r0.getClass()
            r1.getClass()
            r20.getClass()
            r21.getClass()
            r22.getClass()
            r23.getClass()
            int r2 = r1.l()
            int r3 = r1.l()
            r4 = 1
            r5 = 0
            r6 = 3
            if (r3 != r6) goto L2b
            boolean r3 = r23.M()
            if (r3 != 0) goto L2b
            r11 = r4
            goto L2c
        L2b:
            r11 = r5
        L2c:
            j$.time.Instant r3 = r23.F()
            int r7 = r1.l()
            if (r7 != r6) goto L59
            int r7 = r1.s()
            r8 = 14
            if (r7 == r8) goto L59
            if (r3 == 0) goto L59
            long r7 = r1.y()
            j$.time.Instant r7 = j$.time.Instant.ofEpochMilli(r7)
            boolean r3 = r7.isAfter(r3)
            if (r3 == 0) goto L59
            r3 = 2132085338(0x7f150a5a, float:1.9810872E38)
            java.lang.String r0 = b(r0, r1, r3)
            r3 = r17
        L57:
            r8 = r0
            goto La8
        L59:
            int r3 = r1.l()
            r7 = 0
            if (r3 != r6) goto La5
            boolean r3 = r23.M()
            if (r3 != 0) goto La5
            boolean r3 = r23.K()
            if (r3 == 0) goto La5
            r3 = r17
            cqoh r8 = r3.b
            j$.time.Instant r8 = r8.f()
            long r8 = r8.toEpochMilli()
            j$.time.Instant r8 = j$.time.Instant.ofEpochMilli(r8)
            cfva r9 = defpackage.aqgk.b
            java.lang.Object r9 = r9.e()
            r9.getClass()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            j$.time.Instant r8 = r8.minusMillis(r9)
            long r9 = r1.y()
            j$.time.Instant r9 = j$.time.Instant.ofEpochMilli(r9)
            boolean r8 = r8.isAfter(r9)
            if (r8 == 0) goto La7
            r7 = 2132085336(0x7f150a58, float:1.9810868E38)
            java.lang.String r0 = b(r0, r1, r7)
            goto L57
        La5:
            r3 = r17
        La7:
            r8 = r7
        La8:
            byyw r0 = r1.J()
            if (r0 != 0) goto Lb0
            byyw r0 = defpackage.byyw.UNKNOWN
        Lb0:
            byyw r1 = defpackage.byyw.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE
            if (r0 != r1) goto Lb6
            r13 = r4
            goto Lb7
        Lb6:
            r13 = r5
        Lb7:
            if (r2 != r6) goto Lbb
            r10 = r4
            goto Lbc
        Lbb:
            r10 = r5
        Lbc:
            aqcl r7 = new aqcl
            r15 = 0
            r16 = 208(0xd0, float:2.91E-43)
            r9 = 1
            r12 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqcu.a(android.content.res.Resources, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, engw, aoug, apug, amfx):aqcm");
    }
}

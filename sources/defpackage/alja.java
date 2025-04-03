package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alja {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger");
    private final ffsk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final akyb f;
    private final cqoh g;

    public alja(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, akyb akybVar, cqoh cqohVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        akybVar.getClass();
        cqohVar.getClass();
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = akybVar;
        this.g = cqohVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0155 A[LOOP:0: B:13:0x014f->B:15:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0183 A[LOOP:1: B:18:0x017d->B:20:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alja.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r20, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r21, int r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alja.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, int, ffgu):java.lang.Object");
    }

    public final void c(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i) {
        ((enrr) a.e().h("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger", "logEvent", 77, "DeidentifiedMmsGroupEventLogger.kt")).t("Logging MMS group event: %s", i != 2 ? i != 3 ? i != 4 ? "MMS_GROUP_UPGRADE_NOT_ELIGIBLE" : "MMS_GROUP_UPGRADE_ELIGIBLE" : "MMS_GROUP_MESSAGE_RECEIVED" : "MMS_GROUP_MESSAGE_SENT");
        axol.k(this.b, null, new aliy(this, conversationIdType, selfIdentityId, i, null), 3);
    }
}

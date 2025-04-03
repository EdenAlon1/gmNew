package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckta implements cktx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler");
    public static final ecda b = new ecda("MmsGroupUpgradeBackupSchedulerTimer");
    public static final ecda c = new ecda("MmsGroupUpgradeBackupSchedulerMemory");
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final ffsk i;

    public ckta(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.i = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
    }

    @Override // defpackage.cktx
    public final elfl a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return axol.i(this.i, new cksz(this, conversationIdType, null));
    }
}

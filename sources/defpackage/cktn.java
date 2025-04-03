package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cktn implements emyl {
    final /* synthetic */ ConversationIdType a;

    public cktn(ConversationIdType conversationIdType) {
        this.a = conversationIdType;
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        Integer c = cktv.c(this.a);
        if (c == null) {
            return false;
        }
        int intValue = c.intValue();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("MmsGroupUpgradeDatabaseOperations#incrementMmsGroupUpgradeRetries");
        int i = intValue + 1;
        int intValue2 = bsom.g().intValue();
        int intValue3 = bsom.g().intValue();
        if (intValue3 < 60050) {
            dtub.w("mms_group_upgrade_retries", intValue3);
        }
        if (intValue2 >= 60050) {
            bsoeVar.a.put("mms_group_upgrade_retries", Integer.valueOf(i));
        }
        return Boolean.valueOf(bsoeVar.f(this.a));
    }
}

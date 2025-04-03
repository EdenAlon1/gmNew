package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzk extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ yzm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzk(yzm yzmVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = yzmVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        yzk yzkVar = new yzk(this.d, (ffgu) obj4);
        yzkVar.a = (ResolvedRecipient) obj;
        yzkVar.b = (Optional) obj2;
        yzkVar.c = (alxj) obj3;
        return yzkVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r8 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        if (!(this.d.g instanceof RbmConversationId) || !(obj3 instanceof amxx)) {
            ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 90, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled because we are not in an RBM conversation.");
            return false;
        }
        if (!((Boolean) avjy.b.e()).booleanValue()) {
            ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 95, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled by phenotype.");
            return false;
        }
        if (r8.z()) {
            ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 100, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying recipient.");
            return false;
        }
        if (((amxx) obj3).y() != avji.SHOW) {
            ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 105, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone is not in SHOW state.");
            return false;
        }
        String n = r8.g().n();
        if (n == null) {
            n = "";
        }
        String c = aoqw.c(n);
        c.getClass();
        if (c.length() != 0 && avjy.c().contains(c)) {
            Optional optional = (Optional) obj2;
            if (optional.isPresent()) {
                aqmo aqmoVar = (aqmo) optional.get();
                String name = aqmoVar.a().name();
                String b = aqmoVar.b();
                if (avjy.a().contains(name)) {
                    ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 126, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to agent use case: %s.", name);
                    return false;
                }
                if (!avjy.b().contains(b)) {
                    return true;
                }
                ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 133, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to business ID being in toolstone bypass allowlist: %s.", b);
                return false;
            }
        }
        ((enrr) yzm.a.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 118, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying business domain.");
        return false;
    }
}

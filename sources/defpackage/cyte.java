package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyte extends ffhv implements ffjm {
    final /* synthetic */ cytf a;
    final /* synthetic */ ResolvedRecipient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyte(cytf cytfVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cytfVar;
        this.b = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyte) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cytf.a.h();
        h.Y(ente.a, "BugleCdp");
        ((enrr) h.h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl$onShowOrAddContact$1", "invokeSuspend", 254, "ActionsUiAdapterImpl.kt")).q("Navigate to show or add contact");
        ((aigz) this.a.e.b()).h(new aino(this.b));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyte(this.a, this.b, ffguVar);
    }
}

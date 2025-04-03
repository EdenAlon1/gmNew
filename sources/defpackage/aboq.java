package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aboq extends ffhv implements ffjm {
    final /* synthetic */ abos a;
    final /* synthetic */ engw b;
    final /* synthetic */ alxj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aboq(abos abosVar, engw engwVar, alxj alxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = abosVar;
        this.b = engwVar;
        this.c = alxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aboq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ResolvedRecipient resolvedRecipient;
        ffci.b(obj);
        if (this.a.m.a() && (resolvedRecipient = (ResolvedRecipient) ffdx.M(this.b)) != null && resolvedRecipient.D()) {
            String n = resolvedRecipient.g().n();
            if (n != null) {
                abos abosVar = this.a;
                ((altk) abosVar.k.b()).aH(2, eorw.BIZINFO_SOURCE_CONVERSATION_TITLE, n);
                abosVar.d.h(new ailc(abosVar.c.a, n));
            }
            return ffcu.a;
        }
        ensk h = abos.a.h();
        h.Y(ente.a, "BugleConversation");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl$onClick$1", "invokeSuspend", 226, "TopAppBarMiddleUiAdapterImpl.kt")).q("Open conversation details from top app bar.");
        abos abosVar2 = this.a;
        abosVar2.d.h(new aijq(this.c, abosVar2.f, 2, 1));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aboq(this.a, this.b, this.c, ffguVar);
    }
}

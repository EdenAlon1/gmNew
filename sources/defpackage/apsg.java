package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apsg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apsk b;
    final /* synthetic */ cnbt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apsg(apsk apskVar, cnbt cnbtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apskVar;
        this.c = cnbtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apsg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            apsk apskVar = this.b;
            cnbt cnbtVar = this.c;
            this.a = 1;
            if (((Optional) apskVar.e.b()).isPresent()) {
                ((cnbg) ((Optional) apskVar.e.b()).get()).a(cnbtVar, bdhb.a);
                ensk h = apsk.a.h();
                h.Y(ente.a, "BugleDittoRcs");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.p, cnbtVar.a());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/importmessages/ImportMessageHandlerImpl", "importReactionMessage", 170, "ImportMessageHandlerImpl.kt")).t("ImportReactionMessage: reaction is inserted in bugle db with reactedMessageId: %s.", cnbtVar.b());
            }
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apsg(this.b, this.c, ffguVar);
    }
}

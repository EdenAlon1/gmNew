package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cynx implements ffjm {
    final /* synthetic */ cyof a;

    public cynx(cyof cyofVar) {
        this.a = cyofVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        fgdj b;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            czam czamVar = ((ConversationDetailsViewModel) this.a.f.a()).c;
            ensk h = czbb.a.h();
            h.Y(ente.a, "BugleCdp");
            ((enrr) h.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl", "createUiData", 93, "ConversationDetailsUiAdapterImpl.kt")).q("ConversationDetailsUiAdapter initialized");
            czbb czbbVar = (czbb) czamVar;
            if (((aspy) czbbVar.k.b()).a()) {
                fgbt fgbtVar = new fgbt(axrb.a(((czdi) czbbVar.d.b()).a(), "TopbarUiData"), new czas(null));
                fgbt fgbtVar2 = new fgbt(axrb.a(((cysc) czbbVar.e.b()).a(), "HeaderUiData"), new czat(null));
                fgdj c = axrb.c(((czbt) czbbVar.f.b()).b(), "SearchUiData");
                fgbt fgbtVar3 = new fgbt(axrb.c(((cypv) czbbVar.g.b()).b(), "EncryptionUiData"), new czau(null));
                cyoq cyoqVar = (cyoq) czbbVar.h.b();
                ffbr ffbrVar = cyoqVar.g;
                ffxx d = axsp.d(fgbtVar, fgbtVar2, c, fgbtVar3, new fgbt(axrb.a(axsp.h(axrb.a(cyoqVar.b, "ConversationProperties"), axrb.a(((cyoz) ffbrVar.b()).a(), "SingleConversationActionsUiData"), axrb.a(((cyow) cyoqVar.f.b()).a(), "GroupConversationActionsUiData"), cyoqVar.a, new cyop(cyoqVar, null)), "ActionsUiData"), new czav(null)), new fgbt(axrb.c(((cypa) czbbVar.j.b()).a(), "ActiveSimUiData"), new czaw(null)), axrb.a(czbbVar.p, "PenpalDescriptionUiData"), axrb.a(czbbVar.q, "PhotoSelectorUiData"), new fgbt(axrb.a(czbbVar.r, "MiniConversationDetailsUiData"), new czax(null)), czbbVar.b, new czay(czbbVar, null));
                ffsk ffskVar = czbbVar.b;
                int i = fgcz.a;
                b = fgbn.b(d, ffskVar, fgcy.a(0L, 3), null);
            } else {
                fgbt fgbtVar4 = new fgbt(axrb.a(((czdi) czbbVar.d.b()).a(), "TopbarUiData"), new czaz(null));
                fgbt fgbtVar5 = new fgbt(axrb.a(((cysc) czbbVar.e.b()).a(), "HeaderUiData"), new czba(null));
                fgdj c2 = axrb.c(((czbt) czbbVar.f.b()).a(), "SearchUiData");
                fgbt fgbtVar6 = new fgbt(axrb.c(((cypv) czbbVar.g.b()).a(), "EncryptionUiData"), new czan(null));
                cyoq cyoqVar2 = (cyoq) czbbVar.h.b();
                ffbr ffbrVar2 = cyoqVar2.g;
                ffxx ffxxVar = cyoqVar2.c;
                ffxx d2 = axsp.d(fgbtVar4, fgbtVar5, c2, fgbtVar6, new fgbt(axrb.a(axsp.i(axrb.a(cyoqVar2.b, "ConversationProperties"), axrb.a(ffxxVar, "IsPenpalConversation"), axrb.a(((cyoz) ffbrVar2.b()).a(), "SingleConversationActionsUiData"), axrb.a(((cyow) cyoqVar2.f.b()).a(), "GroupConversationActionsUiData"), cyoqVar2.a, new cyoo(cyoqVar2, null)), "ActionsUiData"), new czao(null)), new fgbt(axrb.c(((cypa) czbbVar.j.b()).a(), "ActiveSimUiData"), new czap(null)), axrb.a(czbbVar.p, "PenpalDescriptionUiData"), axrb.a(czbbVar.q, "PhotoSelectorUiData"), new fgbt(axrb.a(czbbVar.r, "MiniConversationDetailsUiData"), new czaq(null)), czbbVar.b, new czar(czbbVar, null));
                ffsk ffskVar2 = czbbVar.b;
                int i2 = fgcz.a;
                b = fgbn.b(d2, ffskVar2, fgcy.a(0L, 3), null);
            }
            czbr.b(b, hfdVar, 0);
        }
        return ffcu.a;
    }
}

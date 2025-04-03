package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytz implements cytw {
    private static final enru d = enru.c("com/google/android/apps/messaging/ui/conversation/details/header/title/TitleUiAdapterImpl");
    private static final RuntimeException e = new RuntimeException("InvalidCdpAccess");
    public final ConversationId a;
    public final ffbr b;
    public final ffbr c;
    private final ffsk f;
    private final ffxx g;
    private final ffxx h;
    private final ffxx i;
    private final cuxh j;
    private final ffbr k;
    private final atix l;

    public cytz(ffsk ffskVar, ffxx ffxxVar, ConversationId conversationId, ffxx ffxxVar2, ffxx ffxxVar3, ffbr ffbrVar, cuxh cuxhVar, ffbr ffbrVar2, ffbr ffbrVar3, atix atixVar) {
        ffskVar.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        ffxxVar2.getClass();
        ffxxVar3.getClass();
        ffbrVar.getClass();
        cuxhVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.f = ffskVar;
        this.g = ffxxVar;
        this.a = conversationId;
        this.h = ffxxVar2;
        this.i = ffxxVar3;
        this.b = ffbrVar;
        this.j = cuxhVar;
        this.k = ffbrVar2;
        this.c = ffbrVar3;
        this.l = atixVar;
    }

    public static final String c(alxj alxjVar, engw engwVar) {
        ResolvedRecipient resolvedRecipient;
        aoku g;
        aokr G;
        if (alxjVar.b() == alxi.GROUP || (resolvedRecipient = (ResolvedRecipient) ffdx.M(engwVar)) == null || (g = resolvedRecipient.g()) == null || (G = g.G()) == null) {
            return null;
        }
        return G.a;
    }

    @Override // defpackage.cytw
    public final ffxx a() {
        if (((aspy) this.b.b()).a()) {
            ffxx ffxxVar = this.g;
            ffxx ffxxVar2 = this.h;
            return axsp.j(axrb.a(ffxxVar, "ConversationProperties"), axrb.a(ffxxVar2, "Recipients"), this.f, new cytx(this, null));
        }
        ffxx ffxxVar3 = this.g;
        ffxx ffxxVar4 = this.i;
        ffxx ffxxVar5 = this.h;
        return axsp.h(axrb.a(ffxxVar3, "ConversationProperties"), axrb.a(ffxxVar4, "IsPenpalConversation"), axrb.a(ffxxVar5, "Recipients"), this.f, new cyty(this, null));
    }

    public final String b(alxj alxjVar, engw engwVar, boolean z) {
        if (alxjVar.b() != alxi.GROUP && !z) {
            if (this.l.a() && (alxjVar.u() || engwVar.isEmpty())) {
                ensk j = d.j();
                j.Y(ente.a, "BugleCdp");
                ((enrr) ((enrr) j).g(eldx.b(e)).h("com/google/android/apps/messaging/ui/conversation/details/header/title/TitleUiAdapterImpl", "getConversationSubtitle", 129, "TitleUiAdapterImpl.kt")).q("Attempting to open CDP header for a deleted conversation");
                return null;
            }
            ResolvedRecipient resolvedRecipient = ((atji) this.k.b()).a() ? (ResolvedRecipient) ffdx.M(engwVar) : (ResolvedRecipient) ffdx.T(engwVar);
            if (resolvedRecipient == null) {
                return null;
            }
            if (resolvedRecipient.A()) {
                return this.j.c(resolvedRecipient.g().G().toString());
            }
            String y = resolvedRecipient.y();
            if (y != null) {
                String a = aswb.a() ? cuxh.a(y) : this.j.c(y);
                a.getClass();
                return cjze.a(a);
            }
        }
        return null;
    }
}

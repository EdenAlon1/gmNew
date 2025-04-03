package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysj implements cysc {
    private static final enru m = enru.c("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl");
    public final ffsk a;
    public final Context b;
    public final ConversationId c;
    public final aihu d;
    public final ffbr e;
    public final llv f;
    public final ffbr g;
    public final atjc h;
    public final auxw i;
    public final atzo j;
    public final ffbr k;
    public final ffbr l;
    private final ffxx n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public cysj(ffsk ffskVar, Context context, ffxx ffxxVar, ConversationId conversationId, aihu aihuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, llv llvVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, atjc atjcVar, auxw auxwVar, atzo atzoVar, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffskVar.getClass();
        context.getClass();
        ffxxVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        llvVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        auxwVar.getClass();
        atzoVar.getClass();
        ffbrVar8.getClass();
        this.a = ffskVar;
        this.b = context;
        this.n = ffxxVar;
        this.c = conversationId;
        this.d = aihuVar;
        this.e = ffbrVar;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.f = llvVar;
        this.q = ffbrVar4;
        this.g = ffbrVar5;
        this.r = ffbrVar6;
        this.h = atjcVar;
        this.i = auxwVar;
        this.j = atzoVar;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        if (atzoVar.a() && ffkj.e(llvVar.b("has_pending_profile_photo_picker_result"), true)) {
            axol.m(ffskVar, new cysd(this, null));
        }
    }

    @Override // defpackage.cysc
    public final ffxx a() {
        ffxx a = axrb.a(this.n, "ConversationProperties");
        ffxx a2 = axrb.a(((cytw) this.p.b()).a(), "TitleUiData");
        ffxx a3 = axrb.a(((cysw) this.q.b()).a(), "ActionsUiData");
        cytp cytpVar = (cytp) this.o.b();
        return axsp.f(a, a2, a3, axrb.a(axsp.j(axrb.a(cytpVar.b, "ConversationProperties"), axrb.a(cytpVar.c, "Recipients"), cytpVar.a, new cyto(cytpVar, null)), "AvatarUiData"), this.h.a() ? axrb.a(((wwd) this.r.b()).b, "BackActionsUiData") : new ffyg(null), this.a, new cysf(this, null));
    }

    public final void b(Uri uri) {
        if (uri == null) {
            ensk h = m.h();
            h.Y(ente.a, "BugleCdp");
            ((enrr) h.h("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl", "handleProfilePhotoPickerResult", 156, "HeaderUiAdapterImpl.kt")).q("No group icon was picked");
        } else {
            ensk h2 = m.h();
            h2.Y(ente.a, "BugleCdp");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.X, uri);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl", "handleProfilePhotoPickerResult", 153, "HeaderUiAdapterImpl.kt")).q("Group icon was picked");
            c(uri);
        }
    }

    public final void c(Uri uri) {
        axol.m(this.a, new cysi(this, uri, null));
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chvn implements bbeo {
    final /* synthetic */ erwx a;
    final /* synthetic */ ervi b;
    final /* synthetic */ fcek c;
    final /* synthetic */ fbzt d;
    final /* synthetic */ bzge e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ fcek g;
    final /* synthetic */ chvq h;

    public chvn(chvq chvqVar, erwx erwxVar, ervi erviVar, fcek fcekVar, fbzt fbztVar, bzge bzgeVar, ArrayList arrayList, fcek fcekVar2) {
        this.a = erwxVar;
        this.b = erviVar;
        this.c = fcekVar;
        this.d = fbztVar;
        this.e = bzgeVar;
        this.f = arrayList;
        this.g = fcekVar2;
        this.h = chvqVar;
    }

    @Override // defpackage.bbeo
    public final void a(bbcd bbcdVar, Object obj) {
        ensk i = chvq.c.i();
        i.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2$1", "onGetOrCreateConversationFailed", 2229, "DittoChannelRequestHandlerV2.java")).t("Failed to create conversation %s", ((cgzv) this.h.m.b()).z(this.b.b, this.g));
        erwx erwxVar = this.a;
        erwxVar.copyOnWrite();
        erwz erwzVar = (erwz) erwxVar.instance;
        erwz erwzVar2 = erwz.a;
        erwzVar.d = erwy.a(4);
        this.h.m(erwxVar.build(), this.b, this.c, this.d, true, 1, this.e);
    }

    @Override // defpackage.bbeo
    public final void b(bbcd bbcdVar, Object obj, ConversationIdType conversationIdType) {
        this.h.z(conversationIdType, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

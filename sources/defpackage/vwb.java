package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwb implements ellh {
    final /* synthetic */ vvn a;

    public vwb(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final wdl wdlVar = (wdl) ellfVar;
        int b = wdlVar.a().b();
        vvn vvnVar = this.a;
        if (vvnVar.bm(b)) {
            vvnVar.W(wdlVar.a().b());
            return elli.a;
        }
        if (!((djrv) vvnVar.bZ.b()).x(wdlVar.a().b()) || !vvnVar.bi()) {
            vvnVar.S(new Consumer() { // from class: vmp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((uav) obj).e().H().I(wdl.this.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vmq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().I(wdl.this.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            vvnVar.cC.ad();
            vvnVar.aS((bcvr) vvnVar.cM.a());
            return elli.a;
        }
        twr twrVar = vvnVar.Q;
        final ConversationIdType conversationIdType = vvnVar.M;
        bcxq a = wdlVar.a();
        txl txlVar = (txl) twrVar;
        final cbvt cbvtVar = (cbvt) txlVar.r.b();
        ffbr ffbrVar = cbvtVar.m;
        final SelfIdentityId e = a.e();
        ((aqvh) ffbrVar.b()).d(e).i(new eroh() { // from class: cbvk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cbvt.this.g(conversationIdType, e, (Optional) obj);
            }
        }, cbvtVar.n).e(Throwable.class, new emwl() { // from class: txb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk i = txl.b.i();
                i.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) i).g((Throwable) obj)).h("com/google/android/apps/messaging/conversation/dataservice/ConversationDataServiceImpl", "insertRbmTombstone", 518, "ConversationDataServiceImpl.java")).q("Failed to insert RBM tombstone.");
                return null;
            }
        }, txlVar.g).k(axnw.b(), erpp.a);
        return elli.a;
    }
}

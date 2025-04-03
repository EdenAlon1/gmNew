package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwv implements ellh {
    final /* synthetic */ vvn a;

    public vwv(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final vvn vvnVar = this.a;
        final cxmb cxmbVar = (cxmb) ellfVar;
        vvnVar.S(null, new Consumer() { // from class: vrf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final bcvr bcvrVar = (bcvr) ((ComposeMessageView) obj).H().s().a();
                List B = bcvrVar.B(cxmbVar.a());
                Stream stream = Collection.EL.stream(B);
                final vvn vvnVar2 = vvn.this;
                stream.forEach(new Consumer() { // from class: vln
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj2;
                        ((alcb) vvn.this.bw.b()).b(dcln.a(messagePartCoreData), bcvrVar.r(messagePartCoreData));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bcvrVar.al(B);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}

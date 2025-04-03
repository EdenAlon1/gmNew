package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwi implements ellh {
    final /* synthetic */ vvn a;

    public vwi(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        this.a.S(new Consumer() { // from class: vqh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((uav) obj).e().H().y();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vqi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                composeMessageView.getClass();
                composeMessageView.H().y();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}

package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxg implements ellh {
    final /* synthetic */ vvn a;

    public vxg(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        if (((Boolean) ((cfup) cyml.a.get()).e()).booleanValue()) {
            final vvn vvnVar = this.a;
            vvnVar.S(new Consumer() { // from class: vrl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    View view = ((uav) obj).b().Q;
                    view.getClass();
                    vvn.this.aP(view.getHeight());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vrw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    vvn.this.aP(((ComposeMessageView) obj).getHeight());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return elli.a;
    }
}

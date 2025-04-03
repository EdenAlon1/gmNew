package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.material.snackbar.Snackbar;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvv implements ellh {
    final /* synthetic */ vvn a;

    public vvv(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final ajuh ajuhVar = (ajuh) ellfVar;
        csjy.d("BugleReplies", "ConversationFragmentPeerDelegate.onReplyInvoked %s", ajuhVar.a);
        Consumer consumer = new Consumer() { // from class: vro
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((uav) obj).g(ajuh.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        final vvn vvnVar = this.a;
        vvnVar.S(consumer, new Consumer() { // from class: vrp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                if (composeMessageView.H().V()) {
                    Snackbar q = Snackbar.q(composeMessageView, R.string.error_text_scheduled_send_with_draft_reply, 0);
                    q.w(android.R.string.ok, new View.OnClickListener() { // from class: vkg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            enru enruVar = vvn.a;
                        }
                    });
                    q.i();
                    return;
                }
                ajuh ajuhVar2 = ajuhVar;
                vvn vvnVar2 = vvn.this;
                final MessageIdType messageIdType = ajuhVar2.a;
                vvnVar2.aL.i(new ejlp((elfl) vvnVar2.H.map(new Function() { // from class: vpj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        enru enruVar = vvn.a;
                        return ((ajss) obj2).c(MessageIdType.this);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(elfo.c())), new ejlm(messageIdType), vvnVar2.n);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
        return elli.a;
    }
}

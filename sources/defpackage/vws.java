package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vws implements ellh {
    final /* synthetic */ vvn a;

    public vws(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final akra akraVar = (akra) ellfVar;
        Function function = new Function() { // from class: voc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                uav uavVar = (uav) obj;
                enru enruVar = vvn.a;
                uavVar.getClass();
                boolean z = false;
                if (uavVar.e() != null && uavVar.e().H().k()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Function function2 = new Function() { // from class: vod
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                enru enruVar = vvn.a;
                boolean z = false;
                if (composeMessageView != null && composeMessageView.H().k()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final vvn vvnVar = this.a;
        if (((Boolean) (vvnVar.ba() ? function.apply(vvnVar.w()) : function2.apply(vvnVar.cv))).booleanValue()) {
            vvnVar.bo.ifPresent(new Consumer() { // from class: vqu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ea eaVar = vvn.this.N;
                    akqx a = akraVar.a();
                    akqy.a(eaVar, "SCHEDULED_MESSAGE_DIALOG_FRAGMENT_TAG");
                    akrb akrbVar = new akrb();
                    fbae.e(akrbVar);
                    ekku.a(akrbVar, a);
                    akqy.b(eaVar, akrbVar, "OVERWRITE_DRAFT_DIALOG_FRAGMENT_TAG");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return elli.a;
        }
        vvnVar.V(akraVar.a());
        return elli.a;
    }
}

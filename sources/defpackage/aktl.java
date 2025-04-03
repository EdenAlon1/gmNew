package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aktl implements adsn {
    public final Set a = new HashSet();

    @Override // defpackage.adsn
    public final void a() {
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            Collection.EL.stream(this.a).forEach(new Consumer() { // from class: aktk
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((vlk) obj).a.S(new Consumer() { // from class: vly
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                            enru enruVar = vvn.a;
                            ((uav) obj2).e().b().Q();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: vlz
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                            enru enruVar = vvn.a;
                            ((ComposeMessageView) obj2).b().Q();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}

package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtj extends txv<Optional<cvlz>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtj(vvn vvnVar) {
        super("Signature Data Loader");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (((Boolean) vxo.a.e()).booleanValue()) {
            vvn vvnVar = this.a;
            final Optional empty = Optional.empty();
            if (optional.isPresent()) {
                empty = Optional.of(((cvlz) optional.get()).a());
            }
            vvnVar.S(null, new Consumer() { // from class: vor
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj2).H().c.H = Optional.this;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}

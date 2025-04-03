package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvb implements ellh {
    final /* synthetic */ uuy a;

    public uvb(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final uuy uuyVar = this.a;
        final sma smaVar = (sma) ellfVar;
        ((Optional) uuyVar.ax.b()).ifPresent(new Consumer() { // from class: utx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ConversationIdType conversationIdType = uuy.this.ap;
                sma smaVar2 = smaVar;
                ((sjo) obj).a(new aree(conversationIdType, smaVar2.a, smaVar2.b, smaVar2.c, true));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}

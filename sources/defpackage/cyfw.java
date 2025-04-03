package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfw {
    public final errl a;
    public final ctjh b;
    private final errl c;

    public cyfw(errl errlVar, errl errlVar2, ctjh ctjhVar) {
        this.a = errlVar;
        this.c = errlVar2;
        this.b = ctjhVar;
    }

    public final elfl a(final MessageIdType messageIdType, final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: cyft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = btvy.a;
                btvo btvoVar = new btvo();
                final MessageIdType messageIdType2 = MessageIdType.this;
                btvoVar.c(new Function() { // from class: cyfv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btvx btvxVar = (btvx) obj;
                        btvxVar.b(fbrc.NUDGE_CLASSIFICATION);
                        btvxVar.d(MessageIdType.this);
                        return btvxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return btvoVar.a().a();
            }
        }, this.c).i(new eroh() { // from class: cyfu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                int size = engwVar.size();
                if (size != 1) {
                    return elfo.e(Integer.valueOf(size));
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                MessageIdType messageIdType2 = messageIdType;
                cyfw cyfwVar = cyfw.this;
                return cyfwVar.b.b(messageIdType2, conversationIdType2, ((btus) engwVar.get(0)).k(), eopx.DISMISS).h(new emwl() { // from class: cyfs
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return 1;
                    }
                }, cyfwVar.a);
            }
        }, this.a);
    }
}

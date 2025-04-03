package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvl implements aqge {
    public final ffsk a;
    public final becj b;
    public final BugleConversationId c;
    public ctbx d;
    public final ctbl e;
    private final ffsk f;
    private final ctbk g;

    public anvl(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, BugleConversationId bugleConversationId) {
        this.a = ffskVar;
        this.f = ffskVar2;
        this.g = ctbkVar;
        this.b = becjVar;
        this.c = bugleConversationId;
        this.e = ctbkVar.a(new anvi(this));
    }

    public static final btsz d(ConversationIdType conversationIdType) {
        final buxo a = ctrt.a(conversationIdType);
        btta b = bttf.b();
        b.z("createMessageAnnotationsSuggestionQuery");
        b.f(new Function() { // from class: anve
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btte btteVar = (btte) obj;
                Function function = new Function() { // from class: anvf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((buum) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                buxo buxoVar = buxo.this;
                buxoVar.f(function);
                btteVar.f(buxoVar.b());
                return btteVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return b.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: anvd
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "MessageAnnotationSuggestionObservableSupplier::register", "MessageAnnotationSuggestionObservableSupplier::callback", "MessageAnnotationSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new anvh(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amoz implements aqge {
    public final ffsk a;
    public final becj b;
    public final BugleConversationId c;
    public ctbx d;
    public final ctbl e;
    private final ffsk f;
    private final ctbk g;

    public amoz(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, BugleConversationId bugleConversationId) {
        this.a = ffskVar;
        this.f = ffskVar2;
        this.g = ctbkVar;
        this.b = becjVar;
        this.c = bugleConversationId;
        this.e = ctbkVar.a(new amow(this));
    }

    public static final brbm d(final ConversationIdType conversationIdType) {
        brbn a = brbs.a();
        a.z("createConversationClassificationsQuery");
        a.c(new Function() { // from class: amou
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brbr brbrVar = (brbr) obj;
                brbrVar.d(ConversationIdType.this);
                return brbrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: amos
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "ConversationClassificationsObservableSupplier::register", "ConversationClassificationsObservableSupplier::callback", "ConversationClassificationsObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new amov(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}

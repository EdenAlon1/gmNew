package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcb implements bqab {
    public static final entd a = entd.c("BugleSuperSort");
    public final aeyq b;
    public final errl c;
    private buxm d;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final afbw e = new afbw(new Consumer() { // from class: afca
        @Override // java.util.function.Consumer
        /* renamed from: accept */
        public final void o(Object obj) {
            aeyc aeycVar;
            afcb afcbVar = afcb.this;
            final engw engwVar = (engw) obj;
            if (!aewg.h()) {
                ((ensz) afcb.a.o().h("com/google/android/apps/messaging/label/data/observer/MessageDeletionObserver", "handleDeletion", 77, "MessageDeletionObserver.java")).q("Skipping MessageDeletionObserver:handleDeletion, feature disabled.");
                return;
            }
            agsp a2 = agss.a();
            a2.z("MessageDeletionObserver#handleDeletion");
            a2.r();
            a2.e(new Function() { // from class: afby
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    agsr agsrVar = (agsr) obj2;
                    entd entdVar = afcb.a;
                    engr engrVar = new engr();
                    Iterator<E> it = engw.this.iterator();
                    while (it.hasNext()) {
                        engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
                    }
                    agsrVar.aq(new dtrw("messages.conversation_id", 3, agsr.at(engrVar.g()), true));
                    return agsrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            agsi agsiVar = agss.c;
            a2.c(new agsm(agsiVar.e), new agsm(agsiVar.b));
            agsi agsiVar2 = agss.c;
            a2.v(agsiVar2.d, agsiVar2.c);
            agsk agskVar = (agsk) a2.b().o();
            while (agskVar.moveToNext()) {
                try {
                    final MessageIdType d = agskVar.d();
                    aeyq aeyqVar = afcbVar.b;
                    MessageIdType d2 = agskVar.d();
                    SuperSortLabel a3 = SuperSortLabel.a(agskVar.c());
                    int ordinal = agskVar.f().ordinal();
                    if (ordinal == 0) {
                        aeycVar = new aeyc(d2, a3, agskVar.g(), buay.MODEL, agskVar.e(), agskVar.h(), false);
                    } else {
                        if (ordinal != 1) {
                            throw new IllegalArgumentException("unknown source: ".concat(String.valueOf(String.valueOf(agskVar.f()))));
                        }
                        aeycVar = new aeyc(d2, a3, "", buay.USER, buax.HIGH, "", false);
                    }
                    aeyqVar.a(aeycVar).k(axnw.c(new Consumer() { // from class: afbz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            ensk o = afcb.a.o();
                            o.Y(csux.a, MessageIdType.this.b());
                            ((ensz) o.h("com/google/android/apps/messaging/label/data/observer/MessageDeletionObserver", "handleDeletion", 107, "MessageDeletionObserver.java")).t("[supersort]: set label post deletion returned with result %b.", (Boolean) obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), afcbVar.c);
                } finally {
                }
            }
            agskVar.close();
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
    });

    public afcb(aeyq aeyqVar, errl errlVar) {
        this.b = aeyqVar;
        this.c = errlVar;
    }

    @Override // defpackage.bqab
    public final void a() {
        buxo d = MessagesTable.d();
        d.z("MessageDeletionObserver");
        d.e(new Function() { // from class: afbx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                entd entdVar = afcb.a;
                return new buun[]{buumVar.a, buumVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.d = d.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.f.compareAndSet(false, true)) {
            this.d.L(this.e);
        }
    }
}

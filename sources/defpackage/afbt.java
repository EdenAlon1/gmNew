package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afbt implements bqab, coxh, cqcv {
    public static final entd a = entd.c("BugleSuperSort");
    public final tbs b;
    public final ffbr c;
    private buxm d;
    private final afbn e;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public afbt(tbs tbsVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = tbsVar;
        this.c = ffbrVar;
        this.e = new afbn(new Consumer() { // from class: afbo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                engw engwVar = (engw) obj;
                if (!aewg.h()) {
                    ((ensz) afbt.a.o().h("com/google/android/apps/messaging/label/data/observer/MessageChangeObserver", "handleInsertion", 107, "MessageChangeObserver.java")).q("Skipping MessageInsertionObserver:handleInsertion, feature disabled.");
                    return;
                }
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    final afbt afbtVar = afbt.this;
                    final MessageIdType messageIdType = (MessageIdType) engwVar.get(i);
                    ((ensz) afbt.a.n().h("com/google/android/apps/messaging/label/data/observer/MessageChangeObserver", "handleInsertion", 111, "MessageChangeObserver.java")).q("schedule classifyMessages in silo execution");
                    dtuu dtuuVar = (dtuu) afbtVar.c.b();
                    dtut dtutVar = new dtut() { // from class: afbp
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            entd entdVar = afbt.a;
                            return eleg.f("MessageChangeObserver::handleInsertion::classifyMessagesInSiloExecution");
                        }
                    };
                    String valueOf = String.valueOf(String.valueOf(messageIdType));
                    dtuuVar.h(dtutVar, valueOf.concat("classifyMessages"), new Runnable() { // from class: afbq
                        @Override // java.lang.Runnable
                        public final void run() {
                            tbb tbbVar = (tbb) tbc.a.createBuilder();
                            String b = messageIdType.b();
                            tbbVar.copyOnWrite();
                            tbc tbcVar = (tbc) tbbVar.instance;
                            b.getClass();
                            tbcVar.b = b;
                            ((cevh) afbt.this.b.a.b()).a(ceyr.g("CLASSIFY_SPECIFIC_MESSAGES", (tbc) tbbVar.build()));
                        }
                    }, dtuz.TXN_1);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, ffbrVar, ffbrVar2);
    }

    @Override // defpackage.bqab
    public final void a() {
        buxm b;
        if (((Boolean) afas.a.e()).booleanValue()) {
            buxo d = MessagesTable.d();
            d.z("MessageChangeObserver1");
            d.e(new Function() { // from class: afbr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    entd entdVar = afbt.a;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.k};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b = d.b();
        } else {
            buxo d2 = MessagesTable.d();
            d2.z("MessageChangeObserver2");
            d2.e(new Function() { // from class: afbs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    entd entdVar = afbt.a;
                    return new buun[]{buumVar.a, buumVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            b = d2.b();
        }
        this.d = b;
    }

    @Override // defpackage.coxh
    public final void b(boolean z) {
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue() || !this.f.compareAndSet(true, false)) {
            return;
        }
        this.d.P(this.e);
    }

    @Override // defpackage.cqcv
    public final void c() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/label/data/observer/MessageChangeObserver", "allSyncsComplete", 163, "MessageChangeObserver.java")).q("allSyncsComplete: Enabling MessageChangeListener");
        this.e.d = true;
        ensk h = afbn.a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/label/data/observer/MessageChangeListener", "enable", 55, "MessageChangeListener.java")).q("MessageChangeListener is now enabled.");
    }

    @Override // defpackage.cqcv
    public final void d() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/label/data/observer/MessageChangeObserver", "beforeSyncStarts", 157, "MessageChangeObserver.java")).q("beforeSyncStarts: Disabling MessageChangeListener");
        this.e.d = false;
        ensk h = afbn.a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/label/data/observer/MessageChangeListener", "disable", 64, "MessageChangeListener.java")).q("MessageChangeListener is now disabled.");
    }

    @Override // defpackage.coxh
    public final void fE(boolean z) {
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            return;
        }
        fF();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.f.compareAndSet(false, true)) {
            this.d.L(this.e);
        }
    }
}

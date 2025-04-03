package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afci implements bqab {
    public static final entd a = entd.c("BugleSuperSort");
    private bwdd b;
    private final afcf c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public afci(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = new afcf(new Consumer() { // from class: afch
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                engw engwVar = (engw) obj;
                entd entdVar = afci.a;
                if (!aewg.h()) {
                    ((ensz) afci.a.o().h("com/google/android/apps/messaging/label/data/observer/MessagePartUpdateObserver", "handleUpdate", 76, "MessagePartUpdateObserver.java")).q("Skipping MessagePartChangeObserver:handleUpdate, feature disabled.");
                    return;
                }
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    afce afceVar = (afce) engwVar.get(i);
                    String[] strArr = brsd.a;
                    brsa brsaVar = new brsa();
                    brsaVar.ap("MessagePartUpdateObserver#handleUpdate");
                    brsaVar.c(afceVar.c());
                    brsaVar.d(afceVar.a());
                    MessageIdType b = bdhb.b(afceVar.b());
                    brsc brscVar = new brsc();
                    brscVar.aq(new dtrt("conversation_labels.message_id", 1, Long.valueOf(bdhb.a(b))));
                    brsaVar.ae(new brsb(brscVar), "conversation_labels-buildAndUpdateForMessageId");
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, ffbrVar, ffbrVar2);
    }

    @Override // defpackage.bqab
    public final void a() {
        bwdf c = PartsTable.c();
        c.z("MessagePartUpdateObserver");
        c.e(new Function() { // from class: afcg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                entd entdVar = afci.a;
                return new bwau[]{bwatVar.a, bwatVar.b, bwatVar.e, bwatVar.d, bwatVar.v, bwatVar.u};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = c.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.d.compareAndSet(false, true)) {
            this.b.L(this.c);
        }
    }
}

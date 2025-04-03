package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcn implements bqab {
    public static final entd a = entd.c("BugleSuperSort");
    public final ejvp b;
    private buxm c;
    private final afcm d = new afcm(new Runnable() { // from class: afcj
        @Override // java.lang.Runnable
        public final void run() {
            if (aewg.h()) {
                afcn.this.b.a(elfo.e(null), "label_status_refresh");
            } else {
                ((ensz) afcn.a.o().h("com/google/android/apps/messaging/label/data/observer/MessageReadObserver", "handleReadUpdate", 65, "MessageReadObserver.java")).q("Skipping MessageReadObserver:handleReadUpdate, feature disabled.");
            }
        }
    });
    private final AtomicBoolean e = new AtomicBoolean(false);

    public afcn(ejvp ejvpVar) {
        this.b = ejvpVar;
    }

    @Override // defpackage.bqab
    public final void a() {
        buxo d = MessagesTable.d();
        d.z("MessageReadObserver");
        d.f(new Function() { // from class: afck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = afcn.a;
                return ((buum) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: afcl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                entd entdVar = afcn.a;
                buxzVar.P(true);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.c = d.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.e.compareAndSet(false, true)) {
            this.c.L(this.d);
        }
    }
}

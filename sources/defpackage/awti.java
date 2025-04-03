package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awti {
    public final Map a = new HashMap();
    public final errm b;
    public final ejvp c;
    public final Executor d;
    public final cqoh e;
    private final ctbl f;

    public awti(errm errmVar, ejvp ejvpVar, cqoh cqohVar, ctbk ctbkVar) {
        this.b = errmVar;
        this.c = ejvpVar;
        this.d = new ersb(errmVar);
        this.e = cqohVar;
        this.f = ctbkVar.a(new awtf());
    }

    public final ctbx a(awth awthVar) {
        return this.f.a(awthVar, "Subscribe Typing updates", "Typing update callback", "Typing update unregister");
    }

    public final elfl b() {
        return elfo.g(new Callable() { // from class: awtd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (enhk) Collection.EL.stream(awti.this.a.entrySet()).collect(endq.a(new Function() { // from class: awsz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (ConversationIdType) ((Map.Entry) obj).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: awta
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return enhk.j((Map) ((Map.Entry) obj).getValue());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }, this.d);
    }

    public final void c(final String str) {
        this.f.c(new Supplier() { // from class: awtb
            @Override // java.util.function.Supplier
            public final Object get() {
                return str;
            }
        }, "notifyCallbacks");
    }
}

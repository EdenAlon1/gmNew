package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqw {
    private final Executor a;

    public cmqw(Executor executor) {
        this.a = executor;
    }

    final elfl a(final MessageIdType messageIdType) {
        return elfo.g(new Callable() { // from class: cmqv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (eqaw) MessagesTable.i(MessageIdType.this, new Function() { // from class: cmqu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eqav eqavVar = (eqav) eqaw.a.createBuilder();
                        long A = ((MessagesTable.BindData) obj).A();
                        eqavVar.copyOnWrite();
                        eqaw eqawVar = (eqaw) eqavVar.instance;
                        eqawVar.b |= 1;
                        eqawVar.c = A;
                        return (eqaw) eqavVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.a);
    }
}

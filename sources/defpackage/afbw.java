package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afbw extends dtrs {
    public static final /* synthetic */ int a = 0;
    private final Consumer b;
    private final Set c = new HashSet();

    public afbw(Consumer consumer) {
        this.b = consumer;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        if (aewg.h()) {
            duap e = dtukVar.e();
            if (e instanceof buxs) {
                Set set = this.c;
                buxo d = MessagesTable.d();
                d.z("+MessageDeletionListener#preChangeInTransaction");
                d.f(new Function() { // from class: afbu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = afbw.a;
                        return ((buum) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.k((buxs) e);
                set.addAll((Collection) Collection.EL.stream(d.b().f()).filter(new Predicate() { // from class: afbv
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i = afbw.a;
                        return !((ConversationIdType) obj).b();
                    }
                }).collect(endq.b));
            }
        }
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        if (this.c.isEmpty()) {
            return;
        }
        this.b.o(engw.n(this.c));
        this.c.clear();
    }
}

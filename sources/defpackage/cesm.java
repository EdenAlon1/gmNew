package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesm extends ceut {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    public final cbgf c;
    private final errl d;

    public cesm(ffbr ffbrVar, errl errlVar, cbgf cbgfVar) {
        this.b = ffbrVar;
        this.d = errlVar;
        this.c = cbgfVar;
    }

    public static void k(bczy bczyVar, cbgf cbgfVar, List list, boolean z) {
        if (bczyVar.e(list, z) > 0) {
            for (int i = 0; i < list.size(); i++) {
                cbgfVar.e((ConversationIdType) list.get(i), true);
            }
        }
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateMarkUnreadHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceso.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ceso cesoVar = (ceso) eyhsVar;
        return elfo.g(new Callable() { // from class: cesj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((ensz) cesm.a.n().h("com/google/android/apps/messaging/shared/datamodel/workhandlers/UpdateMarkUnreadHandler", "processPendingWorkItemAsync", 64, "UpdateMarkUnreadHandler.java")).q("Executing work inside UpdateMarkUnreadHandler.");
                ceso cesoVar2 = cesoVar;
                List list = (List) Collection.EL.stream(cesoVar2.b).map(new Function() { // from class: cesk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return bdgq.b((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: cesl
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                cesm cesmVar = cesm.this;
                cesm.k((bczy) cesmVar.b.b(), cesmVar.c, list, cesoVar2.c);
                return ceyt.i();
            }
        }, this.d);
    }
}

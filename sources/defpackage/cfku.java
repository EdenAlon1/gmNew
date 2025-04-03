package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfku extends dtrs implements bqab {
    public static final /* synthetic */ int b = 0;
    private static final cskc c = cskc.g("BugleDataModel", "HeavyWorkQueueEmptyObserver");
    public cfay a;

    public cfku(cfkw cfkwVar, cflm cflmVar, cevh cevhVar, ceww cewwVar) {
        cfkwVar.getClass();
        cflmVar.getClass();
        cevhVar.getClass();
        cewwVar.getClass();
    }

    @Override // defpackage.bqab
    public final void a() {
        Object apply;
        cfba a = cfbf.a();
        a.z("HeavyWorkQueueEmptyObserver::query");
        apply = new Function() { // from class: cfkt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cfku.b;
                return ((cfae) obj).f;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(cfbf.c);
        a.c((cfaf) apply);
        a.v(cfbf.c.f);
        this.a = a.b();
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
    }

    @Override // defpackage.bqab
    public final void fF() {
        c.p("Starting observation of WorkQueueWorkManagerTable");
        cfay cfayVar = this.a;
        if (cfayVar == null) {
            ffkj.c(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
            cfayVar = null;
        }
        cfayVar.L(this);
    }
}

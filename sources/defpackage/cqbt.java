package defpackage;

import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbt extends alhh {
    public static final cfup a = cfvl.i(cfvl.b, "forward_sync_log_message_counts_to_clearcut", true);
    private final BiConsumer b;

    public cqbt(ffbr ffbrVar, cqbx cqbxVar, Executor executor, BiConsumer biConsumer) {
        super(ffbrVar, cqbxVar, executor);
        this.b = biConsumer;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return this.b;
    }

    public final void b(final UUID uuid, final engw engwVar, final eyhs eyhsVar) {
        p(new Supplier() { // from class: cqbr
            @Override // java.util.function.Supplier
            public final Object get() {
                cfup cfupVar = cqbt.a;
                return eyhs.this;
            }
        }, new Function() { // from class: cqbs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqpl eqplVar = (eqpl) obj;
                cfup cfupVar = cqbt.a;
                eyee a2 = cpzf.a(uuid);
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqqnVar.b |= 1;
                eqqnVar.e = a2;
                eqplVar.a(engwVar);
                return eqplVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void c(final engw engwVar, final eyhs eyhsVar) {
        p(new Supplier() { // from class: cqbp
            @Override // java.util.function.Supplier
            public final Object get() {
                cfup cfupVar = cqbt.a;
                return eyhs.this;
            }
        }, new Function() { // from class: cqbq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqpl eqplVar = (eqpl) obj;
                cfup cfupVar = cqbt.a;
                eqplVar.a(engw.this);
                return eqplVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}

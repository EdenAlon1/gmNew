package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cbcj {
    public final /* synthetic */ azxg a;

    public /* synthetic */ cbcj(azxg azxgVar) {
        this.a = azxgVar;
    }

    public final dtve a(dttz dttzVar) {
        azxg azxgVar = this.a;
        Context context = (Context) azxgVar.a.b();
        context.getClass();
        Optional optional = (Optional) azxgVar.c.b();
        optional.getClass();
        cqoh cqohVar = (cqoh) azxgVar.i.b();
        cqohVar.getClass();
        becd becdVar = (becd) azxgVar.j.b();
        becdVar.getClass();
        Map map = (Map) azxgVar.l.b();
        map.getClass();
        dttv dttvVar = (dttv) azxgVar.m.b();
        dttvVar.getClass();
        asnj asnjVar = (asnj) azxgVar.n.b();
        asnjVar.getClass();
        final azxf azxfVar = new azxf(context, azxgVar.b, optional, azxgVar.d, azxgVar.e, azxgVar.f, azxgVar.g, azxgVar.h, cqohVar, becdVar, azxgVar.k, map, dttvVar, asnjVar, dttzVar);
        synchronized (azxfVar.j) {
            dtve dtveVar = (dtve) azxfVar.i.get();
            if (dtveVar != null) {
                return dtveVar;
            }
            emxf.l(azxfVar.i.get() == null);
            ekzz f = eleg.f("DatabaseHelperBasic#getDatabaseWrapperForAnyThread create");
            try {
                azxfVar.setWriteAheadLoggingEnabled(true);
                caru caruVar = (caru) azxfVar.g.b();
                dttz dttzVar2 = azxfVar.l;
                cauz cauzVar = (cauz) caruVar.b.b();
                Stream filter = Collection.EL.stream(((Map) caruVar.a.b()).entrySet()).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: carr
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return ((Integer) ((Map.Entry) obj).getKey()).intValue();
                    }
                })).map(new Function() { // from class: cars
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (cavm) ((Map.Entry) obj).getValue();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cart
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
                        cavm cavmVar = (cavm) obj;
                        return cavmVar != null && cavmVar.n();
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) filter.collect(endq.a);
                Context context2 = (Context) cauzVar.a.b();
                context2.getClass();
                ffbr ffbrVar = cauzVar.b;
                ffbr ffbrVar2 = cauzVar.c;
                cqoh cqohVar2 = (cqoh) cauzVar.d.b();
                cqohVar2.getClass();
                dttzVar2.getClass();
                engwVar.getClass();
                cauy cauyVar = new cauy(context2, ffbrVar, cqohVar2, dttzVar2, engwVar);
                final SettableFuture create = SettableFuture.create();
                final caut cautVar = cauyVar.j;
                elfl g = elfl.g(create);
                g.getClass();
                emxf.l(cautVar.a.get() == null);
                cautVar.a.set(g);
                ((ListenableFuture) cautVar.a.get()).getClass();
                g.h(new emwl() { // from class: cauq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        caut.this.b.b((SQLiteDatabase) obj);
                        return null;
                    }
                }, erpp.a);
                emxf.l(azxfVar.i.get() == null);
                azxfVar.i.set(cauyVar);
                elfl.g(((errl) azxfVar.h.b()).submit(eldl.m(new Callable() { // from class: azwz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekzz f2 = eleg.f("DatabaseHelperBasic#doInitialization");
                        azxf azxfVar2 = azxf.this;
                        try {
                            ((cauy) azxfVar2.i.get()).getClass();
                            SQLiteDatabase a = azxfVar2.a();
                            ekzz f3 = eleg.f("DatabaseHelperBasic#initPlugins");
                            if (a != null) {
                                try {
                                    for (cavm cavmVar : ((cauy) azxfVar2.i.get()).f) {
                                        cavmVar.m(a);
                                    }
                                } finally {
                                }
                            }
                            f3.close();
                            f2.close();
                            return a;
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }))).h(new emwl() { // from class: azxa
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        AtomicBoolean atomicBoolean = azxf.a;
                        SettableFuture.this.set((SQLiteDatabase) obj);
                        return null;
                    }
                }, erpp.a).e(Throwable.class, new emwl() { // from class: azxb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        AtomicBoolean atomicBoolean = azxf.a;
                        axnw.d(th);
                        if (!csjc.j()) {
                            return null;
                        }
                        SettableFuture.this.setException(th);
                        return null;
                    }
                }, erpp.a);
                cauy cauyVar2 = (cauy) azxfVar.i.get();
                cauyVar2.getClass();
                f.close();
                return cauyVar2;
            } finally {
            }
        }
    }
}

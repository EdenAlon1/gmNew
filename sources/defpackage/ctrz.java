package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrz implements ctsa {
    private final emyl a = emys.a(new emyl() { // from class: ctry
        @Override // defpackage.emyl
        public final Object get() {
            Stream map = Collection.EL.stream(((emho) ctjd.ab.e()).b).map(new Function() { // from class: ctrv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ctsc.b((emhr) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: ctrw
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
                    return ((Optional) obj).isPresent();
                }
            }).map(new Function() { // from class: ctrx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (ctsc) ((Optional) obj).get();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            return (engw) map.collect(endq.a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ctsa
    public final Optional a(String str) {
        Optional empty;
        ekzz f = eleg.f("IosReactionMessageClassifier#classify");
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!((engw) this.a.get()).isEmpty()) {
                    enqv it = ((engw) this.a.get()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            empty = Optional.empty();
                            break;
                        }
                        ctsc ctscVar = (ctsc) it.next();
                        Optional a = ctscVar.a(str);
                        if (!a.isEmpty()) {
                            fbwu fbwuVar = (fbwu) fbwv.a.createBuilder();
                            fbrc fbrcVar = fbrc.REACTION_CLASSIFICATION;
                            fbwuVar.copyOnWrite();
                            ((fbwv) fbwuVar.instance).d = fbrcVar.a();
                            fbvq fbvqVar = (fbvq) fbvt.a.createBuilder();
                            fbvqVar.copyOnWrite();
                            ((fbvt) fbvqVar.instance).e = fbvr.a(3);
                            String str2 = ((ctru) a.get()).b;
                            fbvqVar.copyOnWrite();
                            ((fbvt) fbvqVar.instance).b = str2;
                            String str3 = ((ctru) a.get()).a;
                            fbvqVar.copyOnWrite();
                            ((fbvt) fbvqVar.instance).c = str3;
                            int i = ctscVar.a;
                            fbvqVar.copyOnWrite();
                            ((fbvt) fbvqVar.instance).d = fbvs.a(i);
                            fbwuVar.copyOnWrite();
                            fbwv fbwvVar = (fbwv) fbwuVar.instance;
                            fbvt fbvtVar = (fbvt) fbvqVar.build();
                            fbvtVar.getClass();
                            fbwvVar.c = fbvtVar;
                            fbwvVar.b = 2;
                            empty = Optional.of((fbwv) fbwuVar.build());
                            break;
                        }
                    }
                } else {
                    empty = Optional.empty();
                }
            } else {
                empty = Optional.empty();
            }
            f.close();
            return empty;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

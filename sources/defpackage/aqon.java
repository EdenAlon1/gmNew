package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqon implements aqge {
    public static final entd a = entd.c("BugleRecipients");
    public final azaw b;
    public final azaw c;
    public final ctbl d;
    public final engw e;
    public final enip f;
    private final errl g;
    private final errl h;
    private final int i;

    public aqon(errl errlVar, errl errlVar2, azei azeiVar, azaw azawVar, azaw azawVar2, ctbk ctbkVar, engw engwVar, int i) {
        aqom aqomVar = new aqom(this);
        this.g = errlVar;
        this.h = errlVar2;
        this.b = azawVar;
        this.c = azawVar2;
        this.e = engwVar;
        this.f = enip.o((Collection) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: aqoi
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
                entd entdVar = aqon.a;
                return ((aoku) obj).e().isPresent();
            }
        }).map(new Function() { // from class: aqnz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aqon.a;
                return (awui) ((aoku) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
        this.i = i;
        this.d = ctbkVar.a(new aqoj(azeiVar, aqomVar));
    }

    private static String d(List list) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: aqog
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aqon.a;
                return cskt.c((aoku) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return aqny.a((Iterable) map.collect(endq.a));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: aqoh
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                entd entdVar = aqon.a;
                return aqgd.this.a();
            }
        }, "ProviderBatchRcsCapabilitiesSupplier::register", "ProviderBatchRcsCapabilitiesSupplier::callback", "ProviderBatchRcsCapabilitiesSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl h;
        if (this.i == 1) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier", "getAsync", 89, "ProviderBatchRcsCapabilitiesSupplier.java")).t("Retrieving RCS Capabilities in batch from Network for identities: %s", d(this.e));
            h = elfo.h(new erog() { // from class: aqod
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    aqon aqonVar = aqon.this;
                    return aqonVar.c.b(aqonVar.e);
                }
            }, this.h);
        } else {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier", "getAsync", 97, "ProviderBatchRcsCapabilitiesSupplier.java")).t("Retrieving RCS Capabilities in batch from Storage for identities: %s", d(this.e));
            h = elfo.h(new erog() { // from class: aqoe
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    aqon aqonVar = aqon.this;
                    return aqonVar.b.b(aqonVar.e);
                }
            }, this.g);
        }
        return h.h(new emwl() { // from class: aqof
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = aqon.a;
                return (enhk) Collection.EL.stream(((Map) obj).entrySet()).collect(endq.a(new Function() { // from class: aqob
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (aoku) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: aqoc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        entd entdVar2 = aqon.a;
                        return aqpk.a((azau) ((Map.Entry) obj2).getValue());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }, this.g);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}

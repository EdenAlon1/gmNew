package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cguv implements cgun {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RenumberingsConfigConfigurationListener");
    public final ffbr a;
    public final ffbr b;
    public final errl c;
    private final ffbr e;

    public cguv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.e = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = errlVar;
    }

    @Override // defpackage.cgun
    public final elfl a(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: cgur
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgue) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        ((enrr) ((enrr) d.e()).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RenumberingsConfigConfigurationListener", "onNewConfig", 49, "RenumberingsConfigConfigurationListener.java")).t("Renumberings config configuration ids updated: %s", (engw) map.collect(endq.a));
        final long j = ((cguo) this.e.b()).e().b;
        return elfl.g(((cnls) this.a.b()).a.a()).h(new emwl() { // from class: cnlr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((akus) obj).c);
            }
        }, erpp.a).i(new eroh() { // from class: cgus
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                long longValue = ((Long) obj).longValue();
                final long j2 = j;
                if (longValue == j2) {
                    return erre.a;
                }
                final cguv cguvVar = cguv.this;
                return ((azei) cguvVar.b.b()).a(new Function() { // from class: cgut
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cnlu) obj2).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).i(new eroh() { // from class: cguu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        effy effyVar = ((cnls) cguv.this.a.b()).a;
                        final long j3 = j2;
                        return elfl.g(effyVar.b(new emwl() { // from class: cnlq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                akur akurVar = (akur) ((akus) obj3).toBuilder();
                                akurVar.copyOnWrite();
                                akus akusVar = (akus) akurVar.instance;
                                akusVar.b |= 1;
                                akusVar.c = j3;
                                return (akus) akurVar.build();
                            }
                        }, erpp.a));
                    }
                }, cguvVar.c);
            }
        }, this.c);
    }
}

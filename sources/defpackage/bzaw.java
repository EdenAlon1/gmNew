package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzaw {
    public final bzgd a;
    public final ffbr b;
    public final ffbr c;
    public final cqoh d;
    private final errl e;

    public bzaw(bzgd bzgdVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, errl errlVar) {
        this.a = bzgdVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = cqohVar;
        this.e = errlVar;
    }

    public final elfl a(final fcek fcekVar) {
        return elfo.g(new Callable() { // from class: bzau
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(bzaw.this.a.y(fcekVar));
            }
        }, this.e).i(new eroh() { // from class: bzav
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bzaw bzawVar = bzaw.this;
                return booleanValue ? ((chny) bzawVar.c.b()).h() : ((chmx) bzawVar.b.b()).b();
            }
        }, erpp.a);
    }

    public final elfl b(final fcek fcekVar) {
        return elfo.g(new Callable() { // from class: bzas
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(bzaw.this.a.y(fcekVar));
            }
        }, this.e).i(new eroh() { // from class: bzat
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bzaw bzawVar = bzaw.this;
                if (booleanValue) {
                    final chny chnyVar = (chny) bzawVar.c.b();
                    final long epochMilli = bzawVar.d.f().toEpochMilli();
                    return chnyVar.h().i(new eroh() { // from class: chnn
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            long longValue = ((Long) obj2).longValue();
                            final long j = epochMilli;
                            if (j <= longValue) {
                                return elfo.e(null);
                            }
                            chny chnyVar2 = chny.this;
                            return chnyVar2.a.j(new emwl() { // from class: chnu
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    chlk chlkVar = (chlk) ((chll) obj3).toBuilder();
                                    chlkVar.copyOnWrite();
                                    ((chll) chlkVar.instance).h = j;
                                    return (chll) chlkVar.build();
                                }
                            }).h(new emwl() { // from class: chnv
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    return null;
                                }
                            }, erpp.a);
                        }
                    }, erpp.a);
                }
                final chmx chmxVar = (chmx) bzawVar.b.b();
                final long epochMilli2 = bzawVar.d.f().toEpochMilli();
                return chmxVar.b().i(new eroh() { // from class: chml
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        final long j = epochMilli2;
                        if (j <= longValue) {
                            return elfo.e(null);
                        }
                        chmx chmxVar2 = chmx.this;
                        return chmxVar2.a.j(new emwl() { // from class: chmh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                chlo chloVar = (chlo) ((chlp) obj3).toBuilder();
                                chloVar.copyOnWrite();
                                ((chlp) chloVar.instance).g = j;
                                return (chlp) chloVar.build();
                            }
                        }).h(new emwl() { // from class: chmi
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, erpp.a);
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }
}

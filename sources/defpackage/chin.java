package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chin {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public chin(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    private final void b(int i) {
        ((akzt) this.c.b()).e("Bugle.Tachyon.Grpc.Configuration.Create", i);
    }

    private final void c(int i, String str) {
        ensk j = a.j();
        j.Y(ente.a, "BugleTachygram");
        enrr enrrVar = (enrr) j;
        enrrVar.aa(ensy.MEDIUM);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "logError", 119, "PhoneChannelConfigurationFactory.kt")).q(str.concat(", using default P/H channel config"));
        b(i);
    }

    public final chgx a(djrj djrjVar) {
        chgx b;
        ekzz f = eleg.f("PhoneChannelConfigurationFactory#create");
        try {
            Optional k = ((djry) this.b.b()).k(djrjVar);
            if (((atro) this.d.b()).a()) {
                k.getClass();
                if (k.isEmpty()) {
                    c(2, "Configuration is empty for msisdn");
                    cfup cfupVar = chgx.a;
                    b = chgw.b();
                } else {
                    final chil chilVar = chil.a;
                    Optional flatMap = k.flatMap(new Function() { // from class: chij
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ffji.this.invoke(obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    flatMap.getClass();
                    String str = (String) fflm.b(flatMap);
                    if (str != null && !ffpc.J(str)) {
                        List i = emye.b(':').i(str);
                        if (i.size() != 2) {
                            c(4, "Tachyon endpoint is malformed");
                        } else {
                            i.getClass();
                            String str2 = (String) i.get(1);
                            str2.getClass();
                            Integer g = ffpc.g(str2);
                            if (g == null) {
                                c(6, "Tachyon port is malformed");
                            } else if (g.intValue() <= 0) {
                                c(5, "Tachyon port is not valid");
                            } else {
                                b(1);
                                cfup cfupVar2 = chgx.a;
                                b = chgw.a(str);
                            }
                        }
                        cfup cfupVar3 = chgx.a;
                        b = chgw.b();
                    }
                    c(3, "Tachyon URL is empty for msisdn");
                    cfup cfupVar4 = chgx.a;
                    b = chgw.b();
                }
            } else {
                k.getClass();
                if (k.isEmpty()) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleTachygram");
                    enrr enrrVar = (enrr) j;
                    enrrVar.aa(ensy.MEDIUM);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "doCreateLegacy", 60, "PhoneChannelConfigurationFactory.kt")).q("Configuration is empty for msisdn, using default P/H channel config");
                    cfup cfupVar5 = chgx.a;
                    b = chgw.b();
                } else {
                    final chim chimVar = chim.a;
                    Optional flatMap2 = k.flatMap(new Function() { // from class: chik
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ffji.this.invoke(obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    flatMap2.getClass();
                    String str3 = (String) fflm.b(flatMap2);
                    if (str3 != null && !ffpc.J(str3)) {
                        cfup cfupVar6 = chgx.a;
                        b = chgw.a(str3);
                    }
                    ensk j2 = a.j();
                    j2.Y(ente.a, "BugleTachygram");
                    enrr enrrVar2 = (enrr) j2;
                    enrrVar2.aa(ensy.MEDIUM);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "doCreateLegacy", 69, "PhoneChannelConfigurationFactory.kt")).q("Tachyon URL is empty for msisdn, using default P/H channel config");
                    cfup cfupVar7 = chgx.a;
                    b = chgw.b();
                }
            }
            ffig.a(f, null);
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}

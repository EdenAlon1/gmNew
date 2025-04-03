package defpackage;

import com.google.android.gms.constellation.PhoneNumberInfo;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqh {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsConstellationClient");
    public final csqi b;

    public csqh(csqi csqiVar) {
        this.b = csqiVar;
    }

    public final elfl a() {
        if (this.b.b()) {
            a.m("Requesting all phone numbers from Constellation...");
            return elfl.g(kfg.a(new kfd() { // from class: csqg
                @Override // defpackage.kfd
                public final Object a(final kfb kfbVar) {
                    dhre a2 = csqh.this.b.a();
                    a2.t(new dhqv() { // from class: csqd
                        @Override // defpackage.dhqv
                        public final void d(Exception exc) {
                            csqh.a.s("Constellation returned unexpected exception, returning empty list.", exc);
                            int i = engw.d;
                            kfb.this.b(enou.a);
                        }
                    });
                    a2.a(new dhqy() { // from class: csqe
                        @Override // defpackage.dhqy
                        public final void e(Object obj) {
                            kfb kfbVar2 = kfb.this;
                            List list = (List) obj;
                            if (list == null) {
                                csqh.a.r("Constellation returned unexpected null, treating as an empty list.");
                                int i = engw.d;
                                kfbVar2.b(enou.a);
                                return;
                            }
                            csjb a3 = csqh.a.a();
                            a3.I("Constellation returned phone number(s)");
                            Stream map = Collection.EL.stream(list).map(new Function() { // from class: csqf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((PhoneNumberInfo) obj2).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = engw.d;
                            a3.N("PhoneNumbers", map.collect(endq.a));
                            a3.r();
                            kfbVar2.b(engw.n(list));
                        }
                    });
                    return "Requesting Constellation API to get phone number.";
                }
            }));
        }
        a.r("Google Play Service is not available, couldn't get Constellation phone number(s).");
        int i = engw.d;
        return elfo.e(enou.a);
    }
}

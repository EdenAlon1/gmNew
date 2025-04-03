package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqff {
    public static final Set a;
    private static final bytf d;
    public final ffbr b;
    public final apue c;

    static {
        String[] strArr = bytk.a;
        byth bythVar = new byth(bytk.a);
        bythVar.z("TombstoneUserReferenceObserver");
        bythVar.c(new Function() { // from class: aqex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bysq bysqVar = (bysq) obj;
                Set set = aqff.a;
                return new bysr[]{bysqVar.a, bysqVar.b, bysqVar.c};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d = bythVar.b();
        a = fffi.d(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), Integer.valueOf(BasePaymentResult.ERROR_REQUEST_TIMEOUT), 225, 226, 227, 231);
    }

    public aqff(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ((apuc) ffbrVar2.b()).a("TombstoneUserReferenceObserver", d, new apud() { // from class: aqey
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new aqfe(aqff.this, new ffji() { // from class: aqew
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        engw engwVar = (engw) obj;
                        Set set = aqff.a;
                        engwVar.getClass();
                        Consumer.this.o(engwVar);
                        return ffcu.a;
                    }
                });
            }
        });
    }
}

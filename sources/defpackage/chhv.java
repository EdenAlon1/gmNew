package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chhv {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;

    public chhv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final Object a(fcek fcekVar, ffjm ffjmVar) {
        ekzz f = eleg.f("GrpcProxyFactory#create");
        try {
            djrk djrkVar = (djrk) this.b.b();
            String str = fcekVar.c;
            str.getClass();
            chgx a = ((chin) this.a.b()).a(djrkVar.a(str));
            final chhs chhsVar = (chhs) this.c.b();
            feau feauVar = (feau) Map.EL.computeIfAbsent(chhsVar.o, a, new Function() { // from class: chhq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return chhs.this.c(((chgx) obj).b);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            febo e = chhsVar.e();
            feauVar.getClass();
            Object a2 = ffjmVar.a(feauVar, e);
            ffig.a(f, null);
            return a2;
        } finally {
        }
    }
}

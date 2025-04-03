package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixb implements aiwm {
    public static final cfup a = cfvl.j(cfvl.b, "p13n_decay_factor", 0.5f);
    public static final cfup b = cfvl.k(cfvl.b, "top_n_tokens", 2000);
    public final errl c;
    public final dtuu d;
    public final ctqf e;

    public aixb(errl errlVar, ctqf ctqfVar, dtuu dtuuVar) {
        this.c = errlVar;
        this.e = ctqfVar;
        this.d = dtuuVar;
    }

    public static enhk a(enhk enhkVar, Function function) {
        return (enhk) Collection.EL.stream(enhkVar.entrySet()).collect(endq.a(new Function() { // from class: aiww
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, function));
    }
}

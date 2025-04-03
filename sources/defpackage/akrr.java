package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akrr {
    public final errl a;
    public final ffbr b;
    public final cqoh c;
    public final ffbr d;
    public final ffbr e;
    public final dtuu f;
    public final ffbr g;

    public akrr(errl errlVar, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, dtuu dtuuVar, ffbr ffbrVar4) {
        this.a = errlVar;
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = dtuuVar;
        this.g = ffbrVar4;
    }

    public final elfl a(final coiy coiyVar) {
        return elfo.g(new Callable() { // from class: akrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cgpv cgpvVar = (cgpv) akrr.this.b.b();
                coiy coiyVar2 = coiyVar;
                engw r = engw.r(coiyVar2.b().D());
                ConversationIdType C = coiyVar2.b().C();
                C.getClass();
                return Boolean.valueOf(cgpvVar.c(r, C, false) > 0);
            }
        }, this.a);
    }

    public final elfl b(final cogl coglVar) {
        return elfo.g(new Callable() { // from class: akri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Stream D = cogl.this.D();
                try {
                    Stream map = D.map(new Function() { // from class: akrh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return new coix((cnvv) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    engw engwVar = (engw) map.collect(endq.a);
                    if (D != null) {
                        D.close();
                    }
                    return engwVar;
                } catch (Throwable th) {
                    if (D != null) {
                        try {
                            D.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, this.a);
    }
}

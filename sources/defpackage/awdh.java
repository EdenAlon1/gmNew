package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdh {
    public static final List a(final awap awapVar) {
        Object apply;
        awapVar.getClass();
        awfl a = awfq.a();
        a.z("getAllBindData");
        apply = new Function() { // from class: awdg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awfp awfpVar = (awfp) obj;
                awfpVar.c(awap.this);
                return awfpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new awfp());
        a.k(new awfo((awfp) apply));
        engw y = a.b().y();
        if (((enou) y).c <= 2) {
            y.getClass();
            return y;
        }
        Objects.toString(awapVar);
        throw new IllegalStateException("FileProcessingTable has more than two entries (file and thumbnail) for processingId: ".concat(awapVar.toString()));
    }

    public static final awea b(List list, awfr awfrVar) {
        Object obj;
        awfrVar.getClass();
        enqv it = ((engw) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((awea) obj).e().equals(awfrVar)) {
                break;
            }
        }
        return (awea) obj;
    }

    public static final fayi c(awap awapVar, awfr awfrVar) {
        awfrVar.getClass();
        awea b = b(a(awapVar), awfrVar);
        if (b != null) {
            return b.m();
        }
        return null;
    }
}

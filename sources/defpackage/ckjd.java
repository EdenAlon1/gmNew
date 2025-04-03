package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class ckjd {
    public static engw e(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: ckjb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final bseh bsehVar = (bseh) obj;
                bsehVar.getClass();
                return new ckhm(new emyl() { // from class: ckje
                    @Override // defpackage.emyl
                    public final Object get() {
                        return bseh.this.C();
                    }
                }, cpxv.a(bsehVar.M()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public abstract engw a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();
}

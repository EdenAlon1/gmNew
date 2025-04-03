package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apfi extends ffhv implements ffjm {
    final /* synthetic */ apfj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apfi(apfj apfjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apfjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((apfi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.h.c(new Supplier() { // from class: apfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ClassificationObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apfi(this.a, ffguVar);
    }
}

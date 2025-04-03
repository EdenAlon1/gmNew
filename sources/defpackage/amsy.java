package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amsy extends ffhv implements ffjm {
    final /* synthetic */ amta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsy(amta amtaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amtaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((amsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.c(new Supplier() { // from class: amsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "PenpalObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amsy(this.a, ffguVar);
    }
}

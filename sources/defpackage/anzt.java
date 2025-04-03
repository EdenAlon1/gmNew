package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzt extends ffhv implements ffjm {
    final /* synthetic */ anzu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzt(anzu anzuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anzuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anzt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.c(new Supplier() { // from class: anzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anzt(this.a, ffguVar);
    }
}

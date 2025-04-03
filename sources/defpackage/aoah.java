package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoah extends ffhv implements ffjm {
    final /* synthetic */ aoai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoah(aoai aoaiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aoaiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aoah) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.c(new Supplier() { // from class: aoag
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aoah(this.a, ffguVar);
    }
}

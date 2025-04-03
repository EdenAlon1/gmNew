package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwq extends ffhv implements ffjm {
    final /* synthetic */ anwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwq(anwr anwrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anwrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anwq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: anwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RbmSuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anwq(this.a, ffguVar);
    }
}

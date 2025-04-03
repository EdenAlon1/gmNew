package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anyd extends ffhv implements ffjm {
    final /* synthetic */ anye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anyd(anye anyeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anyeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anyd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.l.c(new Supplier() { // from class: anyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SmartSuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anyd(this.a, ffguVar);
    }
}

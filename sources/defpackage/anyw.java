package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anyw extends ffhv implements ffjm {
    final /* synthetic */ anyx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anyw(anyx anyxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anyxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anyw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.m.c(new Supplier() { // from class: anyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SmartSuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anyw(this.a, ffguVar);
    }
}

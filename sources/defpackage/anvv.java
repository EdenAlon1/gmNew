package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anvv extends ffhv implements ffjm {
    final /* synthetic */ anvw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvv(anvw anvwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anvwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anvv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: anvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "MessageAnnotationSuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anvv(this.a, ffguVar);
    }
}

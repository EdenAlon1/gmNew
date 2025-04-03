package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anxk extends ffhv implements ffjm {
    final /* synthetic */ anxm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxk(anxm anxmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anxmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anxk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.c(new Supplier() { // from class: anxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ScreenEffectSuggestionObservableSupplierV2::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anxk(this.a, ffguVar);
    }
}

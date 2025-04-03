package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anxc extends ffhv implements ffjm {
    final /* synthetic */ anxd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxc(anxd anxdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anxdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((anxc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.c(new Supplier() { // from class: anxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ScreenEffectSuggestionObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anxc(this.a, ffguVar);
    }
}

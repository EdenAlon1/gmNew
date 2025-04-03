package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aelo extends ffhv implements ffjm {
    final /* synthetic */ aelp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelo(aelp aelpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aelpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aelo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: aeln
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "HomeScreenActiveComposersSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aelo(this.a, ffguVar);
    }
}

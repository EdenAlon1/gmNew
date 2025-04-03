package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apje extends ffhv implements ffjm {
    final /* synthetic */ apjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apje(apjf apjfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apjfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((apje) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: apjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "GeofilterConstraintSupplier:Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apje(this.a, ffguVar);
    }
}

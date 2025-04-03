package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apjx extends ffhv implements ffjm {
    final /* synthetic */ apjz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apjx(apjz apjzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((apjx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c.c(new Supplier() { // from class: apjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyLocationPermissionSupplier:Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apjx(this.a, ffguVar);
    }
}

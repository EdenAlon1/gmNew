package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apiw extends ffhv implements ffjm {
    final /* synthetic */ apix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apiw(apix apixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((apiw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.c(new Supplier() { // from class: apiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyRcsAvailabilitySupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apiw(this.a, ffguVar);
    }
}

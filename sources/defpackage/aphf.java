package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aphf extends ffhv implements ffjm {
    final /* synthetic */ aphg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aphf(aphg aphgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aphgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aphf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.c(new Supplier() { // from class: aphe
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyComposeConstraintsSupplier:Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aphf(this.a, ffguVar);
    }
}

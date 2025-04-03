package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apkw extends ffhv implements ffjm {
    final /* synthetic */ apkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkw(apkx apkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((apkw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.c(new Supplier() { // from class: apkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencySessionSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apkw(this.a, ffguVar);
    }
}

package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqmv extends ffhv implements ffjm {
    final /* synthetic */ aqmw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqmv(aqmw aqmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aqmv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.c(new Supplier() { // from class: aqmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RecipientBusinessInfoObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqmv(this.a, ffguVar);
    }
}

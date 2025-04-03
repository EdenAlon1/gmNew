package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqal extends ffhv implements ffjm {
    final /* synthetic */ aqam a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqal(aqam aqamVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqamVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aqal) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: aqak
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "MessageReplyCountObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqal(this.a, ffguVar);
    }
}

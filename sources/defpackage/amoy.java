package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amoy extends ffhv implements ffjm {
    final /* synthetic */ amoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amoy(amoz amozVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amozVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((amoy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.c(new Supplier() { // from class: amox
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ConversationClassificationsObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amoy(this.a, ffguVar);
    }
}

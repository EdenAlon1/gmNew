package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amro extends ffhv implements ffjm {
    final /* synthetic */ amrp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amro(amrp amrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((amro) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c.c(new Supplier() { // from class: amrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyConversationPropertiesObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amro(this.a, ffguVar);
    }
}

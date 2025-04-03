package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amyh extends ffhv implements ffjm {
    final /* synthetic */ amyi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyh(amyi amyiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((amyh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.c(new Supplier() { // from class: amyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RbmConversationPropertiesObservableSupplier::Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amyh(this.a, ffguVar);
    }
}

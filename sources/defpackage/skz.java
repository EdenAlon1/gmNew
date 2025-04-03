package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skz extends ffhv implements ffjm {
    final /* synthetic */ slf a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skz(ffgu ffguVar, slf slfVar) {
        super(2, ffguVar);
        this.a = slfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((skz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Optional optional = (Optional) this.a.e.b();
        final sla slaVar = sla.a;
        optional.ifPresent(new Consumer() { // from class: slb
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj2) {
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        skz skzVar = new skz(ffguVar, this.a);
        skzVar.b = obj;
        return skzVar;
    }
}

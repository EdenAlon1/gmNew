package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wld extends ffhv implements ffjm {
    final /* synthetic */ wlg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wld(wlg wlgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wlgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wld) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ffji ffjiVar = new ffji() { // from class: wlb
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ((wmf) obj2).o(2);
                return ffcu.a;
            }
        };
        this.a.f.ifPresent(new Consumer() { // from class: wlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
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
        return new wld(this.a, ffguVar);
    }
}

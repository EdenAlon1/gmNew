package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wib extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ wii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wib(wii wiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((wib) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final boolean z = this.a;
        Optional optional = (Optional) this.b.g.b();
        final ffji ffjiVar = new ffji() { // from class: whz
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ((wmu) obj2).j(z);
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: wia
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
        wib wibVar = new wib(this.b, ffguVar);
        wibVar.a = ((Boolean) obj).booleanValue();
        return wibVar;
    }
}

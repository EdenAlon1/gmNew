package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drbw extends ffkh implements ffji {
    public drbw(Object obj) {
        super(1, obj, drcf.class, "onStickerClicked", "onStickerClicked(Lcom/google/android/libraries/compose/emotify/data/CustomSticker;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqzc dqzcVar = (dqzc) obj;
        dqzcVar.getClass();
        drcf drcfVar = (drcf) this.g;
        enru enruVar = drcf.a;
        ffqy.d(drcfVar.bF(), null, null, new drbq(drcfVar, dqzcVar, null), 3);
        Optional f = drcfVar.f();
        final ffji ffjiVar = new ffji() { // from class: drbh
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                adao adaoVar = (adao) obj2;
                enru enruVar2 = drcf.a;
                adaoVar.getClass();
                adaoVar.b++;
                return ffcu.a;
            }
        };
        f.ifPresent(new Consumer() { // from class: drbi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                enru enruVar2 = drcf.a;
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }
}

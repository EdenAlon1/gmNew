package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeku implements aekj {
    final /* synthetic */ aekv a;

    public aeku(aekv aekvVar) {
        this.a = aekvVar;
    }

    @Override // defpackage.aekj
    public final void a(aelx aelxVar, aeki aekiVar, aekq aekqVar) {
        aekiVar.getClass();
        aekqVar.getClass();
        if (((asql) this.a.c.b()).a()) {
            if (aekiVar.z() != ckte.j) {
                ((aelu) aelxVar).J = null;
                return;
            }
            if (aekqVar.b == null) {
                ((aelu) aelxVar).J = false;
                return;
            }
            final aekv aekvVar = this.a;
            final ffji ffjiVar = new ffji() { // from class: aekr
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    aegr aegrVar = (aegr) obj;
                    aegrVar.getClass();
                    axol.k(aekv.this.a, null, new aekt(aegrVar, null), 3);
                    return ffcu.a;
                }
            };
            aekvVar.b.ifPresent(new Consumer() { // from class: aeks
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Integer num = aekqVar.b;
            num.getClass();
            ((aelu) aelxVar).J = Boolean.valueOf(num.intValue() < 2);
        }
    }
}

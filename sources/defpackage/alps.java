package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alps implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public alps(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        aloy aloyVar = (aloy) obj;
        alov alovVar = (alov) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((alpb) aloyVar.instance).c)), Integer.valueOf(this.a), alov.a);
        if (alovVar.e == 0) {
            int i = this.a;
            alot alotVar = (alot) alovVar.toBuilder();
            int i2 = this.b;
            alotVar.copyOnWrite();
            alov alovVar2 = (alov) alotVar.instance;
            alovVar2.b |= 2;
            alovVar2.e = i2;
            aloyVar.a(i, (alov) alotVar.build());
        }
        return ffcu.a;
    }
}

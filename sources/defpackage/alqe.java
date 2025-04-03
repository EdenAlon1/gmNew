package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqe implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public alqe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        aloy aloyVar = (aloy) obj;
        alov alovVar = (alov) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((alpb) aloyVar.instance).c)), Integer.valueOf(this.a), alov.a);
        int i = alovVar.d;
        int i2 = alovVar.f;
        alot alotVar = (alot) alovVar.toBuilder();
        int i3 = this.b;
        boolean z = i2 != i3;
        boolean z2 = i == 0;
        if (!z2) {
            if (z) {
                z = true;
            }
            return ffcu.a;
        }
        if (z2) {
            alotVar.copyOnWrite();
            alov alovVar2 = (alov) alotVar.instance;
            alovVar2.b |= 1;
            alovVar2.d = i3;
        }
        if (z) {
            alotVar.copyOnWrite();
            alov alovVar3 = (alov) alotVar.instance;
            alovVar3.b |= 4;
            alovVar3.f = i3;
        }
        eyfy build = alotVar.build();
        build.getClass();
        aloyVar.a(this.a, (alov) build);
        return ffcu.a;
    }
}

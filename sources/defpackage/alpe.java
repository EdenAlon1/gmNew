package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alpe implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public alpe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        alov alovVar;
        aloy aloyVar = (aloy) obj;
        aloyVar.copyOnWrite();
        alpb alpbVar = (alpb) aloyVar.instance;
        alpb alpbVar2 = alpb.a;
        alpbVar.b |= 1;
        alpbVar.d = this.a;
        alov alovVar2 = (alov) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((alpb) aloyVar.instance).c)), Integer.valueOf(this.b), alov.a);
        alox aloxVar = (alox) DesugarCollections.unmodifiableMap(alovVar2.c).get(Integer.valueOf(this.a));
        if (aloxVar == null) {
            alot alotVar = (alot) alovVar2.toBuilder();
            alotVar.copyOnWrite();
            ((alov) alotVar.instance).a().clear();
            alovVar = (alov) alotVar.build();
        } else {
            alot alotVar2 = (alot) alovVar2.toBuilder();
            alotVar2.copyOnWrite();
            ((alov) alotVar2.instance).a().clear();
            alotVar2.a(this.a, aloxVar);
            alovVar = (alov) alotVar2.build();
        }
        aloyVar.a(this.b, alovVar);
        return ffcu.a;
    }
}

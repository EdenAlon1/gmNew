package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alpw implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public alpw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        aloy aloyVar = (aloy) obj;
        alov alovVar = (alov) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((alpb) aloyVar.instance).c)), Integer.valueOf(this.a), alov.a);
        alox aloxVar = (alox) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(alovVar.c), Integer.valueOf(this.b), alox.a);
        if (!aloxVar.f) {
            int i = this.a;
            alot alotVar = (alot) alovVar.toBuilder();
            int i2 = this.b;
            alow alowVar = (alow) aloxVar.toBuilder();
            alowVar.copyOnWrite();
            alox aloxVar2 = (alox) alowVar.instance;
            aloxVar2.b |= 8;
            aloxVar2.f = true;
            alotVar.a(i2, (alox) alowVar.build());
            aloyVar.a(i, (alov) alotVar.build());
        }
        return ffcu.a;
    }
}

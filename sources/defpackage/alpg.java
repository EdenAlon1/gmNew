package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alpg implements ffji {
    final /* synthetic */ List a;

    public alpg(List list) {
        this.a = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        aloy aloyVar = (aloy) obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            aloyVar.copyOnWrite();
            alpb alpbVar = (alpb) aloyVar.instance;
            alpb alpbVar2 = alpb.a;
            alpbVar.a().remove(Integer.valueOf(intValue));
        }
        return ffcu.a;
    }
}

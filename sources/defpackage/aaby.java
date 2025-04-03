package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaby implements alyn {
    final /* synthetic */ aaca a;
    private final /* synthetic */ alyn b;

    public aaby(alxr alxrVar, aaca aacaVar) {
        this.a = aacaVar;
        alya d = alxrVar.d();
        d.getClass();
        this.b = (alyn) d;
    }

    @Override // defpackage.alyo
    public final alxo a() {
        Object obj;
        List list = this.a.a;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alya d = ((alxr) it.next()).d();
            d.getClass();
            arrayList.add(((alyn) d).a());
        }
        List g = ffdx.g(alxo.SENT, alxo.DELIVERED, alxo.SEEN);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int indexOf = g.indexOf((alxo) next);
                while (true) {
                    Object next2 = it2.next();
                    int indexOf2 = g.indexOf((alxo) next2);
                    int i = indexOf > indexOf2 ? indexOf2 : indexOf;
                    if (indexOf > indexOf2) {
                        next = next2;
                    }
                    if (!it2.hasNext()) {
                        break;
                    }
                    indexOf = i;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (alxo) obj;
    }

    @Override // defpackage.alyo
    public final alyt b() {
        return this.b.b();
    }

    @Override // defpackage.alyn
    public final aqux c() {
        return this.b.c();
    }

    @Override // defpackage.alya
    public final /* synthetic */ int d() {
        return 2;
    }
}

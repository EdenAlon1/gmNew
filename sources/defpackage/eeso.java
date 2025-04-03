package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeso extends aac {
    final /* synthetic */ eesu a;

    public eeso(eesu eesuVar) {
        this.a = eesuVar;
    }

    @Override // defpackage.aac
    public final int e(RecyclerView recyclerView, wr wrVar) {
        return g(3, 0);
    }

    @Override // defpackage.aac
    public final boolean k() {
        return false;
    }

    @Override // defpackage.aac
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aac
    public final boolean m(RecyclerView recyclerView, wr wrVar, wr wrVar2) {
        eesu eesuVar = this.a;
        List list = eesuVar.g;
        int fr = wrVar.fr();
        int fr2 = wrVar2.fr();
        Collections.swap(list, fr, fr2);
        ArrayList arrayList = new ArrayList();
        for (ewnp ewnpVar : eesuVar.g) {
            if (!eesuVar.f.contains(ewnpVar.b)) {
                arrayList.add(ewnpVar.b);
            }
        }
        eesuVar.a.o().d(arrayList);
        eesuVar.t(fr, fr2);
        eere eereVar = eesuVar.a;
        List list2 = eesuVar.g;
        eeui a = eereVar.a();
        String str = ((ewnp) list2.get(fr2)).b;
        eumg eumgVar = eumg.FAVORITES;
        if (fr == fr2) {
            return true;
        }
        int i = fr2 > fr ? 37 : 36;
        eumi eumiVar = (eumi) eumj.a.createBuilder();
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).b = eumh.a(i);
        eumiVar.copyOnWrite();
        eumj eumjVar = (eumj) eumiVar.instance;
        str.getClass();
        eumjVar.d = str;
        eumiVar.copyOnWrite();
        ((eumj) eumiVar.instance).e = eumgVar.a();
        ((eeuj) a).g((eumj) eumiVar.build());
        return true;
    }

    @Override // defpackage.aac
    public final void i(wr wrVar, int i) {
    }
}

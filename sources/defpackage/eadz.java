package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadz implements dzwt {
    public final eadx b;
    public final dzwu c;
    private final dyil d;
    private final dzja e;
    private dzwt g;
    public engw a = null;
    private dzwy f = null;

    public eadz(eadx eadxVar, dzja dzjaVar, dzpt dzptVar, dyil dyilVar, dyiu dyiuVar) {
        this.b = eadxVar;
        this.e = dzjaVar;
        this.d = dyilVar;
        this.c = dyiuVar.a(dzptVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzwt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final engw engwVar = (engw) obj;
        b();
        this.a = engwVar;
        final ArrayList arrayList = new ArrayList();
        if (engwVar.isEmpty()) {
            this.b.b(Arrays.asList(new dzpb[0]));
        }
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            dzpg dzpgVar = (dzpg) engwVar.get(i);
            arrayList.add(((dyle) this.d).e(this.e, dzpgVar, new emxg() { // from class: dyky
                @Override // defpackage.emxg
                public final boolean a(Object obj2) {
                    return ((dzpb) obj2).a() == -1;
                }
            }));
        }
        this.g = new dzwt() { // from class: eady
            @Override // defpackage.dzwt
            public final void a(Object obj2) {
                engw engwVar2 = engwVar;
                eadz eadzVar = eadz.this;
                dzwx dzwxVar = (dzwx) obj2;
                if (emxb.a(engwVar2, eadzVar.a)) {
                    List list = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((dzpb) dzwxVar.a.get((dzwu) it.next()));
                    }
                    eadzVar.b.b(arrayList2);
                }
            }
        };
        dzwy dzwyVar = new dzwy(arrayList);
        this.f = dzwyVar;
        dzwyVar.j(this.g);
    }

    public final void b() {
        dzwy dzwyVar = this.f;
        if (dzwyVar != null) {
            dzwyVar.l(this.g);
            this.f = null;
            this.g = null;
        }
    }
}

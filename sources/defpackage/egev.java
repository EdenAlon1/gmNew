package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egev implements erqj {
    final /* synthetic */ egex a;

    public egev(egex egexVar) {
        this.a = egexVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final ewjv ewjvVar = (ewjv) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(enkr.g(ewjvVar.d, new emwl() { // from class: eges
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return Uri.parse(((ewkv) obj2).c);
            }
        }));
        Iterator<E> it = ewjvVar.d.iterator();
        while (it.hasNext()) {
            arrayList.addAll(enkr.g(((ewkv) it.next()).g, new emwl() { // from class: eget
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return Uri.parse(((ewmb) obj2).d);
                }
            }));
        }
        this.a.a(arrayList, new emwl() { // from class: egeu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                enhk enhkVar;
                List list;
                List list2 = (List) obj2;
                ewjv ewjvVar2 = ewjv.this;
                int i = 0;
                List subList = list2.subList(0, ewjvVar2.d.size());
                eygr<ewkv> eygrVar = ewjvVar2.d;
                List subList2 = list2.subList(eygrVar.size(), list2.size());
                enhd enhdVar = new enhd();
                int i2 = 0;
                for (ewkv ewkvVar : eygrVar) {
                    if (ewkvVar.g.isEmpty()) {
                        String str = ewkvVar.b;
                        int i3 = engw.d;
                        enhdVar.k(str, enou.a);
                    } else {
                        enhdVar.k(ewkvVar.b, engw.n(subList2.subList(i2, ewkvVar.g.size() + i2)));
                        i2 += ewkvVar.g.size();
                    }
                }
                enhk c = enhdVar.c();
                eggr eggrVar = new eggr();
                ewkp ewkpVar = ewjvVar2.b;
                if (ewkpVar == null) {
                    ewkpVar = ewkp.a;
                }
                eggrVar.f(ewkpVar.b);
                ewkp ewkpVar2 = ewjvVar2.b;
                if (ewkpVar2 == null) {
                    ewkpVar2 = ewkp.a;
                }
                eggrVar.b(ewkpVar2.c);
                ewkp ewkpVar3 = ewjvVar2.b;
                if (ewkpVar3 == null) {
                    ewkpVar3 = ewkp.a;
                }
                eggrVar.h(ewkpVar3.d);
                ewkp ewkpVar4 = ewjvVar2.b;
                if (ewkpVar4 == null) {
                    ewkpVar4 = ewkp.a;
                }
                eggrVar.e(ewkpVar4.e);
                eygr eygrVar2 = ewjvVar2.d;
                enhd enhdVar2 = new enhd();
                int i4 = 0;
                while (i4 < eygrVar2.size()) {
                    ewkv ewkvVar2 = (ewkv) eygrVar2.get(i4);
                    String str2 = ewkvVar2.b;
                    Bitmap bitmap = (Bitmap) subList.get(i4);
                    engw engwVar = (engw) c.get(ewkvVar2.b);
                    int i5 = engw.d;
                    engr engrVar = new engr();
                    if (ewkvVar2.g.isEmpty()) {
                        enhkVar = c;
                        list = subList;
                    } else {
                        egha eghaVar = new egha();
                        eghaVar.f(ewkvVar2.g.size());
                        ewkt ewktVar = ewkvVar2.f;
                        if (ewktVar == null) {
                            ewktVar = ewkt.a;
                        }
                        eghaVar.c(ewktVar.b);
                        ewkt ewktVar2 = ewkvVar2.f;
                        if (ewktVar2 == null) {
                            ewktVar2 = ewkt.a;
                        }
                        eghaVar.e(ewktVar2.c);
                        ewkt ewktVar3 = ewkvVar2.f;
                        if (ewktVar3 == null) {
                            ewktVar3 = ewkt.a;
                        }
                        eghaVar.d(ewktVar3.d);
                        eghaVar.g(ewkvVar2.c);
                        eghaVar.b(bitmap);
                        engrVar.h(eghaVar.a());
                        eygr eygrVar3 = ewkvVar2.g;
                        engr engrVar2 = new engr();
                        enhkVar = c;
                        while (i < eygrVar3.size()) {
                            ewmb ewmbVar = (ewmb) eygrVar3.get(i);
                            Bitmap bitmap2 = (Bitmap) engwVar.get(i);
                            List list3 = subList;
                            egha eghaVar2 = new egha();
                            int i6 = i;
                            eghaVar2.f(ewmbVar.b);
                            ewkt ewktVar4 = ewmbVar.c;
                            if (ewktVar4 == null) {
                                ewktVar4 = ewkt.a;
                            }
                            eghaVar2.c(ewktVar4.b);
                            ewkt ewktVar5 = ewmbVar.c;
                            if (ewktVar5 == null) {
                                ewktVar5 = ewkt.a;
                            }
                            eghaVar2.e(ewktVar5.c);
                            ewkt ewktVar6 = ewmbVar.c;
                            if (ewktVar6 == null) {
                                ewktVar6 = ewkt.a;
                            }
                            eghaVar2.d(ewktVar6.d);
                            eghaVar2.g(ewmbVar.d);
                            eghaVar2.b(bitmap2);
                            engrVar2.h(eghaVar2.a());
                            i = i6 + 1;
                            subList = list3;
                        }
                        list = subList;
                        engrVar.j(engrVar2.g());
                    }
                    eggp eggpVar = new eggp();
                    eggpVar.g(ewkvVar2.b);
                    eggpVar.j(ewkvVar2.c);
                    eggpVar.c(ewkvVar2.d);
                    eggpVar.d(ewkvVar2.e);
                    ewkt ewktVar7 = ewkvVar2.f;
                    if (ewktVar7 == null) {
                        ewktVar7 = ewkt.a;
                    }
                    eggpVar.e(ewktVar7.b);
                    ewkt ewktVar8 = ewkvVar2.f;
                    if (ewktVar8 == null) {
                        ewktVar8 = ewkt.a;
                    }
                    eggpVar.h(ewktVar8.c);
                    ewkt ewktVar9 = ewkvVar2.f;
                    if (ewktVar9 == null) {
                        ewktVar9 = ewkt.a;
                    }
                    eggpVar.f(ewktVar9.d);
                    eggpVar.b(bitmap);
                    eggpVar.i(engrVar.g());
                    enhdVar2.k(str2, eggpVar.a());
                    i4++;
                    c = enhkVar;
                    subList = list;
                    i = 0;
                }
                eggrVar.a = enhdVar2.c();
                int i7 = engw.d;
                engr engrVar3 = new engr();
                ewkp ewkpVar5 = ewjvVar2.b;
                if (ewkpVar5 == null) {
                    ewkpVar5 = ewkp.a;
                }
                engrVar3.h(egfl.a(ewkpVar5.d, enou.a));
                engrVar3.j(enkr.g(ewjvVar2.c, new emwl() { // from class: egeq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        ewlv ewlvVar = (ewlv) obj3;
                        return egfl.a(ewlvVar.b, enkr.g(ewlvVar.c, new emwl() { // from class: egep
                            @Override // defpackage.emwl
                            public final Object apply(Object obj4) {
                                ewkn ewknVar = (ewkn) obj4;
                                return new eghc(ewknVar.b, ewknVar.c);
                            }
                        }));
                    }
                }));
                eggrVar.g(engrVar3.g());
                eggrVar.d(engw.n(ewjvVar2.e));
                eggrVar.c(enou.a);
                return eggrVar.a();
            }
        });
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.g.j(egfk.b(this.a.d.a(th)));
    }
}

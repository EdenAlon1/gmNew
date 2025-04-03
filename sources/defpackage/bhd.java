package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhd {
    public final Map a = new LinkedHashMap();
    private final String b;

    public bhd(String str) {
        this.b = str;
    }

    private final bhc k(String str, bgk bgkVar, bhh bhhVar, bgr bgrVar, List list) {
        bhc bhcVar = (bhc) this.a.get(str);
        if (bhcVar != null) {
            return bhcVar;
        }
        bhc bhcVar2 = new bhc(bgkVar, bhhVar, bgrVar, list);
        this.a.put(str, bhcVar2);
        return bhcVar2;
    }

    public final bgj a() {
        bgj bgjVar = new bgj();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            bhc bhcVar = (bhc) entry.getValue();
            if (bhcVar.f && bhcVar.e) {
                String str = (String) entry.getKey();
                bgjVar.b(bhcVar.a);
                arrayList.add(str);
            }
        }
        avw.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.b);
        return bgjVar;
    }

    public final bgj b() {
        bgj bgjVar = new bgj();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            bhc bhcVar = (bhc) entry.getValue();
            if (bhcVar.e) {
                bgjVar.b(bhcVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        avw.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.b);
        return bgjVar;
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableCollection(e(new bhb() { // from class: bgz
            @Override // defpackage.bhb
            public final boolean a(bhc bhcVar) {
                return bhcVar.e;
            }
        }));
    }

    public final Collection d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (((bhc) entry.getValue()).e) {
                arrayList.add(((bhc) entry.getValue()).b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public final Collection e(bhb bhbVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (bhbVar.a((bhc) entry.getValue())) {
                arrayList.add(((bhc) entry.getValue()).a);
            }
        }
        return arrayList;
    }

    public final void f(String str, bgk bgkVar, bhh bhhVar, bgr bgrVar, List list) {
        k(str, bgkVar, bhhVar, bgrVar, list).f = true;
    }

    public final void g(String str, bgk bgkVar, bhh bhhVar, bgr bgrVar, List list) {
        k(str, bgkVar, bhhVar, bgrVar, list).e = true;
        i(str, bgkVar, bhhVar, bgrVar, list);
    }

    public final void h(String str) {
        if (this.a.containsKey(str)) {
            bhc bhcVar = (bhc) this.a.get(str);
            bhcVar.f = false;
            if (bhcVar.e) {
                return;
            }
            this.a.remove(str);
        }
    }

    public final void i(String str, bgk bgkVar, bhh bhhVar, bgr bgrVar, List list) {
        if (this.a.containsKey(str)) {
            bhc bhcVar = new bhc(bgkVar, bhhVar, bgrVar, list);
            bhc bhcVar2 = (bhc) this.a.get(str);
            bhcVar.e = bhcVar2.e;
            bhcVar.f = bhcVar2.f;
            this.a.put(str, bhcVar);
        }
    }

    public final boolean j(String str) {
        if (this.a.containsKey(str)) {
            return ((bhc) this.a.get(str)).e;
        }
        return false;
    }
}

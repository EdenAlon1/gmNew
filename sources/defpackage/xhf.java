package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhf {
    public final xhu a;
    public final xgc b;
    public final Map c;
    public final Map d;

    public xhf(xhu xhuVar, xgc xgcVar, Map map, Map map2) {
        xhuVar.getClass();
        this.a = xhuVar;
        this.b = xgcVar;
        this.c = map;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhf)) {
            return false;
        }
        xhf xhfVar = (xhf) obj;
        return ffkj.e(this.a, xhfVar.a) && ffkj.e(this.b, xhfVar.b) && ffkj.e(this.c, xhfVar.c) && ffkj.e(this.d, xhfVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xgc xgcVar = this.b;
        return ((((hashCode + (xgcVar == null ? 0 : xgcVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        Set<Map.Entry> entrySet = this.c.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            ffcf ffcfVar = new ffcf(((drli) entry.getKey()).fo(), cskw.d((Uri) entry.getValue()));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        Set<Map.Entry> entrySet2 = this.d.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(entrySet2, 10)), 16));
        for (Map.Entry entry2 : entrySet2) {
            ffcf ffcfVar2 = new ffcf(((doxs) entry2.getKey()).fo(), cskw.c((CharSequence) entry2.getValue()));
            linkedHashMap2.put(ffcfVar2.a, ffcfVar2.b);
        }
        return "AnnotatedDraft(draft=" + this.a + ", emojiAnnotations=" + this.b + ", selectedVariations=" + linkedHashMap + ", captions=" + linkedHashMap2 + ")";
    }
}

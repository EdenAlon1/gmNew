package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fang extends fanj {
    public final eniz a;
    private final int b;

    public fang(eniz enizVar) {
        enizVar.getClass();
        this.a = enizVar;
        enqu listIterator = enizVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            int b = ((fanj) entry.getKey()).b();
            i = i < b ? b : i;
            int b2 = ((fanj) entry.getValue()).b();
            if (i < b2) {
                i = b2;
            }
        }
        int i2 = i + 1;
        this.b = i2;
        if (i2 > 8) {
            throw new famz("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c((byte) -96);
    }

    @Override // defpackage.fanj
    protected final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        fanj fanjVar = (fanj) obj;
        if (a() != fanjVar.a()) {
            size = a();
            size2 = fanjVar.a();
        } else {
            fang fangVar = (fang) fanjVar;
            if (this.a.size() == fangVar.a.size()) {
                enqu listIterator = this.a.entrySet().listIterator();
                enqu listIterator2 = fangVar.a.entrySet().listIterator();
                do {
                    if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    Map.Entry entry2 = (Map.Entry) listIterator2.next();
                    int compareTo2 = ((fanj) entry.getKey()).compareTo((fanj) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((fanj) entry.getValue()).compareTo((fanj) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.a.size();
            size2 = fangVar.a.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ennc.m(this.a, ((fang) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        if (this.a.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        enqu listIterator = this.a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            linkedHashMap.put(((fanj) entry.getKey()).toString().replace("\n", "\n  "), ((fanj) entry.getValue()).toString().replace("\n", "\n  "));
        }
        emwv emwvVar = new emwv(new emww(",\n  "), " : ");
        StringBuilder sb = new StringBuilder("{\n  ");
        emwvVar.b(sb, linkedHashMap.entrySet());
        sb.append("\n}");
        return sb.toString();
    }
}

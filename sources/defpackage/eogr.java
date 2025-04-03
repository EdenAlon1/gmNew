package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eogr implements Comparable, Serializable {
    protected final eogq a;

    protected eogr(eogq eogqVar) {
        this.a = eogqVar;
    }

    protected final void b(eogr eogrVar) {
        eogrVar.a.equals(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        eogr eogrVar = (eogr) obj;
        if (this == eogrVar) {
            return 0;
        }
        b(eogrVar);
        return Double.compare(100000.0d, 100000.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eogr)) {
            return false;
        }
        b((eogr) obj);
        return true;
    }

    public int hashCode() {
        return 53336526;
    }

    public String toString() {
        return Double.toString(100000.0d);
    }
}

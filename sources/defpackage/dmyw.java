package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyw {
    public final String a;
    public final List b;

    public dmyw(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmyw)) {
            return false;
        }
        dmyw dmywVar = (dmyw) obj;
        return ffkj.e(this.a, dmywVar.a) && ffkj.e(this.b, dmywVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FavoriteRowUiData(title=" + this.a + ", items=" + this.b + ")";
    }
}

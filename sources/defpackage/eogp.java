package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogp extends eogr {
    public eogp(eogq eogqVar) {
        super(eogqVar);
    }

    public final void a() {
        this.a.equals(eogo.a);
    }

    @Override // defpackage.eogr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eogp)) {
            return false;
        }
        b((eogp) obj);
        return true;
    }

    @Override // defpackage.eogr
    public final int hashCode() {
        a();
        return Arrays.hashCode(new Object[]{Double.valueOf(100000.0d)});
    }

    @Override // defpackage.eogr
    public final String toString() {
        a();
        return "100000.0m";
    }
}

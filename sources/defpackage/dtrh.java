package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtrh extends dtyk {
    private final dtyq a;
    private final dtrs b;
    private final int c;
    private final List d;

    public dtrh(dtyq dtyqVar, dtrs dtrsVar, int i, List list) {
        this.a = dtyqVar;
        if (dtrsVar == null) {
            throw new NullPointerException("Null changeListener");
        }
        this.b = dtrsVar;
        this.c = i;
        if (list == null) {
            throw new NullPointerException("Null preChangeDataObjects");
        }
        this.d = list;
    }

    @Override // defpackage.dtyk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dtyk
    public final dtrs b() {
        return this.b;
    }

    @Override // defpackage.dtyk
    public final dtyq c() {
        return this.a;
    }

    @Override // defpackage.dtyk
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtyk) {
            dtyk dtykVar = (dtyk) obj;
            if (this.a.equals(dtykVar.c()) && this.b.equals(dtykVar.b()) && this.c == dtykVar.a() && this.d.equals(dtykVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        List list = this.d;
        dtrs dtrsVar = this.b;
        return "PreChangeCallState{query=" + this.a.toString() + ", changeListener=" + dtrsVar.toString() + ", listPosition=" + this.c + ", preChangeDataObjects=" + list.toString() + "}";
    }
}

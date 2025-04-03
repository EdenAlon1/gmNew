package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xob {
    public final String a;
    public final dmzz b;
    public final List c;

    public xob(String str, dmzz dmzzVar, List list) {
        dmzzVar.getClass();
        list.getClass();
        this.a = str;
        this.b = dmzzVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xob)) {
            return false;
        }
        xob xobVar = (xob) obj;
        return ffkj.e(this.a, xobVar.a) && this.b == xobVar.b && ffkj.e(this.c, xobVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DirectSendHeaderUiData(title=" + this.a + ", navigationIcon=" + this.b + ", toolbarActions=" + this.c + ")";
    }
}

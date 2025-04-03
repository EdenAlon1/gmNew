package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgq extends dlaf implements Closeable {
    public final List a;
    public final ffji b;
    public final List c;
    public final Closeable d;
    public final eyee e;

    public dlgq(List list, ffji ffjiVar, List list2, Closeable closeable, eyee eyeeVar) {
        list2.getClass();
        this.a = list;
        this.b = ffjiVar;
        this.c = list2;
        this.d = closeable;
        this.e = eyeeVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgq)) {
            return false;
        }
        dlgq dlgqVar = (dlgq) obj;
        return ffkj.e(this.a, dlgqVar.a) && ffkj.e(this.b, dlgqVar.b) && ffkj.e(this.c, dlgqVar.c) && ffkj.e(this.d, dlgqVar.d) && ffkj.e(this.e, dlgqVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffji ffjiVar = this.b;
        return ((((((hashCode + (ffjiVar == null ? 0 : ffjiVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}

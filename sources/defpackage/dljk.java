package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljk extends dlaf implements Closeable {
    public final List a;
    public final ffji b;
    private final Closeable c;

    public dljk(List list, ffji ffjiVar, Closeable closeable) {
        this.a = list;
        this.b = ffjiVar;
        this.c = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljk)) {
            return false;
        }
        dljk dljkVar = (dljk) obj;
        return ffkj.e(this.a, dljkVar.a) && ffkj.e(this.b, dljkVar.b) && ffkj.e(this.c, dljkVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffji ffjiVar = this.b;
        return ((hashCode + (ffjiVar == null ? 0 : ffjiVar.hashCode())) * 31) + this.c.hashCode();
    }
}

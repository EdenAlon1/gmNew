package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhg extends dlaf implements Closeable {
    public final List a;
    public final dljy b;
    public final List c;
    public final eyee d;
    private final Closeable e;

    public dlhg() {
        this(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlac) it.next()).close();
        }
        dljy dljyVar = this.b;
        if (dljyVar != null) {
            dljyVar.close();
        }
        Closeable closeable = this.e;
        if (closeable != null) {
            closeable.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhg)) {
            return false;
        }
        dlhg dlhgVar = (dlhg) obj;
        return ffkj.e(this.a, dlhgVar.a) && ffkj.e(this.b, dlhgVar.b) && ffkj.e(this.c, dlhgVar.c) && ffkj.e(this.e, dlhgVar.e) && ffkj.e(this.d, dlhgVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dljy dljyVar = this.b;
        int hashCode2 = (((hashCode + (dljyVar == null ? 0 : dljyVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        Closeable closeable = this.e;
        return ((hashCode2 + (closeable != null ? closeable.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public dlhg(List list, dljy dljyVar, List list2, Closeable closeable, eyee eyeeVar) {
        eyeeVar.getClass();
        this.a = list;
        this.b = dljyVar;
        this.c = list2;
        this.e = closeable;
        this.d = eyeeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dlhg(byte[] r7) {
        /*
            r6 = this;
            ffel r1 = defpackage.ffel.a
            r4 = 0
            eyee r5 = defpackage.eyee.b
            r2 = 0
            r3 = r1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhg.<init>(byte[]):void");
    }
}

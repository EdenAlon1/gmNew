package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejr implements ejq, ipq {
    private final ejc a;
    private final irg b;
    private final ejg c;
    private final cnw d;

    /* JADX WARN: Type inference failed for: r1v2, types: [ejg, java.lang.Object] */
    public ejr(ejc ejcVar, irg irgVar) {
        this.a = ejcVar;
        this.b = irgVar;
        this.c = ejcVar.b.invoke();
        cnw cnwVar = cmz.a;
        this.d = new cnw((byte[]) null);
    }

    @Override // defpackage.ejq
    public final List a(int i, long j) {
        List list = (List) this.d.a(i);
        if (list != null) {
            return list;
        }
        Object d = this.c.d(i);
        List a = this.b.a(d, this.a.b(i, d, this.c.c(i)));
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ipl) a.get(i2)).e(j));
        }
        this.d.f(i, arrayList);
        return arrayList;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.b.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return this.b.ef(j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return this.b.eg(f);
    }

    @Override // defpackage.ipq
    public final ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return this.b.ei(i, i2, map, ffjiVar);
    }

    @Override // defpackage.ejq, defpackage.jzn
    public final float ek(int i) {
        return this.b.ek(i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return this.b.el(j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return this.b.em(f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return this.b.en(j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return this.b.eo(f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return this.b.ep(j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return this.b.eq(j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return this.b.er(f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return this.b.es(f);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        return this.b.et(i, i2, map, ffjiVar, ffjiVar2);
    }

    @Override // defpackage.iny
    public final boolean eu() {
        return this.b.eu();
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.b.q();
    }
}

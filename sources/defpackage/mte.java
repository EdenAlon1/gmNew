package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mte extends mta {
    public static final Object c = new Object();
    public final Object d;
    private final Object e;

    public mte(lru lruVar, Object obj, Object obj2) {
        super(lruVar);
        this.e = obj;
        this.d = obj2;
    }

    public static mte s(lqw lqwVar) {
        return new mte(new mtf(lqwVar), lrt.a, c);
    }

    @Override // defpackage.mta, defpackage.lru
    public final int a(Object obj) {
        Object obj2;
        if (c.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrs d(int i, lrs lrsVar, boolean z) {
        this.b.d(i, lrsVar, z);
        Object obj = lrsVar.b;
        int i2 = lvf.a;
        if (Objects.equals(obj, this.d) && z) {
            lrsVar.b = c;
        }
        return lrsVar;
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        this.b.e(i, lrtVar, j);
        Object obj = lrtVar.b;
        int i2 = lvf.a;
        if (Objects.equals(obj, this.e)) {
            lrtVar.b = lrt.a;
        }
        return lrtVar;
    }

    @Override // defpackage.mta, defpackage.lru
    public final Object f(int i) {
        Object f = this.b.f(i);
        int i2 = lvf.a;
        return Objects.equals(f, this.d) ? c : f;
    }

    public final mte r(lru lruVar) {
        return new mte(lruVar, this.e, this.d);
    }
}

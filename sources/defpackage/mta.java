package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mta extends lru {
    protected final lru b;

    public mta(lru lruVar) {
        this.b = lruVar;
    }

    @Override // defpackage.lru
    public int a(Object obj) {
        return this.b.a(obj);
    }

    @Override // defpackage.lru
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.lru
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.lru
    public lrs d(int i, lrs lrsVar, boolean z) {
        return this.b.d(i, lrsVar, z);
    }

    @Override // defpackage.lru
    public lrt e(int i, lrt lrtVar, long j) {
        return this.b.e(i, lrtVar, j);
    }

    @Override // defpackage.lru
    public Object f(int i) {
        return this.b.f(i);
    }

    @Override // defpackage.lru
    public final int g(boolean z) {
        return this.b.g(z);
    }

    @Override // defpackage.lru
    public final int h(boolean z) {
        return this.b.h(z);
    }

    @Override // defpackage.lru
    public final int j(int i, int i2, boolean z) {
        return this.b.j(i, i2, z);
    }

    @Override // defpackage.lru
    public final int k(int i, int i2, boolean z) {
        return this.b.k(i, i2, z);
    }
}

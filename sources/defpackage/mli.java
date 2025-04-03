package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mli {
    public final String a;
    public int b;
    public long c;
    public mtl d;
    public boolean e;
    public boolean f;
    final /* synthetic */ mlj g;

    public mli(mlj mljVar, String str, int i, mtl mtlVar) {
        this.g = mljVar;
        this.a = str;
        this.b = i;
        this.c = mtlVar == null ? -1L : mtlVar.d;
        if (mtlVar == null || !mtlVar.b()) {
            return;
        }
        this.d = mtlVar;
    }

    public final boolean a(mis misVar) {
        mtl mtlVar = misVar.d;
        if (mtlVar == null) {
            return this.b != misVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (mtlVar.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        lru lruVar = misVar.b;
        int a = lruVar.a(mtlVar.a);
        int a2 = lruVar.a(this.d.a);
        mtl mtlVar2 = misVar.d;
        if (mtlVar2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (!mtlVar2.b()) {
            int i = misVar.d.e;
            return i == -1 || i > this.d.b;
        }
        mtl mtlVar3 = misVar.d;
        int i2 = mtlVar3.b;
        int i3 = mtlVar3.c;
        mtl mtlVar4 = this.d;
        int i4 = mtlVar4.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > mtlVar4.c;
        }
        return true;
    }
}

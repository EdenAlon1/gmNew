package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fecl implements fecn {
    final int a;
    final fecn[] b;
    private final int c;

    private fecl(int i, fecn[] fecnVarArr, int i2) {
        this.a = i;
        this.b = fecnVarArr;
        this.c = i2;
    }

    static fecn d(fecn fecnVar, int i, fecn fecnVar2, int i2, int i3) {
        int f = f(i, i3);
        int f2 = f(i2, i3);
        if (f == f2) {
            fecn d = d(fecnVar, i, fecnVar2, i2, i3 + 5);
            return new fecl(f, new fecn[]{d}, ((fecl) d).c);
        }
        int g = g(i, i3);
        int g2 = g(i2, i3);
        fecn fecnVar3 = g > g2 ? fecnVar : fecnVar2;
        if (g > g2) {
            fecnVar = fecnVar2;
        }
        return new fecl(f | f2, new fecn[]{fecnVar, fecnVar3}, fecnVar.a() + fecnVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount((i - 1) & this.a);
    }

    private static int f(int i, int i2) {
        return 1 << g(i, i2);
    }

    private static int g(int i, int i2) {
        return (i >>> i2) & 31;
    }

    @Override // defpackage.fecn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fecn
    public final fecn b(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int f = f(i, i2);
        int e = e(f);
        if ((i3 & f) != 0) {
            fecn[] fecnVarArr = this.b;
            fecn[] fecnVarArr2 = (fecn[]) Arrays.copyOf(fecnVarArr, fecnVarArr.length);
            fecn b = this.b[e].b(obj, obj2, i, i2 + 5);
            fecnVarArr2[e] = b;
            return new fecl(this.a, fecnVarArr2, (this.c + b.a()) - this.b[e].a());
        }
        int i4 = i3 | f;
        fecn[] fecnVarArr3 = this.b;
        fecn[] fecnVarArr4 = new fecn[fecnVarArr3.length + 1];
        System.arraycopy(fecnVarArr3, 0, fecnVarArr4, 0, e);
        fecnVarArr4[e] = new fecm(obj, obj2);
        fecn[] fecnVarArr5 = this.b;
        System.arraycopy(fecnVarArr5, e, fecnVarArr4, e + 1, fecnVarArr5.length - e);
        return new fecl(i4, fecnVarArr4, this.c + 1);
    }

    @Override // defpackage.fecn
    public final Object c(Object obj, int i, int i2) {
        int i3 = this.a;
        int f = f(i, i2);
        if ((i3 & f) == 0) {
            return null;
        }
        return this.b[e(f)].c(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (fecn fecnVar : this.b) {
            sb.append(fecnVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}

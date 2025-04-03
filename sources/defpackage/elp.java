package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elp {
    public final Object[] a;
    public final int b;
    private final cov c;

    public elp(ffmj ffmjVar, eik eikVar) {
        eln b = eikVar.b();
        int i = ffmjVar.a;
        if (i < 0) {
            dwv.d("negative nearestRange.first");
        }
        int min = Math.min(ffmjVar.b, b.b - 1);
        if (min < i) {
            this.c = cow.a();
            this.a = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.a = new Object[i2];
        this.b = i;
        cog cogVar = new cog(i2);
        elo eloVar = new elo(i, min, cogVar, this);
        if (i < 0 || i >= b.b) {
            dwv.e("Index " + i + ", size " + b.b);
        }
        if (min < 0 || min >= b.b) {
            dwv.e("Index " + min + ", size " + b.b);
        }
        if (min < i) {
            dwv.c("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int a = ehw.a(b.a, i);
        int i3 = ((ehv) b.a.a[a]).a;
        while (i3 <= min) {
            ehv ehvVar = (ehv) b.a.a[a];
            eloVar.invoke(ehvVar);
            i3 += ehvVar.b;
            a++;
        }
        this.c = cogVar;
    }

    public final int a(Object obj) {
        cov covVar = this.c;
        int e = covVar.e(obj);
        if (e >= 0) {
            return covVar.c[e];
        }
        return -1;
    }

    public final Object b(int i) {
        int i2 = i - this.b;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.a;
        if (i2 <= ffdo.B(objArr)) {
            return objArr[i2];
        }
        return null;
    }
}

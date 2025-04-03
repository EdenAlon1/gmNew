package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehv {
    public final int a;
    public final int b;
    public final Object c;

    public ehv(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            dwv.c("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        dwv.c("size should be > 0");
    }
}

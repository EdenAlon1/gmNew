package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eln {
    public final hne a = new hne(new ehv[16]);
    public int b;
    private ehv c;

    public final ehv a(int i) {
        if (i < 0 || i >= this.b) {
            dwv.e("Index " + i + ", size " + this.b);
        }
        ehv ehvVar = this.c;
        if (ehvVar != null) {
            int i2 = ehvVar.a;
            if (i < ehvVar.b + i2 && i2 <= i) {
                return ehvVar;
            }
        }
        hne hneVar = this.a;
        ehv ehvVar2 = (ehv) hneVar.a[ehw.a(hneVar, i)];
        this.c = ehvVar2;
        return ehvVar2;
    }

    public final void b(int i, Object obj) {
        if (i < 0) {
            dwv.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ehv ehvVar = new ehv(this.b, i, obj);
        this.b += i;
        this.a.n(ehvVar);
    }
}

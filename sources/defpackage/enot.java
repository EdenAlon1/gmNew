package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enot extends engf {
    public static final enot a = new enot();
    final transient Object[] c;
    public final transient enot d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    private enot() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }

    @Override // defpackage.engf
    public final engf b() {
        return this.d;
    }

    @Override // defpackage.enhk, java.util.Map
    public final Object get(Object obj) {
        Object y = enoz.y(this.e, this.c, this.g, this.f, obj);
        if (y == null) {
            return null;
        }
        return y;
    }

    @Override // defpackage.enhk
    public final enip hE() {
        return new enow(this, this.c, this.f, this.g);
    }

    @Override // defpackage.enhk
    public final enip hF() {
        return new enox(this, new enoy(this.c, this.f, this.g));
    }

    @Override // defpackage.enhk
    public final boolean hH() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.engf, defpackage.enhk
    public Object writeReplace() {
        return super.writeReplace();
    }

    private enot(Object obj, Object[] objArr, int i, enot enotVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = enotVar;
    }

    public enot(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int d = i >= 2 ? enip.d(i) : 0;
        this.e = enoz.x(objArr, i, d, 0);
        this.d = new enot(enoz.x(objArr, i, d, 1), objArr, i, this);
    }
}

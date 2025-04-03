package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khv implements khu {
    final float a;
    float b;

    public khv(float f, float f2) {
        this.a = f2;
        this.b = f;
    }

    @Override // defpackage.khu
    public final float a() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}

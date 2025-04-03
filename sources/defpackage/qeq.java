package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qeq implements qeo {
    private final qlx a;
    private float b = -1.0f;

    public qeq(List list) {
        this.a = (qlx) list.get(0);
    }

    @Override // defpackage.qeo
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.qeo
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.qeo
    public final qlx c() {
        return this.a;
    }

    @Override // defpackage.qeo
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.qeo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qeo
    public final boolean f(float f) {
        return !this.a.e();
    }
}

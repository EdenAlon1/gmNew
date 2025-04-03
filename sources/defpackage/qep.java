package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qep implements qeo {
    private final List a;
    private qlx c = null;
    private float d = -1.0f;
    private qlx b = g(0.0f);

    public qep(List list) {
        this.a = list;
    }

    private final qlx g(float f) {
        qlx qlxVar = (qlx) this.a.get(this.a.size() - 1);
        if (f >= qlxVar.c()) {
            return qlxVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            qlx qlxVar2 = (qlx) this.a.get(size);
            if (this.b != qlxVar2 && qlxVar2.d(f)) {
                return qlxVar2;
            }
        }
        return (qlx) this.a.get(0);
    }

    @Override // defpackage.qeo
    public final float a() {
        return ((qlx) this.a.get(this.a.size() - 1)).b();
    }

    @Override // defpackage.qeo
    public final float b() {
        return ((qlx) this.a.get(0)).c();
    }

    @Override // defpackage.qeo
    public final qlx c() {
        return this.b;
    }

    @Override // defpackage.qeo
    public final boolean d(float f) {
        qlx qlxVar = this.c;
        qlx qlxVar2 = this.b;
        if (qlxVar == qlxVar2 && this.d == f) {
            return true;
        }
        this.c = qlxVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.qeo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qeo
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}

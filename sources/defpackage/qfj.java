package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfj extends qer {
    private final Object e;

    public qfj(qlz qlzVar) {
        this(qlzVar, null);
    }

    @Override // defpackage.qer
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.qer
    public final Object e() {
        qlz qlzVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return qlzVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.qer
    public final Object f(qlx qlxVar, float f) {
        return e();
    }

    @Override // defpackage.qer
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.qer
    public final void j(float f) {
        this.c = f;
    }

    public qfj(qlz qlzVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = qlzVar;
        this.e = obj;
    }
}

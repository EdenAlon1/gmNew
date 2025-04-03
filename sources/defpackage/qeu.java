package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qeu implements qem {
    private final qem a;
    private final qer b;
    private final qer c;
    private final qer d;
    private final qer e;
    private final qer f;
    private boolean g = true;

    public qeu(qem qemVar, qje qjeVar, qkd qkdVar) {
        this.a = qemVar;
        qer a = qkdVar.a.a();
        this.b = a;
        a.h(this);
        qjeVar.k(a);
        qer a2 = qkdVar.b.a();
        this.c = a2;
        a2.h(this);
        qjeVar.k(a2);
        qer a3 = qkdVar.c.a();
        this.d = a3;
        a3.h(this);
        qjeVar.k(a3);
        qer a4 = qkdVar.d.a();
        this.e = a4;
        a4.h(this);
        qjeVar.k(a4);
        qer a5 = qkdVar.e.a();
        this.f = a5;
        a5.h(this);
        qjeVar.k(a5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double floatValue = ((Float) this.d.e()).floatValue();
            float floatValue2 = ((Float) this.e.e()).floatValue();
            double d = floatValue * 0.017453292519943295d;
            float sin = ((float) Math.sin(d)) * floatValue2;
            float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.b.e()).intValue();
            paint.setShadowLayer(((Float) this.f.e()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public final void b(qlz qlzVar) {
        this.b.d = qlzVar;
    }

    public final void c(qlz qlzVar) {
        this.d.d = qlzVar;
    }

    @Override // defpackage.qem
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(qlz qlzVar) {
        this.e.d = qlzVar;
    }

    public final void f(qlz qlzVar) {
        if (qlzVar == null) {
            this.c.d = null;
        } else {
            this.c.d = new qet(qlzVar);
        }
    }

    public final void g(qlz qlzVar) {
        this.f.d = qlzVar;
    }
}

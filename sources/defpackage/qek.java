package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qek extends qds {
    private final qje d;
    private final String e;
    private final boolean f;
    private final qer g;
    private qer h;

    public qek(qdb qdbVar, qje qjeVar, qjb qjbVar) {
        super(qdbVar, qjeVar, qiz.a(qjbVar.i), qja.a(qjbVar.j), qjbVar.g, qjbVar.e, qjbVar.f, qjbVar.c, qjbVar.b);
        this.d = qjeVar;
        this.e = qjbVar.a;
        this.f = qjbVar.h;
        qer a = qjbVar.d.a();
        this.g = a;
        a.h(this);
        qjeVar.k(a);
    }

    @Override // defpackage.qds, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.b) {
            this.g.d = qlzVar;
            return;
        }
        if (obj == qdg.K) {
            qer qerVar = this.h;
            if (qerVar != null) {
                this.d.m(qerVar);
            }
            if (qlzVar == null) {
                this.h = null;
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.h = qfjVar;
            qfjVar.h(this);
            this.d.k(this.g);
        }
    }

    @Override // defpackage.qds, defpackage.qdw
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        this.b.setColor(((qes) this.g).k());
        qer qerVar = this.h;
        if (qerVar != null) {
            this.b.setColorFilter((ColorFilter) qerVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.e;
    }
}

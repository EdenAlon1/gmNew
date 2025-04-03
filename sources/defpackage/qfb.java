package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfb extends qey {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private qfa h;

    public qfb(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        float f2;
        qfa qfaVar = (qfa) qlxVar;
        Path path = qfaVar.a;
        if (path == null) {
            return (PointF) qlxVar.b;
        }
        qlz qlzVar = this.d;
        if (qlzVar != null) {
            f2 = f;
            PointF pointF = (PointF) qlzVar.b(qfaVar.g, qfaVar.h.floatValue(), (PointF) qfaVar.b, (PointF) qfaVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.h != qfaVar) {
            this.g.setPath(path, false);
            this.h = qfaVar;
        }
        PathMeasure pathMeasure = this.g;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.f, null);
        PointF pointF2 = this.e;
        float[] fArr = this.f;
        pointF2.set(fArr[0], fArr[1]);
        return this.e;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjl extends qje {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final qji n;
    private qer o;

    public qjl(qdb qdbVar, qji qjiVar) {
        super(qdbVar, qjiVar);
        this.j = new RectF();
        qdq qdqVar = new qdq();
        this.k = qdqVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = qjiVar;
        qdqVar.setAlpha(0);
        qdqVar.setStyle(Paint.Style.FILL);
        qdqVar.setColor(qjiVar.k);
    }

    @Override // defpackage.qje, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.K) {
            if (qlzVar == null) {
                this.o = null;
            } else {
                this.o = new qfj(qlzVar);
            }
        }
    }

    @Override // defpackage.qje, defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qji qjiVar = this.n;
        this.j.set(0.0f, 0.0f, qjiVar.i, qjiVar.j);
        this.a.mapRect(this.j);
        rectF.set(this.j);
    }

    @Override // defpackage.qje
    public final void l(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.n.k);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.g.e == null ? 100 : ((Integer) r1.e()).intValue())) / 100.0f) * 255.0f);
        this.k.setAlpha(intValue);
        qer qerVar = this.o;
        if (qerVar != null) {
            this.k.setColorFilter((ColorFilter) qerVar.e());
        }
        if (intValue > 0) {
            float[] fArr = this.l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            qji qjiVar = this.n;
            float f = qjiVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = qjiVar.j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            this.m.reset();
            Path path = this.m;
            float[] fArr2 = this.l;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.m;
            float[] fArr3 = this.l;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.m;
            float[] fArr4 = this.l;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.m;
            float[] fArr5 = this.l;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.m;
            float[] fArr6 = this.l;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.m.close();
            canvas.drawPath(this.m, this.k);
        }
    }
}

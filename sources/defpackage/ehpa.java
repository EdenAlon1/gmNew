package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpa extends ehpf {
    private final ehpc a;

    public ehpa(ehpc ehpcVar) {
        this.a = ehpcVar;
    }

    @Override // defpackage.ehpf
    public final void a(Matrix matrix, ehod ehodVar, int i, Canvas canvas) {
        ehpc ehpcVar = this.a;
        float f = ehpcVar.e;
        float f2 = ehpcVar.f;
        RectF rectF = new RectF(ehpcVar.a, ehpcVar.b, ehpcVar.c, ehpcVar.d);
        boolean z = f2 < 0.0f;
        Path path = ehodVar.k;
        if (z) {
            int[] iArr = ehod.c;
            iArr[0] = 0;
            iArr[1] = ehodVar.j;
            iArr[2] = ehodVar.i;
            iArr[3] = ehodVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = ehod.c;
            iArr2[0] = 0;
            iArr2[1] = ehodVar.h;
            iArr2[2] = ehodVar.i;
            iArr2[3] = ehodVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = ehod.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        ehodVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, ehod.c, ehod.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, ehodVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, ehodVar.f);
        canvas.restore();
    }
}

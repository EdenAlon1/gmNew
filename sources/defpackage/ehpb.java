package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpb extends ehpf {
    private final ehpd a;
    private final float b;
    private final float e;

    public ehpb(ehpd ehpdVar, float f, float f2) {
        this.a = ehpdVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.ehpf
    public final void a(Matrix matrix, ehod ehodVar, int i, Canvas canvas) {
        ehpd ehpdVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(ehpdVar.b - this.e, ehpdVar.a - this.b), 0.0f);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = ehod.a;
        iArr[0] = ehodVar.j;
        iArr[1] = ehodVar.i;
        iArr[2] = ehodVar.h;
        ehodVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, ehod.a, ehod.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(this.d);
        canvas.drawRect(rectF, ehodVar.g);
        canvas.restore();
    }

    final float b() {
        ehpd ehpdVar = this.a;
        return (float) Math.toDegrees(Math.atan((ehpdVar.b - this.e) / (ehpdVar.a - this.b)));
    }
}

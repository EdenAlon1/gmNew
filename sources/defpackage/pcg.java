package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pcg {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final pcd d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final cmh l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public pcg() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        this.l = new cmh();
        this.d = new pcd();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(pcd pcdVar, Matrix matrix, Canvas canvas, int i, int i2) {
        pcdVar.a.set(matrix);
        pcdVar.a.preConcat(pcdVar.j);
        canvas.save();
        for (int i3 = 0; i3 < pcdVar.b.size(); i3++) {
            pce pceVar = (pce) pcdVar.b.get(i3);
            if (pceVar instanceof pcd) {
                a((pcd) pceVar, pcdVar.a, canvas, i, i2);
            } else if (pceVar instanceof pcf) {
                pcf pcfVar = (pcf) pceVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = pcdVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[0], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = fArr[2];
                float f6 = f3 * fArr[3];
                float f7 = f4 * f5;
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f6 - f7) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    kpv[] kpvVarArr = pcfVar.m;
                    if (kpvVarArr != null) {
                        kpw.a(kpvVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (pcfVar.a()) {
                        this.n.setFillType(pcfVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        pcc pccVar = (pcc) pcfVar;
                        float f8 = pccVar.g;
                        if (f8 != 0.0f || pccVar.h != 1.0f) {
                            float f9 = pccVar.i;
                            float f10 = (f8 + f9) % 1.0f;
                            float f11 = (pccVar.h + f9) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path2.reset();
                            if (f12 > f13) {
                                this.p.getSegment(f12, length, path2, true);
                                this.p.getSegment(0.0f, f13, path2, true);
                            } else {
                                this.p.getSegment(f12, f13, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (pccVar.d.d()) {
                            kpb kpbVar = pccVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (kpbVar.a()) {
                                Shader shader = kpbVar.a;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(pccVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(PrivateKeyType.INVALID);
                                paint2.setColor(pcj.a(kpbVar.b, pccVar.f));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(pccVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (pccVar.b.d()) {
                            kpb kpbVar2 = pccVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = pccVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = pccVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(pccVar.l);
                            if (kpbVar2.a()) {
                                Shader shader2 = kpbVar2.a;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(pccVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(PrivateKeyType.INVALID);
                                paint4.setColor(pcj.a(kpbVar2.b, pccVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(pccVar.c * abs * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public pcg(pcg pcgVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = PrivateKeyType.INVALID;
        this.j = null;
        this.k = null;
        cmh cmhVar = new cmh();
        this.l = cmhVar;
        this.d = new pcd(pcgVar.d, cmhVar);
        this.m = new Path(pcgVar.m);
        this.n = new Path(pcgVar.n);
        this.e = pcgVar.e;
        this.f = pcgVar.f;
        this.g = pcgVar.g;
        this.h = pcgVar.h;
        int i = pcgVar.q;
        this.q = 0;
        this.i = pcgVar.i;
        this.j = pcgVar.j;
        String str = pcgVar.j;
        if (str != null) {
            cmhVar.put(str, this);
        }
        this.k = pcgVar.k;
    }
}

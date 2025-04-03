package defpackage;

import android.content.Context;
import android.graphics.Gainmap;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzc extends lyi implements mad, mcn {
    public final ltx f;
    public final boolean g;
    public Gainmap h;
    public int i;
    public boolean j;
    public boolean k;
    private final engw m;
    private final engw n;
    private final float[][] o;
    private final float[][] p;
    private final float[] q;
    private final float[] r;
    private final float[] s;
    private final int t;
    private engw u;
    private static final engw l = engw.u(new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f});
    public static final float[] d = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    public static final float[] e = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};

    private lzc(ltx ltxVar, engw engwVar, engw engwVar2, boolean z) {
        super(z);
        this.f = ltxVar;
        this.m = engwVar;
        this.n = engwVar2;
        this.g = z;
        this.o = (float[][]) Array.newInstance((Class<?>) Float.TYPE, engwVar.size(), 16);
        this.p = (float[][]) Array.newInstance((Class<?>) Float.TYPE, engwVar2.size(), 16);
        this.q = ltz.z();
        this.r = ltz.z();
        this.s = new float[16];
        this.u = l;
        this.i = -1;
        int i = 9729;
        for (int i2 = 0; i2 < engwVar.size(); i2++) {
            i = Math.max(i, ((mbf) engwVar.get(i2)).d());
        }
        this.t = i;
    }

    public static ltx l(Context context, String str, String str2) {
        try {
            ltx ltxVar = new ltx(context, str, str2);
            ltxVar.g("uTexTransformationMatrix", ltz.z());
            return ltxVar;
        } catch (IOException | lty e2) {
            throw new lsf(e2);
        }
    }

    public static lzc m(Context context, List list, List list2, boolean z) {
        return new lzc(l(context, "shaders/vertex_shader_transformation_es2.glsl", true != list2.isEmpty() ? "shaders/fragment_shader_transformation_es2.glsl" : "shaders/fragment_shader_copy_es2.glsl"), engw.n(list), engw.n(list2), z);
    }

    public static lzc n(Context context, List list, List list2, lpo lpoVar, int i) {
        boolean i2 = lpo.i(lpoVar);
        boolean z = true;
        String str = true != i2 ? "shaders/vertex_shader_transformation_es2.glsl" : "shaders/vertex_shader_transformation_es3.glsl";
        boolean z2 = i == 2;
        ltx l2 = l(context, str, i2 ? "shaders/fragment_shader_oetf_es3.glsl" : z2 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i3 = lpoVar.e;
        if (i2) {
            if (i3 != 7) {
                if (i3 == 6) {
                    i3 = 6;
                } else {
                    z = false;
                }
            }
            lti.a(z);
            l2.h("uOutputColorTransfer", i3);
        } else if (z2) {
            if (i3 != 3) {
                if (i3 == 10) {
                    i3 = 10;
                } else {
                    z = false;
                }
            }
            lti.a(z);
            l2.h("uOutputColorTransfer", i3);
        }
        return new lzc(l2, engw.n(list), engw.n(list2), i2);
    }

    public static lzc o(ltx ltxVar, lpo lpoVar, lpo lpoVar2, engw engwVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = lpoVar.c;
        boolean i2 = lpo.i(lpoVar);
        boolean z4 = (i == 1 || i == 2) && lpoVar2.c == 6;
        int i3 = lpoVar2.e;
        int i4 = 7;
        if (i2) {
            if (i3 == 3) {
                i3 = 10;
            }
            if (i3 == 1 || i3 == 10 || i3 == 6) {
                i4 = i3;
            } else if (i3 != 7) {
                i4 = i3;
                z3 = false;
                lti.a(z3);
                ltxVar.h("uOutputColorTransfer", i4);
            }
            z3 = true;
            lti.a(z3);
            ltxVar.h("uOutputColorTransfer", i4);
        } else if (z4) {
            if (i3 == 1 || i3 == 6) {
                z2 = true;
            } else if (i3 == 7) {
                z2 = true;
                i3 = 7;
            } else {
                z2 = false;
            }
            lti.a(z2);
            ltxVar.h("uOutputColorTransfer", i3);
        } else {
            ltxVar.h("uSdrWorkingColorSpace", 0);
            if (i3 == 3) {
                z = true;
            } else if (i3 == 1) {
                i3 = 1;
                z = true;
            } else {
                z = false;
            }
            lti.a(z);
            ltxVar.h("uOutputColorTransfer", i3);
        }
        int i5 = engw.d;
        return new lzc(ltxVar, engwVar, enou.a, i2 || z4);
    }

    private static boolean p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                int length = fArr4.length;
                lti.d(length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, length);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.lyi
    public final lux a(int i, int i2) {
        return mbt.a(i, i2, this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    @Override // defpackage.lyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r18, long r19) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzc.b(int, long):void");
    }

    @Override // defpackage.lyi, defpackage.mbj
    public final void e() {
        try {
            this.a.c();
            try {
                this.f.e();
                int i = this.i;
                if (i != -1) {
                    ltz.q(i);
                }
            } catch (lty e2) {
                throw new lsf(e2);
            }
        } catch (lty e3) {
            throw new lsf(e3);
        }
    }

    @Override // defpackage.lyi
    public final boolean k() {
        return (this.k && this.j) ? false : true;
    }
}

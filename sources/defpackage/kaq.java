package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kaq {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    private static volatile cpo c = new cpo(null);
    private static final Object[] d;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        synchronized (objArr) {
            f(c, 1.15f, new kas(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f(c, 1.3f, new kas(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f(c, 1.5f, new kas(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f(c, 1.8f, new kas(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f(c, 2.0f, new kas(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if (d(c.b(0)) - 0.01f > 1.03f) {
            return;
        }
        jzy.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static final boolean a(float f) {
        return f >= 1.03f;
    }

    public static final kap b(float f) {
        float d2;
        kap kapVar;
        if (!a(f)) {
            return null;
        }
        kap kapVar2 = (kap) cpp.a(c, c(f));
        if (kapVar2 != null) {
            return kapVar2;
        }
        int a2 = c.a(c(f));
        if (a2 >= 0) {
            return (kap) c.e(a2);
        }
        int i = -(a2 + 1);
        int i2 = i - 1;
        if (i >= c.c()) {
            kas kasVar = new kas(new float[]{1.0f}, new float[]{f});
            e(f, kasVar);
            return kasVar;
        }
        if (i2 < 0) {
            float[] fArr = b;
            kapVar = new kas(fArr, fArr);
            d2 = 1.0f;
        } else {
            d2 = d(c.b(i2));
            kapVar = (kap) c.e(i2);
        }
        float a3 = kat.a(0.0f, 1.0f, d2, d(c.b(i)), f);
        kap kapVar3 = (kap) c.e(i);
        float[] fArr2 = new float[9];
        for (int i3 = 0; i3 < 9; i3++) {
            float f2 = b[i3];
            float b2 = kapVar.b(f2);
            fArr2[i3] = b2 + ((kapVar3.b(f2) - b2) * a3);
        }
        kas kasVar2 = new kas(b, fArr2);
        e(f, kasVar2);
        return kasVar2;
    }

    private static final int c(float f) {
        return (int) (f * 100.0f);
    }

    private static final float d(int i) {
        return i / 100.0f;
    }

    private static final void e(float f, kap kapVar) {
        synchronized (d) {
            cpo clone = c.clone();
            f(clone, f, kapVar);
            c = clone;
        }
    }

    private static final void f(cpo cpoVar, float f, kap kapVar) {
        cpoVar.f(c(f), kapVar);
    }
}

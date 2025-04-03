package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imk {
    public static final float a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void b(imj imjVar, iku ikuVar) {
        if (ikj.d(ikuVar)) {
            imjVar.b();
        }
        if (!ikj.f(ikuVar)) {
            List a = ikuVar.a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                ijw ijwVar = (ijw) a.get(i);
                imjVar.a(ijwVar.a, ijwVar.c);
            }
            imjVar.a(ikuVar.b, ikuVar.k);
        }
        if (ikj.f(ikuVar) && ikuVar.b - imjVar.c > 40) {
            imjVar.b();
        }
        imjVar.c = ikuVar.b;
    }
}

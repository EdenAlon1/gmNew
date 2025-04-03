package defpackage;

import android.os.Build;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dts {
    public static final boolean a(iki ikiVar) {
        MotionEvent a;
        int classification;
        if (Build.VERSION.SDK_INT < 29 || (a = ikiVar.a()) == null) {
            return false;
        }
        classification = a.getClassification();
        return classification == 2;
    }
}

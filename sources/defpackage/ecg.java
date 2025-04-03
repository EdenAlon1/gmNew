package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecg {
    public static final ech b(hfd hfdVar) {
        ech echVar;
        View view = (View) hfdVar.e(AndroidCompositionLocals_androidKt.g);
        synchronized (ech.a) {
            WeakHashMap weakHashMap = ech.a;
            Object obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new ech(view);
                weakHashMap.put(view, obj);
            }
            echVar = (ech) obj;
        }
        boolean F = hfdVar.F(echVar) | hfdVar.F(view);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            f = new ecf(echVar, view);
            hfdVar.y(f);
        }
        hgs.c(echVar, (ffji) f, hfdVar);
        return echVar;
    }
}

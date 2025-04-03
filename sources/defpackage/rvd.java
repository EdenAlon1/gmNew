package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvd {
    public static final long a = iby.j(0.0f, 0.0f, 0.0f, 0.3f, null, 16);
    public static final ffji b = rvc.a;

    @ffbs
    public static final rva a(hfd hfdVar) {
        hfdVar.v(-715745933);
        hfdVar.v(1009281237);
        ViewParent parent = ((View) hfdVar.e(AndroidCompositionLocals_androidKt.g)).getParent();
        Window window = null;
        kei keiVar = parent instanceof kei ? (kei) parent : null;
        Window a2 = keiVar != null ? keiVar.a() : null;
        if (a2 == null) {
            Context context = ((View) hfdVar.e(AndroidCompositionLocals_androidKt.g)).getContext();
            context.getClass();
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
        } else {
            window = a2;
        }
        hfm hfmVar = (hfm) hfdVar;
        hfmVar.Z();
        View view = (View) hfdVar.e(AndroidCompositionLocals_androidKt.g);
        hfdVar.v(1969318995);
        boolean D = hfdVar.D(window) | hfdVar.D(view);
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new rva(view, window);
            hfmVar.ad(R);
        }
        rva rvaVar = (rva) R;
        hfmVar.Z();
        hfmVar.Z();
        return rvaVar;
    }
}

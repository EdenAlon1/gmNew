package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easo {
    public static int a(int i, int i2, int i3) {
        return kps.g(kps.h(i2, i3), i);
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5d);
    }

    public static int c(faul faulVar) {
        float f;
        if ((faulVar.b & 1) != 0) {
            eyfn eyfnVar = faulVar.f;
            if (eyfnVar == null) {
                eyfnVar = eyfn.a;
            }
            f = eyfnVar.b;
        } else {
            f = 1.0f;
        }
        return Color.argb(((int) (f * 255.0f)) & PrivateKeyType.INVALID, ((int) (faulVar.c * 255.0f)) & PrivateKeyType.INVALID, ((int) (faulVar.d * 255.0f)) & PrivateKeyType.INVALID, ((int) (faulVar.e * 255.0f)) & PrivateKeyType.INVALID);
    }

    public static View d(Activity activity) {
        Window window;
        for (ea eaVar : ((eg) activity).a().p()) {
            if (eaVar instanceof dn) {
                View view = eaVar.Q;
                return (view != null || (window = ((dn) eaVar).d.getWindow()) == null) ? view : window.getDecorView();
            }
        }
        return null;
    }

    public static void e(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }
}

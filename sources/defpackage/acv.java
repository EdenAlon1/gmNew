package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void a(abe abeVar, ffjm ffjmVar) {
        View childAt = ((ViewGroup) abeVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.i(null);
            composeView.a(ffjmVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(abeVar, null, 0, 6, null);
        composeView2.i(null);
        composeView2.a(ffjmVar);
        View decorView = abeVar.getWindow().getDecorView();
        if (lmz.a(decorView) == null) {
            lmz.b(decorView, abeVar);
        }
        if (lna.a(decorView) == null) {
            lna.b(decorView, abeVar);
        }
        if (oxa.a(decorView) == null) {
            oxa.b(decorView, abeVar);
        }
        abeVar.setContentView(composeView2, a);
    }
}

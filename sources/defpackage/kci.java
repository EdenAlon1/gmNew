package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kci extends ffkk implements ffji {
    final /* synthetic */ kck a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(kck kckVar) {
        super(1);
        this.a = kckVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        Rect rect;
        hye hyeVar = (hye) obj;
        View a = kch.a(this.a);
        if (!a.isFocused() && !a.hasFocus()) {
            hyv hyvVar = ((AndroidComposeView) isx.f(this.a)).d;
            kck kckVar = this.a;
            int i = hyeVar.a;
            View a2 = isy.a(kckVar);
            Integer d = hyn.d(i);
            int[] iArr = new int[2];
            a2.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            a.getLocationOnScreen(iArr2);
            iam c = hyvVar.c();
            if (c == null) {
                rect = null;
            } else {
                int i2 = iArr[0];
                int i3 = ((int) c.b) + i2;
                int i4 = iArr2[0];
                int i5 = iArr[1];
                int i6 = ((int) c.c) + i5;
                int i7 = iArr2[1];
                rect = new Rect(i3 - i4, i6 - i7, (((int) c.d) + i2) - i4, (((int) c.e) + i5) - i7);
            }
            if (!hyn.e(a, d, rect)) {
                hyeVar.b = true;
            }
        }
        return ffcu.a;
    }
}

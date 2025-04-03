package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehau implements ehje {
    @Override // defpackage.ehje
    public final void a(View view, kxh kxhVar, ehjf ehjfVar) {
        ehjfVar.d += kxhVar.a();
        int layoutDirection = view.getLayoutDirection();
        int b = kxhVar.b();
        int c = kxhVar.c();
        int i = ehjfVar.a + (layoutDirection == 1 ? c : b);
        ehjfVar.a = i;
        if (layoutDirection != 1) {
            b = c;
        }
        int i2 = ehjfVar.c + b;
        ehjfVar.c = i2;
        view.setPaddingRelative(i, ehjfVar.b, i2, ehjfVar.d);
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caor implements cbuv {
    public caor(asnt asntVar) {
        asntVar.getClass();
    }

    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        bcseVar.getClass();
        return "";
    }

    @Override // defpackage.cbuv
    public final void b(View view, TextView textView, bcse bcseVar, int i) {
        textView.getClass();
        bcseVar.getClass();
        int f = bcseVar.f();
        if (f != 215) {
            if (f != 216 && f != 219 && f != 237) {
                if (f != 238) {
                    switch (f) {
                        case 233:
                            textView.setText(caoy.a(textView, true));
                            break;
                        case 234:
                            textView.setText(caoy.a(textView, false));
                            break;
                    }
                    return;
                }
            }
            textView.setText(caoy.c(textView, bcseVar, true));
            return;
        }
        textView.setText(caoy.c(textView, bcseVar, false));
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        bcseVar.getClass();
        int f = bcseVar.f();
        return f == 233 || f == 234;
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return false;
    }
}

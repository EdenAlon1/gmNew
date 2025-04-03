package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjq {
    private final ehjl a;
    private final View b;
    private final ehjn c;

    public ehjq(ehjl ehjlVar, View view) {
        this.c = Build.VERSION.SDK_INT >= 34 ? new ehjp() : Build.VERSION.SDK_INT >= 33 ? new ehjn() : null;
        this.a = ehjlVar;
        this.b = view;
    }

    public final void a() {
        ehjn ehjnVar = this.c;
        if (ehjnVar != null) {
            ehjnVar.b(this.a, this.b, false);
        }
    }

    public final void b() {
        ehjn ehjnVar = this.c;
        if (ehjnVar != null) {
            ehjnVar.c(this.b);
        }
    }
}

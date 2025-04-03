package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caog implements cbuv {
    private final bzqa a;
    private final adsd b;

    public caog(bzqa bzqaVar, adsd adsdVar, asnt asntVar) {
        bzqaVar.getClass();
        adsdVar.getClass();
        asntVar.getClass();
        this.a = bzqaVar;
        this.b = adsdVar;
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
        if (f == 207) {
            textView.setText(caoy.c(textView, bcseVar, false));
            return;
        }
        if (f != 213) {
            return;
        }
        textView.setText(caoy.c(textView, bcseVar, true));
        if (this.a.l()) {
            textView.setTag(R.id.growthkit_view_tag, "etouffee_initialization_tombstone");
            this.b.a(18);
        }
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        bcseVar.getClass();
        return false;
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return false;
    }
}

package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeps implements View.OnClickListener {
    final /* synthetic */ aepr a;

    public aeps(aepr aeprVar) {
        this.a = aeprVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list = this.a.c;
        ellj.g(new cxnp(list instanceof engw ? (engw) list : engw.n(list)), view);
    }
}

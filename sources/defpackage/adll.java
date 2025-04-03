package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adll implements View.OnClickListener {
    private final Activity a;
    private final ffbr b;
    private final ffbr c;
    private final adkx d;

    public adll(Activity activity, ffbr ffbrVar, ffbr ffbrVar2, adkx adkxVar) {
        this.a = activity;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = adkxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.a(2);
        ((akvg) this.b.b()).ab(this.a);
        ((adsd) this.c.b()).a(12);
    }
}

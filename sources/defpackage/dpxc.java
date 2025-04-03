package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxc {
    public final fgcm a;
    public final fgdj b;
    private final Context c;
    private final OrientationEventListener d;

    public dpxc(Context context) {
        context.getClass();
        this.c = context;
        fgcm a = fgdm.a(dpxa.a);
        this.a = a;
        this.b = new fgco(a);
        this.d = new dpxb(this, context);
    }

    public final void a() {
        this.d.enable();
    }

    public final void b() {
        this.d.disable();
    }
}

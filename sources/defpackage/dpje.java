package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpje implements hgo {
    final /* synthetic */ Activity a;
    final /* synthetic */ int b;

    public dpje(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    @Override // defpackage.hgo
    public final void a() {
        this.a.setRequestedOrientation(this.b);
    }
}

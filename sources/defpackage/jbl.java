package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbl implements hgo {
    final /* synthetic */ Context a;
    final /* synthetic */ jbn b;

    public jbl(Context context, jbn jbnVar) {
        this.a = context;
        this.b = jbnVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}

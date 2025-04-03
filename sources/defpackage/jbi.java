package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbi implements hgo {
    final /* synthetic */ Context a;
    final /* synthetic */ jbk b;

    public jbi(Context context, jbk jbkVar) {
        this.a = context;
        this.b = jbkVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}

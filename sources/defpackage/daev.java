package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daev extends davy {
    public elbx a;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.a.b("DebugReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return null;
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        q("debug future", SettableFuture.create());
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }
}

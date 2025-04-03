package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdt implements eknz {
    final /* synthetic */ acdu a;

    public acdt(acdu acduVar) {
        this.a = acduVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emux.a;
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        return elfo.e(eknx.b(new Intent().setClassName(this.a.a, "com.google.android.apps.messaging.main.MainActivity")));
    }

    @Override // defpackage.eknz
    public final /* synthetic */ eknx e() {
        return ekny.a();
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void d() {
    }
}

package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.samsung.settings.CmcUserConsentSettingsActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akoc implements eknz {
    final /* synthetic */ akod a;

    public akoc(akod akodVar) {
        this.a = akodVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emux.a;
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        return elfo.e(eknx.b(new Intent(this.a.a, (Class<?>) CmcUserConsentSettingsActivity.class)));
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

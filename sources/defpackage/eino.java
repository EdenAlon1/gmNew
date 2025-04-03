package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.search.verification.api.ISearchActionVerificationService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eino implements ServiceConnection {
    public ISearchActionVerificationService a;
    final /* synthetic */ einp b;

    public eino(einp einpVar) {
        this.b = einpVar;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.b.b) {
            ensk e = einp.a.e();
            e.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) e).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceConnected", 124, "SearchActionVerificationClientService.java")).q("onServiceConnected");
        }
        this.a = ISearchActionVerificationService.Stub.asInterface(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a = null;
        if (this.b.b) {
            ensk e = einp.a.e();
            e.Y(ente.a, "SAVerificationClientS");
            ((enrr) ((enrr) e).h("com/google/android/search/verification/client/SearchActionVerificationClientService$SearchActionVerificationServiceConnection", "onServiceDisconnected", 134, "SearchActionVerificationClientService.java")).q("onServiceDisconnected");
        }
    }
}

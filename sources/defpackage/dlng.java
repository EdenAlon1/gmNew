package defpackage;

import android.app.KeyguardManager$KeyguardDismissCallback;
import android.util.Log;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlng extends KeyguardManager$KeyguardDismissCallback {
    final /* synthetic */ IAppIntegrationSessionCallbackStub a;

    public dlng(IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub) {
        this.a = iAppIntegrationSessionCallbackStub;
    }

    public final void onDismissCancelled() {
        dlnh dlnhVar;
        dlnh dlnhVar2;
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissCancelled()");
        dlnhVar = this.a.b;
        if (dlnhVar != null) {
            dlnhVar2 = this.a.b;
            dlnhVar2.a();
        }
    }

    public final void onDismissError() {
        dlnh dlnhVar;
        dlnh dlnhVar2;
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissError()");
        dlnhVar = this.a.b;
        if (dlnhVar != null) {
            dlnhVar2 = this.a.b;
            dlnhVar2.a();
        }
    }

    public final void onDismissSucceeded() {
        dlnh dlnhVar;
        dlnh dlnhVar2;
        Log.v("AIClientCbStub", "KeyguardDismissCallback#onDismissSucceeded()");
        dlnhVar = this.a.b;
        if (dlnhVar != null) {
            dlnhVar2 = this.a.b;
            dlnhVar2.a();
        }
    }
}

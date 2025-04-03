package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgda implements dfsm, dftw {
    public final Queue a = new ArrayDeque();
    public Status b = new Status(17, "None of the GmsClient connection callbacks have been called.");

    private final void a() {
        while (true) {
            Consumer m104m = afg$$ExternalSyntheticApiModelOutline0.m104m(this.a.poll());
            if (m104m == null) {
                return;
            } else {
                m104m.accept(this.b);
            }
        }
    }

    @Override // defpackage.dfsm
    public final void onConnected(Bundle bundle) {
        this.b = Status.a;
        a();
    }

    @Override // defpackage.dftw
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.b = new Status(connectionResult, "Connection to the GMS Core module failed.");
        a();
    }

    @Override // defpackage.dfsm
    public final void onConnectionSuspended(int i) {
        this.b = new Status(20, a.h(i, "Connection to the GMS Core module was suspended, cause: "));
        a();
    }
}

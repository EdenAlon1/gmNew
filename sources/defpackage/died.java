package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.IWearableService;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class died {
    private final Map a = new HashMap();

    public final void a(IBinder iBinder) {
        synchronized (this.a) {
            IWearableService asInterface = IWearableService.Stub.asInterface(iBinder);
            difk difkVar = new difk();
            for (Map.Entry entry : this.a.entrySet()) {
                WearableListenerStubImpl wearableListenerStubImpl = (WearableListenerStubImpl) entry.getValue();
                try {
                    asInterface.addListener(difkVar, new AddListenerRequest(wearableListenerStubImpl));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(wearableListenerStubImpl));
                }
            }
        }
    }
}

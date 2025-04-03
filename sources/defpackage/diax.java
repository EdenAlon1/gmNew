package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.IWearableListener;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diax extends IWearableListener.Stub {
    final /* synthetic */ diay a;
    private volatile int b = -1;

    public diax(diay diayVar) {
        this.a = diayVar;
    }

    public static final void a(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    private final boolean b(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.a.F.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (digf.a(this.a).b() && dfzb.b(this.a, callingUid, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else {
                if (!dfzb.a(this.a, callingUid)) {
                    Log.e("WearableLS", a.h(callingUid, "Caller is not GooglePlayServices; caller UID: "));
                    return false;
                }
                this.b = callingUid;
            }
        }
        synchronized (this.a.I) {
            diay diayVar = this.a;
            if (diayVar.J) {
                return false;
            }
            diayVar.G.post(runnable);
            return true;
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        b(new diaw(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        b(new diat(), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedNodes(List<NodeParcelable> list) {
        b(new dias(), "onConnectedNodes", list);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onDataChanged(DataHolder dataHolder) {
        try {
            if (b(new diao(this, dataHolder), "onDataItemChanged", a.g(dataHolder.i, String.valueOf(dataHolder), ", rows="))) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        b(new diav(), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        b(new diap(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNodeMigrated(final NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        if (b(new Runnable() { // from class: dian
            @Override // java.lang.Runnable
            public final void run() {
                NodeMigratedEventParcelable nodeMigratedEventParcelable2 = NodeMigratedEventParcelable.this;
                dhzo dhzoVar = new dhzo(nodeMigratedEventParcelable2.b);
                try {
                    String str = nodeMigratedEventParcelable2.a;
                    dhzoVar.b();
                } catch (Throwable th) {
                    try {
                        dhzoVar.b();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, "onNodeMigrated", "DataHolder[rows=" + nodeMigratedEventParcelable.b.i + "]")) {
            return;
        }
        nodeMigratedEventParcelable.b.close();
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        b(new diau(), "onNotificationReceived", ancsNotificationParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerConnected(NodeParcelable nodeParcelable) {
        b(new diaq(), "onPeerConnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerDisconnected(NodeParcelable nodeParcelable) {
        b(new diar(), "onPeerDisconnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRequestReceived(final MessageEventParcelable messageEventParcelable, final IRpcResponseCallback iRpcResponseCallback) {
        b(new Runnable() { // from class: dial
            @Override // java.lang.Runnable
            public final void run() {
                diay diayVar = diax.this.a;
                MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                dhre d = diayVar.d(messageEventParcelable2.d, messageEventParcelable2.b, messageEventParcelable2.c);
                final IRpcResponseCallback iRpcResponseCallback2 = iRpcResponseCallback;
                d.s(new dhqs() { // from class: diam
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        IRpcResponseCallback iRpcResponseCallback3 = IRpcResponseCallback.this;
                        if (dhreVar.m()) {
                            diax.a(iRpcResponseCallback3, true, (byte[]) dhreVar.i());
                        } else {
                            Log.e("WearableLS", "Failed to resolve future, sending null response", dhreVar.h());
                            diax.a(iRpcResponseCallback3, false, null);
                        }
                    }
                });
            }
        }, "onRequestReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConsentChanged(ConsentResponse consentResponse) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
    }
}

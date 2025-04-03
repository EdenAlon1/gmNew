package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.dftp;
import defpackage.dfwv;
import defpackage.dhys;
import defpackage.dhyt;
import defpackage.dhyx;
import defpackage.dhyy;
import defpackage.dhzb;
import defpackage.dhzg;
import defpackage.dhzh;
import defpackage.dhzt;
import defpackage.dhzu;
import defpackage.dhzx;
import defpackage.dhzy;
import defpackage.dhzz;
import defpackage.diad;
import defpackage.difq;
import defpackage.difr;
import defpackage.difs;
import defpackage.dift;
import defpackage.difu;
import defpackage.difv;
import defpackage.difw;
import defpackage.difx;
import defpackage.dify;
import defpackage.diga;
import defpackage.digb;
import defpackage.digc;
import defpackage.digd;
import defpackage.dige;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WearableListenerStubImpl<T> extends IWearableListener.Stub {
    private dftp a;
    private dftp b;
    private dftp c;
    private dftp d;
    private dftp e;
    private dftp f;
    private dftp g;
    private dftp h;
    private dftp i;
    private dftp j;
    private dftp k;
    private dftp l;
    private dftp m;
    private final IntentFilter[] n;
    private final String o;

    private WearableListenerStubImpl(IntentFilter[] intentFilterArr, String str) {
        dfwv.n(intentFilterArr);
        this.n = intentFilterArr;
        this.o = str;
    }

    private static void a(dftp dftpVar) {
        if (dftpVar != null) {
            dftpVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableListenerStub", "Failed to send a response back", e);
        }
    }

    public static WearableListenerStubImpl<dhys> forAms(dftp<? extends dhys> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhys> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).a = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhyt> forAncs(dftp<? extends dhyt> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhyt> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).b = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhyx> forCapability(dftp<? extends dhyx> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhyx> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).i = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhyy> forChannel(dftp<? extends dhyy> dftpVar, String str, IntentFilter[] intentFilterArr) {
        dfwv.n(str);
        WearableListenerStubImpl<dhyy> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, str);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzb> forConnectionStateChange(dftp<? extends dhzb> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzb> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).k = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzg> forConsent(dftp<? extends dhzg> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzg> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).j = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzh> forData(dftp<? extends dhzh> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzh> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).c = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzt> forMessage(dftp<? extends dhzt> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzt> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).d = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzy> forNode(dftp<? extends dhzy> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzy> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).f = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzz> forNodeMigrated(dftp<? extends dhzz> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzz> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).l = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzx> forOnConnectedNodes(dftp<? extends dhzx> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzx> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).g = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<dhzu> forRequest(dftp<? extends dhzu> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhzu> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).e = dftpVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<diad> forRestoreCompleted(dftp<? extends diad> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<diad> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).m = dftpVar;
        return wearableListenerStubImpl;
    }

    public void clear() {
        a(this.a);
        this.a = null;
        a(this.b);
        this.b = null;
        a(this.c);
        this.c = null;
        a(this.d);
        this.d = null;
        a(this.e);
        this.e = null;
        a(this.f);
        this.f = null;
        a(this.g);
        this.g = null;
        a(this.h);
        this.h = null;
        a(this.i);
        this.i = null;
        a(this.j);
        this.j = null;
        a(this.k);
        this.k = null;
        a(this.l);
        this.l = null;
        a(this.m);
        this.m = null;
    }

    public String getChannelToken() {
        return this.o;
    }

    public IntentFilter[] getFilters() {
        return this.n;
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        dftp dftpVar = this.h;
        if (dftpVar != null) {
            dftpVar.b(new dige(channelEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        dftp dftpVar = this.i;
        if (dftpVar != null) {
            dftpVar.b(new difq());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedNodes(List<NodeParcelable> list) {
        dftp dftpVar = this.g;
        if (dftpVar != null) {
            dftpVar.b(new digd());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
        dftp dftpVar = this.k;
        if (dftpVar != null) {
            dftpVar.b(new difs());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConsentChanged(ConsentResponse consentResponse) {
        dftp dftpVar = this.j;
        if (dftpVar != null) {
            dftpVar.b(new difr());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onDataChanged(DataHolder dataHolder) {
        dftp dftpVar = this.c;
        if (dftpVar != null) {
            dftpVar.b(new difx(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        dftp dftpVar = this.a;
        if (dftpVar != null) {
            dftpVar.b(new difw());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        dftp dftpVar = this.d;
        if (dftpVar != null) {
            dftpVar.b(new dify(messageEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        dftp dftpVar = this.l;
        if (dftpVar == null) {
            nodeMigratedEventParcelable.b.close();
        } else {
            String str = nodeMigratedEventParcelable.a;
            dftpVar.b(new dift(nodeMigratedEventParcelable.b));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        dftp dftpVar = this.b;
        if (dftpVar != null) {
            dftpVar.b(new difv());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerConnected(NodeParcelable nodeParcelable) {
        dftp dftpVar = this.f;
        if (dftpVar != null) {
            dftpVar.b(new digb());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerDisconnected(NodeParcelable nodeParcelable) {
        dftp dftpVar = this.f;
        if (dftpVar != null) {
            dftpVar.b(new digc());
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        dftp dftpVar = this.e;
        if (dftpVar != null) {
            dftpVar.b(new diga(messageEventParcelable, iRpcResponseCallback));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
        dftp dftpVar = this.m;
        if (dftpVar != null) {
            dftpVar.b(new difu());
        }
    }

    public static WearableListenerStubImpl<dhyy> forChannel(dftp<? extends dhyy> dftpVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<dhyy> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        dfwv.n(dftpVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = dftpVar;
        return wearableListenerStubImpl;
    }
}

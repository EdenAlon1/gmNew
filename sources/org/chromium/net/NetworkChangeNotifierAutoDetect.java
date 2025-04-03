package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import defpackage.fidy;
import defpackage.fiem;
import defpackage.fiev;
import defpackage.fifp;
import defpackage.fifq;
import defpackage.fifr;
import defpackage.fifs;
import defpackage.fify;
import defpackage.fifz;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private fifr mConnectivityManagerDelegate;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private fify mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private fifz mWifiManagerDelegate;

    /* compiled from: PG */
    private static class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* compiled from: PG */
    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
            }
            return 0;
        }

        public int getConnectionType() {
            if (isConnected()) {
                return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    /* compiled from: PG */
    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* compiled from: PG */
    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        protected abstract void destroy();

        protected void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        protected final void register() {
            this.mNotifier.register();
        }

        protected final void unregister() {
            this.mNotifier.unregister();
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        new fiev("NetworkChangeNotifierAutoDetect.constructor");
        try {
            Looper myLooper = Looper.myLooper();
            this.mLooper = myLooper;
            this.mHandler = new Handler(myLooper);
            this.mObserver = observer;
            this.mConnectivityManagerDelegate = new fifr(fidy.a);
            this.mNetworkCallback = new fify(this);
            this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
            if (Build.VERSION.SDK_INT >= 30) {
                this.mDefaultNetworkCallback = new fifq(this);
            } else {
                this.mDefaultNetworkCallback = Build.VERSION.SDK_INT >= 28 ? new fifs(this) : null;
            }
            updateCurrentNetworkState();
            this.mIntentFilter = new NetworkConnectivityIntentFilter();
            this.mIgnoreNextBroadcast = false;
            this.mShouldSignalObserver = false;
            this.mRegistrationPolicy = registrationPolicy;
            registrationPolicy.init(this);
            this.mShouldSignalObserver = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        new fiev("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
        try {
            connectionTypeChangedTo(this.mConnectivityManagerDelegate.g());
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(fifr fifrVar, Network network) {
        NetworkCapabilities c;
        Network[] allNetworks = fifrVar.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (c = fifrVar.c(network2)) != null && c.hasCapability(12)) {
                if (!c.hasTransport(4)) {
                    allNetworks[i] = network2;
                    i++;
                } else if (fifr.h(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectivityManagerDelegateForTests$1(fifr fifrVar) {
        this.mConnectivityManagerDelegate = fifrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWifiManagerDelegateForTests$2(fifz fifzVar) {
        this.mWifiManagerDelegate = fifzVar;
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeNotifierAutoDetect.this.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    public void destroy() {
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public NetworkState getCurrentNetworkState() {
        new fiev("NetworkChangeNotifierAutoDetect.getCurrentNetworkState");
        try {
            NetworkState networkState = this.mNetworkState;
            Trace.endSection();
            return networkState;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public long getDefaultNetId() {
        Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return networkToNetId(defaultNetwork);
    }

    public Network getDefaultNetwork() {
        return this.mConnectivityManagerDelegate.b();
    }

    public long[] getNetworksAndTypes() {
        new fiev("NetworkChangeNotifierAutoDetect.getNetworksAndTypes");
        try {
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            int length = allNetworksFiltered.length;
            long[] jArr = new long[length + length];
            int i = 0;
            for (Network network : allNetworksFiltered) {
                int i2 = i + 1;
                jArr[i] = networkToNetId(network);
                i += 2;
                jArr[i2] = this.mConnectivityManagerDelegate.a(r5);
            }
            Trace.endSection();
            return jArr;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
    }

    RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new fifp(this));
    }

    public void register() {
        fifr fifrVar;
        NetworkRequest networkRequest;
        fify fifyVar;
        Handler handler;
        fiem a;
        NetworkCapabilities c;
        new fiev("NetworkChangeNotifierAutoDetect.register");
        try {
            if (this.mRegistered) {
                connectionTypeChanged();
            } else {
                if (this.mShouldSignalObserver) {
                    connectionTypeChanged();
                }
                ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
                if (networkCallback != null) {
                    try {
                        this.mConnectivityManagerDelegate.a.registerDefaultNetworkCallback(networkCallback, this.mHandler);
                    } catch (RuntimeException unused) {
                        this.mDefaultNetworkCallback = null;
                    }
                }
                if (this.mDefaultNetworkCallback == null) {
                    this.mIgnoreNextBroadcast = fidy.a(fidy.a, this, this.mIntentFilter) != null;
                }
                this.mRegistered = true;
                fify fifyVar2 = this.mNetworkCallback;
                if (fifyVar2 != null) {
                    new fiev("NetworkChangeNotifierAutoDetect.initializeVpnInPlace");
                    try {
                        Network[] allNetworksFiltered = getAllNetworksFiltered(fifyVar2.b.mConnectivityManagerDelegate, null);
                        fifyVar2.a = null;
                        if (allNetworksFiltered.length == 1 && (c = fifyVar2.b.mConnectivityManagerDelegate.c(allNetworksFiltered[0])) != null && c.hasTransport(4)) {
                            fifyVar2.a = allNetworksFiltered[0];
                        }
                        Trace.endSection();
                        try {
                            fifrVar = this.mConnectivityManagerDelegate;
                            networkRequest = this.mNetworkRequest;
                            fifyVar = this.mNetworkCallback;
                            handler = this.mHandler;
                            a = fiem.a();
                        } catch (RuntimeException unused2) {
                            this.mRegisterNetworkCallbackFailed = true;
                            this.mNetworkCallback = null;
                        }
                        try {
                            fifrVar.a.registerNetworkCallback(networkRequest, fifyVar, handler);
                            a.close();
                            if (!this.mRegisterNetworkCallbackFailed && this.mShouldSignalObserver) {
                                Network[] allNetworksFiltered2 = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
                                long[] jArr = new long[allNetworksFiltered2.length];
                                for (int i = 0; i < allNetworksFiltered2.length; i++) {
                                    jArr[i] = networkToNetId(allNetworksFiltered2[i]);
                                }
                                this.mObserver.purgeActiveNetworkList(jArr);
                            }
                        } catch (Throwable th) {
                            try {
                                a.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    void setConnectivityManagerDelegateForTests(fifr fifrVar) {
        this.mConnectivityManagerDelegate = fifrVar;
    }

    void setWifiManagerDelegateForTests(fifz fifzVar) {
        this.mWifiManagerDelegate = fifzVar;
    }

    public void unregister() {
        if (this.mRegistered) {
            this.mRegistered = false;
            fify fifyVar = this.mNetworkCallback;
            if (fifyVar != null) {
                this.mConnectivityManagerDelegate.f(fifyVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.f(networkCallback);
            } else {
                fidy.a.unregisterReceiver(this);
            }
        }
    }

    public void updateCurrentNetworkState() {
        new fiev("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState");
        try {
            this.mNetworkState = this.mConnectivityManagerDelegate.g();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void assertOnThread() {
    }
}

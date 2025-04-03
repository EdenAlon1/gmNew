package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.fidy;
import defpackage.figa;
import defpackage.figb;
import internal.J.N;
import java.util.Locale;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* compiled from: PG */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* compiled from: PG */
    private class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        figb extractNewProxy;
                        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                        extractNewProxy = ProxyChangeListener.extractNewProxy(intent);
                        proxyChangeListener.proxySettingsChanged(extractNewProxy);
                    }
                });
            }
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static figb extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return figb.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private figb getProxyConfig(Intent intent) {
        figb a = figb.a(((ConnectivityManager) fidy.a.getSystemService("connectivity")).getDefaultProxy());
        if (a == null) {
            return figb.a;
        }
        if (Build.VERSION.SDK_INT < 29 || !a.b.equals("localhost") || a.c != -1) {
            return a;
        }
        figb extractNewProxy = extractNewProxy(intent);
        Log.i("cn_ProxyChangeListener", String.format(Locale.US, "configFromConnectivityManager = %s, configFromIntent = %s", a, extractNewProxy));
        if (extractNewProxy == null) {
            return null;
        }
        return new figb(extractNewProxy.b, extractNewProxy.c, a.d, a.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$1(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(figb figbVar) {
        if (sEnabled) {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            long j = this.mNativePtr;
            if (j != 0) {
                if (figbVar == null) {
                    N.MCIk73GZ(j, this);
                    return;
                }
                String[] strArr = figbVar.e;
                String str = figbVar.d;
                N.MyoFZt$2(j, this, figbVar.b, figbVar.c, str, strArr);
            }
        }
    }

    private void registerBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (!fidy.b()) {
            fidy.c(fidy.a, this.mProxyReceiver, new IntentFilter(), 4);
        }
        this.mRealProxyReceiver = new figa(this);
        fidy.a(fidy.a, this.mRealProxyReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    private void unregisterBroadcastReceiver() {
        fidy.a.unregisterReceiver(this.mProxyReceiver);
        BroadcastReceiver broadcastReceiver = this.mRealProxyReceiver;
        if (broadcastReceiver != null) {
            fidy.a.unregisterReceiver(broadcastReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        TraceEvent a = TraceEvent.a("ProxyChangeListener.start");
        try {
            this.mNativePtr = j;
            registerBroadcastReceiver();
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void stop() {
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$1(intent);
            }
        });
    }

    private void assertOnThread() {
    }
}

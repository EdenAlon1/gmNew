package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.dlnd;
import defpackage.dlne;
import defpackage.dlng;
import defpackage.dlnh;
import defpackage.dlnw;
import defpackage.dlnx;
import defpackage.dlob;
import defpackage.dlod;
import defpackage.dloe;
import defpackage.dlof;
import defpackage.dloj;
import defpackage.dlok;
import defpackage.dlol;
import defpackage.dlon;
import defpackage.dloo;
import defpackage.dlop;
import defpackage.emux;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.eyfc;
import defpackage.eyfw;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.eyib;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IAppIntegrationSessionCallbackStub extends IAppIntegrationSessionCallback.Stub {
    private dlnh b;
    private boolean c;
    protected dlnd callback;
    private KeyguardManager$KeyguardDismissCallback d;
    private final eyfc e;
    dlnx systemUiManager;
    private final Handler a = new Handler(Looper.getMainLooper());
    emxc<Runnable> resetStatesTask = emux.a;
    protected SettableFuture<dlof> navigationStateChangeComplete = SettableFuture.create();

    public IAppIntegrationSessionCallbackStub(Context context) {
        this.systemUiManager = new dlnx(context);
        this.navigationStateChangeComplete.set(dlof.a);
        int i = dlop.a;
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        eyfc eyfcVar2 = new eyfc();
        eyfcVar2.c(dlol.a);
        eyfcVar2.c(dloo.a);
        this.e = eyfcVar2;
    }

    private final void a(dlok dlokVar) {
        eyfw checkIsLite;
        eyfw checkIsLite2;
        eyfw checkIsLite3;
        eyfw checkIsLite4;
        int a = dloj.a(dlokVar.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        switch (i) {
            case 1:
                Log.v("AIClientCbStub", "#onUpdate(): VOICE_PLATE_OPENED");
                break;
            case 2:
                Log.v("AIClientCbStub", "#onUpdate(): VOICE_PLATE_CLOSED");
                break;
            case 3:
                Log.i("AIClientCbStub", "#onUpdate(): VOICE_PLATE_STATE_CHANGED");
                checkIsLite = eyfy.checkIsLite(dloo.a);
                dlokVar.b(checkIsLite);
                if (!dlokVar.r.o(checkIsLite.d)) {
                    Log.w("AIClientCbStub", String.format("#onUpdate(): extension not set for VOICE_PLATE_STATE_CHANGED event: %s", dlokVar));
                    break;
                } else {
                    checkIsLite2 = eyfy.checkIsLite(dloo.a);
                    dlokVar.b(checkIsLite2);
                    Object l = dlokVar.r.l(checkIsLite2.d);
                    dloe dloeVar = (dloe) (l == null ? checkIsLite2.b : checkIsLite2.c(l));
                    int a2 = dlod.a(dloeVar.b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    Log.d("AIClientCbStub", "VOICE_PLATE_STATE ".concat(Integer.toString(a2 - 1)));
                    dlne dlneVar = (dlne) this.callback;
                    int a3 = dlod.a(dloeVar.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int a4 = dlob.a(dloeVar.c);
                    if (a4 == 0 || a4 != 4) {
                        dlneVar.c(dloeVar);
                        break;
                    } else {
                        if (this.resetStatesTask.g()) {
                            this.a.removeCallbacks((Runnable) this.resetStatesTask.c());
                            this.resetStatesTask = emux.a;
                        }
                        if (a3 == 2) {
                            dlnx dlnxVar = this.systemUiManager;
                            boolean z = dloeVar.d;
                            Log.d("SystemUiManager", String.format("#adjustSystemNavigationUi(%b)", Boolean.valueOf(z)));
                            if (dlnxVar.c.g()) {
                                ((dlnw) dlnxVar.c.c()).a();
                                if (dlnxVar.e()) {
                                    ((dlnw) dlnxVar.c.c()).c();
                                }
                            }
                            if (dlnxVar.d.g()) {
                                ((dlnw) dlnxVar.d.c()).a();
                                if (dlnxVar.e()) {
                                    ((dlnw) dlnxVar.d.c()).c();
                                }
                            }
                            int f = dlnx.f(z);
                            dlnxVar.a.compareAndSet(false, z);
                            Integer valueOf = Integer.valueOf(f);
                            Log.d("SystemUiManager", String.format("#updateSystemUiVisibility(%d)", valueOf));
                            if (dlnxVar.c.g()) {
                                ((dlnw) dlnxVar.c.c()).f(f);
                            }
                            if (dlnxVar.d.g()) {
                                ((dlnw) dlnxVar.d.c()).f(f);
                            }
                            dlnxVar.f = emxc.j(valueOf);
                            if (!this.c) {
                                this.c = true;
                            }
                        } else if (this.c) {
                            this.systemUiManager.c();
                            this.c = false;
                        }
                        dlneVar.c(dloeVar);
                        break;
                    }
                }
                break;
            case 4:
            case 5:
            default:
                Log.w("AIClientCbStub", String.format("#onUpdate(): unrecognized callback event: %d", Integer.valueOf(i)));
                break;
            case 6:
                Log.v("AIClientCbStub", "#onUpdate(): ASSISTANT_CONNECTION_LOST");
                resetStates();
                break;
            case 7:
                Log.v("AIClientCbStub", "#onUpdate(): ASSISTANT_CONVERSATION_STATE_CHANGED");
                checkIsLite3 = eyfy.checkIsLite(dlol.a);
                dlokVar.b(checkIsLite3);
                if (!dlokVar.r.o(checkIsLite3.d)) {
                    Log.w("AIClientCbStub", "#onUpdate(): extension not set for ASSISTANT_CONVERSATION_STATE_CHANGED event.");
                    break;
                } else {
                    checkIsLite4 = eyfy.checkIsLite(dlol.a);
                    dlokVar.b(checkIsLite4);
                    Object l2 = dlokVar.r.l(checkIsLite4.d);
                    int i2 = ((dlon) (l2 == null ? checkIsLite4.b : checkIsLite4.c(l2))).b;
                    break;
                }
            case 8:
                Log.v("AIClientCbStub", "#onUpdate(): REQUEST_DISMISS_KEYGUARD");
                if (!getActivityOptional().g()) {
                    Log.w("AIClientCbStub", "#onUpdate(): REQUEST_DISMISS_KEYGUARD - no registered activity.");
                    break;
                } else {
                    KeyguardManager keyguardManager = (KeyguardManager) ((Activity) getActivityOptional().c()).getSystemService("keyguard");
                    if (this.d == null) {
                        this.d = new dlng(this);
                    }
                    keyguardManager.requestDismissKeyguard((Activity) getActivityOptional().c(), this.d);
                    break;
                }
            case 9:
                Log.v("AIClientCbStub", "#onUpdate(): NAVIGATION_STATE_CHANGE_COMPLETE");
                this.navigationStateChangeComplete.set(dlof.a);
                break;
        }
    }

    public emxc<Activity> getActivityOptional() {
        return this.systemUiManager.b;
    }

    public dlnd getCallback() {
        return this.callback;
    }

    public SettableFuture<dlof> getNavigationStateChangeComplete() {
        return this.navigationStateChangeComplete;
    }

    public emxc<Window> getPopupWindowOptional() {
        return this.systemUiManager.d.b(new emwl() { // from class: dlnk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dlnw) obj).a;
            }
        });
    }

    public boolean isMorrisVoicePlateOpened() {
        return this.c;
    }

    public void onServiceConnected() {
        this.callback.a();
    }

    public void onServiceDisconnected() {
        this.callback.b();
    }

    public void onUpdate(dlok dlokVar) {
        Log.d("AIClientCbStub", "#onUpdate()");
        dlnd dlndVar = this.callback;
        if (dlndVar instanceof dlne) {
            a(dlokVar);
        } else {
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", dlndVar));
        }
    }

    public void resetNavigationStateChangeComplete() {
        if (!this.navigationStateChangeComplete.isDone()) {
            Log.w("AIClientCbStub", "#resetNavigationStateChangeComplete(): cancelled in-progress state change.");
            this.navigationStateChangeComplete.cancel(true);
        }
        this.navigationStateChangeComplete = SettableFuture.create();
    }

    public void resetStates() {
        Log.v("AIClientCbStub", "#resetStates(): isMorrisVoicePlateOpened = %b " + this.c);
        if (this.resetStatesTask.g()) {
            this.a.removeCallbacks((Runnable) this.resetStatesTask.c());
            this.resetStatesTask = emux.a;
        }
        if (this.c) {
            this.systemUiManager.c();
            this.c = false;
        }
    }

    public void resetStatesDelayed(long j) {
        Log.v("AIClientCbStub", "#resetStatesDelayed(): isMorrisVoicePlateOpened = %b " + this.c);
        if (this.c) {
            emxc<Runnable> j2 = emxc.j(new Runnable() { // from class: dlnf
                @Override // java.lang.Runnable
                public final void run() {
                    IAppIntegrationSessionCallbackStub.this.resetStates();
                }
            });
            this.resetStatesTask = j2;
            this.a.postDelayed((Runnable) j2.c(), j);
        }
    }

    public void setActivityOptional(emxc<Activity> emxcVar) {
        Log.d("AIClientCbStub", String.format("#setActivityOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.c)));
        if (this.c) {
            this.systemUiManager.a();
        }
        final dlnx dlnxVar = this.systemUiManager;
        dlnxVar.b = emxcVar;
        dlnxVar.c = emxcVar.b(new emwl() { // from class: dlnj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dlnw(dlnx.this, ((Activity) obj).getWindow());
            }
        });
        if (dlnxVar.c.g()) {
            Log.d("SystemUiManager", String.format("#setActivityOptional(): set new activity window = %s", ((dlnw) dlnxVar.c.c()).a));
        } else {
            Log.w("SystemUiManager", "#setActivityOptional(): activity window not present");
        }
        if (this.c) {
            dlnx dlnxVar2 = this.systemUiManager;
            Log.d("SystemUiManager", String.format("#updateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(dlnxVar2.c.g())));
            if (dlnxVar2.c.g()) {
                dlnxVar2.d((dlnw) dlnxVar2.c.c());
            }
        }
    }

    public void setCallback(dlnd dlndVar) {
        this.callback = dlndVar;
    }

    public void setKeyguardDismissStatusListener(dlnh dlnhVar) {
        this.b = dlnhVar;
    }

    public void setPopupWindowOptional(emxc<Window> emxcVar) {
        Log.v("AIClientCbStub", String.format("#setPopupWindowOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.c)));
        if (this.c) {
            this.systemUiManager.b();
        }
        final dlnx dlnxVar = this.systemUiManager;
        dlnxVar.d = emxcVar.b(new emwl() { // from class: dlni
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new dlnw(dlnx.this, (Window) obj);
            }
        });
        if (this.c) {
            dlnx dlnxVar2 = this.systemUiManager;
            Log.d("SystemUiManager", String.format("#updatePopupWindowSystemUi(): popupWindowOptional.isPresent() = %b", Boolean.valueOf(dlnxVar2.d.g())));
            if (dlnxVar2.d.g()) {
                dlnxVar2.d((dlnw) dlnxVar2.d.c());
            }
        }
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback
    public void onUpdate(byte[] bArr) {
        Log.i("AIClientCbStub", "#onUpdate()");
        dlnd dlndVar = this.callback;
        if (!(dlndVar instanceof dlne)) {
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", dlndVar));
            return;
        }
        try {
            a((dlok) eyfy.parseFrom(dlok.a, bArr, this.e));
        } catch (eygu unused) {
            Log.w("AIClientCbStub", "#onUpdate(): failed to parse bytes to AppIntegrationCallbackEvent");
        }
    }
}

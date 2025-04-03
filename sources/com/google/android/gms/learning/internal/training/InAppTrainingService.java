package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.IInAppTrainingService;
import defpackage.dgva;
import defpackage.dgvd;
import defpackage.dgve;
import defpackage.dgvf;
import defpackage.dgvh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    IInAppTrainingService dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                return iInAppTrainingService.onBind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new dgva("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            IInAppTrainingService iInAppTrainingService = (IInAppTrainingService) dgvf.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new dgve() { // from class: dgwa
                @Override // defpackage.dgve
                public final IInterface a(IBinder iBinder) {
                    return IInAppTrainingService.Stub.asInterface(iBinder);
                }
            });
            try {
                iInAppTrainingService.onCreate(ObjectWrapper.wrap(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                iInAppTrainingService.addHttpUrlConnectionFactory("cronet", new dgvh(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = iInAppTrainingService;
        } catch (dgvd e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                iInAppTrainingService.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                iInAppTrainingService.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                return iInAppTrainingService.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                iInAppTrainingService.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IInAppTrainingService iInAppTrainingService = this.dynamiteImpl;
        if (iInAppTrainingService != null) {
            try {
                return iInAppTrainingService.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}

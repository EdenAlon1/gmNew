package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.IInAppJobService;
import com.google.android.gms.learning.internal.training.InAppJobService;
import defpackage.dgvd;
import defpackage.dgve;
import defpackage.dgvf;
import defpackage.dgvi;
import defpackage.dgvo;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    IInAppJobService dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        if (!((PowerManager) getSystemService("power")).isInteractive()) {
            return true;
        }
        if (jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Device is not idle, but running anyway since requirements waived");
            }
            return true;
        }
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Not running the job " + jobParameters.getJobId() + " b/c device is not idle!");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$0() {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                iInAppJobService.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(Context context, JobParameters jobParameters) {
        if (!tryLoadDynamiteImpl()) {
            dgvi.a(context, jobParameters);
            jobFinished(jobParameters, false);
            return;
        }
        try {
            if (this.dynamiteImpl.onStartJob(jobParameters)) {
                return;
            }
            jobFinished(jobParameters, false);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
            }
            dgvi.a(context, jobParameters);
            jobFinished(jobParameters, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopJob$0(JobParameters jobParameters) {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                iInAppJobService.onStopJob(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTrimMemory$0(int i) {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                iInAppJobService.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            IInAppJobService iInAppJobService = (IInAppJobService) dgvf.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", new dgve() { // from class: dgvl
                @Override // defpackage.dgve
                public final IInterface a(IBinder iBinder) {
                    return IInAppJobService.Stub.asInterface(iBinder);
                }
            });
            try {
                if (iInAppJobService.init(ObjectWrapper.wrap(this), ObjectWrapper.wrap(getDynamiteBgExecutor()))) {
                    this.dynamiteImpl = iInAppJobService;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (dgvd e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getDynamiteBgExecutor() {
        return dgvo.a;
    }

    public ExecutorService getLifecycleCallbacksBgExecutor() {
        return dgvo.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: dgvj
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onDestroy$0();
            }
        });
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                iInAppJobService.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                return iInAppJobService.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(final JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            dgvi.a(this, jobParameters);
            return false;
        }
        final Context applicationContext = getApplicationContext();
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: dgvm
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStartJob$0(applicationContext, jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(final JobParameters jobParameters) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: dgvn
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStopJob$0(jobParameters);
            }
        });
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(final int i) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: dgvk
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onTrimMemory$0(i);
            }
        });
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IInAppJobService iInAppJobService = this.dynamiteImpl;
        if (iInAppJobService != null) {
            try {
                return iInAppJobService.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}

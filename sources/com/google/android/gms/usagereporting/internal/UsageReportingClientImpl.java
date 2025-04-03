package com.google.android.gms.usagereporting.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks;
import com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import defpackage.dfrc;
import defpackage.dfrd;
import defpackage.dfse;
import defpackage.dftp;
import defpackage.dfvs;
import defpackage.dfwc;
import defpackage.dhuy;
import defpackage.dhvn;
import defpackage.dhvr;
import defpackage.dhvt;
import defpackage.dhvu;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UsageReportingClientImpl extends dfwc {
    private final AtomicReference a;

    /* compiled from: PG */
    public static class AbstractCallbacks extends IUsageReportingCallbacks.Stub {
        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCanLog(Status status, boolean z, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCheckConsents(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetAppWhitelist(Status status, List<String> list) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetElCapitanOptions(Status status, ElCapitanOptions elCapitanOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetPassedWhitelists(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetSafetyOptions(Status status, SafetyOptions safetyOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onRegisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetAppWhitelist(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetElCapitanOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetOptInOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetSafetyOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onUnregisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* compiled from: PG */
    public static class CanLogCallbacks extends AbstractCallbacks {
    }

    /* compiled from: PG */
    public static final class UsageReportingOptInOptionsChangedListener extends IUsageReportingOptInOptionsChangedListener.Stub {
        private final dftp a;

        public UsageReportingOptInOptionsChangedListener(dftp<dhvn> dftpVar) {
            this.a = dftpVar;
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener
        public void onOptInOptionsChanged() {
            this.a.b(new dhvu());
        }
    }

    public UsageReportingClientImpl(Context context, Looper looper, dfvs dfvsVar, dfrc dfrcVar, dfrd dfrdVar) {
        super(context, looper, 41, dfvsVar, dfrcVar, dfrdVar);
        this.a = new AtomicReference();
    }

    public final void M(UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener, UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener2, dfse dfseVar) {
        dhvt dhvtVar = new dhvt((IUsageReportingService) w(), dfseVar, usageReportingOptInOptionsChangedListener2);
        if (usageReportingOptInOptionsChangedListener != null) {
            ((IUsageReportingService) w()).unregisterOptInOptionsChangedListenerConnectionless(usageReportingOptInOptionsChangedListener, dhvtVar);
        } else if (usageReportingOptInOptionsChangedListener2 == null) {
            dfseVar.c(Status.a);
        } else {
            ((IUsageReportingService) w()).registerOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener2, dhvtVar);
        }
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IUsageReportingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dhuy.f;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final void m() {
        try {
            UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = (UsageReportingOptInOptionsChangedListener) this.a.getAndSet(null);
            if (usageReportingOptInOptionsChangedListener != null) {
                ((IUsageReportingService) w()).unregisterOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener, new dhvr());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.m();
    }
}

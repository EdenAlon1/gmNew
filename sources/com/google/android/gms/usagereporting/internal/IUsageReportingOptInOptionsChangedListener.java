package com.google.android.gms.usagereporting.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IUsageReportingOptInOptionsChangedListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IUsageReportingOptInOptionsChangedListener {
        static final int TRANSACTION_onOptInOptionsChanged = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IUsageReportingOptInOptionsChangedListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
            }

            @Override // com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener
            public void onOptInOptionsChanged() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        }

        public static IUsageReportingOptInOptionsChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
            return queryLocalInterface instanceof IUsageReportingOptInOptionsChangedListener ? (IUsageReportingOptInOptionsChangedListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            onOptInOptionsChanged();
            return true;
        }
    }

    void onOptInOptionsChanged();
}

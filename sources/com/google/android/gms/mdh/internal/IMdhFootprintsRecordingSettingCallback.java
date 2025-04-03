package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdhFootprintsRecordingSettingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdhFootprintsRecordingSettingCallback {
        static final int TRANSACTION_onDataRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdhFootprintsRecordingSettingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
            }

            @Override // com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback
            public void onDataRetrieved(Status status, FootprintsRecordingSetting footprintsRecordingSetting) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, footprintsRecordingSetting);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
        }

        public static IMdhFootprintsRecordingSettingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
            return queryLocalInterface instanceof IMdhFootprintsRecordingSettingCallback ? (IMdhFootprintsRecordingSettingCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) rve.a(parcel, FootprintsRecordingSetting.CREATOR);
            enforceNoDataAvail(parcel);
            onDataRetrieved(status, footprintsRecordingSetting);
            return true;
        }
    }

    void onDataRetrieved(Status status, FootprintsRecordingSetting footprintsRecordingSetting);
}

package com.google.android.gms.spatula.settings.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISpatulaSettingsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISpatulaSettingsService {
        static final int TRANSACTION_getSpatulaAvailability = 3;
        static final int TRANSACTION_getSpatulaPreference = 1;
        static final int TRANSACTION_setSpatulaPreference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISpatulaSettingsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void getSpatulaAvailability(ISpatulaAvailabilityCallbacks iSpatulaAvailabilityCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSpatulaAvailabilityCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void getSpatulaPreference(ISpatulaSettingsCallbacks iSpatulaSettingsCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSpatulaSettingsCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService
            public void setSpatulaPreference(IStatusCallback iStatusCallback, String str, SpatulaSettingPreference spatulaSettingPreference, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, spatulaSettingPreference);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
        }

        public static ISpatulaSettingsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
            return queryLocalInterface instanceof ISpatulaSettingsService ? (ISpatulaSettingsService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISpatulaSettingsCallbacks asInterface = ISpatulaSettingsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSpatulaPreference(asInterface, readString, apiMetadata);
            } else if (i == 2) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                SpatulaSettingPreference spatulaSettingPreference = (SpatulaSettingPreference) rve.a(parcel, SpatulaSettingPreference.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setSpatulaPreference(asInterface2, readString2, spatulaSettingPreference, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                ISpatulaAvailabilityCallbacks asInterface3 = ISpatulaAvailabilityCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSpatulaAvailability(asInterface3, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpatulaAvailability(ISpatulaAvailabilityCallbacks iSpatulaAvailabilityCallbacks, ApiMetadata apiMetadata);

    void getSpatulaPreference(ISpatulaSettingsCallbacks iSpatulaSettingsCallbacks, String str, ApiMetadata apiMetadata);

    void setSpatulaPreference(IStatusCallback iStatusCallback, String str, SpatulaSettingPreference spatulaSettingPreference, ApiMetadata apiMetadata);
}

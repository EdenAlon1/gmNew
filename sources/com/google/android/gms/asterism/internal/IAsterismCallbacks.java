package com.google.android.gms.asterism.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAsterismCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAsterismCallbacks {
        static final int TRANSACTION_onConsentFetched = 1;
        static final int TRANSACTION_onConsentRegistered = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAsterismCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.asterism.internal.IAsterismCallbacks");
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismCallbacks
            public void onConsentFetched(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getAsterismConsentResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismCallbacks
            public void onConsentRegistered(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, setAsterismConsentResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.asterism.internal.IAsterismCallbacks");
        }

        public static IAsterismCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
            return queryLocalInterface instanceof IAsterismCallbacks ? (IAsterismCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                GetAsterismConsentResponse getAsterismConsentResponse = (GetAsterismConsentResponse) rve.a(parcel, GetAsterismConsentResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onConsentFetched(status, getAsterismConsentResponse);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) rve.a(parcel, SetAsterismConsentResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onConsentRegistered(status2, setAsterismConsentResponse);
            }
            return true;
        }
    }

    void onConsentFetched(Status status, GetAsterismConsentResponse getAsterismConsentResponse);

    void onConsentRegistered(Status status, SetAsterismConsentResponse setAsterismConsentResponse);
}

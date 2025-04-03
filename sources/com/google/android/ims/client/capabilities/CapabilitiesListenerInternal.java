package com.google.android.ims.client.capabilities;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface CapabilitiesListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements CapabilitiesListenerInternal {
        static final int TRANSACTION_onCapabilitiesReceived = 1;
        static final int TRANSACTION_onCapabilitiesUpdateError = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements CapabilitiesListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.capabilities.CapabilitiesListenerInternal");
            }

            @Override // com.google.android.ims.client.capabilities.CapabilitiesListenerInternal
            public void onCapabilitiesReceived(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.capabilities.CapabilitiesListenerInternal
            public void onCapabilitiesUpdateError(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.capabilities.CapabilitiesListenerInternal");
        }

        public static CapabilitiesListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.capabilities.CapabilitiesListenerInternal");
            return queryLocalInterface instanceof CapabilitiesListenerInternal ? (CapabilitiesListenerInternal) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCapabilitiesReceived(readString, bundle);
            } else {
                if (i != 2) {
                    return false;
                }
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onCapabilitiesUpdateError(readString2);
            }
            return true;
        }
    }

    void onCapabilitiesReceived(String str, Bundle bundle);

    void onCapabilitiesUpdateError(String str);
}

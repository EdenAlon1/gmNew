package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGeofencerCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGeofencerCallbacks {
        static final int TRANSACTION_onAddGeofencesResult = 1;
        static final int TRANSACTION_onRemoveGeofencesByPendingIntentResult = 3;
        static final int TRANSACTION_onRemoveGeofencesByRequestIdsResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGeofencerCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IGeofencerCallbacks");
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onAddGeofencesResult(int i, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGeofencerCallbacks
            public void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        }

        public static IGeofencerCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return queryLocalInterface instanceof IGeofencerCallbacks ? (IGeofencerCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                enforceNoDataAvail(parcel);
                onAddGeofencesResult(readInt, createStringArray);
            } else if (i == 2) {
                int readInt2 = parcel.readInt();
                String[] createStringArray2 = parcel.createStringArray();
                enforceNoDataAvail(parcel);
                onRemoveGeofencesByRequestIdsResult(readInt2, createStringArray2);
            } else {
                if (i != 3) {
                    return false;
                }
                int readInt3 = parcel.readInt();
                PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onRemoveGeofencesByPendingIntentResult(readInt3, pendingIntent);
            }
            return true;
        }
    }

    void onAddGeofencesResult(int i, String[] strArr);

    void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent);

    void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr);
}

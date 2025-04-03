package com.google.android.gms.appdatasearch.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.euof;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILightweightAppDataSearch extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILightweightAppDataSearch {
        static final int TRANSACTION_getFileDescriptorAndDelete = 2;
        static final int TRANSACTION_getRecentContext = 5;
        static final int TRANSACTION_registerCompletionFilter = 6;
        static final int TRANSACTION_reportUsage = 1;
        static final int TRANSACTION_reportUserActions = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILightweightAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getRecentContextCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedArray(usageInfoArr, 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, euof[] euofVarArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeTypedArray(euofVarArr, 0);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        }

        public static ILightweightAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return queryLocalInterface instanceof ILightweightAppDataSearch ? (ILightweightAppDataSearch) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ILightweightAppDataSearchCallbacks asInterface = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                UsageInfo[] usageInfoArr = (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                reportUsage(asInterface, readString, usageInfoArr, apiMetadata);
            } else if (i == 2) {
                ILightweightAppDataSearchCallbacks asInterface2 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getFileDescriptorAndDelete(asInterface2, apiMetadata2);
            } else if (i == 5) {
                GetRecentContextCall$Request getRecentContextCall$Request = (GetRecentContextCall$Request) rve.a(parcel, GetRecentContextCall$Request.CREATOR);
                ILightweightAppDataSearchCallbacks asInterface3 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getRecentContext(getRecentContextCall$Request, asInterface3, apiMetadata3);
            } else if (i == 6) {
                ILightweightAppDataSearchCallbacks asInterface4 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                registerCompletionFilter(asInterface4, readString2, readString3, apiMetadata4);
            } else {
                if (i != 7) {
                    return false;
                }
                ILightweightAppDataSearchCallbacks asInterface5 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                euof[] euofVarArr = (euof[]) parcel.createTypedArray(euof.CREATOR);
                enforceNoDataAvail(parcel);
                reportUserActions(asInterface5, euofVarArr);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata);

    void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, ApiMetadata apiMetadata);

    void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr, ApiMetadata apiMetadata);

    void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, euof[] euofVarArr);
}

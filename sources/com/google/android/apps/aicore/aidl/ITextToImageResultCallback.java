package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.sad;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextToImageResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextToImageResultCallback {
        static final int TRANSACTION_onTextToImageInferenceFailure = 3;
        static final int TRANSACTION_onTextToImageInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextToImageResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextToImageResultCallback
            public void onTextToImageInferenceSuccess(sad sadVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, sadVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
        }

        public static ITextToImageResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextToImageResultCallback");
            return queryLocalInterface instanceof ITextToImageResultCallback ? (ITextToImageResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sad sadVar = (sad) rve.a(parcel, sad.CREATOR);
                enforceNoDataAvail(parcel);
                onTextToImageInferenceSuccess(sadVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextToImageInferenceFailure(readInt);
            return true;
        }
    }

    void onTextToImageInferenceFailure(int i);

    void onTextToImageInferenceSuccess(sad sadVar);
}

package com.google.android.play.core.inappreview.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IInAppReviewServiceCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppReviewServiceCallback {
        static final int TRANSACTION_onGetLaunchReviewFlowInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppReviewServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
            }

            @Override // com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback
            public void onGetLaunchReviewFlowInfo(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        }

        public static IInAppReviewServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
            return queryLocalInterface instanceof IInAppReviewServiceCallback ? (IInAppReviewServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onGetLaunchReviewFlowInfo(bundle);
            return true;
        }
    }

    void onGetLaunchReviewFlowInfo(Bundle bundle);
}

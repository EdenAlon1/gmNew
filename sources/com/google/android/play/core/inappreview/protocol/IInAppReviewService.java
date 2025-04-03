package com.google.android.play.core.inappreview.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IInAppReviewService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppReviewService {
        static final int TRANSACTION_getLaunchReviewFlowInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppReviewService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            }

            @Override // com.google.android.play.core.inappreview.protocol.IInAppReviewService
            public void getLaunchReviewFlowInfo(String str, Bundle bundle, IInAppReviewServiceCallback iInAppReviewServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iInAppReviewServiceCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        }

        public static IInAppReviewService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            return queryLocalInterface instanceof IInAppReviewService ? (IInAppReviewService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            IInAppReviewServiceCallback asInterface = IInAppReviewServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getLaunchReviewFlowInfo(readString, bundle, asInterface);
            return true;
        }
    }

    void getLaunchReviewFlowInfo(String str, Bundle bundle, IInAppReviewServiceCallback iInAppReviewServiceCallback);
}

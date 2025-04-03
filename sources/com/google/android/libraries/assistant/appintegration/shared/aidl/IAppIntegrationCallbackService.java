package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIntegrationCallbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIntegrationCallbackService {
        static final int TRANSACTION_forwardCallbackEvent = 1;
        static final int TRANSACTION_registerDeathRecipient = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIntegrationCallbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void forwardCallbackEvent(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService
            public void registerDeathRecipient(IBinder iBinder) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
        }

        public static IAppIntegrationCallbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            return queryLocalInterface instanceof IAppIntegrationCallbackService ? (IAppIntegrationCallbackService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                forwardCallbackEvent(createByteArray);
            } else {
                if (i != 2) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                enforceNoDataAvail(parcel);
                registerDeathRecipient(readStrongBinder);
            }
            return true;
        }
    }

    void forwardCallbackEvent(byte[] bArr);

    void registerDeathRecipient(IBinder iBinder);
}

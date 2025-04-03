package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import defpackage.rve;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDroidGuardHandle extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDroidGuardHandle {
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_initWithExtras = 5;
        static final int TRANSACTION_snapshot = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDroidGuardHandle {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void close() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void init(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, droidGuardResultsRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) rve.a(transactAndReadException, DroidGuardInitReply.CREATOR);
                transactAndReadException.recycle();
                return droidGuardInitReply;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public byte[] snapshot(Map map) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeMap(map);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                byte[] createByteArray = transactAndReadException.createByteArray();
                transactAndReadException.recycle();
                return createByteArray;
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        }

        public static IDroidGuardHandle asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            return queryLocalInterface instanceof IDroidGuardHandle ? (IDroidGuardHandle) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                init(readString);
            } else if (i == 2) {
                HashMap c = rve.c(parcel);
                enforceNoDataAvail(parcel);
                byte[] snapshot = snapshot(c);
                parcel2.writeNoException();
                parcel2.writeByteArray(snapshot);
            } else if (i == 3) {
                close();
            } else {
                if (i != 5) {
                    return false;
                }
                String readString2 = parcel.readString();
                DroidGuardResultsRequest droidGuardResultsRequest = (DroidGuardResultsRequest) rve.a(parcel, DroidGuardResultsRequest.CREATOR);
                enforceNoDataAvail(parcel);
                DroidGuardInitReply initWithExtras = initWithExtras(readString2, droidGuardResultsRequest);
                parcel2.writeNoException();
                rve.e(parcel2, initWithExtras);
            }
            return true;
        }
    }

    void close();

    void init(String str);

    DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest);

    byte[] snapshot(Map map);
}

package com.google.mlkit.vision.text.aidls;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.mlkit.vision.text.aidls.ITextRecognizer;
import defpackage.expx;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ITextRecognizerCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextRecognizerCreator {
        static final int TRANSACTION_newTextRecognizer = 1;
        static final int TRANSACTION_newTextRecognizerWithOptions = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextRecognizerCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizerCreator
            public ITextRecognizer newTextRecognizer(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                ITextRecognizer asInterface = ITextRecognizer.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizerCreator
            public ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, expx expxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.d(obtainAndWriteInterfaceToken, expxVar);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ITextRecognizer asInterface = ITextRecognizer.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        }

        public static ITextRecognizerCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
            return queryLocalInterface instanceof ITextRecognizerCreator ? (ITextRecognizerCreator) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ITextRecognizer newTextRecognizer = newTextRecognizer(asInterface);
                parcel2.writeNoException();
                rve.f(parcel2, newTextRecognizer);
            } else {
                if (i != 2) {
                    return false;
                }
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                expx expxVar = (expx) rve.a(parcel, expx.CREATOR);
                enforceNoDataAvail(parcel);
                ITextRecognizer newTextRecognizerWithOptions = newTextRecognizerWithOptions(asInterface2, expxVar);
                parcel2.writeNoException();
                rve.f(parcel2, newTextRecognizerWithOptions);
            }
            return true;
        }
    }

    ITextRecognizer newTextRecognizer(IObjectWrapper iObjectWrapper);

    ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, expx expxVar);
}

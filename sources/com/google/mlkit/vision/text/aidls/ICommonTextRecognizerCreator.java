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
public interface ICommonTextRecognizerCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommonTextRecognizerCreator {
        static final int TRANSACTION_newTextRecognizerWithOptions = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommonTextRecognizerCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
            }

            @Override // com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator
            public ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, expx expxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, expxVar);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                ITextRecognizer asInterface = ITextRecognizer.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        }

        public static ICommonTextRecognizerCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
            return queryLocalInterface instanceof ICommonTextRecognizerCreator ? (ICommonTextRecognizerCreator) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            expx expxVar = (expx) rve.a(parcel, expx.CREATOR);
            enforceNoDataAvail(parcel);
            ITextRecognizer newTextRecognizerWithOptions = newTextRecognizerWithOptions(asInterface, asInterface2, expxVar);
            parcel2.writeNoException();
            rve.f(parcel2, newTextRecognizerWithOptions);
            return true;
        }
    }

    ITextRecognizer newTextRecognizerWithOptions(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, expx expxVar);
}

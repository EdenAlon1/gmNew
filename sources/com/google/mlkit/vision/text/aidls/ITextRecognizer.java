package com.google.mlkit.vision.text.aidls;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import defpackage.expn;
import defpackage.expv;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ITextRecognizer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextRecognizer {
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_process = 3;
        static final int TRANSACTION_recognizeBitmap = 4;
        static final int TRANSACTION_release = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextRecognizer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public void init() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public expv process(IObjectWrapper iObjectWrapper, expn expnVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.d(obtainAndWriteInterfaceToken, expnVar);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                expv expvVar = (expv) rve.a(transactAndReadException, expv.CREATOR);
                transactAndReadException.recycle();
                return expvVar;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public LineBoxParcel[] recognizeBitmap(IObjectWrapper iObjectWrapper, expn expnVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.d(obtainAndWriteInterfaceToken, expnVar);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                LineBoxParcel[] lineBoxParcelArr = (LineBoxParcel[]) transactAndReadException.createTypedArray(LineBoxParcel.CREATOR);
                transactAndReadException.recycle();
                return lineBoxParcelArr;
            }

            @Override // com.google.mlkit.vision.text.aidls.ITextRecognizer
            public void release() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
        }

        public static ITextRecognizer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            return queryLocalInterface instanceof ITextRecognizer ? (ITextRecognizer) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                init();
                parcel2.writeNoException();
            } else if (i == 2) {
                release();
                parcel2.writeNoException();
            } else if (i == 3) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                expn expnVar = (expn) rve.a(parcel, expn.CREATOR);
                enforceNoDataAvail(parcel);
                expv process = process(asInterface, expnVar);
                parcel2.writeNoException();
                rve.e(parcel2, process);
            } else {
                if (i != 4) {
                    return false;
                }
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                expn expnVar2 = (expn) rve.a(parcel, expn.CREATOR);
                enforceNoDataAvail(parcel);
                LineBoxParcel[] recognizeBitmap = recognizeBitmap(asInterface2, expnVar2);
                parcel2.writeNoException();
                parcel2.writeTypedArray(recognizeBitmap, 1);
            }
            return true;
        }
    }

    void init();

    expv process(IObjectWrapper iObjectWrapper, expn expnVar);

    LineBoxParcel[] recognizeBitmap(IObjectWrapper iObjectWrapper, expn expnVar);

    void release();
}

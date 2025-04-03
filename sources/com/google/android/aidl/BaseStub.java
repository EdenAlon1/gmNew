package com.google.android.aidl;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.rve;
import defpackage.rvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BaseStub extends Binder implements IInterface {
    private static rvf globalInterceptor;

    protected BaseStub(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(rvf rvfVar) {
        synchronized (BaseStub.class) {
            try {
                if (rvfVar == null) {
                    throw new IllegalArgumentException("null interceptor");
                }
                if (globalInterceptor != null) {
                    throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
                }
                globalInterceptor = rvfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        rvf rvfVar = globalInterceptor;
        if (rvfVar != null) {
            rvfVar.a();
            return;
        }
        int i = rve.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        rvf rvfVar = globalInterceptor;
        return rvfVar == null ? dispatchTransaction(i, parcel, parcel2, i2) : rvfVar.b();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}

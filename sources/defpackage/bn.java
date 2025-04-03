package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.IAuthTabCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bn implements IAuthTabCallback {
    private final IBinder a;

    public bn(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            bo.b(obtain, bundle, 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeString(str);
            bo.b(obtain, bundle, 0);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) bo.a(obtain2, Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            obtain.writeInt(i);
            bo.b(obtain, bundle, 0);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.customtabs.IAuthTabCallback
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(DESCRIPTOR);
            bo.b(obtain, bundle, 0);
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

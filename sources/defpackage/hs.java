package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hs implements IMediaControllerCallback {
    private final IBinder a;

    public hs(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onCaptioningEnabledChanged(boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onEvent(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeString(str);
            ht.b(obtain, bundle);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onExtrasChanged(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(obtain, bundle);
            this.a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onMetadataChanged(hp hpVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(obtain, hpVar);
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onPlaybackStateChanged(ig igVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(obtain, igVar);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueChanged(List<hx> list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int size = list.size();
                obtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    ht.b(obtain, list.get(i));
                }
            }
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onRepeatModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionDestroyed() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onSessionReady() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            this.a.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onShuffleModeChangedRemoved(boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void onVolumeInfoChanged(ic icVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            ht.b(obtain, icVar);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

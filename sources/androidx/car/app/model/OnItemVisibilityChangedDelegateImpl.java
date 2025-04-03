package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.chr;
import defpackage.cig;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements cig {
    private final IOnItemVisibilityChangedListener mStub;

    /* compiled from: PG */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final chr mListener;

        public OnItemVisibilityChangedListenerStub(chr chrVar) {
            this.mListener = chrVar;
        }

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m202xb730acdb(int i, int i2) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onItemVisibilityChanged", new clh() { // from class: cih
                @Override // defpackage.clh
                public final Object a() {
                    return OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.m202xb730acdb(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }

    public static cig create(chr chrVar) {
        return new OnItemVisibilityChangedDelegateImpl(chrVar);
    }

    public void sendItemVisibilityChanged(int i, int i2, cfi cfiVar) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            iOnItemVisibilityChangedListener.getClass();
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl(chr chrVar) {
        this.mStub = new OnItemVisibilityChangedListenerStub(chrVar);
    }
}

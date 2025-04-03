package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.cid;
import defpackage.cif;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements cid {
    private final IOnContentRefreshListener mListener;

    /* compiled from: PG */
    @cfs
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final cif mOnContentRefreshListener;

        public OnContentRefreshListenerStub(cif cifVar) {
            this.mOnContentRefreshListener = cifVar;
        }

        /* renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub, reason: not valid java name */
        public /* synthetic */ Object m201xff9c1a9c() {
            this.mOnContentRefreshListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new clh() { // from class: cie
                @Override // defpackage.clh
                public final Object a() {
                    return OnContentRefreshDelegateImpl.OnContentRefreshListenerStub.this.m201xff9c1a9c();
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }

    public static cid create(cif cifVar) {
        return new OnContentRefreshDelegateImpl(cifVar);
    }

    public void sendContentRefreshRequested(cfi cfiVar) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            iOnContentRefreshListener.getClass();
            iOnContentRefreshListener.onContentRefreshRequested(new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl(cif cifVar) {
        this.mListener = new OnContentRefreshListenerStub(cifVar);
    }
}

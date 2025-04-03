package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.model.OnSelectedDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.chs;
import defpackage.cii;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements cii {
    private final IOnSelectedListener mStub;

    /* compiled from: PG */
    @cfs
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final chs mListener;

        public OnSelectedListenerStub(chs chsVar) {
            this.mListener = chsVar;
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        public /* synthetic */ Object m203x5a7f46f5(int i) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSelectedListener", new clh() { // from class: cij
                @Override // defpackage.clh
                public final Object a() {
                    return OnSelectedDelegateImpl.OnSelectedListenerStub.this.m203x5a7f46f5(i);
                }
            });
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }

    public static cii create(chs chsVar) {
        return new OnSelectedDelegateImpl(chsVar);
    }

    public void sendSelected(int i, cfi cfiVar) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            iOnSelectedListener.getClass();
            iOnSelectedListener.onSelected(i, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl(chs chsVar) {
        this.mStub = new OnSelectedListenerStub(chsVar);
    }
}

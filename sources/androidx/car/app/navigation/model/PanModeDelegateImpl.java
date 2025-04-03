package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.ckf;
import defpackage.ckh;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class PanModeDelegateImpl implements ckf {
    private final IPanModeListener mStub;

    /* compiled from: PG */
    @cfs
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final ckh mListener;

        public PanModeListenerStub(ckh ckhVar) {
            this.mListener = ckhVar;
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m208xa5766d47(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onPanModeChanged", new clh() { // from class: ckg
                @Override // defpackage.clh
                public final Object a() {
                    return PanModeDelegateImpl.PanModeListenerStub.this.m208xa5766d47(z);
                }
            });
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }

    public static ckf create(ckh ckhVar) {
        return new PanModeDelegateImpl(ckhVar);
    }

    public void sendPanModeChanged(boolean z, cfi cfiVar) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            iPanModeListener.getClass();
            iPanModeListener.onPanModeChanged(z, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private PanModeDelegateImpl(ckh ckhVar) {
        this.mStub = new PanModeListenerStub(ckhVar);
    }
}

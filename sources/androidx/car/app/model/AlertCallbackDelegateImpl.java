package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.IAlertCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.chb;
import defpackage.chc;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class AlertCallbackDelegateImpl implements chc {
    private final IAlertCallback mCallback;

    /* compiled from: PG */
    @cfs
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final chb mCallback;

        public AlertCallbackStub(chb chbVar) {
            this.mCallback = chbVar;
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m195x74881a4b(int i) {
            this.mCallback.b();
            return null;
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m196xeacf1252() {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCancel", new clh() { // from class: che
                @Override // defpackage.clh
                public final Object a() {
                    return AlertCallbackDelegateImpl.AlertCallbackStub.this.m195x74881a4b(i);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onDismiss", new clh() { // from class: chd
                @Override // defpackage.clh
                public final Object a() {
                    return AlertCallbackDelegateImpl.AlertCallbackStub.this.m196xeacf1252();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }

    public static chc create(chb chbVar) {
        return new AlertCallbackDelegateImpl(chbVar);
    }

    public void sendCancel(int i, cfi cfiVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertCancelled(i, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDismiss(cfi cfiVar) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            iAlertCallback.getClass();
            iAlertCallback.onAlertDismissed(new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl(chb chbVar) {
        this.mCallback = new AlertCallbackStub(chbVar);
    }
}

package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.chl;
import defpackage.chm;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements chm {
    private final IInputCallback mCallback;

    /* compiled from: PG */
    @cfs
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final chl mCallback;

        public OnInputCallbackStub(chl chlVar) {
            this.mCallback = chlVar;
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m197x52ef688c(String str) {
            this.mCallback.a();
            return null;
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m198x16cfd85f(String str) {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputSubmitted", new clh() { // from class: cho
                @Override // defpackage.clh
                public final Object a() {
                    return InputCallbackDelegateImpl.OnInputCallbackStub.this.m197x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onInputTextChanged", new clh() { // from class: chn
                @Override // defpackage.clh
                public final Object a() {
                    return InputCallbackDelegateImpl.OnInputCallbackStub.this.m198x16cfd85f(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }

    public static chm create(chl chlVar) {
        chlVar.getClass();
        return new InputCallbackDelegateImpl(chlVar);
    }

    public void sendInputSubmitted(String str, cfi cfiVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputSubmitted(str, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, cfi cfiVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            iInputCallback.getClass();
            iInputCallback.onInputTextChanged(str, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl(chl chlVar) {
        this.mCallback = new OnInputCallbackStub(chlVar);
    }
}

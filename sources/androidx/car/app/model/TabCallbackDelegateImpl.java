package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import androidx.car.app.model.TabCallbackDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.cjb;
import defpackage.cjf;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements cjb {
    private final ITabCallback mStubCallback;

    /* compiled from: PG */
    @cfs
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final cjf mCallback;

        public TabCallbackStub(cjf cjfVar) {
            this.mCallback = cjfVar;
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m206x7d0e011a(String str) {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onTabSelected", new clh() { // from class: cjc
                @Override // defpackage.clh
                public final Object a() {
                    return TabCallbackDelegateImpl.TabCallbackStub.this.m206x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }

    public static cjb create(cjf cjfVar) {
        return new TabCallbackDelegateImpl(cjfVar);
    }

    public void sendTabSelected(String str, cfi cfiVar) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            iTabCallback.getClass();
            iTabCallback.onTabSelected(str, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl(cjf cjfVar) {
        this.mStubCallback = new TabCallbackStub(cjfVar);
    }
}

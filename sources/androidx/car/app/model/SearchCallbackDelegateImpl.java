package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.cis;
import defpackage.ciw;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements cis {
    private final ISearchCallback mStubCallback;

    /* compiled from: PG */
    @cfs
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final ciw mCallback;

        public SearchCallbackStub(ciw ciwVar) {
            this.mCallback = ciwVar;
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m204x5bd43f40(String str) {
            this.mCallback.a();
            return null;
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m205xa7c97055(String str) {
            this.mCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchSubmitted", new clh() { // from class: cit
                @Override // defpackage.clh
                public final Object a() {
                    return SearchCallbackDelegateImpl.SearchCallbackStub.this.m204x5bd43f40(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onSearchTextChanged", new clh() { // from class: ciu
                @Override // defpackage.clh
                public final Object a() {
                    return SearchCallbackDelegateImpl.SearchCallbackStub.this.m205xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }

    public static cis create(ciw ciwVar) {
        return new SearchCallbackDelegateImpl(ciwVar);
    }

    public void sendSearchSubmitted(String str, cfi cfiVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchSubmitted(str, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(String str, cfi cfiVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchTextChanged(str, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl(ciw ciwVar) {
        this.mStubCallback = new SearchCallbackStub(ciwVar);
    }
}

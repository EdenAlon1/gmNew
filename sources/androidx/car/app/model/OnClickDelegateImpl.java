package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.cia;
import defpackage.cic;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class OnClickDelegateImpl implements cia {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* compiled from: PG */
    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final cic mOnClickListener;

        public OnClickListenerStub(cic cicVar) {
            this.mOnClickListener = cicVar;
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ Object m200xba9c2d94() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onClick", new clh() { // from class: cib
                @Override // defpackage.clh
                public final Object a() {
                    return OnClickDelegateImpl.OnClickListenerStub.this.m200xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }

    public static cia create(cic cicVar) {
        return new OnClickDelegateImpl(cicVar, cicVar instanceof ParkedOnlyOnClickListener);
    }

    @Override // defpackage.cia
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(cfi cfiVar) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            iOnClickListener.getClass();
            iOnClickListener.onClick(new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnClickDelegateImpl(cic cicVar, boolean z) {
        this.mListener = new OnClickListenerStub(cicVar);
        this.mIsParkedOnly = z;
    }
}

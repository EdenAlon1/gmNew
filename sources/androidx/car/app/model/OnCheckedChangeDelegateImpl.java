package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.chy;
import defpackage.cji;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements chy {
    private final IOnCheckedChangeListener mStub;

    /* compiled from: PG */
    @cfs
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final cji mListener;

        public OnCheckedChangeListenerStub(cji cjiVar) {
            this.mListener = cjiVar;
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        public /* synthetic */ Object m199xd37d5aa3(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onCheckedChange", new clh() { // from class: chz
                @Override // defpackage.clh
                public final Object a() {
                    return OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.m199xd37d5aa3(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }

    public static chy create(cji cjiVar) {
        return new OnCheckedChangeDelegateImpl(cjiVar);
    }

    public void sendCheckedChange(boolean z, cfi cfiVar) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            iOnCheckedChangeListener.getClass();
            iOnCheckedChangeListener.onCheckedChange(z, new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl(cji cjiVar) {
        this.mStub = new OnCheckedChangeListenerStub(cjiVar);
    }
}

package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.ExampleStoreQueryCallbackImpl;
import com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dguz implements dgts {
    private final ExampleStoreQueryCallbackImpl.IteratorAdapter a;
    private final IExampleStoreIteratorCallbackV2 b;
    private final emyv c;
    private final long d;

    public dguz(ExampleStoreQueryCallbackImpl.IteratorAdapter iteratorAdapter, IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2, emyv emyvVar) {
        this.a = iteratorAdapter;
        this.b = iExampleStoreIteratorCallbackV2;
        this.c = emyvVar;
        this.d = emyvVar.a();
    }

    @Override // defpackage.dgts
    public final void a(int i, String str) {
        try {
            this.b.onIteratorNextFailure(new Status(i, str), this.c.a() - this.d);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.a.close();
        }
    }

    @Override // defpackage.dgts
    public final void b(byte[] bArr, byte[] bArr2) {
        long a = this.c.a() - this.d;
        try {
            IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2 = this.b;
            IObjectWrapper iObjectWrapper = null;
            IObjectWrapper wrap = bArr == null ? null : ObjectWrapper.wrap(bArr);
            if (bArr2 != null) {
                iObjectWrapper = ObjectWrapper.wrap(bArr2);
            }
            iExampleStoreIteratorCallbackV2.onIteratorNextSuccess(wrap, iObjectWrapper, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.a.close();
        }
    }
}

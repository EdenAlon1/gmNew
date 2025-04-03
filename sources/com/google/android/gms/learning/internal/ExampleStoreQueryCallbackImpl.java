package com.google.android.gms.learning.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.IExampleStoreIteratorV2;
import defpackage.dgtt;
import defpackage.dgtx;
import defpackage.dguz;
import defpackage.emtt;
import defpackage.emxf;
import defpackage.emyv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExampleStoreQueryCallbackImpl implements dgtx {
    private final IExampleStoreQueryCallbackV2 a;
    private final emyv b;
    private final long c;

    /* compiled from: PG */
    public static class IteratorAdapter extends IExampleStoreIteratorV2.Stub {
        private final dgtt a;
        private final emyv b;
        private final Object c = new Object();
        private boolean d = false;

        public IteratorAdapter(dgtt dgttVar, emyv emyvVar) {
            this.a = dgttVar;
            this.b = emyvVar;
        }

        @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
        public void close() {
            synchronized (this.c) {
                if (this.d) {
                    Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
                } else {
                    this.d = true;
                    this.a.close();
                }
            }
        }

        @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
        public void next(IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2) {
            emxf.a(iExampleStoreIteratorCallbackV2 != null);
            synchronized (this.c) {
                if (this.d) {
                    Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
                } else {
                    this.a.a(new dguz(this, iExampleStoreIteratorCallbackV2, this.b));
                }
            }
        }

        @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
        public void request(int i) {
            synchronized (this.c) {
                if (this.d) {
                    Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                } else {
                    this.a.b();
                }
            }
        }
    }

    public ExampleStoreQueryCallbackImpl(IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
        this.a = iExampleStoreQueryCallbackV2;
        emyv emyvVar = emtt.a;
        this.b = emyvVar;
        this.c = emyvVar.a();
    }

    @Override // defpackage.dgtx
    public final void a(int i, String str) {
        try {
            this.a.onStartQueryFailure(new Status(i, str), this.b.a() - this.c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }

    @Override // defpackage.dgtx
    public final void b(dgtt dgttVar) {
        long a = this.b.a() - this.c;
        IteratorAdapter iteratorAdapter = new IteratorAdapter(dgttVar, this.b);
        try {
            this.a.onStartQuerySuccess(iteratorAdapter, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            iteratorAdapter.close();
        }
    }
}

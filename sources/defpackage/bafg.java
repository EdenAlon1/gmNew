package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafg implements erqj {
    final /* synthetic */ String a;

    public bafg(String str) {
        this.a = str;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (GenericWorkerQueueAction.a) {
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        synchronized (GenericWorkerQueueAction.a) {
        }
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bber implements bbcb {
    final /* synthetic */ SettableFuture a;

    public bber(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        this.a.set(true);
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        this.a.set(false);
    }
}

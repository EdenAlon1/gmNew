package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtg implements ejxi {
    final /* synthetic */ awti a;

    public awtg(awti awtiVar) {
        this.a = awtiVar;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ejuj a() {
        return new ejtz("typing_status_all_conversations");
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return this.a.b();
    }
}

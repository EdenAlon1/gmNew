package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfsn implements dfrf {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ dfsp b;

    public dfsn(dfsp dfspVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = dfspVar;
    }

    @Override // defpackage.dfrf
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}

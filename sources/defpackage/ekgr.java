package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgr implements eroh {
    final /* synthetic */ ekgt a;
    final /* synthetic */ eyee b;
    final /* synthetic */ ecwu c;

    public ekgr(ekgt ekgtVar, eyee eyeeVar, ecwu ecwuVar) {
        this.a = ekgtVar;
        this.b = eyeeVar;
        this.c = ecwuVar;
    }

    @Override // defpackage.eroh
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        ekgt ekgtVar = this.a;
        return ekgtVar.c(this.b, (eisx) obj, ekgtVar.a, this.c);
    }
}

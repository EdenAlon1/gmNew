package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feuk extends fekk {
    final /* synthetic */ Status a;
    final /* synthetic */ feuo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuk(feuo feuoVar, Status status) {
        super(feuoVar.a);
        this.a = status;
        this.b = feuoVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        this.b.c().a(this.a);
    }
}

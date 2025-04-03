package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejk extends fekk {
    final /* synthetic */ fdxn a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fejk(fejr fejrVar, fdxn fdxnVar, String str) {
        super(fejrVar.e);
        this.a = fdxnVar;
        this.b = str;
    }

    @Override // defpackage.fekk
    public final void a() {
        fejr.g(this.a, Status.o.withDescription(String.format("Unable to find compressor by name %s", this.b)), new febo());
    }
}

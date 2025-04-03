package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwzv implements cxjl {
    final /* synthetic */ cwzu a;

    public cwzv(cwzu cwzuVar) {
        this.a = cwzuVar;
    }

    @Override // defpackage.cxjl
    public final void a(Optional optional) {
        if (optional.equals(this.a.t)) {
            return;
        }
        cwzu cwzuVar = this.a;
        aoku u = ((aolr) cwzuVar.ag.b()).u(cwzuVar.s.h, cwzuVar.n);
        if ((cwzuVar.s.b & 32) == 0 || !optional.equals(Optional.of(u))) {
            elfl b = this.a.b().b(optional);
            cwzu cwzuVar2 = this.a;
            ejlp b2 = ejlp.b(b);
            cwzu cwzuVar3 = this.a;
            cwzuVar2.V.i(b2, new ejlm(cwzuVar3.m), cwzuVar3.v);
        }
    }
}

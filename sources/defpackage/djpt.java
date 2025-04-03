package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpt extends djpr {
    final /* synthetic */ djqf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpt(djqf djqfVar) {
        super(djqfVar);
        this.c = djqfVar;
    }

    @Override // defpackage.djpr, defpackage.diya, defpackage.dixy
    public final String a() {
        return "ReregisteringState";
    }

    @Override // defpackage.djpr
    protected final void h(eenl eenlVar) {
        eehy eehyVar = this.c.t.a;
        if (Objects.isNull(eehyVar)) {
            throw new eejg("Null SipStack");
        }
        this.c.F = g(eenlVar);
        i(eehyVar, eenlVar);
        djqf djqfVar = this.c;
        djqfVar.w(djqfVar.af);
    }
}

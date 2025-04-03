package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubs extends txv<Optional<ephg>> {
    final /* synthetic */ ucd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubs(ucd ucdVar) {
        super("RCS oneOnOne conditions");
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        this.a.O = (ephg) optional.get();
        ucd ucdVar = this.a;
        ucj ucjVar = ucdVar.N;
        ucjVar.i = ucdVar.O;
        ucjVar.a();
        this.a.x("onRcsOneOnOneConditionsUpdated");
        this.a.v();
    }
}

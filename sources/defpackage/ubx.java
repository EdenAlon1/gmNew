package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubx extends txv<Optional<cvlz>> {
    final /* synthetic */ ucd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubx(ucd ucdVar) {
        super("Draft Signature Data Loader");
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.a.I.Q(Optional.empty());
            return;
        }
        ucd ucdVar = this.a;
        ucdVar.I.Q(Optional.of(((cvlz) optional.get()).a()));
    }
}

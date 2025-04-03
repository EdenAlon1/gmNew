package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubt extends txv<Optional<Boolean>> {
    final /* synthetic */ ucd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubt(ucd ucdVar) {
        super("RCS support status");
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        this.a.N.h = ((Boolean) optional.get()).booleanValue();
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eduz {
    private final Optional a;

    public eduz(Optional optional) {
        this.a = optional;
    }

    public static eduz a(long j) {
        edxo edxoVar = (edxo) edxp.a.createBuilder();
        edxoVar.copyOnWrite();
        edxp edxpVar = (edxp) edxoVar.instance;
        edxpVar.b = 1;
        edxpVar.c = Long.valueOf(j);
        return new eduz(Optional.of((edxp) edxoVar.build()));
    }

    public static eduz b() {
        return new eduz(Optional.empty());
    }

    public final edxp c() {
        return (edxp) this.a.get();
    }

    public final boolean d() {
        return this.a.isEmpty();
    }
}

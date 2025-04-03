package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chia implements chhx {
    public final Optional a;
    public final Optional b;
    private final ffbr c;

    public chia(ffbr ffbrVar, Optional optional, Optional optional2) {
        ffbrVar.getClass();
        optional.getClass();
        optional2.getClass();
        this.c = ffbrVar;
        this.a = optional;
        this.b = optional2;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [chhw, java.lang.Object] */
    @Override // defpackage.chhx
    public final chhw a(fcek fcekVar) {
        fcekVar.getClass();
        if (!this.a.isPresent() || !this.b.isPresent()) {
            return (chhw) ((chhv) this.c.b()).a(fcekVar, chhz.a);
        }
        chhv chhvVar = (chhv) this.c.b();
        ffjm ffjmVar = new ffjm() { // from class: chhy
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                chgx chgxVar = (chgx) obj;
                chhs chhsVar = (chhs) obj2;
                chgxVar.getClass();
                chhsVar.getClass();
                chia chiaVar = chia.this;
                return new chie((fbou) chiaVar.a.get(), (fbot) chiaVar.b.get(), Optional.of(chgxVar), chhsVar);
            }
        };
        ekzz f = eleg.f("GrpcProxyFactory#createWithChannelConfiguration");
        try {
            djrk djrkVar = (djrk) chhvVar.b.b();
            String str = fcekVar.c;
            str.getClass();
            chgx a = ((chin) chhvVar.a.b()).a(djrkVar.a(str));
            chhs chhsVar = (chhs) chhvVar.c.b();
            chhsVar.getClass();
            ?? a2 = ffjmVar.a(a, chhsVar);
            ffig.a(f, null);
            return a2;
        } finally {
        }
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalu {
    private final csrh a;
    private final Optional b;
    private final aufx c;

    public aalu(csrh csrhVar, Optional optional, aufx aufxVar) {
        csrhVar.getClass();
        this.a = csrhVar;
        this.b = optional;
        this.c = aufxVar;
    }

    static /* synthetic */ dnvr b(aalu aaluVar, dnvj dnvjVar, dnvi dnviVar, boolean z, int i) {
        if (1 == (i & 1)) {
            dnvjVar = null;
        }
        if ((i & 2) != 0) {
            dnviVar = null;
        }
        return aaluVar.a(dnvjVar, dnviVar, null, z);
    }

    public final dnvr a(dnvj dnvjVar, dnvi dnviVar, dnvh dnvhVar, boolean z) {
        dnvr dnvrVar = new dnvr(dnvjVar, dnviVar, dnvhVar, !z, new dnvq(this.c.a()));
        if (dnvjVar == null && dnviVar == null && dnvhVar == null && !this.c.a()) {
            return null;
        }
        return dnvrVar;
    }

    public final axrc c(zvp zvpVar, boolean z, final boolean z2) {
        ffxx aalqVar;
        ffxx ffxxVar;
        final dnvj dnvjVar = zvpVar.h() ? new dnvj((String) this.a.c(zvpVar.a().n().toEpochMilli())) : null;
        if (!z) {
            return new axqd(new ffix() { // from class: aaln
                @Override // defpackage.ffix
                public final Object invoke() {
                    return aalu.b(aalu.this, dnvjVar, null, z2, 6);
                }
            });
        }
        zvpVar.a().b();
        dnvi dnviVar = new dnvi(abjk.a);
        if (((Boolean) wpl.e.e()).booleanValue()) {
            zpb zpbVar = (zpb) fflm.b(this.b);
            if (zpbVar != null) {
                aalqVar = new aalq(zpbVar.a());
                return axrg.b(new aalt(aalqVar, this, dnvjVar, dnviVar, z2), b(this, dnvjVar, dnviVar, z2, 4));
            }
            ffxxVar = ffxw.a;
        } else {
            ffxxVar = ffxw.a;
        }
        aalqVar = ffxxVar;
        return axrg.b(new aalt(aalqVar, this, dnvjVar, dnviVar, z2), b(this, dnvjVar, dnviVar, z2, 4));
    }
}

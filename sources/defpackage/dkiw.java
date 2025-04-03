package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkiw extends dkgm {
    public final Map g;
    public dklz h;
    private final ffbr i;
    private eeiq j;

    public dkiw(djjr djjrVar, dkhc dkhcVar, ffbr ffbrVar, dkur dkurVar) {
        super(djjrVar, dkhcVar, dkurVar);
        this.g = DesugarCollections.synchronizedMap(new HashMap());
        this.i = ffbrVar;
    }

    @Override // defpackage.dkgm
    protected final void f() {
        if (this.a.a().mConfirmationServiceIdentity == null) {
            dkty.q("No confirmation service identity configured!", new Object[0]);
            k(dilc.DISABLED);
            return;
        }
        try {
            eehk eehkVar = dkut.a;
            this.j = eehk.e(this.a.a().mConfirmationServiceIdentity);
        } catch (eeje e) {
            dkty.i(e, "Error while parsing identity: %s", e.getMessage());
            this.j = null;
        }
    }

    public final void p(eenk eenkVar) {
        try {
            ((eehz) this.i).a.s(this.f.n(eenkVar));
        } catch (eejg e) {
            dkty.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
            throw new dkix("Error while sending response: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final void q(eenk eenkVar) {
        try {
            ((eehz) this.i).a.s(this.f.o(eenkVar, 400, 2));
        } catch (eejg e) {
            dkty.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
        }
    }

    public final boolean r(eenk eenkVar) {
        eeiq eeiqVar = this.j;
        if (eeiqVar == null) {
            return true;
        }
        String j = eenkVar.j("P-Asserted-Identity");
        if (j == null) {
            return false;
        }
        try {
            eehk eehkVar = dkut.a;
            eeiq eeiqVar2 = (eeiq) eehk.b(j).b;
            if (Objects.equals(eeiqVar2.e(), eeiqVar.e())) {
                if (Objects.equals(eeiqVar2.b(), eeiqVar.b())) {
                    return true;
                }
            }
        } catch (eeje unused) {
        }
        return false;
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}

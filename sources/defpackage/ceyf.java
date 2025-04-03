package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyf implements ceyw {
    public final ceza a;
    public final ffbr b;
    public final cexi c;
    private final ffsk d;

    public ceyf(ceza cezaVar, ffbr ffbrVar, cexi cexiVar, ffsk ffskVar) {
        cezaVar.getClass();
        cexiVar.getClass();
        ffskVar.getClass();
        this.a = cezaVar;
        this.b = ffbrVar;
        this.c = cexiVar;
        this.d = ffskVar;
    }

    @Override // defpackage.ceyw
    public final elfl a(ceze cezeVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new ceyd(cezeVar, this, null));
        return c;
    }

    @Override // defpackage.ceyw
    public final elfl b(ceze cezeVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new ceye(cezeVar, this, null));
        return c;
    }

    @Override // defpackage.ceyw
    public final Optional c(ceze cezeVar) {
        String r = cezeVar.r();
        r.getClass();
        int ordinal = this.c.b(r).ordinal();
        if (ordinal == 0) {
            return Optional.empty();
        }
        if (ordinal == 1) {
            return ((cfdp) this.b.b()).c(cezeVar);
        }
        throw new ffcd();
    }

    @Override // defpackage.ceyw
    public final boolean d(String str, ceyv ceyvVar, UUID uuid) {
        cexh a = this.c.a((String) ffpc.V(str, new String[]{"-"}, 0, 6).get(0));
        if (a == null || a.ordinal() != 1) {
            return this.a.d(str, ceyvVar, uuid);
        }
        return true;
    }
}

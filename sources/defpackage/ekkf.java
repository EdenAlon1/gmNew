package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkf extends lkv {
    private ekwr d;

    public ekkf(eg egVar) {
        super(egVar);
    }

    @Override // defpackage.lkv
    public final void e(lki lkiVar) {
        lkv.g("getObserverCount");
        if (this.b.e <= 0) {
            super.e(lkiVar);
            return;
        }
        ekwr ekwrVar = this.d;
        int ordinal = lkiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                elae elaeVar = elad.a;
                elaeVar.getClass();
                ekwrVar.p("Lifecycle.Started", elaeVar);
            } else if (ordinal == 2) {
                elae elaeVar2 = elad.a;
                elaeVar2.getClass();
                ekwrVar.p("Lifecycle.Resumed", elaeVar2);
            } else if (ordinal == 3) {
                elae elaeVar3 = elad.a;
                elaeVar3.getClass();
                ekwrVar.p("Lifecycle.Paused", elaeVar3);
            } else if (ordinal == 4) {
                elae elaeVar4 = elad.a;
                elaeVar4.getClass();
                ekwrVar.p("Lifecycle.Stopped", elaeVar4);
            } else {
                if (ordinal != 5) {
                    Objects.toString(lkiVar);
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(lkiVar.toString()));
                }
                elae elaeVar5 = elad.a;
                elaeVar5.getClass();
                ekwrVar.p("Lifecycle.Destroyed", elaeVar5);
            }
        } else if (ekwrVar.e == null) {
            elae elaeVar6 = elad.a;
            elaeVar6.getClass();
            ekwrVar.p("Lifecycle.Created", elaeVar6);
            ekwrVar.d = true;
        }
        try {
            super.e(lkiVar);
        } finally {
            this.d.n(lkiVar);
        }
    }

    public final void h(ekwr ekwrVar) {
        emxf.m(this.d == null, "Activity was already created");
        this.d = ekwrVar;
    }
}

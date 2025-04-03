package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxkc {
    private final akue a;

    public cxkc(akue akueVar) {
        this.a = akueVar;
    }

    public final eqbw a() {
        int ordinal = this.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return eqbw.USER_ENABLED_FEATURE;
            }
            if (ordinal == 2) {
                return eqbw.USER_DISABLED_FEATURE;
            }
            if (ordinal == 3) {
                return eqbw.CONSENT_NOTICE_SHOWN;
            }
            if (ordinal == 4) {
                return eqbw.CONSENT_ENABLED_FEATURE;
            }
            if (ordinal != 5) {
                throw new IllegalStateException("Unknown consent state. Current state is: ".concat(String.valueOf(this.a.name())));
            }
        }
        return eqbw.UNSET;
    }

    public final boolean b(akue akueVar) {
        akue akueVar2 = this.a;
        if (akueVar2 == akue.UNSET || akueVar2 == akueVar) {
            return true;
        }
        akue akueVar3 = akue.USER_ENABLED_FEATURE;
        if (akueVar2 == akueVar3) {
            return akueVar == akue.USER_DISABLED_FEATURE;
        }
        akue akueVar4 = akue.USER_DISABLED_FEATURE;
        if (akueVar2 != akueVar4) {
            if (akueVar2 == akue.CONSENT_NOTICE_SHOWN) {
                return akueVar == akueVar4 || akueVar == akue.CONSENT_ENABLED_FEATURE;
            }
            if (akueVar2 == akue.CONSENT_ENABLED_FEATURE) {
                akueVar3 = akueVar4;
            }
        }
        return akueVar == akueVar3;
    }

    public final boolean c() {
        akue akueVar = this.a;
        return akueVar == akue.USER_ENABLED_FEATURE || akueVar == akue.CONSENT_ENABLED_FEATURE;
    }

    public final boolean d() {
        akue akueVar = this.a;
        return akueVar == akue.USER_ENABLED_FEATURE || akueVar == akue.CONSENT_NOTICE_SHOWN || akueVar == akue.CONSENT_ENABLED_FEATURE;
    }

    public final boolean e() {
        akue akueVar = this.a;
        return akueVar == akue.USER_ENABLED_FEATURE || akueVar == akue.USER_DISABLED_FEATURE;
    }
}

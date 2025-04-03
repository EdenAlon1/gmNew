package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpiw extends cphy {
    @Override // defpackage.cphy
    public final void c(fcek fcekVar, awuf awufVar) {
        fgtg b = fgtg.b(fcekVar.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            awuh awuhVar = awuh.PHONE;
            awufVar.copyOnWrite();
            awui awuiVar = (awui) awufVar.instance;
            awui awuiVar2 = awui.a;
            awuiVar.c = awuhVar.f;
            awuiVar.b |= 1;
            return;
        }
        if (ordinal == 10) {
            awuh awuhVar2 = awuh.BOT;
            awufVar.copyOnWrite();
            awui awuiVar3 = (awui) awufVar.instance;
            awui awuiVar4 = awui.a;
            awuiVar3.c = awuhVar2.f;
            awuiVar3.b |= 1;
            return;
        }
        if (ordinal == 41) {
            awuh awuhVar3 = awuh.EMERGENCY;
            awufVar.copyOnWrite();
            awui awuiVar5 = (awui) awufVar.instance;
            awui awuiVar6 = awui.a;
            awuiVar5.c = awuhVar3.f;
            awuiVar5.b |= 1;
            return;
        }
        if (ordinal != 42) {
            fgtg b2 = fgtg.b(fcekVar.b);
            if (b2 == null) {
                b2 = fgtg.UNRECOGNIZED;
            }
            throw new IllegalArgumentException("Unknown enum value: " + b2.a());
        }
        awuh awuhVar4 = awuh.UNKNOWN_TYPE;
        awufVar.copyOnWrite();
        awui awuiVar7 = (awui) awufVar.instance;
        awui awuiVar8 = awui.a;
        awuiVar7.c = awuhVar4.f;
        awuiVar7.b |= 1;
    }

    @Override // defpackage.cphy
    public final void d(awui awuiVar, fcej fcejVar) {
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            fgtg fgtgVar = fgtg.UNSET;
            fcejVar.copyOnWrite();
            fcek fcekVar = (fcek) fcejVar.instance;
            fcek fcekVar2 = fcek.a;
            fcekVar.b = fgtgVar.a();
            return;
        }
        if (ordinal == 1) {
            fgtg fgtgVar2 = fgtg.PHONE_NUMBER;
            fcejVar.copyOnWrite();
            fcek fcekVar3 = (fcek) fcejVar.instance;
            fcek fcekVar4 = fcek.a;
            fcekVar3.b = fgtgVar2.a();
            return;
        }
        if (ordinal == 3) {
            fgtg fgtgVar3 = fgtg.RCS_BOT;
            fcejVar.copyOnWrite();
            fcek fcekVar5 = (fcek) fcejVar.instance;
            fcek fcekVar6 = fcek.a;
            fcekVar5.b = fgtgVar3.a();
            return;
        }
        if (ordinal != 4) {
            awuh b2 = awuh.b(awuiVar.c);
            if (b2 == null) {
                b2 = awuh.UNKNOWN_TYPE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + b2.f);
        }
        fgtg fgtgVar4 = fgtg.EMERGENCY;
        fcejVar.copyOnWrite();
        fcek fcekVar7 = (fcek) fcejVar.instance;
        fcek fcekVar8 = fcek.a;
        fcekVar7.b = fgtgVar4.a();
    }

    @Override // defpackage.cphy
    public final fcej e() {
        return cpta.a();
    }
}

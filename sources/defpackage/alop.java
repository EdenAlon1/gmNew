package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alop {
    private final ffbr a;
    private final ctvs b;

    public alop(ffbr ffbrVar, ctvs ctvsVar) {
        ffbrVar.getClass();
        ctvsVar.getClass();
        this.a = ffbrVar;
        this.b = ctvsVar;
    }

    private static final long b(boolean z) {
        return z ? 1L : 0L;
    }

    public final void a(int i, String str, alov alovVar, alox aloxVar) {
        str.getClass();
        alovVar.getClass();
        akxn a = ((akyb) this.a.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.GAIA_REPORT_EVENT, eoluVar);
        epay epayVar = (epay) epbj.a.createBuilder();
        epayVar.getClass();
        epayVar.copyOnWrite();
        epbj epbjVar = (epbj) epayVar.instance;
        epbjVar.b |= 1;
        epbjVar.c = str;
        epayVar.copyOnWrite();
        epbj epbjVar2 = (epbj) epayVar.instance;
        epbjVar2.b |= 4;
        epbjVar2.d = i;
        epbb epbbVar = (epbb) epbc.a.createBuilder();
        epbbVar.getClass();
        epaz epazVar = (epaz) epba.a.createBuilder();
        epazVar.getClass();
        int i2 = alovVar.e;
        epazVar.copyOnWrite();
        epba epbaVar = (epba) epazVar.instance;
        epbaVar.b |= 1;
        epbaVar.c = i2;
        boolean d = this.b.d();
        epazVar.copyOnWrite();
        epba epbaVar2 = (epba) epazVar.instance;
        epbaVar2.b |= 2;
        epbaVar2.d = d;
        int i3 = alovVar.d;
        epazVar.copyOnWrite();
        epba epbaVar3 = (epba) epazVar.instance;
        epbaVar3.b |= 4;
        epbaVar3.e = i3;
        eyfy build = epazVar.build();
        build.getClass();
        epbbVar.copyOnWrite();
        epbc epbcVar = (epbc) epbbVar.instance;
        epbcVar.c = (epba) build;
        epbcVar.b |= 4;
        eyfy build2 = epbbVar.build();
        build2.getClass();
        epayVar.copyOnWrite();
        epbj epbjVar3 = (epbj) epayVar.instance;
        epbjVar3.e = (epbc) build2;
        epbjVar3.b |= 8;
        epbf epbfVar = (epbf) epbi.a.createBuilder();
        epbfVar.getClass();
        epbd epbdVar = (epbd) epbe.a.createBuilder();
        epbdVar.getClass();
        long b = b(aloxVar.c);
        epbdVar.copyOnWrite();
        epbe epbeVar = (epbe) epbdVar.instance;
        epbeVar.b |= 1;
        epbeVar.c = b;
        boolean z = aloxVar.f || aloxVar.g;
        epbdVar.copyOnWrite();
        epbe epbeVar2 = (epbe) epbdVar.instance;
        epbeVar2.b |= 2;
        epbeVar2.d = b(z);
        boolean z2 = aloxVar.h > 0;
        epbdVar.copyOnWrite();
        epbe epbeVar3 = (epbe) epbdVar.instance;
        epbeVar3.b |= 16;
        epbeVar3.g = b(z2);
        long b2 = b(aloxVar.e);
        epbdVar.copyOnWrite();
        epbe epbeVar4 = (epbe) epbdVar.instance;
        epbeVar4.b |= 4;
        epbeVar4.e = b2;
        long b3 = b(aloxVar.d);
        epbdVar.copyOnWrite();
        epbe epbeVar5 = (epbe) epbdVar.instance;
        epbeVar5.b |= 8;
        epbeVar5.f = b3;
        eyfy build3 = epbdVar.build();
        build3.getClass();
        epbfVar.copyOnWrite();
        epbi epbiVar = (epbi) epbfVar.instance;
        epbiVar.c = (epbe) build3;
        epbiVar.b |= 1;
        epbg epbgVar = (epbg) epbh.a.createBuilder();
        epbgVar.getClass();
        long j = aloxVar.i;
        epbgVar.copyOnWrite();
        epbh epbhVar = (epbh) epbgVar.instance;
        epbhVar.b = 1 | epbhVar.b;
        epbhVar.c = j;
        long j2 = aloxVar.j;
        epbgVar.copyOnWrite();
        epbh epbhVar2 = (epbh) epbgVar.instance;
        epbhVar2.b |= 2;
        epbhVar2.d = j2;
        long j3 = aloxVar.h;
        epbgVar.copyOnWrite();
        epbh epbhVar3 = (epbh) epbgVar.instance;
        epbhVar3.b |= 4;
        epbhVar3.e = j3;
        eyfy build4 = epbgVar.build();
        build4.getClass();
        epbfVar.copyOnWrite();
        epbi epbiVar2 = (epbi) epbfVar.instance;
        epbiVar2.d = (epbh) build4;
        epbiVar2.b |= 2;
        eyfy build5 = epbfVar.build();
        build5.getClass();
        epayVar.copyOnWrite();
        epbj epbjVar4 = (epbj) epayVar.instance;
        epbjVar4.f = (epbi) build5;
        epbjVar4.b |= 16;
        eyfy build6 = epayVar.build();
        build6.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cw = (epbj) build6;
        eolvVar.h |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_GAIA_REPORT);
    }
}

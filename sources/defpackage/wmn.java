package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmn implements wmf {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffbr f;

    public wmn(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.e = ffskVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.f = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
    }

    public static final boolean p() {
        return ((Boolean) ctjd.bd.e()).booleanValue() || ((Boolean) ctjd.bg.e()).booleanValue();
    }

    private final void q(eolu eoluVar) {
        r(new wml(eoluVar, null));
    }

    private final void r(ffji ffjiVar) {
        axol.k(this.e, null, new wmm(this, ffjiVar, null), 3);
    }

    private static final void s(Throwable th, eqsl eqslVar) {
        eqslVar.copyOnWrite();
        eqsp.a((eqsp) eqslVar.instance);
        Throwable cause = th.getCause();
        if (cause instanceof emeb) {
            emeb emebVar = (emeb) cause;
            Integer b = emebVar.b();
            if (b != null) {
                int intValue = b.intValue();
                eqslVar.copyOnWrite();
                eqsp eqspVar = (eqsp) eqslVar.instance;
                eqspVar.b |= 16;
                eqspVar.f = intValue;
            }
            Integer a = emebVar.a();
            if (a != null) {
                int intValue2 = a.intValue();
                eqslVar.copyOnWrite();
                eqsp eqspVar2 = (eqsp) eqslVar.instance;
                eqspVar2.b |= 32;
                eqspVar2.g = intValue2;
            }
        }
    }

    @Override // defpackage.wmf
    public final void a(int i) {
        axol.k(this.e, null, new wmg(this, i, null), 3);
    }

    @Override // defpackage.wmf
    public final void b(Throwable th) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_ERROR;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqsl eqslVar = (eqsl) eqsp.a.createBuilder();
        eqslVar.copyOnWrite();
        eqsp eqspVar = (eqsp) eqslVar.instance;
        eqspVar.c = 2;
        eqspVar.b |= 1;
        eqslVar.copyOnWrite();
        eqsp eqspVar2 = (eqsp) eqslVar.instance;
        eqspVar2.d = wmo.b(th) - 1;
        eqspVar2.b = 2 | eqspVar2.b;
        eqsn a = wmo.a(th);
        eqslVar.copyOnWrite();
        eqsp eqspVar3 = (eqsp) eqslVar.instance;
        eqspVar3.e = a.m;
        eqspVar3.b |= 4;
        if (p()) {
            s(th, eqslVar);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsp eqspVar4 = (eqsp) eqslVar.build();
        eqspVar4.getClass();
        eolvVar2.bK = eqspVar4;
        eolvVar2.g |= 65536;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void c() {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_ERROR;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqsl eqslVar = (eqsl) eqsp.a.createBuilder();
        eqslVar.copyOnWrite();
        eqsp eqspVar = (eqsp) eqslVar.instance;
        eqspVar.c = 2;
        eqspVar.b |= 1;
        eqslVar.copyOnWrite();
        eqsp eqspVar2 = (eqsp) eqslVar.instance;
        eqspVar2.d = 1;
        eqspVar2.b |= 2;
        eqsn eqsnVar = eqsn.MAGIC_COMPOSE_MAGIC_REWRITE_WITHOUT_DRAFT;
        eqslVar.copyOnWrite();
        eqsp eqspVar3 = (eqsp) eqslVar.instance;
        eqspVar3.e = eqsnVar.m;
        eqspVar3.b |= 4;
        if (p()) {
            eqslVar.copyOnWrite();
            eqsp.a((eqsp) eqslVar.instance);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsp eqspVar4 = (eqsp) eqslVar.build();
        eqspVar4.getClass();
        eolvVar2.bK = eqspVar4;
        eolvVar2.g |= 65536;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void d(Throwable th) {
        th.getClass();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_ERROR;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqsl eqslVar = (eqsl) eqsp.a.createBuilder();
        eqslVar.copyOnWrite();
        eqsp eqspVar = (eqsp) eqslVar.instance;
        eqspVar.c = 1;
        eqspVar.b = 1 | eqspVar.b;
        eqslVar.copyOnWrite();
        eqsp eqspVar2 = (eqsp) eqslVar.instance;
        eqspVar2.d = wmo.b(th) - 1;
        eqspVar2.b |= 2;
        eqsn a = wmo.a(th);
        eqslVar.copyOnWrite();
        eqsp eqspVar3 = (eqsp) eqslVar.instance;
        eqspVar3.e = a.m;
        eqspVar3.b |= 4;
        if (p()) {
            s(th, eqslVar);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsp eqspVar4 = (eqsp) eqslVar.build();
        eqspVar4.getClass();
        eolvVar2.bK = eqspVar4;
        eolvVar2.g |= 65536;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final /* synthetic */ void e() {
        f(true, false, false, false, false, false, false);
    }

    @Override // defpackage.wmf
    public final void f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        r(new wmh(z, this, p(), z2, z6, z3, z4, z5, z7, null));
    }

    @Override // defpackage.wmf
    public final void g(esgx esgxVar) {
        r(new wmi(this, esgxVar, null));
    }

    @Override // defpackage.wmf
    public final void h(boolean z) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_SETTING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqtc eqtcVar = (eqtc) eqte.a.createBuilder();
        eqtcVar.copyOnWrite();
        eqte eqteVar = (eqte) eqtcVar.instance;
        eqteVar.c = (true != z ? 3 : 2) - 1;
        eqteVar.b |= 1;
        if (p()) {
            eqtcVar.copyOnWrite();
            eqte eqteVar2 = (eqte) eqtcVar.instance;
            eqteVar2.b |= 2;
            eqteVar2.d = true;
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqte eqteVar3 = (eqte) eqtcVar.build();
        eqteVar3.getClass();
        eolvVar2.bQ = eqteVar3;
        eolvVar2.g |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void i() {
        axol.k(this.e, null, new wmj(this, null), 3);
    }

    @Override // defpackage.wmf
    public final void j(String str) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_FEEDBACK;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqst eqstVar = (eqst) eqsu.a.createBuilder();
        eqstVar.copyOnWrite();
        eqsu eqsuVar = (eqsu) eqstVar.instance;
        eqsuVar.c = 2;
        eqsuVar.b |= 1;
        eqtg eqtgVar = (eqtg) Map.EL.getOrDefault(((wmx) this.b.b()).a, str, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
        eqstVar.copyOnWrite();
        eqsu eqsuVar2 = (eqsu) eqstVar.instance;
        eqsuVar2.d = eqtgVar.i;
        eqsuVar2.b |= 2;
        eqstVar.copyOnWrite();
        eqsu eqsuVar3 = (eqsu) eqstVar.instance;
        eqsuVar3.e = 2;
        eqsuVar3.b |= 4;
        if (p()) {
            eqstVar.copyOnWrite();
            eqsu.a((eqsu) eqstVar.instance);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsu eqsuVar4 = (eqsu) eqstVar.build();
        eqsuVar4.getClass();
        eolvVar2.bG = eqsuVar4;
        eolvVar2.g |= 2048;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void k() {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_FEEDBACK;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqst eqstVar = (eqst) eqsu.a.createBuilder();
        eqstVar.copyOnWrite();
        eqsu eqsuVar = (eqsu) eqstVar.instance;
        eqsuVar.c = 1;
        eqsuVar.b = 1 | eqsuVar.b;
        eqstVar.copyOnWrite();
        eqsu eqsuVar2 = (eqsu) eqstVar.instance;
        eqsuVar2.e = 2;
        eqsuVar2.b |= 4;
        if (p()) {
            eqstVar.copyOnWrite();
            eqsu.a((eqsu) eqstVar.instance);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsu eqsuVar3 = (eqsu) eqstVar.build();
        eqsuVar3.getClass();
        eolvVar2.bG = eqsuVar3;
        eolvVar2.g |= 2048;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void l(String str) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_FEEDBACK;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqst eqstVar = (eqst) eqsu.a.createBuilder();
        eqstVar.copyOnWrite();
        eqsu eqsuVar = (eqsu) eqstVar.instance;
        eqsuVar.c = 2;
        eqsuVar.b |= 1;
        eqtg eqtgVar = (eqtg) Map.EL.getOrDefault(((wmx) this.b.b()).a, str, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
        eqstVar.copyOnWrite();
        eqsu eqsuVar2 = (eqsu) eqstVar.instance;
        eqsuVar2.d = eqtgVar.i;
        eqsuVar2.b |= 2;
        eqstVar.copyOnWrite();
        eqsu eqsuVar3 = (eqsu) eqstVar.instance;
        eqsuVar3.e = 1;
        eqsuVar3.b |= 4;
        if (p()) {
            eqstVar.copyOnWrite();
            eqsu.a((eqsu) eqstVar.instance);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsu eqsuVar4 = (eqsu) eqstVar.build();
        eqsuVar4.getClass();
        eolvVar2.bG = eqsuVar4;
        eolvVar2.g |= 2048;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void m() {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_FEEDBACK;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqst eqstVar = (eqst) eqsu.a.createBuilder();
        eqstVar.copyOnWrite();
        eqsu eqsuVar = (eqsu) eqstVar.instance;
        eqsuVar.c = 1;
        eqsuVar.b |= 1;
        eqstVar.copyOnWrite();
        eqsu eqsuVar2 = (eqsu) eqstVar.instance;
        eqsuVar2.e = 1;
        eqsuVar2.b |= 4;
        if (p()) {
            eqstVar.copyOnWrite();
            eqsu.a((eqsu) eqstVar.instance);
        }
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsu eqsuVar3 = (eqsu) eqstVar.build();
        eqsuVar3.getClass();
        eolvVar2.bG = eqsuVar3;
        eolvVar2.g |= 2048;
        q(eoluVar);
    }

    @Override // defpackage.wmf
    public final void n(eqss eqssVar) {
        eqssVar.getClass();
        eyfq builder = eqssVar.toBuilder();
        eqsq eqsqVar = (eqsq) builder;
        if (p()) {
            eqsqVar.copyOnWrite();
            eqss eqssVar2 = (eqss) eqsqVar.instance;
            eqssVar2.b |= 256;
            eqssVar2.p = true;
        }
        builder.getClass();
        axol.k(this.e, null, new wmk(eqsqVar, this, null), 3);
    }

    @Override // defpackage.wmf
    public final void o(int i) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_CONSENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqse eqseVar = (eqse) eqsg.a.createBuilder();
        eqseVar.copyOnWrite();
        eqsg eqsgVar = (eqsg) eqseVar.instance;
        eqsgVar.c = i - 1;
        eqsgVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqsg eqsgVar2 = (eqsg) eqseVar.build();
        eqsgVar2.getClass();
        eolvVar2.bH = eqsgVar2;
        eolvVar2.g |= 4096;
        q(eoluVar);
    }
}

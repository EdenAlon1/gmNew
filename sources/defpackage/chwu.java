package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwu {

    @Deprecated
    public final fcek a;
    public final esaa b;
    public String c = null;
    public String d = null;
    public eyee e = eyee.b;
    public boolean f = false;
    public boolean g = false;
    public eyee h;
    public fbzr i;
    public long j;
    public int k;
    public boolean l;
    public String m;
    public fcek n;
    public eyee o;
    public Optional p;
    private final chwx q;

    public chwu(chwx chwxVar, cgcu cgcuVar, bzge bzgeVar, esaa esaaVar) {
        eyee eyeeVar = eyee.b;
        this.h = eyeeVar;
        this.i = null;
        this.j = 0L;
        this.k = 1;
        this.l = false;
        this.o = eyeeVar;
        this.p = Optional.empty();
        this.q = chwxVar;
        fcek fcekVar = bzgeVar.a;
        this.a = fcekVar;
        if (cgcuVar.a()) {
            if (bzgeVar.c.isPresent()) {
                this.o = (eyee) bzgeVar.c.get();
            } else {
                fgtg b = fgtg.b(fcekVar.b);
                if ((b == null ? fgtg.UNRECOGNIZED : b) == fgtg.EMAIL) {
                    csjy.f("BugleNetwork", "GDitto push is missing registration id. Type=".concat(String.valueOf(esaaVar.name())));
                }
            }
            this.p = Optional.of(bzgeVar);
        }
        this.b = esaaVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [fazb, java.lang.Object] */
    public final chwv a() {
        chwx chwxVar = this.q;
        cgzv cgzvVar = (cgzv) chwxVar.a.b();
        cgzvVar.getClass();
        cqoh cqohVar = (cqoh) chwxVar.b.b();
        cqohVar.getClass();
        ctyx ctyxVar = (ctyx) chwxVar.c.b();
        ctyxVar.getClass();
        bzgd bzgdVar = (bzgd) chwxVar.d.b();
        bzgdVar.getClass();
        chep chepVar = (chep) chwxVar.e.b();
        chepVar.getClass();
        errl errlVar = (errl) chwxVar.f.b();
        errlVar.getClass();
        ?? b = chwxVar.h.b();
        b.getClass();
        akzt akztVar = (akzt) chwxVar.i.b();
        akztVar.getClass();
        chyw chywVar = (chyw) chwxVar.j.b();
        chywVar.getClass();
        chyp chypVar = (chyp) chwxVar.l.b();
        chypVar.getClass();
        chhw chhwVar = (chhw) chwxVar.m.b();
        chhwVar.getClass();
        chhw chhwVar2 = (chhw) chwxVar.n.b();
        chhwVar2.getClass();
        bzek bzekVar = (bzek) chwxVar.p.b();
        bzekVar.getClass();
        ffbr ffbrVar = chwxVar.o;
        return new chwv(cgzvVar, cqohVar, ctyxVar, bzgdVar, chepVar, errlVar, chwxVar.g, b, akztVar, chywVar, chwxVar.k, chypVar, chhwVar, chhwVar2, ffbrVar, bzekVar, this);
    }

    public final void b(eyhs eyhsVar) {
        this.e = eyhsVar.toByteString();
    }

    public final void c() {
        this.g = true;
    }

    @Deprecated
    public chwu(chwx chwxVar, cgcu cgcuVar, fcek fcekVar, Optional optional, esaa esaaVar) {
        eyee eyeeVar = eyee.b;
        this.h = eyeeVar;
        this.i = null;
        this.j = 0L;
        this.k = 1;
        this.l = false;
        this.o = eyeeVar;
        this.p = Optional.empty();
        this.q = chwxVar;
        this.a = fcekVar;
        if (cgcuVar.a()) {
            if (optional.isPresent()) {
                this.o = (eyee) optional.get();
            } else {
                fgtg b = fgtg.b(fcekVar.b);
                if ((b == null ? fgtg.UNRECOGNIZED : b) == fgtg.EMAIL) {
                    csjy.f("BugleNetwork", "GDitto push is missing registration id. Type=".concat(String.valueOf(esaaVar.name())));
                }
            }
        }
        this.b = esaaVar;
    }
}

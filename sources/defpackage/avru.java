package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avru {
    public static final Duration a;
    public static final avtj b;
    public final avsv c;
    public final avrk d;
    public final avrk e;
    public final cqoh f;
    public final akin g;
    public final akjz h;
    private final avsd i;
    private final avrh j;
    private final avmb k;
    private final avmb l;
    private final avrk m;
    private final avti n;
    private final avtj o;
    private final errl p;
    private final akim q;

    static {
        long j = ffpw.a;
        Duration ofSeconds = Duration.ofSeconds(ffpw.h(ffpy.d(36500, ffpz.g)), ffpw.d(r0));
        ofSeconds.getClass();
        a = ofSeconds;
        avtf avtfVar = new avtf();
        avtfVar.c(ofSeconds);
        avtfVar.b(ofSeconds);
        b = avtfVar.a();
    }

    public avru(akim akimVar, avsd avsdVar, akin akinVar, avrh avrhVar, avsv avsvVar, akjz akjzVar, avmb avmbVar, avmb avmbVar2, avrk avrkVar, avrk avrkVar2, avrk avrkVar3, avti avtiVar, avtj avtjVar, errl errlVar, cqoh cqohVar) {
        akimVar.getClass();
        akinVar.getClass();
        akjzVar.getClass();
        avrkVar3.getClass();
        errlVar.getClass();
        cqohVar.getClass();
        this.q = akimVar;
        this.i = avsdVar;
        this.g = akinVar;
        this.j = avrhVar;
        this.c = avsvVar;
        this.h = akjzVar;
        this.k = avmbVar;
        this.l = avmbVar2;
        this.m = avrkVar;
        this.d = avrkVar2;
        this.e = avrkVar3;
        this.n = avtiVar;
        this.o = avtjVar;
        this.p = errlVar;
        this.f = cqohVar;
    }

    public final avpg a() {
        return this.h.a(this.g.a(this.e, new avqk(new Supplier() { // from class: avrs
            @Override // java.util.function.Supplier
            public final Object get() {
                Duration duration = avru.a;
                return Instant.EPOCH;
            }
        })));
    }

    public final avrk b(avrk avrkVar, avtj avtjVar) {
        avth a2 = this.n.a(new avtl(avtjVar, this.o));
        avmb avmbVar = this.l;
        avpg a3 = a();
        errl errlVar = this.p;
        avpy avpyVar = new avpy(this.k, new avpy(avmbVar, a3, a2, errlVar), a2, errlVar);
        avrh avrhVar = this.j;
        azei azeiVar = (azei) avrhVar.a.b();
        azeiVar.getClass();
        errl errlVar2 = (errl) avrhVar.b.b();
        errlVar2.getClass();
        avrp a4 = this.g.a(new avrg(avrkVar, avpyVar, azeiVar, errlVar2, a2), new avqk(new Supplier() { // from class: avrt
            @Override // java.util.function.Supplier
            public final Object get() {
                Duration duration = avru.a;
                return Instant.EPOCH;
            }
        }));
        avsd avsdVar = this.i;
        cjzh cjzhVar = (cjzh) avsdVar.a.b();
        cjzhVar.getClass();
        errl errlVar3 = (errl) avsdVar.c.b();
        errlVar3.getClass();
        return new avqb(new avsc(a4, cjzhVar, avsdVar.b, errlVar3), (errl) this.q.a.a.p.b());
    }

    public final avrk c(avtj avtjVar, Executor executor) {
        avti avtiVar = this.n;
        return b(new avpy(this.k, this.m, avtiVar.a(avtjVar), executor), avtjVar);
    }

    public final avrk d(avtj avtjVar) {
        return c(avtjVar, this.p);
    }

    public final avrk e(avtj avtjVar) {
        return h(avtjVar, a());
    }

    public final avrk f(avtj avtjVar) {
        return b(g(this.d, avtjVar), avtjVar);
    }

    public final avrk g(avrk avrkVar, avtj avtjVar) {
        avth a2 = this.n.a(avtjVar);
        avmb avmbVar = this.l;
        errl errlVar = this.p;
        return new avpy(this.k, new avpy(avmbVar, avrkVar, a2, errlVar), a2, errlVar);
    }

    public final avrk h(avtj avtjVar, avrk avrkVar) {
        avth a2 = this.n.a(avtjVar);
        avmb avmbVar = this.l;
        errl errlVar = this.p;
        return b(new avpy(this.k, new avpy(avmbVar, avrkVar, a2, errlVar), a2, errlVar), avtjVar);
    }
}

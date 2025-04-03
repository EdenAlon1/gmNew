package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfd {
    public final egct a;
    public final llg b = new llg();
    public final llg c = new llg();
    private final egcn d;
    private final errl e;
    private final ewjg f;
    private final egdu g;
    private final ewiq h;

    public egfd(egcn egcnVar, errl errlVar, ewjg ewjgVar, egct egctVar, egdu egduVar, ewiq ewiqVar) {
        this.d = egcnVar;
        this.e = errlVar;
        this.f = ewjgVar;
        this.a = egctVar;
        this.g = egduVar;
        this.h = ewiqVar;
    }

    public final void a() {
        ewkw ewkwVar = (ewkw) ewkx.a.createBuilder();
        ewkwVar.copyOnWrite();
        ewkx ewkxVar = (ewkx) ewkwVar.instance;
        ewjg ewjgVar = this.f;
        ewjgVar.getClass();
        ewkxVar.c = ewjgVar;
        ewkxVar.b |= 1;
        if (!this.h.equals(ewiq.a)) {
            ewiq ewiqVar = this.h;
            ewkwVar.copyOnWrite();
            ewkx ewkxVar2 = (ewkx) ewkwVar.instance;
            ewiqVar.getClass();
            ewkxVar2.d = ewiqVar;
            ewkxVar2.b |= 2;
        }
        ListenableFuture g = this.d.g((ewkx) ewkwVar.build());
        egdt a = this.g.a(fapt.OBAKE_ART_HOME_CATEGORIES);
        a.d();
        erqt.r(g, new egfb(this, a), this.e);
    }

    public final void b() {
        ewjw ewjwVar = (ewjw) ewjx.a.createBuilder();
        ewjwVar.copyOnWrite();
        ewjx ewjxVar = (ewjx) ewjwVar.instance;
        ewjg ewjgVar = this.f;
        ewjgVar.getClass();
        ewjxVar.c = ewjgVar;
        ewjxVar.b |= 1;
        ewjwVar.copyOnWrite();
        ewjx ewjxVar2 = (ewjx) ewjwVar.instance;
        ewjxVar2.b |= 2;
        ewjxVar2.d = 48;
        ewjwVar.copyOnWrite();
        ewjx ewjxVar3 = (ewjx) ewjwVar.instance;
        ewjxVar3.b |= 4;
        ewjxVar3.e = 9;
        if (!this.h.equals(ewiq.a)) {
            ewiq ewiqVar = this.h;
            ewjwVar.copyOnWrite();
            ewjx ewjxVar4 = (ewjx) ewjwVar.instance;
            ewiqVar.getClass();
            ewjxVar4.f = ewiqVar;
            ewjxVar4.b |= 8;
        }
        ListenableFuture d = this.d.d((ewjx) ewjwVar.build());
        egdt a = this.g.a(fapt.OBAKE_ART_HOME_SUGGESTIONS);
        a.d();
        erqt.r(d, new egfc(this, a), this.e);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eazf {
    public final eayo a;
    public final ebtx b;
    public final ezoo c;
    public final ezoo d;
    public final ebvw e;
    public final eaze f;
    public final ksp g;

    public eazf(eayo eayoVar, ebtx ebtxVar, ezoo ezooVar, ebvw ebvwVar, eaze eazeVar, ksp kspVar) {
        this.a = eayoVar;
        this.b = ebtxVar;
        ezon ezonVar = (ezon) ezooVar.toBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        ezooVar2.c = 3;
        ezooVar2.b |= 1;
        this.c = (ezoo) ezonVar.build();
        ezon ezonVar2 = (ezon) ezooVar.toBuilder();
        ezonVar2.copyOnWrite();
        ezoo ezooVar3 = (ezoo) ezonVar2.instance;
        ezooVar3.c = 4;
        ezooVar3.b |= 1;
        this.d = (ezoo) ezonVar2.build();
        this.e = ebvwVar;
        this.f = eazeVar;
        this.g = kspVar;
    }
}

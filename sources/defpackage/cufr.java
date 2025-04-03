package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufr {
    public final ffbr a;
    public final ffbr b;
    public final ffsk c;
    public final ffsk d;

    public cufr(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffsk ffskVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffskVar;
        this.d = ffskVar2;
    }

    public static final erdv a(cukx cukxVar, erdy erdyVar, int i) {
        erdx erdxVar = (erdx) erdz.a.createBuilder();
        erdxVar.copyOnWrite();
        erdz erdzVar = (erdz) erdxVar.instance;
        erdzVar.e = erdyVar.a();
        erdzVar.b |= 1;
        if (erdyVar == erdy.RECLASSIFICATION) {
            erej erejVar = (erej) erek.a.createBuilder();
            erejVar.copyOnWrite();
            erek erekVar = (erek) erejVar.instance;
            erekVar.b |= 1;
            erekVar.c = i;
            erdxVar.copyOnWrite();
            erdz erdzVar2 = (erdz) erdxVar.instance;
            erek erekVar2 = (erek) erejVar.build();
            erekVar2.getClass();
            erdzVar2.d = erekVar2;
            erdzVar2.c = 2;
        }
        erdv erdvVar = (erdv) erdw.a.createBuilder();
        erep a = cukxVar.a();
        erdvVar.copyOnWrite();
        erdw erdwVar = (erdw) erdvVar.instance;
        erdwVar.c = a.a();
        erdwVar.b |= 1;
        erdvVar.copyOnWrite();
        erdw erdwVar2 = (erdw) erdvVar.instance;
        erdz erdzVar3 = (erdz) erdxVar.build();
        erdzVar3.getClass();
        erdwVar2.d = erdzVar3;
        erdwVar2.b |= 2;
        return erdvVar;
    }
}

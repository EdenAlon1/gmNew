package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvuw {
    public final fgdj a;
    private final ffsk b;

    /* JADX WARN: Type inference failed for: r4v22, types: [cvvd, java.lang.Object] */
    public cvuw(ffsk ffskVar, amav amavVar, cvyf cvyfVar, cvvt cvvtVar, Optional optional, cwis cwisVar, ffbr ffbrVar, cvwx cvwxVar) {
        ffskVar.getClass();
        amavVar.getClass();
        cvyfVar.getClass();
        cvvtVar.getClass();
        cwisVar.getClass();
        ffbrVar.getClass();
        cvwxVar.getClass();
        this.b = ffskVar;
        ffxx[] ffxxVarArr = new ffxx[7];
        elfl c = amavVar.c();
        c.getClass();
        ffxxVarArr[0] = byzt.a(c).a();
        ffxxVarArr[1] = new cvuv(cvyfVar.a());
        ffxxVarArr[2] = cvvtVar.a();
        optional.isPresent();
        ffxxVarArr[3] = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() ? optional.get().a() : fgdm.a(null);
        ffxxVarArr[4] = ((cwft) ffbrVar.b()).a();
        ffxxVarArr[5] = cwisVar.a();
        ffxxVarArr[6] = cvwxVar.a();
        cvus cvusVar = new cvus(ffxxVarArr, this);
        int i = fgcz.a;
        fgcz a = fgcy.a(0L, 3);
        int i2 = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        this.a = fgbn.b(cvusVar, ffskVar, a, new cvux(engwVar));
    }
}

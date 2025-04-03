package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eajy implements eajw {
    private static final entd a = entd.c("GnpSdk");
    private final Context b;
    private final eafy c;

    public eajy(Context context, eafy eafyVar, easu easuVar) {
        context.getClass();
        eafyVar.getClass();
        this.b = context;
        this.c = eafyVar;
        easuVar.a(context);
    }

    @Override // defpackage.eajw
    public final void a(eajx eajxVar) {
        eagt eagtVar;
        dfld a2;
        exrc exrcVar = (exrc) exre.a.createBuilder();
        exrcVar.getClass();
        exqz exqzVar = (exqz) exrb.a.createBuilder();
        exqzVar.getClass();
        exqu exquVar = (exqu) exqx.a.createBuilder();
        exquVar.getClass();
        DesugarCollections.unmodifiableList(((exqx) exquVar.instance).c).getClass();
        exquVar.copyOnWrite();
        exqx exqxVar = (exqx) exquVar.instance;
        eygr eygrVar = exqxVar.c;
        if (!eygrVar.c()) {
            exqxVar.c = eyfy.mutableCopy(eygrVar);
        }
        eaka eakaVar = (eaka) eajxVar;
        eydl.addAll(eakaVar.j, exqxVar.c);
        eagn eagnVar = eakaVar.a;
        exquVar.copyOnWrite();
        exqx exqxVar2 = (exqx) exquVar.instance;
        exqxVar2.b |= 1;
        exqxVar2.d = ((eagl) eagnVar).a;
        eaox eaoxVar = eakaVar.c;
        if (eakaVar.e != null || TextUtils.isEmpty(eakaVar.l)) {
            eagtVar = eakaVar.e;
        } else {
            eags r = eagt.r();
            r.m(eaua.a);
            ((eagq) r).f = eakaVar.l;
            eagtVar = r.a();
        }
        exsv a3 = eaoxVar.a(eagtVar);
        exquVar.copyOnWrite();
        exqx exqxVar3 = (exqx) exquVar.instance;
        exqxVar3.i = a3;
        exqxVar3.b |= 32;
        exsm b = eakaVar.d.b();
        b.getClass();
        exquVar.copyOnWrite();
        exqx exqxVar4 = (exqx) exquVar.instance;
        exqxVar4.h = b;
        exqxVar4.b |= 16;
        long j = eakaVar.k;
        exquVar.copyOnWrite();
        exqx exqxVar5 = (exqx) exquVar.instance;
        exqxVar5.b |= 256;
        exqxVar5.k = j;
        exrt exrtVar = eakaVar.i;
        if (exrtVar != null) {
            exrm exrmVar = (exrm) exrn.a.createBuilder();
            exrmVar.getClass();
            exrmVar.copyOnWrite();
            exrn exrnVar = (exrn) exrmVar.instance;
            exrnVar.c = exrtVar;
            exrnVar.b |= 1;
            eyfy build = exrmVar.build();
            build.getClass();
            exquVar.copyOnWrite();
            exqx exqxVar6 = (exqx) exquVar.instance;
            exqxVar6.j = (exrn) build;
            exqxVar6.b |= 64;
        }
        String str = eakaVar.f;
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            exqy.a(str, exquVar);
        }
        String str2 = eakaVar.g;
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            exquVar.copyOnWrite();
            exqx exqxVar7 = (exqx) exquVar.instance;
            exqxVar7.b |= 4;
            exqxVar7.f = str2;
        }
        String str3 = eakaVar.h;
        if (!TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            exqy.a(str3, exquVar);
        }
        Long l = eakaVar.n;
        if (l != null) {
            long longValue = l.longValue();
            exquVar.copyOnWrite();
            exqx exqxVar8 = (exqx) exquVar.instance;
            exqxVar8.b |= 8;
            exqxVar8.g = longValue;
        }
        eyfy build2 = exquVar.build();
        build2.getClass();
        exqzVar.copyOnWrite();
        exrb exrbVar = (exrb) exqzVar.instance;
        exrbVar.e = (exqx) build2;
        exrbVar.b |= 1;
        int i = 3;
        if (eakaVar.q != 0) {
            exsw exswVar = (exsw) exsy.a.createBuilder();
            exswVar.getClass();
            int i2 = eakaVar.q;
            if (i2 == 0) {
                throw new IllegalStateException("Required value was null.");
            }
            exswVar.copyOnWrite();
            exsy exsyVar = (exsy) exswVar.instance;
            exsyVar.c = i2 - 1;
            exsyVar.b |= 1;
            int i3 = eakaVar.t;
            if (i3 != 0) {
                exswVar.copyOnWrite();
                exsy exsyVar2 = (exsy) exswVar.instance;
                exsyVar2.d = i3 - 1;
                exsyVar2.b |= 64;
            }
            eyfy build3 = exswVar.build();
            build3.getClass();
            exqzVar.copyOnWrite();
            exrb exrbVar2 = (exrb) exqzVar.instance;
            exrbVar2.d = (exsy) build3;
            exrbVar2.c = 2;
        } else if (eakaVar.r != 0) {
            exsc exscVar = (exsc) exsf.a.createBuilder();
            exscVar.getClass();
            int i4 = eakaVar.r;
            if (i4 == 0) {
                throw new IllegalStateException("Required value was null.");
            }
            exscVar.copyOnWrite();
            exsf exsfVar = (exsf) exscVar.instance;
            exsfVar.c = i4 - 1;
            exsfVar.b |= 1;
            int i5 = eakaVar.u;
            if (i5 != 0) {
                exscVar.copyOnWrite();
                exsf exsfVar2 = (exsf) exscVar.instance;
                exsfVar2.e = i5 - 1;
                exsfVar2.b |= 256;
            }
            String str4 = eakaVar.m;
            if (str4 != null) {
                exscVar.copyOnWrite();
                exsf exsfVar3 = (exsf) exscVar.instance;
                exsfVar3.b |= 32;
                exsfVar3.d = str4;
            }
            eyfy build4 = exscVar.build();
            build4.getClass();
            exqzVar.copyOnWrite();
            exrb exrbVar3 = (exrb) exqzVar.instance;
            exrbVar3.d = (exsf) build4;
            exrbVar3.c = 3;
        } else {
            if (eakaVar.s == 0) {
                throw new IllegalStateException("GnpLogEvent must have interactionType, failureType, or systemEventType.");
            }
            exsp exspVar = (exsp) exsr.a.createBuilder();
            exspVar.getClass();
            int i6 = eakaVar.s;
            if (i6 == 0) {
                throw null;
            }
            exspVar.copyOnWrite();
            exsr exsrVar = (exsr) exspVar.instance;
            exsrVar.c = i6 - 1;
            exsrVar.b |= 1;
            eyfy build5 = exspVar.build();
            build5.getClass();
            exqzVar.copyOnWrite();
            exrb exrbVar4 = (exrb) exqzVar.instance;
            exrbVar4.d = (exsr) build5;
            exrbVar4.c = 4;
        }
        eyfy build6 = exqzVar.build();
        build6.getClass();
        exrcVar.copyOnWrite();
        exre exreVar = (exre) exrcVar.instance;
        exreVar.c = (exrb) build6;
        exreVar.b |= 2;
        int ordinal = eakaVar.b.ordinal();
        if (ordinal == 0) {
            i = 4;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                i = 14;
            } else if (ordinal == 3) {
                i = 13;
            } else if (ordinal == 4) {
                i = 15;
            } else {
                if (ordinal != 5) {
                    throw new ffcd();
                }
                i = 2;
            }
        }
        exrcVar.copyOnWrite();
        exre exreVar2 = (exre) exrcVar.instance;
        exreVar2.d = i - 1;
        exreVar2.b |= 4;
        eyfy build7 = exrcVar.build();
        build7.getClass();
        exre exreVar3 = (exre) build7;
        String str5 = eakaVar.o;
        if (str5 == null) {
            dfla h = dfld.h(this.c.a, "CHIME");
            h.h = new eafx();
            a2 = h.c();
        } else {
            a2 = this.c.a("CHIME", str5);
        }
        dflc j2 = a2.j(exreVar3, dtql.b(this.b, new exqt()));
        if (!eakaVar.p.isEmpty()) {
            j2.f(ffdx.ax(eakaVar.p));
        }
        j2.c();
        a.o().t("GNP ClearCut log [%s]", exreVar3);
    }
}

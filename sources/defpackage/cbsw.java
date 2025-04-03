package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsw implements cbsv {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl");
    private final ffbr b;
    private final Random c;

    public cbsw(ffbr ffbrVar, Random random) {
        ffbrVar.getClass();
        random.getClass();
        this.b = ffbrVar;
        this.c = random;
    }

    private final boolean c() {
        Object e = cful.L.e();
        e.getClass();
        return this.c.nextDouble() <= Math.min(1.0d, Math.max(eobe.a, ((Number) e).doubleValue()));
    }

    private final void d(int i, int i2, int i3, int i4) {
        int i5;
        eomw eomwVar = (eomw) eomx.a.createBuilder();
        if (i2 != 1) {
            i5 = 3;
            if (i2 != 2) {
                i5 = i2 != 3 ? 5 : 4;
            }
        } else {
            i5 = 2;
        }
        eomwVar.copyOnWrite();
        eomx eomxVar = (eomx) eomwVar.instance;
        eomxVar.c = i5 - 1;
        eomxVar.b |= 1;
        eomwVar.copyOnWrite();
        eomx eomxVar2 = (eomx) eomwVar.instance;
        eomxVar2.d = i4 - 1;
        eomxVar2.b |= 2;
        eomwVar.copyOnWrite();
        eomx eomxVar3 = (eomx) eomwVar.instance;
        eomxVar3.e = i - 1;
        eomxVar3.b |= 4;
        eomwVar.copyOnWrite();
        eomx eomxVar4 = (eomx) eomwVar.instance;
        eomxVar4.b |= 8;
        eomxVar4.f = i3;
        cfup cfupVar = cbsu.a;
        if (((Boolean) cbsu.a.e()).booleanValue()) {
            return;
        }
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eomx eomxVar5 = (eomx) eomwVar.build();
        eomxVar5.getClass();
        eolvVar.H = eomxVar5;
        eolvVar.b |= 1073741824;
        eolt eoltVar = eolt.BUGLE_INDEXING;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.j = eoltVar.dk;
        eolvVar2.b |= 1;
        akxlVar.k(eoluVar, epyw.BUGLE_INDEXING);
    }

    @Override // defpackage.cbsv
    public final void a(String str, int i, int i2, Exception exc) {
        str.getClass();
        exc.getClass();
        if (c()) {
            d(3, i, exc instanceof dfqu ? ((dfqu) exc).a() : 13, i2);
            ensk i3 = a.i();
            i3.Y(ente.a, "BugleSearch");
            enrr enrrVar = (enrr) ((enrr) i3).g(exc);
            enrrVar.Y(cbrm.k, str);
            enrrVar.Y(cbrm.h, Integer.valueOf(i));
            enrrVar.Y(cbrm.i, String.valueOf(i2 - 1));
            enrrVar.Y(cbrm.j, "Failure");
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logIndexingFailure", 88, "IcingClearcutLoggerImpl.kt")).q("Icing indexing call is done.");
        }
    }

    @Override // defpackage.cbsv
    public final void b(String str, int i, int i2) {
        str.getClass();
        if (c()) {
            d(2, i, 0, i2);
            ensk h = a.h();
            h.Y(ente.a, "BugleSearch");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(cbrm.k, str);
            enrrVar.Y(cbrm.h, Integer.valueOf(i));
            enrrVar.Y(cbrm.i, String.valueOf(i2 - 1));
            enrrVar.Y(cbrm.j, "Success");
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/telemetry/IcingClearcutLoggerImpl", "logIndexingSuccess", 61, "IcingClearcutLoggerImpl.kt")).q("Icing indexing call is done.");
        }
    }
}

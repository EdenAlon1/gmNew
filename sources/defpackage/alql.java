package defpackage;

import com.android.vcard.VCardConfig;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alql {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger");
    public final ffbr b;
    private final ffbr c;
    private final ffsk d;

    public alql(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.b = ffbrVar2;
        this.d = ffskVar;
    }

    public static final eolu b(int i, Instant instant) {
        eolt eoltVar;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        if (i - 1 != 2) {
            eoltVar = eolt.HOME_SCREEN_FIRST_VISIT;
            eqrv eqrvVar = (eqrv) eqrw.a.createBuilder();
            eyja a2 = cuxv.a(instant);
            eqrvVar.copyOnWrite();
            eqrw eqrwVar = (eqrw) eqrvVar.instance;
            eqrwVar.c = a2;
            eqrwVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eqrw eqrwVar2 = (eqrw) eqrvVar.build();
            eqrwVar2.getClass();
            eolvVar.bN = eqrwVar2;
            eolvVar.g |= 1048576;
        } else {
            eoltVar = eolt.CONVERSATION_SCREEN_FIRST_VISIT;
            eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
            eyja a3 = cuxv.a(instant);
            eqntVar.copyOnWrite();
            eqnu eqnuVar = (eqnu) eqntVar.instance;
            eqnuVar.c = a3;
            eqnuVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eqnu eqnuVar2 = (eqnu) eqntVar.build();
            eqnuVar2.getClass();
            eolvVar2.cz = eqnuVar2;
            eolvVar2.h |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eolvVar3.j = eoltVar.dk;
        eolvVar3.b |= 1;
        return eoluVar;
    }

    @ffbs
    public final elfl a(int i, Instant instant) {
        instant.getClass();
        return axol.i(this.d, new alqk(((algm) this.c.b()).j(i, instant), i, this, instant, null));
    }
}

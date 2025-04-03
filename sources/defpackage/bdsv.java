package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsv {
    public final entd a;
    public final ffly b;
    private final ffbr c;
    private final ffbr d;

    public bdsv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar3;
        this.a = entd.c("BugleParticipantData");
        this.b = fflz.d(cqohVar.f().toEpochMilli());
    }

    public static final evhq a(String str) {
        evhp evhpVar = evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new evhq(evhpVar, str);
    }

    public static /* synthetic */ void b(bdsv bdsvVar, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i) {
        boolean d = d(str, str3);
        boolean d2 = d(str2, str4);
        boolean d3 = d(str3, null);
        boolean d4 = d(str4, null);
        if (d || d2 || d3 || d4) {
            List m = ((ctwb) bdsvVar.c.b()).m();
            ArrayList arrayList = new ArrayList(ffdx.n(m, 10));
            Iterator it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(bdsvVar.c(((ctwi) it.next()).p()));
            }
            ArrayList arrayList2 = new ArrayList(ffdx.n(m, 10));
            Iterator it2 = m.iterator();
            while (it2.hasNext()) {
                arrayList2.add(bdsvVar.c(((ctwi) it2.next()).s()));
            }
            int i2 = i & 64;
            ctvf c = bdsvVar.c(((ctwb) bdsvVar.c.b()).g().s());
            ctvf c2 = bdsvVar.c(((ctwb) bdsvVar.c.b()).g().r());
            bdsq bdsqVar = bdsr.a;
            bdsr a = bdsq.a(str, str2, str3, str4, c, c2, arrayList2, arrayList, bdsvVar.b, 2752);
            boolean N = dizg.N();
            Boolean bool = (Boolean) ((cfup) bdrs.b.get()).e();
            ensz enszVar = (ensz) bdsvVar.a.j();
            ensy ensyVar = i2 != 0 ? ensy.FULL : ensy.NONE;
            int i3 = i & 512;
            int i4 = i & 128;
            boolean z3 = (i & 256) == 0;
            boolean z4 = i4 == 0;
            String str6 = i3 == 0 ? str5 : null;
            boolean z5 = z3 & z2;
            enszVar.aa(ensyVar);
            enszVar.P("Destination mutation found during participant update: originalNormalizedDestination = [%s], originalSendDestination = [%s], updatedNormalizedDestination = [%s], updatedSendDestination = [%s], expectedNormalizedDestination = [%s], expectedSendDestination = [%s], localeCountryCode = [%s], deviceCountryCodeDeprecated = [%s], simCountryCodes = [%s], networkCountryCodes = [%s]roamingFixFlag = [%s], deviceCountryCode = [%s], settingsCountryCode = [%s], stopUpdatesFlag = [%s], blockedSendDestinationUpdate = [%s], blockedNormalizedDestinationUpdate = [%s], updateSource = [%s], ", a(a.d), a(a.e), a(a.f), a(a.g), a(a.h), a(a.i), a(a.j), a(a.l), a(a.n.toString()), a(a.o.toString()), e(String.valueOf(N)), a(String.valueOf(a.k)), a(String.valueOf(a.m)), e(bool.toString()), e(String.valueOf(z4 & z)), e(String.valueOf(z5)), e(str6));
        }
    }

    private final ctvf c(String str) {
        if (str != null) {
            if (true == ffpc.J(str)) {
                str = null;
            }
            if (str != null) {
                ctvb g = ((ctwb) this.c.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ctvf c = g.c(upperCase);
                ctvf ctvfVar = true != c.a() ? c : null;
                if (ctvfVar != null) {
                    return ctvfVar;
                }
            }
        }
        return new ctvf(0);
    }

    private static final boolean d(String str, String str2) {
        return (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0 || ffkj.e(str, str2)) ? false : true;
    }

    private static final evhq e(String str) {
        evhp evhpVar = evhp.NO_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new evhq(evhpVar, str);
    }
}

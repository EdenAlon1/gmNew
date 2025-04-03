package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesr extends ceut {
    static final cfup a = cfvl.e(cfvl.b, "cms_update_telephony_timestamp_max_retries", Alert.DURATION_SHOW_INDEFINITELY);
    public static final cskc b = cskc.g("BugleCms", "UpdateTimestampInTelephonyHandler");
    private final errl c;
    private final ejtr d;
    private final ffbr e;

    public cesr(errl errlVar, ejtr ejtrVar, ffbr ffbrVar) {
        this.c = errlVar;
        this.d = ejtrVar;
        this.e = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) a.e()).intValue());
        l.b(cevc.WAKELOCK);
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateTimestampInTelephonyHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cest.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cest cestVar = (cest) eyhsVar;
        String str = cestVar.b;
        long j = cestVar.d;
        int i = cestVar.c;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        char c2 = c != 0 ? c : (char) 1;
        long j2 = c2 == 4 ? j / 1000 : j;
        if (j == 0 || j2 == 0 || str.isEmpty()) {
            if (j2 == 0) {
                ((akzt) this.e.b()).c(c2 == 4 ? "Bugle.Cms.UpdateTimestampInTelephonyHandler.TimestampIsZero.Mms.Counts" : "Bugle.Cms.UpdateTimestampInTelephonyHandler.TimestampIsZero.Sms.Counts");
            }
            return elfo.e(ceyt.i());
        }
        final Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(j2);
        contentValues.put("date", valueOf);
        contentValues.put("date_sent", valueOf);
        return elfl.g(this.d.h(parse, contentValues, null)).h(new emwl() { // from class: cesp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cesr.b;
                int intValue = ((Integer) obj).intValue();
                Uri uri = parse;
                if (intValue > 0) {
                    csjb c3 = cesr.b.c();
                    c3.I("Telephony message timestamp updated");
                    c3.A("Telephony uri", uri);
                    c3.r();
                    return ceyt.i();
                }
                csjb e = cesr.b.e();
                e.I("Failed to update Telephony message timestamp");
                e.A("Telephony uri", uri);
                e.r();
                return ceyt.k();
            }
        }, this.c).e(Throwable.class, new emwl() { // from class: cesq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th instanceof ejnk) {
                    cesr.b.o("Failed to update Telephony timestamp: No matching provider", th);
                    return ceyt.k();
                }
                cesr.b.o("Failed to update Telephony timestamp", th);
                return ceyt.m();
            }
        }, this.c);
    }
}

package defpackage;

import android.app.Notification;
import com.google.android.apps.messaging.R;
import defpackage.cdrr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrw {
    public static final cdwo a(cdwi cdwiVar, cdrr cdrrVar, int i, boolean z) {
        eyhz parserForType = ccck.a.getParserForType();
        parserForType.getClass();
        int intValue = ((Number) csgj.e.e()).intValue() + 1;
        poh pohVar = new poh();
        pohVar.c(i);
        pohVar.c = z;
        poj a = pohVar.a();
        poa poaVar = poa.EXPONENTIAL;
        long longValue = ((Number) cdwo.b.e()).longValue();
        cevc cevcVar = cevc.WORKMANAGER_ONLY;
        Optional empty = Optional.empty();
        cdwt cdwtVar = new cdwt();
        cfyt cfytVar = cdwiVar.e;
        asjt asjtVar = cdwiVar.g;
        babm babmVar = cdwiVar.f;
        return new cdwo(cdwiVar.b, a, cdwiVar.a, cdwtVar, cdvy.class, babmVar, cdrrVar, cdrr.a.class, parserForType, poaVar, asjtVar, intValue, longValue, cevcVar, empty, null, cfytVar);
    }

    public static final cdwo b(cdwi cdwiVar, cdrr cdrrVar, int i, boolean z, ccll ccllVar) {
        eyhz parserForType = ccck.a.getParserForType();
        parserForType.getClass();
        int intValue = ((Number) csgj.e.e()).intValue() + 1;
        poh pohVar = new poh();
        pohVar.c(i);
        pohVar.c = z;
        poj a = pohVar.a();
        cevc cevcVar = cevc.FOREGROUND_SERVICE;
        Optional of = Optional.of(1);
        String string = ccllVar.b.getString(R.string.cms_media_backup_foreground_notification_text);
        string.getClass();
        Notification a2 = ((cins) ccllVar.c.b()).a(string);
        if (a2 == null) {
            ensk j = ccll.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMediaBackupForegroundNotification", "getCmsMediaBackupNotification", 61, "CmsMediaBackupForegroundNotification.kt")).t("%s Cms media backup notification is null!", "CmsMediaBackupForegroundNotification:");
        }
        poa poaVar = poa.EXPONENTIAL;
        long longValue = ((Number) cdwo.b.e()).longValue();
        return new cdwo(cdwiVar.b, a, cdwiVar.a, new cdwt(), cdvy.class, cdwiVar.f, cdrrVar, cdrr.a.class, parserForType, poaVar, cdwiVar.g, intValue, longValue, cevcVar, of, a2, cdwiVar.e);
    }
}

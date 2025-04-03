package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csze {
    public static final cskc a = cskc.g("Bugle", "BugleSurveyClient");
    public static final emyl b = cfvl.x(183538828, "hats_next_survey_client_logging");
    public final ffbr c;
    public final cszz d;

    public csze(cszz cszzVar, ffbr ffbrVar) {
        this.d = cszzVar;
        this.c = ffbrVar;
    }

    public final void a(Context context) {
        try {
            eldl.p(context, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(context.getPackageName())))));
        } catch (ActivityNotFoundException e) {
            csjy.f("BugleHappinessTracking", "Unable to launch play store rating. ".concat(e.toString()));
        }
    }
}

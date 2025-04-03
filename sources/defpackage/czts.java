package defpackage;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czts {
    public static final czts a = new czts();

    private czts() {
    }

    public static final Intent a(String str, Long l, Long l2) {
        Uri.Builder buildUpon = ffkj.e(str, "android.intent.action.VIEW") ? CalendarContract.CONTENT_URI.buildUpon() : CalendarContract.Events.CONTENT_URI.buildUpon();
        Intent intent = new Intent(str);
        if (l != null) {
            if (ffkj.e(str, "android.intent.action.VIEW")) {
                buildUpon.appendPath("time");
                ContentUris.appendId(buildUpon, l.longValue()).getClass();
            } else {
                intent.putExtra("beginTime", l.longValue());
                if (l2 != null) {
                    intent.putExtra("endTime", l2.longValue());
                }
            }
        }
        intent.setData(buildUpon.build());
        return intent;
    }

    public static /* synthetic */ Intent b(String str, Long l) {
        return a(str, l, null);
    }

    public static final Intent c(fcfy fcfyVar, String str) {
        Uri.Builder buildUpon = ffkj.e(str, "android.intent.action.VIEW") ? CalendarContract.CONTENT_URI.buildUpon() : CalendarContract.Events.CONTENT_URI.buildUpon();
        Intent intent = new Intent(str);
        if (fcfyVar == null) {
            intent.setData(buildUpon.build());
            return intent;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = fcfyVar.b;
        boolean z = (i & 2) != 0;
        int i2 = i & 1;
        if (z && i2 != 0) {
            calendar.getClass();
            faun faunVar = fcfyVar.c;
            if (faunVar == null) {
                faunVar = faun.a;
            }
            faunVar.getClass();
            cztt.a(calendar, faunVar);
            fava favaVar = fcfyVar.d;
            if (favaVar == null) {
                favaVar = fava.a;
            }
            favaVar.getClass();
            cztt.b(calendar, favaVar);
        } else if (z) {
            calendar.getClass();
            fava favaVar2 = fcfyVar.d;
            if (favaVar2 == null) {
                favaVar2 = fava.a;
            }
            favaVar2.getClass();
            cztt.b(calendar, favaVar2);
        } else if (i2 != 0) {
            calendar.clear();
            calendar.getClass();
            faun faunVar2 = fcfyVar.c;
            if (faunVar2 == null) {
                faunVar2 = faun.a;
            }
            faunVar2.getClass();
            cztt.a(calendar, faunVar2);
        }
        return b(str, Long.valueOf(calendar.getTimeInMillis()));
    }
}

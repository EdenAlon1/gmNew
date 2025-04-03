package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzu {
    public static String a(eyja eyjaVar) {
        Date date = new Date(eykm.b(eyjaVar));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return dateTimeInstance.format(date);
    }
}

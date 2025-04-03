package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coxb {
    private final cqoh g;
    private final coxk h;
    private final ffbr i;
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage");
    private static final coxa e = new coxa(1, 109);
    private static final Pattern f = Pattern.compile("([1-9]+\\d*)(w|m|y)");
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public static final long b = TimeUnit.DAYS.toMillis(30);
    public static final long c = TimeUnit.DAYS.toMillis(365);

    public coxb(cqoh cqohVar, coxk coxkVar, ffbr ffbrVar) {
        this.g = cqohVar;
        this.h = coxkVar;
        this.i = ffbrVar;
    }

    public final coxa a() {
        Matcher matcher = f.matcher("1m");
        try {
            if (matcher.matches()) {
                return new coxa(Integer.parseInt(matcher.group(1)), matcher.group(2).charAt(0));
            }
        } catch (NumberFormatException unused) {
        }
        ensk i = d.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "parseMessageRetainingDuration", 88, "SmsReleaseStorage.java")).t("SmsAutoDelete: invalid duration %s", "1m");
        return e;
    }

    public final String b(Context context, coxa coxaVar) {
        Resources resources = context.getResources();
        int i = coxaVar.b;
        if (i == 109) {
            int i2 = coxaVar.a;
            return resources.getQuantityString(R.plurals.month_count, i2, Integer.valueOf(i2));
        }
        if (i == 119) {
            int i3 = coxaVar.a;
            return resources.getQuantityString(R.plurals.week_count, i3, Integer.valueOf(i3));
        }
        if (i != 121) {
            throw new IllegalArgumentException(a.h(i, "SmsAutoDelete: invalid duration unit "));
        }
        int i4 = coxaVar.a;
        return resources.getQuantityString(R.plurals.year_count, i4, Integer.valueOf(i4));
    }

    public final void c(int i, long j) {
        if (i == 0) {
            ensk e2 = d.e();
            e2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 139, "SmsReleaseStorage.java")).q("SmsStorageStatusManager: delete media messages");
            this.h.aj();
            return;
        }
        long epochMilli = this.g.f().toEpochMilli() - j;
        ensk e3 = d.e();
        e3.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 149, "SmsReleaseStorage.java")).q("SmsStorageStatusManager:delete old messages");
        if (this.h.b(epochMilli) > 0) {
            ((coxg) this.i.b()).l(eqqh.SMS_RELEASE_STORAGE);
        }
    }
}

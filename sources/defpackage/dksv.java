package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksv {
    private final Context a;
    private final dkpp b;

    public dksv(Context context, dkpp dkppVar) {
        this.a = context;
        this.b = dkppVar;
    }

    private static String c(String str) {
        return str == null ? "" : str.replace(' ', '_');
    }

    public final String a() {
        String str;
        if (!ctid.d) {
            return "";
        }
        dkpp dkppVar = this.b;
        cosz d = dkppVar.d();
        StringBuilder sb = new StringBuilder(d == null ? (String) dkppVar.i.d() : d.i);
        sb.append(" ");
        sb.append(c(Build.ID));
        sb.append(" ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        sb.append(simpleDateFormat.format(DesugarDate.from(Instant.now())));
        sb.append(" Android ");
        str = Build.VERSION.RELEASE_OR_CODENAME;
        sb.append(c(str));
        sb.append(" ");
        sb.append(c(Build.DEVICE));
        sb.append(" 3gpp-gba");
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder("IM-client/OMA1.0 ");
        sb.append(c(Build.MANUFACTURER));
        sb.append("/");
        sb.append(c(Build.MODEL));
        sb.append("-");
        sb.append(c(Build.VERSION.RELEASE));
        sb.append(" ");
        sb.append(c("Goog"));
        sb.append("/");
        Context context = this.a;
        sb.append(c(dkvy.e(context, dkvy.a(context), 2)));
        return sb.toString();
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqht {
    public static final effy a(Context context, efgc efgcVar, eyhs eyhsVar, String str, String str2) {
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f(str);
        efbrVar.g(str2.concat(".pb"));
        Uri a = efbrVar.a();
        effz h = efga.h();
        h.f(a);
        h.e(eyhsVar);
        return efgcVar.a(h.a());
    }
}

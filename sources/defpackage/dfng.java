package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfng implements dfme {
    public static final Charset a = Charset.forName("UTF-8");
    public static final ecwh b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        dfqt dfqtVar = dhkk.a;
        ecwh ecwhVar = new ecwh(ecvd.a("com.google.android.gms.clearcut.public"));
        if (ecwhVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        b = new ecwh(ecwhVar.a, ecwhVar.b, "gms:playlog:service:samplingrules_", ecwhVar.d, false, ecwhVar.f, ecwhVar.g).d("LogSamplingRulesV2__");
        c = new ConcurrentHashMap();
        d = null;
        e = null;
    }

    public dfng(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            ecwj.f(applicationContext);
        }
    }
}

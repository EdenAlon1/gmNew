package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aver {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator");
    public static final aveo b = new aveo("rbm.goog");
    public final CronetEngine c;
    public final errl d;
    public final ctvb e;
    public final Context f;
    public final ezgw g;

    public aver(CronetEngine cronetEngine, errl errlVar, ctvb ctvbVar, Context context, ezgw ezgwVar) {
        this.c = cronetEngine;
        this.d = errlVar;
        this.e = ctvbVar;
        this.f = context;
        this.g = ezgwVar;
    }

    static String a(String str) {
        return str.trim().replace("tel:", "");
    }
}

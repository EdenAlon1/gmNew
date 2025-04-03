package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csjh {
    public static String a(Context context, long j) {
        long round = Math.round(j / 1000.0f);
        return String.format(kqt.a(context.getResources().getConfiguration()).f(0), "%d:%02d", Long.valueOf(round / 60), Long.valueOf(round % 60));
    }
}

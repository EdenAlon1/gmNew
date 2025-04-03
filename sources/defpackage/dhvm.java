package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvm {

    @Deprecated
    public static final dfqt a;
    private static final dfqs b;
    private static final dfqj c;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dhvj dhvjVar = new dhvj();
        c = dhvjVar;
        a = new dfqt("UsageReporting.API", dhvjVar, dfqsVar);
    }

    public static dhvo a(Context context) {
        return new dhvg(context, new dhvl());
    }
}

package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkv {
    public final dfld a;
    public final String b;
    public CopyOnWriteArrayList c;

    public efkv(Context context, String str) {
        this(new dfld(context, str, null), str);
    }

    public efkv(dfld dfldVar, String str) {
        this.c = new CopyOnWriteArrayList();
        if (!str.startsWith("STREAMZ_")) {
            throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
        }
        this.a = dfldVar;
        this.b = str;
    }
}

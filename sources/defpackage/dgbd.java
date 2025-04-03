package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbd {
    public final Context a;
    public final dgbk b;
    public final Handler c;

    public dgbd(Context context) {
        this.a = context;
        this.b = dgbk.a(context);
        this.c = new dgxx(context.getMainLooper());
    }
}

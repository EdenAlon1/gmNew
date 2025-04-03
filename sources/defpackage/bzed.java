package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzed {
    public final ffbr a;
    public akxl b;
    public dfld c;
    public dfld d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Context f;
    public final ffbr g;

    public bzed(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.f = context;
        this.g = ffbrVar;
        this.a = ffbrVar2;
    }

    public static int b(String str) {
        if (str == null || str.length() == 0) {
            return 1;
        }
        return str.startsWith("+") ? 2 : 3;
    }

    public final boolean a() {
        return this.e.get();
    }

    public final dfld c(int i) {
        return (i == 2 || i == 4) ? this.c : this.d;
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efez {
    public Context a;
    public eroh b;
    public String c;
    public Handler d;
    public final emyl e = new emyr(10);
    public final TimeUnit f = TimeUnit.SECONDS;
    public final emyl g = new emyr(false);

    public final void a() {
        this.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
    }

    public final void b(Context context) {
        this.a = context.getApplicationContext();
    }
}

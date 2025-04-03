package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akne {
    private final Context a;
    private final ffbr b;

    public akne(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    public final void a(Intent intent) {
        if (((adaq) this.b.b()).a()) {
            b(intent);
        }
    }

    public final void b(Intent intent) {
        if (((adaq) this.b.b()).b()) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(akng.a);
            this.a.sendBroadcast(intent2);
            for (ComponentName componentName : akng.b) {
                Intent intent3 = new Intent(intent2);
                intent3.setComponent(componentName);
                this.a.sendBroadcast(intent3);
            }
        }
    }
}

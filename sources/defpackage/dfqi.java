package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfqi extends Exception {
    private final Intent a;

    public dfqi(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        return new Intent(this.a);
    }
}

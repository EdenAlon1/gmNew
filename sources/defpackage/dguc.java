package defpackage;

import android.os.Bundle;
import com.google.android.gms.learning.InAppTrainerOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dguc {
    private String a;
    private int b;
    private boolean c;
    private String d;
    private final byte[] e = new byte[0];

    public final InAppTrainerOptions a() {
        return new InAppTrainerOptions(this.a, this.b, this.c, this.d, 0, null, null, 0L, null, null, this.e, null, Bundle.EMPTY, null);
    }

    public final void b(String str) {
        str.getClass();
        emxf.a(!str.isEmpty());
        this.d = str;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(String str) {
        str.getClass();
        emxf.a(!str.isEmpty());
        this.a = str;
    }
}

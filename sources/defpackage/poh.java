package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class poh {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private qad g = new qad((byte[]) null);
    private int i = 1;
    public long e = -1;
    public long f = -1;
    private final Set h = new LinkedHashSet();

    public final poj a() {
        Set ar = ffdx.ar(this.h);
        return new poj(this.g, this.i, this.a, this.b, this.c, this.d, this.e, this.f, ar);
    }

    public final void b(Uri uri, boolean z) {
        uri.getClass();
        this.h.add(new poi(uri, z));
    }

    public final void c(int i) {
        this.i = i;
        this.g = new qad((byte[]) null);
    }
}

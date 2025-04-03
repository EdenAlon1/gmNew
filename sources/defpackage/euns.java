package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euns {
    private boolean a = faxj.a.b;
    private final int b;
    private final String c;
    private final Bundle d;

    public euns() {
        faxj faxjVar = faxj.a;
        this.b = faxjVar.c;
        this.c = faxjVar.d;
        this.d = new Bundle();
    }

    public final eupg a() {
        return new eupg(this.a, this.b, this.c, this.d, null);
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        dfwv.b(true, "The scope of this indexable is not valid, scope value is 1.");
        this.d.putLongArray("scope", new long[]{1});
    }
}

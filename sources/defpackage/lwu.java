package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwu {
    public Uri a;
    public int b;
    public byte[] c;
    public Map d;
    public long e;
    public int f;

    public lwu(lwv lwvVar) {
        this.a = lwvVar.a;
        this.b = lwvVar.b;
        this.c = lwvVar.c;
        this.d = lwvVar.d;
        this.e = lwvVar.e;
        this.f = lwvVar.g;
    }

    public final lwv a() {
        lti.h(this.a, "The uri must be set.");
        return new lwv(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(String str) {
        this.a = Uri.parse(str);
    }

    public lwu() {
        this.b = 1;
        this.d = Collections.EMPTY_MAP;
    }
}

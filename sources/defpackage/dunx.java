package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dunx {
    private final long a;
    final String b;
    private final int c;

    public dunx(String str, int i, long j) {
        this.b = str;
        this.c = i;
        this.a = j;
    }

    final void a(emwz emwzVar) {
        emwzVar.a(this.b);
        emwzVar.a(new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(this.a)));
        emwzVar.f("queueSize", this.c);
    }
}

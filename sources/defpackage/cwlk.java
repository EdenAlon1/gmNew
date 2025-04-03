package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwlk {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public cwlk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.d = ffbrVar3;
        this.b = ffbrVar4;
    }

    public final void a(boolean z) {
        crln crlnVar = (crln) this.d.b();
        crlnVar.c();
        crlnVar.d(new Date(((cqoh) this.c.b()).f().toEpochMilli()));
        crlnVar.e(z);
    }
}

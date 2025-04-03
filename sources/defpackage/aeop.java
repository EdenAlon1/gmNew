package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeop {
    private final ffbr a;
    private final ffbr b;

    public aeop(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final aeoo a(String str) {
        Context context = (Context) this.a.b();
        errl errlVar = (errl) this.b.b();
        errlVar.getClass();
        return new aeoo(context, errlVar, str);
    }
}

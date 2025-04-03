package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgz {
    public final lhi a;
    public final char[] b;
    public final lgy c = new lgy(1024);
    public final Typeface d;

    public lgz(Typeface typeface, lhi lhiVar) {
        this.d = typeface;
        this.a = lhiVar;
        int a = lhiVar.a();
        this.b = new char[a + a];
        int a2 = lhiVar.a();
        for (int i = 0; i < a2; i++) {
            lhc lhcVar = new lhc(this, i);
            Character.toChars(lhcVar.e(), this.b, i + i);
            ksw.b(lhcVar.b() > 0, "invalid metadata codepoint length");
            this.c.b(lhcVar, 0, lhcVar.b() - 1);
        }
    }
}

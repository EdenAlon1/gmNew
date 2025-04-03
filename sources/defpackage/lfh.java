package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfh {
    public final ozc a;
    public final char[] b;
    public final lfg c;
    public final Typeface d;

    lfh() {
        this.d = Typeface.DEFAULT;
        this.a = null;
        this.c = new lfg(1024);
        this.b = new char[0];
    }

    public lfh(Typeface typeface, ozc ozcVar) {
        this.d = typeface;
        this.a = ozcVar;
        this.c = new lfg(1024);
        int a = ozcVar.a();
        this.b = new char[a + a];
        int a2 = ozcVar.a();
        for (int i = 0; i < a2; i++) {
            lex lexVar = new lex(this, i);
            Character.toChars(lexVar.c(), this.b, i + i);
            ksw.b(lexVar.b() > 0, "invalid metadata codepoint length");
            this.c.b(lexVar, 0, lexVar.b() - 1);
        }
    }
}

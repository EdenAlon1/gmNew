package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffoq implements ffnl {
    public final CharSequence a;
    public final int b;
    public final ffjm c;

    public ffoq(CharSequence charSequence, int i, ffjm ffjmVar) {
        this.a = charSequence;
        this.b = i;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffop(this);
    }
}

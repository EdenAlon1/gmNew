package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiua implements fiuq, fiuo {
    private final String a;

    public fiua(String str) {
        this.a = str;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        return fiuh.d(charSequence, i, this.a) ? i + this.a.length() : ~i;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        appendable.append(this.a);
    }
}

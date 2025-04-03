package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiug extends fity {
    public fiug(firf firfVar, int i, boolean z) {
        super(firfVar, i, z);
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        try {
            fium.d(appendable, this.a.a(firbVar).a(j));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}

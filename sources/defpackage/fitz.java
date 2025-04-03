package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fitz extends fity {
    protected final int d;

    protected fitz(firf firfVar, int i, boolean z, int i2) {
        super(firfVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        try {
            fium.b(appendable, this.a.a(firbVar).a(j), this.d);
        } catch (RuntimeException unused) {
            fiuh.b(appendable, this.d);
        }
    }
}

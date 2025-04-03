package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebtp implements qud {
    private final ebtf a;
    private final int b;
    private final ebtq c;

    public ebtp(ebtf ebtfVar, ebtq ebtqVar, int i) {
        this.a = ebtfVar;
        this.c = ebtqVar;
        this.b = i;
    }

    @Override // defpackage.qud
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.MEMORY_CACHE;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        qucVar.c(this.a.a(this.c.b(), this.b));
    }

    @Override // defpackage.qud
    public final void d() {
    }

    @Override // defpackage.qud
    public final void e() {
    }
}

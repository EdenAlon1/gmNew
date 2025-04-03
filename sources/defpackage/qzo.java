package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qzo implements qud {
    private final Resources.Theme a;
    private final Resources b;
    private final qzp c;
    private final int d;
    private Object e;

    public qzo(Resources.Theme theme, Resources resources, qzp qzpVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = qzpVar;
        this.d = i;
    }

    @Override // defpackage.qud
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.qud
    public final void e() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        try {
            Object c = this.c.c(this.a, this.b, this.d);
            this.e = c;
            qucVar.c(c);
        } catch (Resources.NotFoundException e) {
            qucVar.f(e);
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }
}

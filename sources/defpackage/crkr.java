package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crkr implements qud {
    private final ffbr a;
    private final Executor b;
    private final emhv c;

    public crkr(ffbr ffbrVar, Executor executor, emhv emhvVar) {
        this.a = ffbrVar;
        this.b = executor;
        this.c = emhvVar;
    }

    @Override // defpackage.qud
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, final quc qucVar) {
        qqeVar.getClass();
        erph c = ((emmt) this.a.b()).c(this.c);
        final ffji ffjiVar = new ffji() { // from class: crkp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                quc qucVar2 = quc.this;
                try {
                    qucVar2.c(((erpf) obj).a());
                } catch (Exception e) {
                    qucVar2.f(e);
                }
                return ffcu.a;
            }
        };
        c.m(new erpg() { // from class: crkq
            @Override // defpackage.erpg
            public final void a(erpf erpfVar) {
                ffji.this.invoke(erpfVar);
            }
        }, this.b);
    }

    @Override // defpackage.qud
    public final void d() {
    }

    @Override // defpackage.qud
    public final void e() {
    }
}

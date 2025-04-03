package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkf implements aqge {
    public final ffjm a;
    private final aqkd b;
    private final arak c;

    public aqkf(aqkd aqkdVar, ffjm ffjmVar, arak arakVar) {
        aqkdVar.getClass();
        this.b = aqkdVar;
        this.a = ffjmVar;
        this.c = arakVar;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        final aqke aqkeVar = new aqke(this, aqgdVar);
        final aqkd aqkdVar = this.b;
        synchronized (aqkdVar.a) {
            aqkdVar.a.add(aqkeVar);
            if (aqkdVar.a.size() == 1) {
                aqkdVar.c.L(aqkdVar.b);
                aqkdVar.e.L(aqkdVar.d);
            }
        }
        return new ctbx() { // from class: aqka
            @Override // defpackage.ctbx
            public final void a() {
                aqkd aqkdVar2 = aqkd.this;
                List list = aqkdVar2.a;
                aqke aqkeVar2 = aqkeVar;
                synchronized (list) {
                    aqkdVar2.a.remove(aqkeVar2);
                    if (aqkdVar2.a.isEmpty()) {
                        aqkdVar2.c.P(aqkdVar2.b);
                        aqkdVar2.e.P(aqkdVar2.d);
                    }
                }
            }

            @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                ctbw.a(this);
            }
        };
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.c.c();
    }

    @Override // defpackage.aqge
    public final Object c() {
        return this.c.d();
    }
}

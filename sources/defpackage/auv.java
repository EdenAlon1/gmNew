package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auv extends aug {
    final WeakReference b;

    public auv(avr avrVar, auw auwVar) {
        super(avrVar);
        this.b = new WeakReference(auwVar);
        g(new auf() { // from class: aut
            @Override // defpackage.auf
            public final void k(avr avrVar2) {
                final auw auwVar2 = (auw) auv.this.b.get();
                if (auwVar2 != null) {
                    auwVar2.n.execute(new Runnable() { // from class: auu
                        @Override // java.lang.Runnable
                        public final void run() {
                            auw auwVar3 = auw.this;
                            synchronized (auwVar3.o) {
                                auwVar3.q = null;
                                avr avrVar3 = auwVar3.p;
                                if (avrVar3 != null) {
                                    auwVar3.p = null;
                                    auwVar3.e(avrVar3);
                                }
                            }
                        }
                    });
                }
            }
        });
    }
}

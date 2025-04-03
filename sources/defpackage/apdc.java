package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdc implements aptb {
    private final btsz a;
    private final apue b;

    public apdc(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        btta b = bttf.b();
        b.z("MessageAnnotationChangeObserver");
        btsz b2 = b.b();
        this.a = b2;
        this.b = apucVar.a("MessageAnnotationChangeObserver", b2, new apud() { // from class: apdb
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apdn(dtuu.this, new ffji() { // from class: apda
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        engw engwVar = (engw) obj;
                        engwVar.getClass();
                        Consumer.this.o(engwVar);
                        return ffcu.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.aptb
    public final apta a() {
        return this.b.a();
    }

    @Override // defpackage.aptb
    public final ctbx b(alyd alydVar) {
        return this.b.b(alydVar);
    }
}

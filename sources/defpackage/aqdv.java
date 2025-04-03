package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqdv implements aptb {
    private final bvhc a;
    private final apue b;

    public aqdv(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        bvhd a = bvhn.a();
        a.z("SuggestionShortcutChangeObserver");
        bvhc b = a.b();
        this.a = b;
        this.b = apucVar.a("SuggestionShortcutChangeObserver", b, new apud() { // from class: aqdt
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new aqeg(dtuu.this, new ffji() { // from class: aqdu
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

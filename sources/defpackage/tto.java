package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tto {
    private final ttv a;

    public tto(ffbr ffbrVar, Executor executor) {
        ffbrVar.getClass();
        executor.getClass();
        this.a = new ttv(ffbrVar, new ttr(eolt.BUGLE_ADD_CONTACT), executor);
    }

    public final void a(final int i) {
        if (i == 0) {
            throw null;
        }
        this.a.b(new ffji() { // from class: ttn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eogx eogxVar = (eogx) obj;
                eogxVar.getClass();
                eogxVar.a(i);
                eogxVar.b(3);
                return ffcu.a;
            }
        });
    }
}

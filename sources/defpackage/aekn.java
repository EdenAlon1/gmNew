package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aekn {
    public static void a(aeko aekoVar, lkk lkkVar, ejvp ejvpVar) {
        byzz.b((aqge) aekoVar.d().b(), aekoVar.e(), lkkVar, ejvpVar);
    }

    public static void b(aeko aekoVar, ejwl ejwlVar, byzz byzzVar, aeix aeixVar, final AtomicBoolean atomicBoolean) {
        final fazb d = aekoVar.d();
        final aekk b = aekoVar.b();
        ejwlVar.b(new ejuy(byzzVar.a, new eros() { // from class: byzw
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(!atomicBoolean.get() ? elfo.e(b) : ((aqge) fazb.this.b()).b());
            }
        }, aekoVar.e()), aekoVar.c(aeixVar));
    }
}

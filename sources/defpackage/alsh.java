package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alsh {
    public final ecrj a;

    public alsh(ecrj ecrjVar) {
        this.a = ecrjVar;
    }

    public final elfl a(final ecri ecriVar, elfl elflVar, final ecda ecdaVar) {
        return elflVar.h(new emwl() { // from class: alsf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                alsh.this.a.f(ecriVar, ecdaVar, null, ecrh.SUCCESS);
                return obj;
            }
        }, erpp.a).f(Throwable.class, new eroh() { // from class: alsg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                alsh.this.a.f(ecriVar, ecdaVar, null, ecrh.ERROR);
                return elfo.d((Throwable) obj);
            }
        }, erpp.a);
    }
}

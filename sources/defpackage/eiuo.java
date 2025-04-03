package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiuo implements eiuz {
    private final eiyk a;

    public eiuo(eiyk eiykVar) {
        this.a = eiykVar;
    }

    @Override // defpackage.eiuz
    public final ListenableFuture a(eisx eisxVar, eiva eivaVar) {
        return erny.f(ernq.f(this.a.h(eisxVar), IllegalArgumentException.class, eldl.a(new emwl() { // from class: eiul
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new eiuq();
            }
        }), erpp.a), eldl.a(new emwl() { // from class: eium
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eixm.d();
                }
                throw new eiuq();
            }
        }), erpp.a);
    }
}

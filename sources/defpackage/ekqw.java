package defpackage;

import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqw {
    public final ekql a;
    private final ffsk b;

    public ekqw(ekql ekqlVar, ffsk ffskVar) {
        ekqlVar.getClass();
        ffskVar.getClass();
        this.a = ekqlVar;
        this.b = ffskVar;
    }

    public final lap a(final ekqu ekquVar) {
        eyfc a = eyfc.a();
        a.getClass();
        ekqq ekqqVar = (ekqq) ekquVar;
        lcv lcvVar = new lcv(ekqqVar.c, a);
        Optional optional = ekqqVar.e;
        optional.getClass();
        ldq ldqVar = (ldq) fflm.b(optional);
        engw engwVar = ekqqVar.b;
        engwVar.getClass();
        return laq.a(lcvVar, ldqVar, engwVar, this.b, new ffix() { // from class: ekqv
            @Override // defpackage.ffix
            public final Object invoke() {
                ekqq ekqqVar2 = (ekqq) ekquVar;
                return new File(ekqw.this.a.b(ekqqVar2.d), ekqqVar2.a.concat(".pb"));
            }
        });
    }
}

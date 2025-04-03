package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulj implements dqlv {
    private final /* synthetic */ uls a;
    private final alcb b;
    private final uco c;
    private final Supplier d;

    public ulj(alcb alcbVar, final uco ucoVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: uli
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ufo ufoVar = (ufo) obj;
                ufoVar.getClass();
                return uco.this.a(ufoVar, ulm.a());
            }
        });
        this.b = alcbVar;
        this.c = ucoVar;
        this.d = supplier;
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        ufo ufoVar = (ufo) doxsVar;
        MessagePartCoreData a = this.c.a(ufoVar, ulm.a());
        obj = this.d.get();
        ugl uglVar = (ugl) obj;
        if (uglVar.e().b()) {
            uglVar.f(a);
        } else {
            uglVar.g(ufoVar.m());
        }
        this.b.g(a.O(), -1);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((ufo) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((ufo) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}

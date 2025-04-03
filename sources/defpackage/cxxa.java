package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxxa implements ejwd<acmd> {
    final /* synthetic */ fazb a;
    final /* synthetic */ cxwp b;

    public cxxa(fazb fazbVar, cxwp cxwpVar) {
        this.a = fazbVar;
        this.b = cxwpVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((acmd) obj) != acmd.REMOTE) {
            this.b.H().b();
            return;
        }
        Optional optional = (Optional) this.a.b();
        final cxwp cxwpVar = this.b;
        optional.ifPresent(new Consumer() { // from class: cxwz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                ((acio) obj2).d(cxwp.this.fe().getIntent());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.fe().finish();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
    }
}

package defpackage;

import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebpv extends abo {
    final /* synthetic */ ebpx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebpv(ebpx ebpxVar) {
        super(false);
        this.a = ebpxVar;
    }

    @Override // defpackage.abo
    public final void b() {
        ExpressSignInLayout expressSignInLayout = this.a.ak;
        boolean z = false;
        if (expressSignInLayout != null && expressSignInLayout.b()) {
            z = true;
        }
        emxf.b(z, "ExpressSignInLayout has to be initialized to handle back presses");
        this.a.ak.d(new ebqh() { // from class: ebqf
            @Override // defpackage.ebqh
            public final void a(ebrp ebrpVar) {
                if (ebrpVar.b) {
                    ebrpVar.o.b();
                } else {
                    ebrpVar.i();
                    ebrpVar.c();
                }
            }
        });
    }
}

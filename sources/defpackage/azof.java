package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azof extends duak {
    public azof() {
        super("my_identities");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azoe b() {
        ah();
        return new azoe(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean c(azsu azsuVar) {
        String[] strArr = azoi.a;
        azoh azohVar = new azoh();
        azohVar.c(azsuVar);
        return aj(new azog(azohVar), "my_identities-buildAndUpdateForToken");
    }

    public final void d(String str) {
        dtub.u(this.a, "phone_number", str);
    }

    public final void e(String str) {
        int intValue = azoi.c().intValue();
        int intValue2 = azoi.c().intValue();
        if (intValue2 < 60120) {
            dtub.w("display_name", intValue2);
        }
        if (intValue >= 60120) {
            dtub.u(this.a, "display_name", str);
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = azoi.a;
        apply = function.apply(new azoh());
        af(new azog((azoh) apply));
    }
}

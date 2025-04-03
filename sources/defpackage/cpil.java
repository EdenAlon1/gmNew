package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpil {
    private final cpow a;
    private final errl b;

    public cpil(cpow cpowVar, errl errlVar) {
        this.a = cpowVar;
        this.b = errlVar;
    }

    final elfl a(final awwf awwfVar) {
        return this.a.b(awwfVar.c).h(new emwl() { // from class: cpik
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcek fcekVar = (fcek) obj;
                esqg esqgVar = new esqg();
                awui awuiVar = awwf.this.d;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                esqgVar.b(URI.create(awuiVar.d));
                esqgVar.c(fcekVar);
                return esqgVar.a();
            }
        }, this.b);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfd {
    public final comc c;
    public final errl d;
    public final ejvp e;
    public final eixo f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final AtomicReference j;
    private static final ejui k = new ejtz("GAIA_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    public static final ejui a = new ejtz("GAIA_AUTH_ERROR_DATA_SOURCE_KEY");
    public static final ejuj b = new ejtz("GAIA_AUTH_ERROR_NONLOCAL_DATA_SOURCE_KEY");

    public cgfd(comc comcVar, eixo eixoVar, errl errlVar, ejvp ejvpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        new AtomicBoolean(false);
        new AtomicReference();
        this.j = new AtomicReference(ejug.a);
        this.c = comcVar;
        this.f = eixoVar;
        this.e = ejvpVar;
        this.d = errlVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    public final elfl a() {
        return this.c.h().h(new emwl() { // from class: cget
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cgea) obj).e);
            }
        }, erpp.a);
    }

    public final elfl b() {
        return this.c.h().h(new emwl() { // from class: cgek
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((cgea) obj).d);
            }
        }, erpp.a);
    }

    public final elfl c(final boolean z) {
        return this.c.j(new emwl() { // from class: cgeh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = cgfd.a;
                cgdx cgdxVar = (cgdx) ((cgea) obj).toBuilder();
                cgdxVar.copyOnWrite();
                cgea cgeaVar = (cgea) cgdxVar.instance;
                cgeaVar.b |= 64;
                cgeaVar.h = z;
                return (cgea) cgdxVar.build();
            }
        }).h(new emwl() { // from class: cgen
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgfd.this.e();
                return null;
            }
        }, this.d);
    }

    public final elfl d(final cgdz cgdzVar) {
        return this.c.j(new emwl() { // from class: cgem
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = cgfd.a;
                cgdx cgdxVar = (cgdx) ((cgea) obj).toBuilder();
                cgdxVar.copyOnWrite();
                cgea cgeaVar = (cgea) cgdxVar.instance;
                cgeaVar.j = cgdz.this.d;
                cgeaVar.b |= 512;
                return (cgea) cgdxVar.build();
            }
        }).h(new emwl() { // from class: cgeo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgfd.this.e();
                return null;
            }
        }, this.d);
    }

    public final void e() {
        this.e.a(elfo.e(null), k);
    }
}

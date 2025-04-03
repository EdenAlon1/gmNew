package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsz {
    private final fazb a;
    private final errl b;

    public ctsz(fazb fazbVar, errl errlVar) {
        this.a = fazbVar;
        this.b = errlVar;
    }

    public final elfl a() {
        return (stl.a() && ((Boolean) ((cfup) stl.c.get()).e()).booleanValue() && ((Optional) this.a.b()).isPresent()) ? ((ctta) ((Optional) this.a.b()).get()).b().h(new emwl() { // from class: ctsy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ctsx) obj).e);
            }
        }, this.b) : !((Boolean) ((cfup) stl.c.get()).e()).booleanValue() ? elfo.e(true) : elfo.e(false);
    }

    public final elfl b() {
        if (ctjd.f() && ((Optional) this.a.b()).isPresent()) {
            return ((ctta) ((Optional) this.a.b()).get()).b();
        }
        ctsw createBuilder = ctsx.a.createBuilder();
        createBuilder.copyOnWrite();
        ctsx ctsxVar = (ctsx) createBuilder.instance;
        ctsxVar.b |= 1;
        ctsxVar.c = false;
        createBuilder.copyOnWrite();
        ctsx.a((ctsx) createBuilder.instance);
        return elfo.e(createBuilder.build());
    }
}

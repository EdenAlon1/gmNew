package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshr implements cshn {
    private final crtv a;

    public cshr(crtv crtvVar) {
        this.a = crtvVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [comc, java.lang.Object] */
    @Override // defpackage.cshn
    public final void a() {
        crtv crtvVar = this.a;
        if (!crtvVar.c.a.i()) {
            throw new IllegalStateException("Cannot set bnr opt in state when restore starts. Is this called in a transaction?");
        }
        crtvVar.b.i();
        crtvVar.a.S(axeu.ENABLING);
        crtvVar.a.Z(true);
        crtvVar.a.aj(UUID.randomUUID().toString());
        axkm axkmVar = crtvVar.a;
        efbd.b();
        axkmVar.e.get().m(new emwl() { // from class: axje
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= Integer.MIN_VALUE;
                axezVar.D = true;
                return builder.build();
            }
        });
        axkmVar.N();
        crtvVar.a.ap();
        if (((Boolean) ((cfup) csgj.o.get()).e()).booleanValue()) {
            crtvVar.a.ai(true);
        }
    }
}

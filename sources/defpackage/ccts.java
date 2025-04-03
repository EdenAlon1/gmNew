package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccts {
    private final axdf a;
    private final cqoh b;

    public ccts(axdf axdfVar, cqoh cqohVar) {
        this.a = axdfVar;
        this.b = cqohVar;
    }

    public final cejm a(cejm cejmVar) {
        cejl cejlVar = (cejl) cejmVar.toBuilder();
        eyja d = eykm.d(this.b.f().toEpochMilli());
        cejlVar.copyOnWrite();
        cejm cejmVar2 = (cejm) cejlVar.instance;
        d.getClass();
        cejmVar2.g = d;
        cejmVar2.b |= 32;
        return (cejm) cejlVar.build();
    }

    public final void b(ceyt ceytVar, epfi epfiVar, cejm cejmVar) {
        if ((cejmVar.b & 32) != 0) {
            eyja eyjaVar = cejmVar.g;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eyja d = eykm.d(this.b.f().toEpochMilli());
            if (ceytVar.e() && ceytVar.c() == null) {
                this.a.v(epfiVar, eyjaVar, d, 2);
            } else {
                if (ceytVar.e() || ceytVar.f()) {
                    return;
                }
                this.a.v(epfiVar, eyjaVar, d, 3);
            }
        }
    }

    public final void c(epfi epfiVar, cejm cejmVar, int i) {
        if ((cejmVar.b & 32) != 0) {
            axdf axdfVar = this.a;
            eyja eyjaVar = cejmVar.g;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            axdfVar.v(epfiVar, eyjaVar, eykm.d(this.b.f().toEpochMilli()), i);
        }
    }
}

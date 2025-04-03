package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqi extends abo {
    final /* synthetic */ dbqk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbqi(dbqk dbqkVar) {
        super(true);
        this.a = dbqkVar;
    }

    @Override // defpackage.abo
    public final void b() {
        dbqk dbqkVar = this.a;
        if (dbqkVar.b != 2) {
            dbqkVar.d.h(false);
            dbqkVar.e.gE().d();
        } else if (adhu.b() && dbqkVar.p.isPresent()) {
            dbqkVar.c(dbqkVar.p);
        } else {
            dbqkVar.c(Optional.empty());
        }
    }
}

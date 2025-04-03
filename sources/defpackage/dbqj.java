package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbqj implements eivv {
    final /* synthetic */ dbqk a;

    public dbqj(dbqk dbqkVar) {
        this.a = dbqkVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        if (adhu.b()) {
            this.a.p = Optional.of(eivtVar.a());
            dbqk dbqkVar = this.a;
            dbqkVar.b(dbqkVar.p);
        }
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        if (adhu.b()) {
            this.a.p = Optional.empty();
            ((adio) this.a.m.b()).a(eiupVar);
        }
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}

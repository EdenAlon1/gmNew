package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daau implements ejxk {
    final /* synthetic */ daay a;

    public daau(daay daayVar) {
        this.a = daayVar;
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        clys clysVar = (clys) obj;
        this.a.f.set(Optional.of(clysVar));
        daax daaxVar = this.a.a;
        if (daaxVar != null) {
            daaxVar.k(Optional.of(clysVar));
        }
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
    }
}

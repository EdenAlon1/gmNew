package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvyb implements dvza {
    final /* synthetic */ boolean a;

    public dvyb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dvza
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dvxe dvxeVar) {
        dvzb dvzbVar = dvxeVar.f;
        dvzbVar.n(this);
        boolean z = false;
        if (this.a && dvzbVar.o()) {
            z = true;
        }
        if (z) {
            dvzbVar.i();
        }
        dvxeVar.g();
        if (z) {
            dvzbVar.h();
        }
    }
}

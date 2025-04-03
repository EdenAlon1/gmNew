package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbq extends ffkk implements ffix {
    final /* synthetic */ kbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbq(kbs kbsVar) {
        super(0);
        this.a = kbsVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        kbs kbsVar = this.a;
        if (kbsVar.f && kbsVar.isAttachedToWindow()) {
            kbs kbsVar2 = this.a;
            if (kbsVar2.c.getParent() == kbsVar2) {
                ixh j = kbsVar2.j();
                kbs kbsVar3 = this.a;
                j.d(kbsVar3, kbs.a, kbsVar3.e);
            }
        }
        return ffcu.a;
    }
}

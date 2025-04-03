package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhs extends ffkk implements ffix {
    final /* synthetic */ dhw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(dhw dhwVar) {
        super(0);
        this.a = dhwVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        dhw dhwVar = this.a;
        if (dhwVar.j() <= dhwVar.i()) {
            return null;
        }
        int i = ((dhn) this.a.g.a()).a;
        if (dhn.a(1) && !((Boolean) this.a.e.a()).booleanValue()) {
            return null;
        }
        dhw dhwVar2 = this.a;
        return Float.valueOf(dhwVar2.j() + dhwVar2.k());
    }
}

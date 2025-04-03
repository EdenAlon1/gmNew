package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqvx implements ffxy, ffke {
    final /* synthetic */ dqwa a;

    public dqvx(dqwa dqwaVar) {
        this.a = dqwaVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dqwa.class, "onContainerWidthChanged", "onContainerWidthChanged(I)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int intValue = ((Number) obj).intValue();
        Object obj2 = this.a.m;
        dutb dutbVar = obj2 instanceof dutb ? (dutb) obj2 : null;
        if (dutbVar != null) {
            dutbVar.f().f = intValue;
            dutbVar.f().p();
            dutj dutjVar = dutbVar.y;
            if (dutjVar != null) {
                dutjVar.p();
            }
        }
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}

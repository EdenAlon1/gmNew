package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hde extends ffkk implements ffji {
    final /* synthetic */ idh a;
    final /* synthetic */ ibz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hde(idh idhVar, ibz ibzVar) {
        super(1);
        this.a = idhVar;
        this.b = ibzVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hxn hxnVar = (hxn) obj;
        return hxnVar.b(new hdd(this.a.a(hxnVar.a(), hxnVar.q(), hxnVar), this.b));
    }
}

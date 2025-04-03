package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezp extends ffkk implements ffjn {
    final /* synthetic */ ezv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezp(ezv ezvVar) {
        super(3);
        this.a = ezvVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            intValue = this.a.f.b(intValue);
        }
        if (!booleanValue) {
            intValue2 = this.a.f.b(intValue2);
        }
        ezv ezvVar = this.a;
        boolean z = false;
        if (ezvVar.d && (intValue != jpm.e(ezvVar.b.c) || intValue2 != jpm.a(this.a.b.c))) {
            if (Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > this.a.b.b.a()) {
                this.a.g.j();
            } else {
                if (booleanValue || intValue == intValue2) {
                    this.a.g.j();
                } else {
                    this.a.g.i(true);
                }
                ezv ezvVar2 = this.a;
                ezvVar2.c.p.invoke(new jvu(ezvVar2.b.b, jpn.a(intValue, intValue2)));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

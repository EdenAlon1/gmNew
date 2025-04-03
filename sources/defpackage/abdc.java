package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abdc extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ abdj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abdc(abdj abdjVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = abdjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        abdc abdcVar = new abdc(this.c, (ffgu) obj3);
        abdcVar.a = booleanValue;
        abdcVar.b = booleanValue2;
        return abdcVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (!z && z2) {
            this.c.h.isPresent();
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}

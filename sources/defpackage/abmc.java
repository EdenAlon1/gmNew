package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abmc extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ abmg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abmc(abmg abmgVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = abmgVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        abmc abmcVar = new abmc(this.d, (ffgu) obj4);
        abmcVar.a = (aaxe) obj;
        abmcVar.b = (String) obj2;
        abmcVar.c = booleanValue;
        return abmcVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.b != null ? this.d.f : !((aaxe) this.a).a.isEmpty() ? this.d.e : this.d.a(this.c);
    }
}

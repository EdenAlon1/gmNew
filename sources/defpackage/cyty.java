package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyty extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ cytz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyty(cytz cytzVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = cytzVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        cyty cytyVar = new cyty(this.d, (ffgu) obj4);
        cytyVar.a = (alxj) obj;
        cytyVar.b = booleanValue;
        cytyVar.c = (engw) obj3;
        return cytyVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r7 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        String i = r7.i();
        cytz cytzVar = this.d;
        boolean z2 = false;
        if (!((aspy) cytzVar.b.b()).a() && z) {
            z2 = true;
        }
        engw engwVar = (engw) obj2;
        return new cyub(i, cytzVar.b(r7, engwVar, z2), cytz.c(r7, engwVar), new cyua(((auxw) this.d.c.b()).a()));
    }
}

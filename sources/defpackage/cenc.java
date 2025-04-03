package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenc extends ffhv implements ffjm {
    final /* synthetic */ cenh a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenc(ffgu ffguVar, cenh cenhVar, String str) {
        super(2, ffguVar);
        this.a = cenhVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cenh cenhVar = this.a;
        return csjx.c(cenhVar.c, cenhVar.d, "backup_timing_stats", this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cenc cencVar = new cenc(ffguVar, this.a, this.b);
        cencVar.c = obj;
        return cencVar;
    }
}

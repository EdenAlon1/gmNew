package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqjz b;
    final /* synthetic */ efkn c;
    final /* synthetic */ dqjz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjt(dqjz dqjzVar, efkn efknVar, ffgu ffguVar, dqjz dqjzVar2) {
        super(2, ffguVar);
        this.b = dqjzVar;
        this.c = efknVar;
        this.d = dqjzVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjt) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.e;
            dqjz dqjzVar = this.b;
            efkn efknVar = this.c;
            dqjz dqjzVar2 = this.d;
            ffhd hT = dqjzVar.c.hT();
            dqjs dqjsVar = new dqjs(dqjzVar, efknVar, ffxeVar, null, dqjzVar2);
            this.a = 1;
            if (ffra.a(hT, dqjsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqjt dqjtVar = new dqjt(this.b, this.c, ffguVar, this.d);
        dqjtVar.e = obj;
        return dqjtVar;
    }
}

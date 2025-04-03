package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqjz b;
    final /* synthetic */ efkn c;
    final /* synthetic */ dqjz d;
    final /* synthetic */ ffxe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjw(dqjz dqjzVar, efkn efknVar, ffxe ffxeVar, ffgu ffguVar, dqjz dqjzVar2) {
        super(2, ffguVar);
        this.b = dqjzVar;
        this.c = efknVar;
        this.d = dqjzVar2;
        this.e = ffxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            erph a = ((efiv) this.b.b.b()).a(this.c);
            dqjz dqjzVar = this.b;
            dqjv dqjvVar = new dqjv(this.e, dqjzVar, null, this.d);
            this.a = 1;
            if (dqkp.a(a, dqjzVar.c, dqjvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqjw(this.b, this.c, this.e, ffguVar, this.d);
    }
}

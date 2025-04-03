package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aihe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aihf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihe(aihf aihfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aihfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aihe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            aihf aihfVar = this.b;
            fgdj a = aihfVar.b.a();
            aihd aihdVar = new aihd(aihfVar, ffskVar);
            this.a = 1;
            if (a.a(aihdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aihe aiheVar = new aihe(this.b, ffguVar);
        aiheVar.c = obj;
        return aiheVar;
    }
}

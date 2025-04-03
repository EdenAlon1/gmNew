package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdh extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public fgdh(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgdh) c((fgcw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((fgcw) this.a) != fgcw.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgdh fgdhVar = new fgdh(ffguVar);
        fgdhVar.a = obj;
        return fgdhVar;
    }
}

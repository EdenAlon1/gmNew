package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lay extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public lay(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lay) c((ldh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(!(((ldh) this.a) instanceof lcr));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lay layVar = new lay(ffguVar);
        layVar.a = obj;
        return layVar;
    }
}

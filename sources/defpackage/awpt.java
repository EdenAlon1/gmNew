package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awpu b;
    final /* synthetic */ awxk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpt(awpu awpuVar, awxk awxkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awpuVar;
        this.c = awxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awpu awpuVar = this.b;
        awxk awxkVar = this.c;
        this.a = 1;
        Object a = awpuVar.a(awxkVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awpt(this.b, this.c, ffguVar);
    }
}

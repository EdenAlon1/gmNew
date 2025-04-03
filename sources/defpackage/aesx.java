package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aetb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesx(ffgu ffguVar, aetb aetbVar) {
        super(2, ffguVar);
        this.b = aetbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aesx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aetb aetbVar = this.b;
        this.a = 1;
        Object a = aetbVar.a.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aesx aesxVar = new aesx(ffguVar, this.b);
        aesxVar.c = obj;
        return aesxVar;
    }
}

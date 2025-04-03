package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ackh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackg(ackh ackhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ackhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ackg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ackh ackhVar = this.b;
        this.a = 1;
        Object a = ackhVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ackg(this.b, ffguVar);
    }
}

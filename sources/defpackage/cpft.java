package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpft extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpfu b;
    final /* synthetic */ List c;
    final /* synthetic */ cpff d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpft(cpfu cpfuVar, List list, cpff cpffVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpfuVar;
        this.c = list;
        this.d = cpffVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpft) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpfu cpfuVar = this.b;
        List list = this.c;
        cpff cpffVar = this.d;
        int i2 = this.e;
        this.a = 1;
        Object b = cpfuVar.b(list, cpffVar, i2, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpft(this.b, this.c, this.d, this.e, ffguVar);
    }
}

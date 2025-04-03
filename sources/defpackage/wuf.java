package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wuf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wug b;
    final /* synthetic */ List c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuf(wug wugVar, List list, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wugVar;
        this.c = list;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wuf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wug wugVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = wugVar.c(list, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.d.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wuf(this.b, this.c, this.d, ffguVar);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvg extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public zvg(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zvg zvgVar = new zvg((ffgu) obj3);
        zvgVar.a = (alya) obj;
        zvgVar.b = (List) obj2;
        return zvgVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new ffcf(this.a, this.b);
    }
}

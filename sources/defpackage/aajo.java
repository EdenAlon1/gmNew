package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajo extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public aajo(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aajo aajoVar = new aajo((ffgu) obj3);
        aajoVar.a = booleanValue;
        aajoVar.b = (List) obj2;
        return aajoVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a ? this.b : ffel.a;
    }
}

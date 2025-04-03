package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrb extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public wrb(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wrb wrbVar = new wrb((ffgu) obj3);
        wrbVar.a = (List) obj;
        wrbVar.b = (amny) obj2;
        return wrbVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.b == amny.b ? this.a : ffel.a;
    }
}

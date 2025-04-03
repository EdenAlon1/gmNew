package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otz {
    public static final Object a(osp ospVar, String str, ffgu ffguVar) {
        Object a = ospVar.a(str, new ffji() { // from class: oty
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                oxf oxfVar = (oxf) obj;
                oxfVar.getClass();
                return Boolean.valueOf(oxfVar.j());
            }
        }, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}

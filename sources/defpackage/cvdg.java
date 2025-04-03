package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdg {
    public static elfl a(String str) {
        fbya fbyaVar;
        String a = cuxu.a(str);
        if (a == null) {
            fbyaVar = null;
        } else {
            fbxz fbxzVar = (fbxz) fbya.a.createBuilder();
            fbxzVar.copyOnWrite();
            fbya fbyaVar2 = (fbya) fbxzVar.instance;
            str.getClass();
            fbyaVar2.b = str;
            fbxzVar.copyOnWrite();
            ((fbya) fbxzVar.instance).c = a;
            fbyaVar = (fbya) fbxzVar.build();
        }
        return elfo.e(fbyaVar);
    }
}

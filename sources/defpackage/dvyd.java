package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvyd {
    public static dvxc a(String str) {
        eyfw eyfwVar = dvyj.a;
        dvyf dvyfVar = (dvyf) dvyi.a.createBuilder();
        dvyfVar.copyOnWrite();
        dvyi dvyiVar = (dvyi) dvyfVar.instance;
        dvyiVar.d = 1;
        dvyiVar.b |= 2;
        dvyfVar.copyOnWrite();
        dvyi dvyiVar2 = (dvyi) dvyfVar.instance;
        str.getClass();
        dvyiVar2.b = 1 | dvyiVar2.b;
        dvyiVar2.c = str;
        return new dvxc(eyfwVar, (dvyi) dvyfVar.build());
    }

    public static dvxc b() {
        eyfw eyfwVar = dvyj.a;
        dvyf dvyfVar = (dvyf) dvyi.a.createBuilder();
        dvyfVar.copyOnWrite();
        dvyi dvyiVar = (dvyi) dvyfVar.instance;
        dvyiVar.d = 3;
        dvyiVar.b |= 2;
        return new dvxc(eyfwVar, (dvyi) dvyfVar.build());
    }
}

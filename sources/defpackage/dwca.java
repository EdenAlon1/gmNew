package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwca {
    public static dvxc a(String str) {
        emxf.a(!str.isEmpty());
        eyfw eyfwVar = dwcf.a;
        dwcd dwcdVar = (dwcd) dwce.a.createBuilder();
        dwcdVar.copyOnWrite();
        dwce dwceVar = (dwce) dwcdVar.instance;
        dwceVar.b |= 1;
        dwceVar.c = str;
        dwcdVar.copyOnWrite();
        dwce dwceVar2 = (dwce) dwcdVar.instance;
        dwceVar2.b |= 2;
        dwceVar2.d = true;
        return new dvxc(eyfwVar, (dwce) dwcdVar.build());
    }

    public static dvxc b() {
        emxf.a(true);
        eyfw eyfwVar = dwcf.a;
        dwcd dwcdVar = (dwcd) dwce.a.createBuilder();
        dwcdVar.copyOnWrite();
        dwce dwceVar = (dwce) dwcdVar.instance;
        dwceVar.b = 1 | dwceVar.b;
        dwceVar.c = "obake_android";
        return new dvxc(eyfwVar, (dwce) dwcdVar.build());
    }
}

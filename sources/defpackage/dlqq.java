package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqq {
    public static ezne a(int i, int i2) {
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznh eznhVar = (eznh) ezni.a.createBuilder();
        eznhVar.copyOnWrite();
        ezni ezniVar = (ezni) eznhVar.instance;
        ezniVar.b |= 1;
        ezniVar.c = i;
        eznhVar.copyOnWrite();
        ezni ezniVar2 = (ezni) eznhVar.instance;
        ezniVar2.d = i2 - 2;
        ezniVar2.b |= 2;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezni ezniVar3 = (ezni) eznhVar.build();
        ezniVar3.getClass();
        ezneVar.c = ezniVar3;
        ezneVar.b = 1;
        return (ezne) ezndVar.build();
    }

    public static ezne b(UUID uuid, int i, UUID uuid2) {
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznn eznnVar = (eznn) ezno.a.createBuilder();
        String uuid3 = uuid.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar = (ezno) eznnVar.instance;
        uuid3.getClass();
        eznoVar.b |= 1;
        eznoVar.e = uuid3;
        String uuid4 = uuid2.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar2 = (ezno) eznnVar.instance;
        uuid4.getClass();
        eznoVar2.b |= 2;
        eznoVar2.f = uuid4;
        eznp eznpVar = (eznp) eznq.a.createBuilder();
        eznpVar.copyOnWrite();
        eznq eznqVar = (eznq) eznpVar.instance;
        eznqVar.c = ewio.a(4);
        eznqVar.b |= 1;
        eznpVar.copyOnWrite();
        eznq eznqVar2 = (eznq) eznpVar.instance;
        eznqVar2.d = ewin.a(i);
        eznqVar2.b |= 2;
        eznnVar.copyOnWrite();
        ezno eznoVar3 = (ezno) eznnVar.instance;
        eznq eznqVar3 = (eznq) eznpVar.build();
        eznqVar3.getClass();
        eznoVar3.d = eznqVar3;
        eznoVar3.c = 3;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezno eznoVar4 = (ezno) eznnVar.build();
        eznoVar4.getClass();
        ezneVar.c = eznoVar4;
        ezneVar.b = 3;
        return (ezne) ezndVar.build();
    }

    public static ezne c(UUID uuid, int i, UUID uuid2) {
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznn eznnVar = (eznn) ezno.a.createBuilder();
        String uuid3 = uuid.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar = (ezno) eznnVar.instance;
        uuid3.getClass();
        eznoVar.b |= 1;
        eznoVar.e = uuid3;
        String uuid4 = uuid2.toString();
        eznnVar.copyOnWrite();
        ezno eznoVar2 = (ezno) eznnVar.instance;
        uuid4.getClass();
        eznoVar2.b |= 2;
        eznoVar2.f = uuid4;
        eznp eznpVar = (eznp) eznq.a.createBuilder();
        eznpVar.copyOnWrite();
        eznq eznqVar = (eznq) eznpVar.instance;
        eznqVar.c = ewio.a(i);
        eznqVar.b |= 1;
        eznnVar.copyOnWrite();
        ezno eznoVar3 = (ezno) eznnVar.instance;
        eznq eznqVar2 = (eznq) eznpVar.build();
        eznqVar2.getClass();
        eznoVar3.d = eznqVar2;
        eznoVar3.c = 3;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        ezno eznoVar4 = (ezno) eznnVar.build();
        eznoVar4.getClass();
        ezneVar.c = eznoVar4;
        ezneVar.b = 3;
        return (ezne) ezndVar.build();
    }
}

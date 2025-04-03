package defpackage;

import j$.util.Collection;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpz {
    public static elzh a(String str, elwo elwoVar) {
        elzh elzhVar = (elzh) elzi.a.createBuilder();
        elzhVar.copyOnWrite();
        ((elzi) elzhVar.instance).b = str;
        boolean c = elwoVar.c();
        elzhVar.copyOnWrite();
        ((elzi) elzhVar.instance).d = c;
        boolean d = elwoVar.d();
        elzhVar.copyOnWrite();
        ((elzi) elzhVar.instance).e = d;
        boolean b = elwoVar.b();
        elzhVar.copyOnWrite();
        ((elzi) elzhVar.instance).f = b;
        return elzhVar;
    }

    public static elzl b(Enum r3) {
        elzk elzkVar = (elzk) elzl.a.createBuilder();
        String str = r3.toString();
        elzkVar.copyOnWrite();
        elzl elzlVar = (elzl) elzkVar.instance;
        str.getClass();
        elzlVar.b |= 1;
        elzlVar.c = str;
        return (elzl) elzkVar.build();
    }

    public static List c(elwo elwoVar, Function function) {
        return (List) Collection.EL.stream(elwoVar.a()).map(function).collect(elvb.a());
    }
}

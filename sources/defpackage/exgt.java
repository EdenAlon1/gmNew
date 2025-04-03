package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exgt {
    /* JADX WARN: Multi-variable type inference failed */
    public static String a(ezom ezomVar) {
        ezom ezomVar2 = (ezom) ((ezol) ezomVar.toBuilder()).build();
        if ((ezomVar.b & 4) != 0) {
            ezol ezolVar = (ezol) ezom.a.createBuilder();
            ezok ezokVar = ezomVar.e;
            if (ezokVar == null) {
                ezokVar = ezok.a;
            }
            int i = ezokVar.b;
            if ((i & 1) == 0 || (i & 2) == 0) {
                throw new IllegalArgumentException("Could not parse place id into a proto");
            }
            qbv a = new qbw(ezokVar.c, ezokVar.d).a();
            ezoj ezojVar = (ezoj) ezok.a.createBuilder();
            double a2 = a.a();
            ezojVar.copyOnWrite();
            ezok ezokVar2 = (ezok) ezojVar.instance;
            ezokVar2.b |= 1;
            ezokVar2.c = a2;
            double b = a.b();
            ezojVar.copyOnWrite();
            ezok ezokVar3 = (ezok) ezojVar.instance;
            ezokVar3.b |= 2;
            ezokVar3.d = b;
            ezok ezokVar4 = (ezok) ezojVar.build();
            ezolVar.copyOnWrite();
            ezom ezomVar3 = (ezom) ezolVar.instance;
            ezokVar4.getClass();
            ezomVar3.e = ezokVar4;
            ezomVar3.b |= 4;
            ezomVar2 = (ezom) ezolVar.build();
        }
        byte[] byteArray = ezomVar2.toByteArray();
        if (c(ezomVar2) && b(ezomVar2, byteArray)) {
            return eoeg.f.g().j(byteArray);
        }
        throw new IllegalArgumentException("The place id is not normalized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(ezom ezomVar, byte[] bArr) {
        ezol ezolVar = (ezol) ezom.a.createBuilder();
        if ((ezomVar.b & 1) != 0) {
            evju evjuVar = ezomVar.c;
            if (evjuVar == null) {
                evjuVar = evju.a;
            }
            ezolVar.copyOnWrite();
            ezom ezomVar2 = (ezom) ezolVar.instance;
            evjuVar.getClass();
            ezomVar2.c = evjuVar;
            ezomVar2.b |= 1;
        }
        if (!ezomVar.d.isEmpty()) {
            String str = ezomVar.d;
            ezolVar.copyOnWrite();
            ezom ezomVar3 = (ezom) ezolVar.instance;
            str.getClass();
            ezomVar3.b |= 2;
            ezomVar3.d = str;
        }
        if ((ezomVar.b & 8) != 0) {
            exjy exjyVar = ezomVar.f;
            if (exjyVar == null) {
                exjyVar = exjy.a;
            }
            ezolVar.copyOnWrite();
            ezom ezomVar4 = (ezom) ezolVar.instance;
            exjyVar.getClass();
            ezomVar4.f = exjyVar;
            ezomVar4.b |= 8;
        }
        if (!ezomVar.g.isEmpty()) {
            String str2 = ezomVar.g;
            ezolVar.copyOnWrite();
            ezom ezomVar5 = (ezom) ezolVar.instance;
            str2.getClass();
            ezomVar5.b |= 16;
            ezomVar5.g = str2;
        }
        if ((ezomVar.b & 4) != 0) {
            ezok ezokVar = ezomVar.e;
            if (ezokVar == null) {
                ezokVar = ezok.a;
            }
            ezolVar.copyOnWrite();
            ezom ezomVar6 = (ezom) ezolVar.instance;
            ezokVar.getClass();
            ezomVar6.e = ezokVar;
            ezomVar6.b |= 4;
        }
        return Arrays.equals(((ezom) ezolVar.build()).toByteArray(), bArr);
    }

    public static boolean c(ezom ezomVar) {
        int i = ezomVar.b;
        if ((i & 4) != 0) {
            if ((i & 1) == 0 && (i & 2) == 0 && (i & 8) == 0 && (i & 16) == 0) {
                ezok ezokVar = ezomVar.e;
                if (ezokVar == null) {
                    ezokVar = ezok.a;
                }
                if ((ezokVar.b & 1) != 0) {
                    ezok ezokVar2 = ezomVar.e;
                    if (ezokVar2 == null) {
                        ezokVar2 = ezok.a;
                    }
                    if ((ezokVar2.b & 2) != 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if ((i & 2) == 0) {
            if ((i & 8) == 0) {
                if ((i & 1) != 0) {
                    evju evjuVar = ezomVar.c;
                    if (evjuVar == null) {
                        evjuVar = evju.a;
                    }
                    if (evjuVar.isInitialized()) {
                        return true;
                    }
                }
                return false;
            }
            exjy exjyVar = ezomVar.f;
            if (exjyVar == null) {
                exjyVar = exjy.a;
            }
            int i2 = exjyVar.b;
            if (exjx.a(i2) == 2 || exjx.a(i2) == 1) {
                return false;
            }
        }
        return true;
    }
}

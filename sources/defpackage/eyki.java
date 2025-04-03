package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyki {
    public static final eyev a;

    static {
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = -315576000000L;
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).c = -999999999;
        eyeu eyeuVar2 = (eyeu) eyev.a.createBuilder();
        eyeuVar2.copyOnWrite();
        ((eyev) eyeuVar2.instance).b = 315576000000L;
        eyeuVar2.copyOnWrite();
        ((eyev) eyeuVar2.instance).c = 999999999;
        eyeu eyeuVar3 = (eyeu) eyev.a.createBuilder();
        eyeuVar3.copyOnWrite();
        ((eyev) eyeuVar3.instance).b = 0L;
        eyeuVar3.copyOnWrite();
        ((eyev) eyeuVar3.instance).c = 0;
        a = (eyev) eyeuVar3.build();
    }

    public static int a(eyev eyevVar, eyev eyevVar2) {
        h(eyevVar);
        h(eyevVar2);
        int compare = Long.compare(eyevVar.b, eyevVar2.b);
        return compare != 0 ? compare : Integer.compare(eyevVar.c, eyevVar2.c);
    }

    public static long b(eyev eyevVar) {
        h(eyevVar);
        return erlc.b(erlc.c(eyevVar.b, 1000L), eyevVar.c / 1000000);
    }

    public static eyev c(long j) {
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        long c = erlc.c(j, 86400L);
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = c;
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).c = 0;
        return (eyev) eyeuVar.build();
    }

    public static eyev d(long j) {
        return g(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static eyev e(long j) {
        return g(j / 1000000000, (int) (j % 1000000000));
    }

    public static eyev f(long j) {
        return g(j, 0);
    }

    public static eyev g(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = erlc.b(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = j;
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).c = i;
        eyev eyevVar = (eyev) eyeuVar.build();
        h(eyevVar);
        return eyevVar;
    }

    public static void h(eyev eyevVar) {
        long j = eyevVar.b;
        int i = eyevVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(emyk.a("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evrg {
    BRANCH(0),
    SINGLE(1),
    ANY(2),
    RANGE(3),
    MAP(4),
    TMAP(5);

    public static final evrg[] g = values();

    evrg(int i) {
        if (i != ordinal()) {
            throw new AssertionError(a.h(i, "bad opcode value: "));
        }
    }

    public static int a(evrc evrcVar, evre evreVar, int i) {
        int c = (evrcVar.c() << 16) | evrcVar.c();
        if (!evreVar.b()) {
            return i;
        }
        int a = evreVar.a();
        int i2 = ((int) (1099368461105 >>> (a * 4))) & 15 & (c >>> (((int) (903298571996192 >>> (a * 5))) & 31));
        if (i2 == 0) {
            return 3;
        }
        return evrcVar.e(i2 - 1);
    }
}

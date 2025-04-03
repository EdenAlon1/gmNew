package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class easg extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        exuz exuzVar = (exuz) obj;
        int ordinal = exuzVar.ordinal();
        if (ordinal == 0) {
            return easa.a;
        }
        if (ordinal == 1) {
            return easa.b;
        }
        if (ordinal == 2) {
            return easa.c;
        }
        if (ordinal == 3) {
            return easa.d;
        }
        if (ordinal == 4) {
            return easa.e;
        }
        if (ordinal == 5) {
            return easa.f;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exuzVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        easa easaVar = (easa) obj;
        int ordinal = easaVar.ordinal();
        if (ordinal == 0) {
            return exuz.DEFAULT;
        }
        if (ordinal == 1) {
            return exuz.TV;
        }
        if (ordinal == 2) {
            return exuz.WEARABLE;
        }
        if (ordinal == 3) {
            return exuz.AUTOMOTIVE;
        }
        if (ordinal == 4) {
            return exuz.BATTLESTAR;
        }
        if (ordinal == 5) {
            return exuz.CHROME_OS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(easaVar.toString()));
    }
}

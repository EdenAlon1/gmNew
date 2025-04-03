package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvj {
    public static final float a(eot eotVar) {
        return eotVar.x().e == dqs.b ? Float.intBitsToFloat((int) (eotVar.o() >> 32)) : Float.intBitsToFloat((int) (eotVar.o() & 4294967295L));
    }

    public static final boolean b(eot eotVar, float f) {
        eotVar.x();
        return (eotVar.w() ? -f : a(eotVar)) <= 0.0f;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvh {
    public static final int a(jzn jznVar, float f) {
        if (Math.abs(f) < jznVar.em(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static final int b(eea eeaVar) {
        return (int) (eeaVar.h() == dqs.a ? eeaVar.g() & 4294967295L : eeaVar.g() >> 32);
    }
}

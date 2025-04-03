package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class azbt implements emwl {
    @Override // defpackage.emwl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azcg apply(awuh awuhVar) {
        int ordinal = awuhVar.ordinal();
        if (ordinal == 0) {
            return b();
        }
        if (ordinal == 1) {
            return azcg.a;
        }
        if (ordinal == 2) {
            return azcg.c;
        }
        if (ordinal == 3) {
            return azcg.b;
        }
        if (ordinal == 4) {
            return azcg.d;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(awuhVar))));
    }

    public abstract azcg b();
}

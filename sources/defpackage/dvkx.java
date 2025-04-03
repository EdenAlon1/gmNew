package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkx extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evzq evzqVar = (evzq) obj;
        int ordinal = evzqVar.ordinal();
        if (ordinal == 0) {
            return eyav.PULSE_WITH_INNER_CIRCLE;
        }
        if (ordinal == 1) {
            return eyav.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evzqVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eyav eyavVar = (eyav) obj;
        int ordinal = eyavVar.ordinal();
        if (ordinal == 1) {
            return evzq.PULSE_WITH_INNER_CIRCLE;
        }
        if (ordinal == 2) {
            return evzq.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eyavVar.toString()));
    }
}

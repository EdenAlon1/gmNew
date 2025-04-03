package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbz implements axca {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final axbm d;

    public axbz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, axbm axbmVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = axbmVar;
    }

    @Override // defpackage.axca
    public final axbo a(awyd awydVar) {
        awydVar.getClass();
        if (awydVar == awyd.RECOVERY_STRATEGY_REFRESH_REGISTRATION) {
            Object b = this.a.b();
            b.getClass();
            return (axbo) b;
        }
        if (awydVar == awyd.RECOVERY_STRATEGY_RECREATE_GROUP) {
            Object b2 = this.b.b();
            b2.getClass();
            return (axbo) b2;
        }
        if (awydVar != awyd.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE) {
            return this.d;
        }
        Object b3 = this.c.b();
        b3.getClass();
        return (axbo) b3;
    }
}

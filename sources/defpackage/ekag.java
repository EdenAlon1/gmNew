package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekag {
    public static final ekah a(final boolean z) {
        return new ekah(new ffix() { // from class: ekae
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(z);
            }
        }, 2);
    }

    public static final ekah b(final double d) {
        return new ekah(new ffix() { // from class: ekad
            @Override // defpackage.ffix
            public final Object invoke() {
                return Double.valueOf(d);
            }
        }, 3);
    }

    public static final ekah c(final long j) {
        return new ekah(new ffix() { // from class: ekac
            @Override // defpackage.ffix
            public final Object invoke() {
                return Long.valueOf(j);
            }
        }, 1);
    }

    public static final ekah d(ffix ffixVar, eyhs eyhsVar) {
        eyhsVar.getClass();
        return new ekah(ffixVar, 6, eyhsVar);
    }

    public static final ekah e(final String str) {
        return new ekah(new ffix() { // from class: ekaf
            @Override // defpackage.ffix
            public final Object invoke() {
                return str;
            }
        }, 4);
    }
}

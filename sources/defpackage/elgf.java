package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgf {
    public static dhqv a(final dhqv dhqvVar) {
        final elds b = elds.b();
        return new dhqv() { // from class: elgd
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                elds eldsVar = elds.this;
                elds g = elds.g();
                elds.e(eldsVar);
                try {
                    dhqvVar.d(exc);
                } finally {
                    elds.e(g);
                }
            }
        };
    }

    public static dhqy b(final dhqy dhqyVar) {
        final elds b = elds.b();
        return new dhqy() { // from class: elge
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                elds eldsVar = elds.this;
                elds g = elds.g();
                elds.e(eldsVar);
                try {
                    dhqyVar.e(obj);
                } finally {
                    elds.e(g);
                }
            }
        };
    }
}

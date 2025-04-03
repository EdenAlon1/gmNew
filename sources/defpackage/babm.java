package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class babm {
    public final ejar a;
    private final babf b;

    public babm(babf babfVar, ejar ejarVar) {
        this.b = babfVar;
        this.a = ejarVar;
    }

    public final elfl a() {
        return this.b.a().h(new emwl() { // from class: babi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(Objects.nonNull((eisx) obj));
            }
        }, erpp.a).e(babn.class, new emwl() { // from class: babj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return false;
            }
        }, erpp.a);
    }

    public final elfl b(final int i) {
        return this.b.a().h(new emwl() { // from class: babg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = i;
                eisx eisxVar = (eisx) obj;
                if (eisxVar == null || eisxVar.a() != i2) {
                    throw new baan(a.h(i2, "Requested Account not linked: "));
                }
                return eisxVar;
            }
        }, erpp.a).e(babn.class, new emwl() { // from class: babh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new baan("No account linked", (babn) obj);
            }
        }, erpp.a);
    }
}

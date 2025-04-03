package defpackage;

import j$.util.Collection;
import java.util.Locale;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cctp {
    public static final Supplier a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final axkm f;
    private final ashh g;

    static {
        final emyl w = cfvl.w("cms_create_trigger_check_for_cms_id");
        w.getClass();
        a = new Supplier() { // from class: cctn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (cfup) emyl.this.get();
            }
        };
        b = String.format(Locale.US, "%s IN (%s)", "NEW.cms_life_cycle", emww.d(',').f((Integer[]) Collection.EL.stream(csgg.w).map(new csga()).sorted().toArray(new IntFunction() { // from class: csge
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                csgg csggVar = csgg.UNKNOWN;
                return new Integer[i];
            }
        })));
        c = String.format(Locale.US, "%s NOT IN (%s)", "NEW.cms_life_cycle", emww.d(',').f((Integer[]) Collection.EL.stream(csgg.z).map(new csga()).sorted().toArray(new IntFunction() { // from class: csgf
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                csgg csggVar = csgg.UNKNOWN;
                return new Integer[i];
            }
        })));
        d = String.format(Locale.US, "%s NOT IN (%s)", "OLD.cms_life_cycle", emww.d(',').f((Integer[]) Collection.EL.stream(csgg.y).map(new csga()).sorted().toArray(new IntFunction() { // from class: csgc
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                csgg csggVar = csgg.UNKNOWN;
                return new Integer[i];
            }
        })));
        e = String.format(Locale.US, "%s NOT IN (%d, %d) OR %s NOT IN (%d, %d, %d)", "OLD.cms_life_cycle", Integer.valueOf(csgg.UNKNOWN.ordinal()), Integer.valueOf(csgg.RESTORED_FROM_TELEPHONY.ordinal()), "NEW.cms_life_cycle", Integer.valueOf(csgg.MERGED_FROM_CMS.ordinal()), Integer.valueOf(csgg.CMS_RESTORE_FAILED.ordinal()), Integer.valueOf(csgg.EXCLUDED.ordinal()));
        String.format(Locale.US, "%s IN (%s)", "OLD.cms_life_cycle", emww.d(',').f((Integer[]) Collection.EL.stream(csgg.A).map(new csga()).sorted().toArray(new IntFunction() { // from class: csgb
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                csgg csggVar = csgg.UNKNOWN;
                return new Integer[i];
            }
        })));
    }

    public cctp(axkm axkmVar, ashh ashhVar) {
        this.f = axkmVar;
        this.g = ashhVar;
    }

    public final bech a(int i, becg becgVar, int i2) {
        return e(i, becgVar, i2, false);
    }

    public final ccto b(int i, becg becgVar) {
        return new ccto(i, becgVar, this.g.a());
    }

    public final String c(int i, becg becgVar) {
        return "DROP TRIGGER IF EXISTS ".concat(bece.f(i, becgVar.name(), 32));
    }

    public final String d(int i, becg becgVar, String str) {
        return c(i, becgVar).concat(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (((java.lang.Boolean) ((defpackage.cfup) r3).e()).booleanValue() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bech e(int r3, defpackage.becg r4, int r5, boolean r6) {
        /*
            r2 = this;
            bech r0 = new bech
            r0.<init>()
            r0.c = r4
            r1 = 32
            r0.e = r1
            r0.b = r3
            r0.c()
            ashh r3 = r2.g
            boolean r3 = r3.a()
            r0.h = r3
            r0.g = r5
            axkm r3 = r2.f
            boolean r3 = r3.al()
            r5 = 2
            if (r3 == 0) goto L46
            int r3 = r4.ordinal()
            if (r3 == 0) goto L40
            r4 = 1
            if (r3 == r4) goto L35
            if (r3 == r5) goto L2f
            goto L64
        L2f:
            java.lang.String r3 = defpackage.cctp.d
            r0.b(r3)
            return r0
        L35:
            java.lang.String r3 = defpackage.cctp.c
            r0.b(r3)
            java.lang.String r3 = defpackage.cctp.e
            r0.b(r3)
            return r0
        L40:
            java.lang.String r3 = defpackage.cctp.b
            r0.b(r3)
            return r0
        L46:
            if (r6 != 0) goto L5c
            java.util.function.Supplier r3 = defpackage.cctp.a
            java.lang.Object r3 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m100m(r3)
            cfup r3 = (defpackage.cfup) r3
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L64
        L5c:
            int r3 = r4.ordinal()
            if (r3 == 0) goto L6b
            if (r3 == r5) goto L65
        L64:
            return r0
        L65:
            java.lang.String r3 = "OLD.cms_id IS NOT NULL"
            r0.b(r3)
            return r0
        L6b:
            java.lang.String r3 = "NEW.cms_id IS NULL"
            r0.b(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cctp.e(int, becg, int, boolean):bech");
    }

    public final String f(int i) {
        return "DROP TRIGGER IF EXISTS " + bece.f(2, becg.UPDATE.name(), 32) + ccue.b(i);
    }
}

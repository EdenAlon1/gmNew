package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpab {
    public static final dpab a;
    public static final dpab b;
    public static final dpab c;
    public static final dpab d;
    public static final dpab e;
    public static final dpab f;
    public static final dpab g;
    public static final /* synthetic */ ffhx j;
    private static final /* synthetic */ dpab[] k;
    public final enip h;
    public final enip i;

    static {
        enpx enpxVar = new enpx(dozr.a);
        dpab dpabVar = new dpab("ID", 0, enpxVar, enpxVar);
        a = dpabVar;
        enpx enpxVar2 = new enpx(dozr.b);
        dpab dpabVar2 = new dpab("MIME_TYPE", 1, enpxVar2, enpxVar2);
        b = dpabVar2;
        enpx enpxVar3 = new enpx(dozr.c);
        dpab dpabVar3 = new dpab("SIZE_BYTES", 2, enpxVar3, enpxVar3);
        c = dpabVar3;
        enpx enpxVar4 = new enpx(dozr.d);
        dpab dpabVar4 = new dpab("DISPLAY_NAME", 3, enpxVar4, enpxVar4);
        d = dpabVar4;
        enpx enpxVar5 = new enpx(dozr.e);
        enip r = enip.r(dozr.e, dozr.f);
        r.getClass();
        dpab dpabVar5 = new dpab("DATE_MODIFIED", 4, enpxVar5, r);
        e = dpabVar5;
        enip s = enip.s(dozr.g, dozr.h, dozr.j);
        s.getClass();
        dpab dpabVar6 = new dpab("DIMENSIONS", 5, s, s);
        f = dpabVar6;
        enpx enpxVar6 = new enpx(dozr.i);
        dpab dpabVar7 = new dpab("DURATION", 6, enpxVar6, enpxVar6);
        g = dpabVar7;
        dpab[] dpabVarArr = {dpabVar, dpabVar2, dpabVar3, dpabVar4, dpabVar5, dpabVar6, dpabVar7};
        k = dpabVarArr;
        j = ffhw.a(dpabVarArr);
    }

    private dpab(String str, int i, enip enipVar, enip enipVar2) {
        this.h = enipVar;
        this.i = enipVar2;
        if (!enipVar2.containsAll(enipVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static dpab[] values() {
        return (dpab[]) k.clone();
    }
}

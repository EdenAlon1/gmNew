package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxw {
    public static final cyb a(dbv dbvVar, Object obj) {
        cyb cybVar = (cyb) dbvVar.b().invoke(obj);
        cybVar.d();
        return cybVar;
    }

    public static /* synthetic */ cxv b(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new cxv(dcp.a, Float.valueOf(f), new cxx(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ cxv c(dbv dbvVar, Object obj, Object obj2) {
        return new cxv(dbvVar, obj, (cyb) dbvVar.b().invoke(obj2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ cxv d(cxv cxvVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) cxvVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((cxx) cxvVar.b).a;
        }
        return new cxv(cxvVar.a, Float.valueOf(f), new cxx(f2), cxvVar.c, cxvVar.d, cxvVar.e);
    }
}

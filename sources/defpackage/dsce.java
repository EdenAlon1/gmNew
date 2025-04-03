package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsce {
    public static final drld a(ewmw ewmwVar) {
        int b = ewmu.b(ewmwVar.e);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        return i != 1 ? i != 2 ? i != 3 ? drld.b : drkk.a : drku.a : drla.a;
    }

    public static final drem b(ewnk ewnkVar) {
        ewmw ewmwVar = ewnkVar.e;
        if (ewmwVar == null) {
            ewmwVar = ewmw.a;
        }
        if (ewmwVar == null) {
            return null;
        }
        drme drmeVar = drme.d;
        drld a = a(ewmwVar);
        String str = ewmwVar.c;
        str.getClass();
        ewmt ewmtVar = ewmwVar.f;
        if (ewmtVar == null) {
            ewmtVar = ewmt.a;
        }
        int i = ewmtVar.b;
        ewmt ewmtVar2 = ewmwVar.f;
        if (ewmtVar2 == null) {
            ewmtVar2 = ewmt.a;
        }
        return new drem(drmeVar, a, str, i, ewmtVar2.c, 100L, dsch.a);
    }
}

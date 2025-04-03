package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiqm {
    public static final int a(afke afkeVar) {
        afkeVar.getClass();
        if (b(afkeVar, "scheduled_send_nudge")) {
            return 1;
        }
        if (ddjr.c() && b(afkeVar, "reminder_nudge")) {
            return 4;
        }
        if (stl.a() && b(afkeVar, "conversation_classification_type")) {
            return 3;
        }
        return (ctjd.f() && b(afkeVar, "nudge_classification")) ? 2 : 1;
    }

    private static final boolean b(afke afkeVar, String str) {
        if (afkeVar.aE(str)) {
            dtro[] aG = afkeVar.aG(str, new dtro[0]);
            aG.getClass();
            if (aG.length != 0) {
                return true;
            }
        }
        return false;
    }
}

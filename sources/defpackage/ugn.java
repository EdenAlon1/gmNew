package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugn {
    public static final ugm a(ugo ugoVar) {
        int ordinal = ugoVar.ordinal();
        if (ordinal == 0) {
            return ugm.IME;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    throw new IllegalStateException("No surface for ".concat(String.valueOf(String.valueOf(ugoVar))));
                }
            } else if (!((Boolean) uky.g.e()).booleanValue()) {
                return ugm.CAMERA_GALLERY_FRAGMENT;
            }
        } else if (!((Boolean) uky.e.e()).booleanValue()) {
            return ugm.C2O_FRAGMENT;
        }
        return ugm.HUGO;
    }
}

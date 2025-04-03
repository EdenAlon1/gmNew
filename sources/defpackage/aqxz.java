package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxz implements aqyt {
    public static final aqxz a = new aqxz();

    private aqxz() {
    }

    @Override // defpackage.aqyt
    public final int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aqyt
    public final int b() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aqyt
    public final int c() {
        return 104857600;
    }

    @Override // defpackage.aqyt
    public final int d() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.aqyt
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqxz)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1315564555;
    }

    public final String toString() {
        return "DefaultRcsConfig";
    }
}

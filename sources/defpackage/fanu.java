package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanu {
    public static final fanu a;
    private static final /* synthetic */ fanu[] c;
    public final int b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;

    static {
        fanu fanuVar = new fanu();
        a = fanuVar;
        c = new fanu[]{fanuVar};
    }

    private fanu() {
    }

    public static fanu[] values() {
        return (fanu[]) c.clone();
    }
}

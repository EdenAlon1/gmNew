package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmy extends ffkk implements ffji {
    public static final pmy a = new pmy();

    public pmy() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        sidecarDisplayFeature.getClass();
        boolean z = true;
        if (sidecarDisplayFeature.getRect().left != 0 && sidecarDisplayFeature.getRect().top != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

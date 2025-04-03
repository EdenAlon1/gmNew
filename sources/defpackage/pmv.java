package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmv extends ffkk implements ffji {
    public static final pmv a = new pmv();

    public pmv() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        sidecarDisplayFeature.getClass();
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

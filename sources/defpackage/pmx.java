package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmx extends ffkk implements ffji {
    public static final pmx a = new pmx();

    public pmx() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        sidecarDisplayFeature.getClass();
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

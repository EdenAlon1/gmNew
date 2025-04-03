package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pfv {
    private final WebSettingsBoundaryInterface a;

    public pfv(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a(int i) {
        this.a.setForceDark(i);
    }

    public void b() {
        this.a.setForceDarkBehavior(1);
    }
}

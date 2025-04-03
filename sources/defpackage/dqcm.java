package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcm implements hgo {
    final /* synthetic */ hho a;

    public dqcm(hho hhoVar) {
        this.a = hhoVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        EmbeddedPhotoPickerSession c = dqco.c(this.a);
        if (c != null) {
            c.close();
        }
        dqco.e(this.a, null);
    }
}

package defpackage;

import androidx.profileinstaller.ProfileInstallReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooz implements ope {
    final /* synthetic */ ProfileInstallReceiver a;

    public ooz(ProfileInstallReceiver profileInstallReceiver) {
        this.a = profileInstallReceiver;
    }

    @Override // defpackage.ope
    public final void a(int i, Object obj) {
        opf.b.a(i, obj);
        this.a.setResultCode(i);
    }

    @Override // defpackage.ope
    public final void b() {
        opf.b.b();
    }
}

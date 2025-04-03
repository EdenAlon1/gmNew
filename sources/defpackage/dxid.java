package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxid implements erqj {
    final /* synthetic */ dwso a;
    final /* synthetic */ dxig b;

    public dxid(dxig dxigVar, dwso dwsoVar) {
        this.a = dwsoVar;
        this.b = dxigVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.e(th, "%s: Unable to create symlink structure, cleaning up symlinks...", "FileGroupManager");
        try {
            dxig dxigVar = this.b;
            dxvk.f(dxigVar.a, dxigVar.i, this.a, dxigVar.f);
        } catch (IOException e) {
            dxth.e(e, "%s: Unable to clean up symlink structure after failure", "FileGroupManager");
        }
    }
}

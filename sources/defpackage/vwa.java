package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwa implements ellh {
    final /* synthetic */ vvn a;

    public vwa(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        uvo uvoVar = (uvo) ellfVar;
        boolean booleanValue = ((Boolean) dcut.e.e()).booleanValue();
        vvn vvnVar = this.a;
        if (booleanValue || ((Boolean) dcut.f.e()).booleanValue()) {
            ffbr ffbrVar = vvnVar.an;
            Uri b = uvoVar.b();
            uvoVar.a();
            vvn.bu(ffbrVar, b, false, vvnVar.M, vvnVar.N);
        } else {
            ffbr ffbrVar2 = vvnVar.an;
            Uri b2 = uvoVar.b();
            uvoVar.a();
            vvn.bt(ffbrVar2, b2, false, vvnVar.M, vvnVar.p());
        }
        return elli.a;
    }
}

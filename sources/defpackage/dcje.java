package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcje implements dcaz {
    private final ffbr a;

    public dcje(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.dcaz
    public final /* synthetic */ dcae a(dcbc dcbcVar) {
        cuxz cuxzVar = (cuxz) this.a.b();
        cuxzVar.getClass();
        dcav dcavVar = (dcav) dcbcVar;
        Context z = dcavVar.a.z();
        final dbxy dbxyVar = dcavVar.d;
        dcab dcabVar = new dcab() { // from class: dcjc
            @Override // defpackage.dcab
            public final void e(eptm eptmVar) {
                dbxy.this.l(eptmVar);
            }
        };
        int i = dcavVar.h;
        return new dcjd(cuxzVar, z, dcavVar.d, dcabVar, dcavVar.i, i);
    }
}

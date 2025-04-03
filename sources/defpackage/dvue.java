package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvue implements dvqu {
    private static final entd b = entd.c("GnpSdk");
    public final dvqo a;
    private final Context c;
    private final ffsk d;
    private final dvcp e;

    public dvue(Context context, dvqo dvqoVar, ffsk ffskVar, dvcp dvcpVar) {
        context.getClass();
        dvqoVar.getClass();
        ffskVar.getClass();
        dvcpVar.getClass();
        this.c = context;
        this.a = dvqoVar;
        this.d = ffskVar;
        this.e = dvcpVar;
    }

    private final void d(dvdp dvdpVar, dvqt dvqtVar) {
        ffqy.d(this.d, null, null, new dvud(this, dvdpVar, dvqtVar, null), 3);
    }

    @Override // defpackage.dvqu
    public final View a(eg egVar, evzd evzdVar) {
        evzdVar.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvqu
    public final void b(eg egVar, View view, dvdp dvdpVar, evzm evzmVar) {
        entd entdVar = b;
        entdVar.o().q("rendering a permission prompt.");
        evzd evzdVar = dvdpVar.c().f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        evzdVar.getClass();
        evyu evyuVar = evzdVar.c == 6 ? (evyu) evzdVar.d : evyu.a;
        evyuVar.getClass();
        evys evysVar = evyuVar.e;
        if (evysVar == null) {
            evysVar = evys.b;
        }
        eygk eygkVar = new eygk(evysVar.c, evys.a);
        if (eygkVar.isEmpty()) {
            entdVar.o().q("must set a permission type.");
            d(dvdpVar, dvqt.FAILED_INVALID_PROMOTION);
            return;
        }
        if (eygkVar.size() > 1) {
            entdVar.o().q("GrowthKit only supports a single permission type, ignoring the rest.");
        }
        E e = eygkVar.get(0);
        e.getClass();
        String a = dvdm.a((evsn) e);
        if (easb.a(this.c, a)) {
            ((ensz) entdVar.j()).t("Permissions for %s are already granted.", a);
            d(dvdpVar, dvqt.NOT_NEEDED_PERMISSION_GRANTED);
            return;
        }
        boolean shouldShowRequestPermissionRationale = egVar.shouldShowRequestPermissionRationale(a);
        entdVar.o().H("shouldShowRequestPermissionRationale returned %s for %s.", shouldShowRequestPermissionRationale, a);
        if (!shouldShowRequestPermissionRationale || evyuVar.c) {
            if (evzdVar.f) {
                d(dvdpVar, dvqt.SUCCESS);
                return;
            }
            this.e.i(dvdpVar);
            entd entdVar2 = dvui.a;
            dvui a2 = dvuh.a(dvdpVar);
            cg cgVar = new cg(egVar.a());
            cgVar.u(a2, "PermissionRequestFrag");
            cgVar.k();
            ffqy.d(this.d, null, null, new dvuc(this, dvdpVar, null), 3);
            return;
        }
        try {
            evxu evxuVar = evyuVar.d;
            if (evxuVar == null) {
                evxuVar = evxu.a;
            }
            evzm b2 = dvrn.b(evzmVar, evxuVar);
            if (evzdVar.f) {
                d(dvdpVar, dvqt.SUCCESS);
            } else {
                this.e.i(dvdpVar);
                dvsj.aT(dvdpVar, b2).s(egVar.a(), "PromoUiDialogFragment");
            }
        } catch (dvrm unused) {
            d(dvdpVar, dvqt.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dvqu
    public final boolean c(evzc evzcVar) {
        evzcVar.getClass();
        return evzcVar == evzc.UITYPE_PERMISSION;
    }
}

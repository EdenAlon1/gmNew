package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvt implements ffjn {
    final /* synthetic */ hho a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffji c;
    final /* synthetic */ Context d;
    final /* synthetic */ ada e;
    final /* synthetic */ Uri f;
    final /* synthetic */ ada g;
    final /* synthetic */ ada h;
    final /* synthetic */ boolean i;
    final /* synthetic */ ffji j;
    final /* synthetic */ egse k;

    public egvt(hho hhoVar, boolean z, ffji ffjiVar, egse egseVar, Context context, ada adaVar, Uri uri, ada adaVar2, ada adaVar3, boolean z2, ffji ffjiVar2) {
        this.a = hhoVar;
        this.b = z;
        this.c = ffjiVar;
        this.k = egseVar;
        this.d = context;
        this.e = adaVar;
        this.f = uri;
        this.g = adaVar2;
        this.h = adaVar3;
        this.i = z2;
        this.j = ffjiVar2;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dxj dxjVar = dxu.g;
            int i = huo.a;
            hus husVar = hum.n;
            d = ebs.d(hvi.e, 1.0f);
            hvi j = eba.j(d, 24.0f, 0.0f, 24.0f, 16.0f, 2);
            hho hhoVar = this.a;
            boolean z = this.b;
            ffji ffjiVar = this.c;
            egse egseVar = this.k;
            ipn a = ebm.a(dxjVar, husVar, hfdVar, 54);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, j);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Object valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dwjt.b(jii.a(R.string.pqe_bottom_sheet_header, hfdVar), null, 0L, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(hfdVar).h, hfdVar, 0, 0, 65022);
            hfd hfdVar2 = hfdVar;
            egth.a(228760, hpx.d(631241232, new egvs(hhoVar, z, ffjiVar, egseVar), hfdVar2), hfdVar2, 54);
            hfdVar2.n();
            c = dix.c(dee.a(eba.j(hvi.e, 24.0f, 0.0f, 24.0f, 16.0f, 2), gft.a(hfdVar2).p, eqm.a(10)), dix.a(0, hfdVar2, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            final Context context = this.d;
            final ada adaVar = this.e;
            final Uri uri = this.f;
            final ada adaVar2 = this.g;
            final ada adaVar3 = this.h;
            final ffji ffjiVar2 = this.c;
            boolean z2 = this.i;
            final ffji ffjiVar3 = this.j;
            ipn a3 = dyo.a(dxu.c, hum.j, hfdVar2, 0);
            int a4 = hey.a(hfdVar2);
            hgb c3 = hfdVar2.c();
            hvi b2 = huz.b(hfdVar2, c);
            ffix ffixVar2 = iss.a;
            hfdVar2.M();
            hfdVar2.x();
            if (hfdVar2.H()) {
                hfdVar2.j(ffixVar2);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a3, iss.e);
            hlc.b(hfdVar2, c3, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar2.H() || !ffkj.e(hfdVar2.f(), Integer.valueOf(a4))) {
                Object valueOf2 = Integer.valueOf(a4);
                hfdVar2.y(valueOf2);
                hfdVar2.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar2, b2, iss.c);
            igq a5 = jie.a(R.drawable.quantum_gm_ic_android_camera_vd_theme_24, hfdVar2, 0);
            hfdVar2.v(2064564215);
            boolean F = hfdVar2.F(context) | hfdVar2.F(adaVar) | hfdVar2.F(uri) | hfdVar2.F(adaVar2);
            Object f = hfdVar2.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: egve
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        if (koa.c(context, "android.permission.CAMERA") == 0) {
                            adaVar.c(egvv.a(uri));
                        } else {
                            adaVar2.c("android.permission.CAMERA");
                        }
                        return ffcu.a;
                    }
                };
                hfdVar2.y(f);
            }
            hfdVar2.o();
            egvv.i(a5, R.string.pqe_edit_camera_option, 0L, "camera", (ffix) f, 228764, hfdVar2, 199680);
            igz igzVar = fqt.a;
            if (igzVar == null) {
                igx igxVar = new igx("Outlined.PhotoLibrary", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(20.0f, 4.0f, arrayList);
                iha.m(12.0f, arrayList);
                iha.g(8.0f, 16.0f, arrayList);
                iha.g(8.0f, 4.0f, arrayList);
                iha.f(12.0f, arrayList);
                iha.j(0.0f, -2.0f, arrayList);
                iha.g(8.0f, 2.0f, arrayList);
                iha.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                iha.m(12.0f, arrayList);
                iha.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.f(12.0f, arrayList);
                iha.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                iha.g(22.0f, 4.0f, arrayList);
                iha.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                iha.b(arrayList);
                iha.i(11.5f, 11.67f, arrayList);
                iha.h(1.69f, 2.26f, arrayList);
                iha.h(2.48f, -3.1f, arrayList);
                iha.g(19.0f, 15.0f, arrayList);
                iha.g(9.0f, 15.0f, arrayList);
                iha.b(arrayList);
                iha.i(2.0f, 6.0f, arrayList);
                iha.m(14.0f, arrayList);
                iha.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.f(14.0f, arrayList);
                iha.m(-2.0f, arrayList);
                iha.g(4.0f, 20.0f, arrayList);
                iha.g(4.0f, 6.0f, arrayList);
                iha.g(2.0f, 6.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fqt.a = igxVar.a();
                igzVar = fqt.a;
                igzVar.getClass();
            }
            igz igzVar2 = igzVar;
            hfdVar2.v(2064585087);
            boolean F2 = hfdVar2.F(adaVar3);
            Object f2 = hfdVar2.f();
            if (F2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: egvf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("image/*");
                        ada.this.c(intent);
                        return ffcu.a;
                    }
                };
                hfdVar2.y(f2);
            }
            hfdVar2.o();
            egvv.j(igzVar2, R.string.pqe_edit_gallery_option, 0L, "gallery", (ffix) f2, 228765, hfdVar2, 199680);
            igz igzVar3 = fqs.a;
            if (igzVar3 == null) {
                igx igxVar2 = new igx("Outlined.Palette", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list2 = iii.a;
                idl idlVar2 = new idl(ibw.a);
                ArrayList arrayList2 = new ArrayList(32);
                iha.i(12.0f, 22.0f, arrayList2);
                iha.c(6.49f, 22.0f, 2.0f, 17.51f, 2.0f, 12.0f, arrayList2);
                iha.k(6.49f, arrayList2);
                iha.l(10.0f, 4.04f, 10.0f, 9.0f, arrayList2);
                iha.d(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f, arrayList2);
                iha.f(-1.77f, arrayList2);
                iha.d(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f, arrayList2);
                iha.d(0.0f, 0.12f, 0.05f, 0.23f, 0.13f, 0.33f, arrayList2);
                iha.d(0.41f, 0.47f, 0.64f, 1.06f, 0.64f, 1.67f, arrayList2);
                iha.c(14.5f, 20.88f, 13.38f, 22.0f, 12.0f, 22.0f, arrayList2);
                iha.b(arrayList2);
                iha.i(12.0f, 4.0f, arrayList2);
                iha.d(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f, arrayList2);
                iha.l(3.59f, 8.0f, 8.0f, 8.0f, arrayList2);
                iha.d(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f, arrayList2);
                iha.d(0.0f, -0.16f, -0.08f, -0.28f, -0.14f, -0.35f, arrayList2);
                iha.d(-0.41f, -0.46f, -0.63f, -1.05f, -0.63f, -1.65f, arrayList2);
                iha.d(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f, arrayList2);
                iha.e(16.0f, arrayList2);
                iha.d(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f, arrayList2);
                iha.c(20.0f, 7.14f, 16.41f, 4.0f, 12.0f, 4.0f, arrayList2);
                iha.b(arrayList2);
                igxVar2.c(arrayList2, 0, "", idlVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                idl idlVar3 = new idl(ibw.a);
                ArrayList arrayList3 = new ArrayList(32);
                iha.i(6.5f, 11.5f, arrayList3);
                iha.j(-1.5f, 0.0f, arrayList3);
                iha.a(3.0f, arrayList3);
                iha.a(-3.0f, arrayList3);
                igxVar2.c(arrayList3, 0, "", idlVar3, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                idl idlVar4 = new idl(ibw.a);
                ArrayList arrayList4 = new ArrayList(32);
                iha.i(9.5f, 7.5f, arrayList4);
                iha.j(-1.5f, 0.0f, arrayList4);
                iha.a(3.0f, arrayList4);
                iha.a(-3.0f, arrayList4);
                igxVar2.c(arrayList4, 0, "", idlVar4, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                idl idlVar5 = new idl(ibw.a);
                ArrayList arrayList5 = new ArrayList(32);
                iha.i(14.5f, 7.5f, arrayList5);
                iha.j(-1.5f, 0.0f, arrayList5);
                iha.a(3.0f, arrayList5);
                iha.a(-3.0f, arrayList5);
                igxVar2.c(arrayList5, 0, "", idlVar5, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                idl idlVar6 = new idl(ibw.a);
                ArrayList arrayList6 = new ArrayList(32);
                iha.i(17.5f, 11.5f, arrayList6);
                iha.j(-1.5f, 0.0f, arrayList6);
                iha.a(3.0f, arrayList6);
                iha.a(-3.0f, arrayList6);
                igxVar2.c(arrayList6, 0, "", idlVar6, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fqs.a = igxVar2.a();
                igzVar3 = fqs.a;
                igzVar3.getClass();
            }
            hfdVar2.v(2064597872);
            boolean D = hfdVar2.D(ffjiVar2);
            Object f3 = hfdVar2.f();
            if (D || f3 == hfc.a) {
                f3 = new ffix() { // from class: egvg
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffji.this.invoke(ewom.OBAKE_PICTURE_PICKER_ILLUSTRATION_SCREEN);
                        return ffcu.a;
                    }
                };
                hfdVar2.y(f3);
            }
            hfdVar2.o();
            egvv.j(igzVar3, R.string.pqe_edit_art_option, 0L, "illustration", (ffix) f3, 228766, hfdVar2, 199680);
            hfdVar2.v(2064605030);
            hfd hfdVar3 = hfdVar2;
            if (!z2) {
                dwgw.a(null, 1.0f, gft.a(hfdVar2).B, hfdVar2, 48, 1);
                hfd hfdVar4 = hfdVar2;
                igq a6 = jie.a(R.drawable.quantum_gm_ic_delete_vd_theme_24, hfdVar4, 0);
                hfdVar4.v(2064616380);
                boolean D2 = hfdVar4.D(ffjiVar3);
                Object f4 = hfdVar4.f();
                if (D2 || f4 == hfc.a) {
                    f4 = new ffix() { // from class: egvh
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffji.this.invoke(ewom.OBAKE_PICTURE_PICKER_REMOVE_PICTURE_SCREEN);
                            return ffcu.a;
                        }
                    };
                    hfdVar4.y(f4);
                }
                hfdVar4.o();
                egvv.i(a6, R.string.pqe_edit_remove_option, 0L, "remove", (ffix) f4, 228767, hfdVar4, 199680);
                hfdVar3 = hfdVar4;
            }
            hfdVar3.o();
            hfdVar3.n();
            ebv.a(new dzd(ecv.h(hfdVar3), ecu.a), hfdVar3);
        }
        return ffcu.a;
    }
}

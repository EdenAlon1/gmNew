package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvr implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffji c;
    final /* synthetic */ egse d;

    public egvr(hho hhoVar, boolean z, ffji ffjiVar, egse egseVar) {
        this.a = hhoVar;
        this.b = z;
        this.c = ffjiVar;
        this.d = egseVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = fqp.a;
            if (igzVar == null) {
                igx igxVar = new igx("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(12.0f, 8.0f, arrayList);
                iha.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                iha.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                iha.l(-2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                iha.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.b(arrayList);
                iha.i(12.0f, 10.0f, arrayList);
                iha.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                iha.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.l(2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                iha.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                iha.b(arrayList);
                iha.i(12.0f, 16.0f, arrayList);
                iha.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                iha.l(0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.l(2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                iha.l(-0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fqp.a = igxVar.a();
                igzVar = fqp.a;
                igzVar.getClass();
            }
            dwho.b(igzVar, jii.a(R.string.pqe_overflow_menu_a11y_label, hfdVar), null, 0L, hfdVar, 0, 12);
            boolean booleanValue = ((Boolean) this.a.a()).booleanValue();
            hfdVar.v(391601007);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: egvk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egvv.c(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            hve hveVar = hvi.e;
            hfdVar.v(391603502);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffji() { // from class: egvl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        jkv jkvVar = (jkv) obj3;
                        jkvVar.getClass();
                        jkr.u(jkvVar, "dropdownMenu");
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            c = jjs.c(hveVar, false, (ffji) f2);
            dwhw.b(booleanValue, ffixVar, c, 0L, null, null, null, 0L, 0.0f, hpx.d(-698264557, new egvq(this.b, this.c, this.d, this.a), hfdVar), hfdVar, 48, 48, 2040);
        }
        return ffcu.a;
    }
}

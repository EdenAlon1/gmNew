package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gct extends ffkk implements ffjn {
    final /* synthetic */ ffjm a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gct(ffjm ffjmVar, boolean z) {
        super(3);
        this.a = ffjmVar;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String b;
        hfd hfdVar = (hfd) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(hfdVar, 0);
            hve hveVar = hvi.e;
            ebe ebeVar = fvp.a;
            ebv.a(ebs.k(hveVar, fvp.e), hfdVar);
            igz igzVar = hbg.d;
            if (igzVar == null) {
                igx igxVar = new igx("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(7.0f, 10.0f, arrayList);
                iha.h(5.0f, 5.0f, arrayList);
                iha.h(5.0f, -5.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hbg.d = igxVar.a();
                igzVar = hbg.d;
                igzVar.getClass();
            }
            igz igzVar2 = igzVar;
            if (this.b) {
                hfdVar.v(-1352975157);
                b = hcb.b(R.string.m3c_date_picker_switch_to_day_selection, hfdVar);
                hfdVar.o();
            } else {
                hfdVar.v(-1352880886);
                b = hcb.b(R.string.m3c_date_picker_switch_to_year_selection, hfdVar);
                hfdVar.o();
            }
            geq.b(igzVar2, b, hxz.a(hvi.e, true != this.b ? 0.0f : 180.0f), 0L, hfdVar, 0, 8);
        }
        return ffcu.a;
    }
}

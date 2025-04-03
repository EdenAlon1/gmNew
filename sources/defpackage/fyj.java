package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyj extends ffkk implements ffjm {
    public static final fyj a = new fyj();

    public fyj() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = hbg.c;
            if (igzVar == null) {
                igx igxVar = new igx("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(9.0f, 11.0f, arrayList);
                iha.g(7.0f, 11.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.f(2.0f, arrayList);
                iha.m(-2.0f, arrayList);
                iha.b(arrayList);
                iha.i(13.0f, 11.0f, arrayList);
                iha.f(-2.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.f(2.0f, arrayList);
                iha.m(-2.0f, arrayList);
                iha.b(arrayList);
                iha.i(17.0f, 11.0f, arrayList);
                iha.f(-2.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.f(2.0f, arrayList);
                iha.m(-2.0f, arrayList);
                iha.b(arrayList);
                iha.i(19.0f, 4.0f, arrayList);
                iha.f(-1.0f, arrayList);
                iha.g(18.0f, 2.0f, arrayList);
                iha.f(-2.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.g(8.0f, 4.0f, arrayList);
                iha.g(8.0f, 2.0f, arrayList);
                iha.g(6.0f, 2.0f, arrayList);
                iha.m(2.0f, arrayList);
                iha.g(5.0f, 4.0f, arrayList);
                iha.d(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f, arrayList);
                iha.g(3.0f, 20.0f, arrayList);
                iha.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f, arrayList);
                iha.f(14.0f, arrayList);
                iha.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                iha.g(21.0f, 6.0f, arrayList);
                iha.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                iha.b(arrayList);
                iha.i(19.0f, 20.0f, arrayList);
                iha.g(5.0f, 20.0f, arrayList);
                iha.g(5.0f, 9.0f, arrayList);
                iha.f(14.0f, arrayList);
                iha.m(11.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hbg.c = igxVar.a();
                igzVar = hbg.c;
                igzVar.getClass();
            }
            geq.b(igzVar, hcb.b(R.string.m3c_date_picker_switch_to_calendar_mode, hfdVar), null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyi extends ffkk implements ffjm {
    public static final fyi a = new fyi();

    public fyi() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = hbg.b;
            if (igzVar == null) {
                igx igxVar = new igx("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(3.0f, 17.25f, arrayList);
                arrayList.add(new ihx(21.0f));
                iha.f(3.75f, arrayList);
                iha.g(17.81f, 9.94f, arrayList);
                iha.h(-3.75f, -3.75f, arrayList);
                iha.g(3.0f, 17.25f, arrayList);
                iha.b(arrayList);
                iha.i(20.71f, 7.04f, arrayList);
                iha.d(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f, arrayList);
                iha.h(-2.34f, -2.34f, arrayList);
                iha.d(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f, arrayList);
                iha.h(-1.83f, 1.83f, arrayList);
                iha.h(3.75f, 3.75f, arrayList);
                iha.h(1.83f, -1.83f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hbg.b = igxVar.a();
                igzVar = hbg.b;
                igzVar.getClass();
            }
            geq.b(igzVar, hcb.b(R.string.m3c_date_picker_switch_to_input_mode, hfdVar), null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

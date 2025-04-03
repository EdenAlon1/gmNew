package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyl extends ffkk implements ffjm {
    public static final fyl a = new fyl();

    public fyl() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = hbf.b;
            if (igzVar == null) {
                igx igxVar = new igx("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(8.59f, 16.59f, arrayList);
                iha.g(13.17f, 12.0f, arrayList);
                iha.g(8.59f, 7.41f, arrayList);
                iha.g(10.0f, 6.0f, arrayList);
                iha.h(6.0f, 6.0f, arrayList);
                iha.h(-6.0f, 6.0f, arrayList);
                iha.h(-1.41f, -1.41f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hbf.b = igxVar.a();
                igzVar = hbf.b;
                igzVar.getClass();
            }
            geq.b(igzVar, hcb.b(R.string.m3c_date_picker_switch_to_next_month, hfdVar), null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

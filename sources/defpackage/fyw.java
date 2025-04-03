package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyw extends ffkk implements ffjm {
    public static final fyw a = new fyw();

    public fyw() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igz igzVar = hbg.a;
            if (igzVar == null) {
                float f = 24.0f;
                igx igxVar = new igx("Filled.Close", f, f, f, f, 0L, 0, false, 224);
                List list = iii.a;
                idl idlVar = new idl(ibw.a);
                ArrayList arrayList = new ArrayList(32);
                iha.i(19.0f, 6.41f, arrayList);
                iha.g(17.59f, 5.0f, arrayList);
                iha.g(12.0f, 10.59f, arrayList);
                iha.g(6.41f, 5.0f, arrayList);
                iha.g(5.0f, 6.41f, arrayList);
                iha.g(10.59f, 12.0f, arrayList);
                iha.g(5.0f, 17.59f, arrayList);
                iha.g(6.41f, 19.0f, arrayList);
                iha.g(12.0f, 13.41f, arrayList);
                iha.g(17.59f, 19.0f, arrayList);
                iha.g(19.0f, 17.59f, arrayList);
                iha.g(13.41f, 12.0f, arrayList);
                iha.b(arrayList);
                igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                hbg.a = igxVar.a();
                igzVar = hbg.a;
                igzVar.getClass();
            }
            geq.b(igzVar, hcb.b(R.string.m3c_snackbar_dismiss, hfdVar), null, 0L, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}

package defpackage;

import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahtx implements ffjm {
    final /* synthetic */ ahuf a;

    public ahtx(ahuf ahufVar) {
        this.a = ahufVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            aicg aicgVar = (aicg) ((MultiShareViewModel) this.a.i.a()).a.b();
            aicp.b(new aicj(aicgVar.a.a(), aicgVar.b.a(), aicgVar.c.a(), aicgVar.d.a(), aicgVar.e.a(), new aici(((auhn) aicgVar.f.b()).a())), hfdVar, 0);
        }
        return ffcu.a;
    }
}

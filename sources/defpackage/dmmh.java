package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmh implements ffjm {
    final /* synthetic */ dmnc a;
    final /* synthetic */ dmnh b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dmpg e;
    final /* synthetic */ float f;

    public dmmh(dmnc dmncVar, dmnh dmnhVar, boolean z, boolean z2, dmpg dmpgVar, float f) {
        this.a = dmncVar;
        this.b = dmnhVar;
        this.c = z;
        this.d = z2;
        this.e = dmpgVar;
        this.f = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int ordinal = this.a.ordinal();
            dnct.a((ordinal == 0 || ordinal == 1) ? Integer.valueOf(R.id.compose_input_magic_compose_growthkit_view) : ordinal != 2 ? ordinal != 5 ? null : Integer.valueOf(R.id.compose_input_voice_growthkit_view) : Integer.valueOf(R.id.compose_input_gallery_growthkit_view), hpx.d(-600982555, new dmmg(this.b, this.a, this.c, this.d, this.e, this.f), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}

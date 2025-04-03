package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smo implements ffjm {
    final /* synthetic */ doui a;
    final /* synthetic */ sme b;
    final /* synthetic */ sms c;
    final /* synthetic */ Uri d;
    final /* synthetic */ smr e;

    public smo(doui douiVar, sme smeVar, sms smsVar, Uri uri, smr smrVar) {
        this.a = douiVar;
        this.b = smeVar;
        this.c = smsVar;
        this.d = uri;
        this.e = smrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doui douiVar = this.a;
            sme smeVar = this.b;
            sms smsVar = this.c;
            Uri uri = this.d;
            smd.a(douiVar, smeVar.a, smsVar.a.a.a(uri), this.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}

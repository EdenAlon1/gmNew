package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smp implements ffjm {
    final /* synthetic */ doui a;
    final /* synthetic */ sme b;
    final /* synthetic */ sms c;
    final /* synthetic */ Uri d;
    final /* synthetic */ smr e;

    public smp(doui douiVar, sme smeVar, sms smsVar, Uri uri, smr smrVar) {
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
            cwoi.a(null, null, false, null, false, hpx.d(-1694996559, new smo(this.a, this.b, this.c, this.d, this.e), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}

package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doex implements ffjn {
    final /* synthetic */ doee a;

    public doex(doee doeeVar) {
        this.a = doeeVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        ((Number) obj).floatValue();
        hfd hfdVar = (hfd) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int em = (int) ((jzn) hfdVar.e(jdr.e)).em(30.0f);
            Uri parse = Uri.parse(this.a.a);
            int i = inp.a;
            inp inpVar = ino.b;
            c = ebs.c(hvi.e, 1.0f);
            Integer valueOf = Integer.valueOf(em);
            dnac.a(parse, "Penpal reaction", c, null, null, null, inpVar, null, 0.0f, valueOf, valueOf, null, null, null, null, null, hfdVar, 12583344, 0, 518008);
        }
        return ffcu.a;
    }
}

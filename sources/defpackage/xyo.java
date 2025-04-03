package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyo implements xyg {
    @Override // defpackage.xyg
    public final Object a(xho xhoVar, xyj xyjVar, String str, ffgu ffguVar) {
        doxs doxsVar = xhoVar.a;
        if (!(doxsVar instanceof drng)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        drng drngVar = (drng) doxsVar;
        xhn xhnVar = xhoVar.b;
        String str2 = drngVar.b;
        Uri uri = xhnVar.c;
        Uri parse = Uri.parse(str2);
        Uri uri2 = uri == null ? parse : uri;
        String a = drjy.a(drngVar.a).a();
        uri2.getClass();
        return new xzc(new xzd(a, uri2, drngVar.e, drngVar.f, xhnVar.b), parse);
    }
}

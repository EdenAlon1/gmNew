package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crky implements rao {
    private final crks a;

    public crky(crks crksVar) {
        this.a = crksVar;
    }

    @Override // defpackage.rao
    public final /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri uri = (Uri) obj;
        uri.getClass();
        qtuVar.getClass();
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        emhuVar.getClass();
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        emhwVar.getClass();
        String authority = uri.getAuthority();
        authority.getClass();
        emhy.b(authority, emhwVar);
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        emhy.c(lastPathSegment, emhwVar);
        emht.b(emhy.a(emhwVar), emhuVar);
        emhv a = emht.a(emhuVar);
        return new ran(new rjn(a), this.a.a(a));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        String authority;
        String lastPathSegment;
        Uri uri = (Uri) obj;
        uri.getClass();
        return (!ffkj.e(uri.getScheme(), "mdd") || (authority = uri.getAuthority()) == null || ffpc.J(authority) || (lastPathSegment = uri.getLastPathSegment()) == null || ffpc.J(lastPathSegment)) ? false : true;
    }
}

package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjr implements erqj {
    final /* synthetic */ efjy a;

    public efjr(efjy efjyVar) {
        this.a = efjyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        new File(this.a.b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}

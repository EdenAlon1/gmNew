package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aanp extends ffkh implements ffji {
    public aanp(Object obj) {
        super(1, obj, aans.class, "navigateToImage", "navigateToImage(Landroid/net/Uri;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        aans aansVar = (aans) this.g;
        axol.k(aansVar.e, null, new aano(aansVar, uri, null), 3);
        return ffcu.a;
    }
}

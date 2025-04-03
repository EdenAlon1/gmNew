package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdux extends ejte {
    final /* synthetic */ bduy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdux(bduy bduyVar, elbx elbxVar) {
        super(elbxVar, "ShareRecentImageSuggestionGenerator.Observer#onChange", erpp.a);
        this.a = bduyVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        if (uri == null) {
            return;
        }
        Set set = this.a.a;
        String uri2 = uri.toString();
        if (set.add(uri2)) {
            bduy bduyVar = this.a;
            bduyVar.b.a(bduyVar.c, uri2, bduyVar.d, bduyVar.a);
        }
    }
}

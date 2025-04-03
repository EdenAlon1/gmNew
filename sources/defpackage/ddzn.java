package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddzn extends cslh {
    final /* synthetic */ Uri a;
    final /* synthetic */ ddzp b;
    final /* synthetic */ ddzq c;
    private String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddzn(ddzq ddzqVar, Uri uri, ddzp ddzpVar) {
        super("Bugle.Async.Compose.PersistVCardToScratchFile.Duration");
        this.a = uri;
        this.b = ddzpVar;
        this.c = ddzqVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String j = this.c.a.j(this.a);
        this.k = j;
        if (!TextUtils.isEmpty(j)) {
            return this.c.a(this.k);
        }
        csjy.n("Bugle", "Could not find lookupKey for the selected contact uri ".concat(this.a.toString()));
        return Uri.EMPTY;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ddzq.b((Uri) obj, this.b);
    }
}

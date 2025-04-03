package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzo extends cslh {
    final /* synthetic */ String a;
    final /* synthetic */ ddzp b;
    final /* synthetic */ ddzq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddzo(ddzq ddzqVar, String str, ddzp ddzpVar) {
        super("Bugle.Async.Compose.PersistVCardToScratchFile.Duration");
        this.a = str;
        this.b = ddzpVar;
        this.c = ddzqVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return this.c.a(this.a);
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ddzq.b((Uri) obj, this.b);
    }
}

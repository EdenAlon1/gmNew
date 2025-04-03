package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzr extends ffhv implements ffjm {
    final /* synthetic */ xzu a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzr(ffgu ffguVar, xzu xzuVar, Uri uri) {
        super(2, ffguVar);
        this.a = xzuVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xzr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Uri c = this.a.b.c(this.b);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Failed to copy " + this.b + " to scratch space");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xzr xzrVar = new xzr(ffguVar, this.a, this.b);
        xzrVar.c = obj;
        return xzrVar;
    }
}

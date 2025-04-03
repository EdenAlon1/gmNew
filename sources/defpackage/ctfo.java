package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfo extends ffhv implements ffjm {
    final /* synthetic */ ctfu a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctfo(ffgu ffguVar, ctfu ctfuVar, Uri uri) {
        super(2, ffguVar);
        this.a = ctfuVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctfo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.b(this.b, new ctfq());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctfo ctfoVar = new ctfo(ffguVar, this.a, this.b);
        ctfoVar.c = obj;
        return ctfoVar;
    }
}

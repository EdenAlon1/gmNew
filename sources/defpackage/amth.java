package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amth extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amtl b;
    final /* synthetic */ amfx c;
    final /* synthetic */ axad d;
    final /* synthetic */ Uri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amth(amtl amtlVar, amfx amfxVar, axad axadVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amtlVar;
        this.c = amfxVar;
        this.d = axadVar;
        this.e = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amth) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amtl amtlVar = this.b;
        amfx amfxVar = this.c;
        axad axadVar = this.d;
        Uri uri = this.e;
        this.a = 1;
        Object c = amtlVar.c(amfxVar, axadVar, uri, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amth(this.b, this.c, this.d, this.e, ffguVar);
    }
}

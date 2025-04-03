package defpackage;

import android.content.ContentValues;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejml extends ffhv implements ffjm {
    final /* synthetic */ ejmp a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ContentValues c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejml(ffgu ffguVar, ejmp ejmpVar, Uri uri, ContentValues contentValues) {
        super(2, ffguVar);
        this.a = ejmpVar;
        this.b = uri;
        this.c = contentValues;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.b.d(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejml ejmlVar = new ejml(ffguVar, this.a, this.b, this.c);
        ejmlVar.d = obj;
        return ejmlVar;
    }
}

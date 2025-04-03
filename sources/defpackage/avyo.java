package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avyo extends ffhv implements ffjm {
    final /* synthetic */ avzh a;
    final /* synthetic */ ContentType b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avyo(ffgu ffguVar, avzh avzhVar, ContentType contentType, Uri uri) {
        super(2, ffguVar);
        this.a = avzhVar;
        this.b = contentType;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.e.n(this.b.toString(), this.c));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avyo avyoVar = new avyo(ffguVar, this.a, this.b, this.c);
        avyoVar.d = obj;
        return avyoVar;
    }
}

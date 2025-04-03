package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emgk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ emgm b;
    final /* synthetic */ Uri c;
    final /* synthetic */ kaf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emgk(emgm emgmVar, Uri uri, kaf kafVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = emgmVar;
        this.c = uri;
        this.d = kafVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emgk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        qqo i2 = ((ekmz) this.b.a.b()).b().i(this.c);
        long j = this.d.a;
        ListenableFuture a = qsl.a((qqo) ((qqo) i2.Q((int) (j >> 32), (int) (j & 4294967295L))).J());
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emgk(this.b, this.c, this.d, ffguVar);
    }
}

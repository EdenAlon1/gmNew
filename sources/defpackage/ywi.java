package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ywq b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywi(ywq ywqVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ywqVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ywq ywqVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            if (ywqVar.c.a(uri, null, null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ywi(this.b, this.c, ffguVar);
    }
}

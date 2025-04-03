package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egst extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egsw b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egst(egsw egswVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egswVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egst) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            egsw egswVar = this.b;
            InputStream b = eepn.b(egswVar.g.a, this.c, eepm.c);
            b.getClass();
            this.a = 1;
            if (egswVar.c(b, "User camera photo", "c", this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egst(this.b, this.c, ffguVar);
    }
}

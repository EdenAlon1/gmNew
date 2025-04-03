package defpackage;

import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqg extends ffhv implements ffji {
    int a;
    final /* synthetic */ drqi b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqg(drqi drqiVar, Uri uri, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drqiVar;
        this.c = uri;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!this.b.e().a) {
                drqi drqiVar = this.b;
                InputStream b = eepn.b(drqiVar.a, this.c, eepm.c);
                b.getClass();
                return b;
            }
            drqi drqiVar2 = this.b;
            Uri uri = this.c;
            eepm eepmVar = eepm.c;
            eepmVar.getClass();
            this.a = 1;
            obj = drqiVar2.b.b(uri, eepmVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return (InputStream) obj;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drqg(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}

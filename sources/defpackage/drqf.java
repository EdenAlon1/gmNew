package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqf extends ffhv implements ffji {
    final /* synthetic */ drqi a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqf(drqi drqiVar, Uri uri, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = drqiVar;
        this.b = uri;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Context context = this.a.a;
        int i = eepn.a;
        InputStream b = eepn.b(context, this.b, eepm.a);
        b.getClass();
        return b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drqf(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}

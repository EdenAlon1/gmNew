package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulh implements drqm {
    public final Context a;
    private final ffhd b;

    public ulh(Context context, ffhd ffhdVar) {
        context.getClass();
        ffhdVar.getClass();
        this.a = context;
        this.b = ffhdVar;
    }

    @Override // defpackage.drqm
    public final Object a(drlx drlxVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new ulg(null, drlxVar, this), ffguVar);
    }

    @Override // defpackage.drqm
    public final Object b(Uri uri) {
        cbgi.j(this.a, uri);
        return ffcu.a;
    }
}

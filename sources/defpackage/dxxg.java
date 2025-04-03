package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxg implements efej {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final dxbv e;

    public dxxg(Context context) {
        dxbv dxbvVar = new dxbv(new dlqb());
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = dxbvVar;
    }

    @Override // defpackage.efej
    public final efei a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.efej
    public final efei b(Uri uri) {
        efei efeiVar;
        synchronized (this.b) {
            efeiVar = (efei) this.d.get(uri);
        }
        return efeiVar;
    }

    @Override // defpackage.efej
    public final void h() {
    }
}

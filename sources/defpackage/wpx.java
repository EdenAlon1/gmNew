package defpackage;

import android.content.LocusId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wpx implements ffji {
    final /* synthetic */ wqj a;

    public wpx(wqj wqjVar) {
        this.a = wqjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        eg G = this.a.b.G();
        if (G != null) {
            G.setLocusContext(new LocusId(str), null);
        }
        return ffcu.a;
    }
}

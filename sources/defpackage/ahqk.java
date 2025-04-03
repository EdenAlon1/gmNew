package defpackage;

import android.content.LocusId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqk implements ffji {
    final /* synthetic */ ahqt a;

    public ahqk(ahqt ahqtVar) {
        this.a = ahqtVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        this.a.b.setLocusContext(new LocusId(str), null);
        return ffcu.a;
    }
}

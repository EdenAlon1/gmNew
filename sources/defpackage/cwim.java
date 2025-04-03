package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwim implements ffxy {
    final /* synthetic */ hzi a;
    final /* synthetic */ dsma b;
    final /* synthetic */ View c;

    public cwim(hzi hziVar, dsma dsmaVar, View view) {
        this.a = hziVar;
        this.b = dsmaVar;
        this.c = view;
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        if (((Boolean) obj).booleanValue()) {
            this.a.b();
            dsma dsmaVar = this.b;
            if (dsmaVar != null) {
                dsmaVar.f(this.c, false);
            }
        }
        return ffcu.a;
    }
}

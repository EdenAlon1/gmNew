package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eza implements ffxy {
    final /* synthetic */ fag a;

    public eza(fag fagVar) {
        this.a = fagVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            fag fagVar = this.a;
            fagVar.a().startStylusHandwriting(fagVar.a);
        }
        return ffcu.a;
    }
}

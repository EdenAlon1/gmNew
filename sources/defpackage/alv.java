package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alv extends ffkk implements ffix {
    final /* synthetic */ alw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alv(alw alwVar) {
        super(0);
        this.a = alwVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Size[] highSpeedVideoSizes = this.a.a.b().b.a.getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? ffdo.J(highSpeedVideoSizes) : ffel.a;
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgj extends ffkk implements ffji {
    final /* synthetic */ hgk a;
    final /* synthetic */ hpz b;
    final /* synthetic */ cog c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgj(hgk hgkVar, hpz hpzVar, cog cogVar, int i) {
        super(1);
        this.a = hgkVar;
        this.b = hpzVar;
        this.c = cogVar;
        this.d = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj == this.a) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof htm) {
            hpz hpzVar = this.b;
            cog cogVar = this.c;
            cogVar.c(obj, Math.min(hpzVar.a - this.d, cogVar.g(obj, Alert.DURATION_SHOW_INDEFINITELY)));
        }
        return ffcu.a;
    }
}

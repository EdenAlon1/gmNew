package androidx.compose.material3;

import defpackage.cxt;
import defpackage.ffkj;
import defpackage.ffqy;
import defpackage.ftb;
import defpackage.fxu;
import defpackage.fxv;
import defpackage.guk;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClockDialModifier extends ivp<fxv> {
    private final ftb a;
    private final boolean b;
    private final int c;
    private final cxt d;

    public ClockDialModifier(ftb ftbVar, boolean z, int i, cxt cxtVar) {
        this.a = ftbVar;
        this.b = z;
        this.c = i;
        this.d = cxtVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new fxv(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        fxv fxvVar = (fxv) hvhVar;
        ftb ftbVar = this.a;
        fxvVar.a = ftbVar;
        fxvVar.b = this.b;
        cxt cxtVar = this.d;
        fxvVar.d = cxtVar;
        int i = fxvVar.c;
        int i2 = this.c;
        if (guk.b(i, i2)) {
            return;
        }
        fxvVar.c = i2;
        ffqy.d(fxvVar.D(), null, null, new fxu(ftbVar, cxtVar, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return ffkj.e(this.a, clockDialModifier.a) && this.b == clockDialModifier.b && guk.b(this.c, clockDialModifier.c) && ffkj.e(this.d, clockDialModifier.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ClockDialModifier(state=" + this.a + ", autoSwitchToMinute=" + this.b + ", selection=" + ((Object) guk.a(this.c)) + ", animationSpec=" + this.d + ')';
    }
}

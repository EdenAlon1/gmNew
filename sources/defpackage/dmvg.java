package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvg implements dmvt {
    public final Context a;
    public final Instant b;
    public final boolean c;
    public final ffji d;
    public final ffji e;
    public final ffji f;
    public final doas g;
    public final doas h;
    public final ffix i;

    public dmvg(Context context, Instant instant, boolean z, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, doas doasVar, doas doasVar2, ffix ffixVar) {
        this.a = context;
        this.b = instant;
        this.c = z;
        this.d = ffjiVar;
        this.e = ffjiVar2;
        this.f = ffjiVar3;
        this.g = doasVar;
        this.h = doasVar2;
        this.i = ffixVar;
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvg)) {
            return false;
        }
        dmvg dmvgVar = (dmvg) obj;
        return ffkj.e(this.a, dmvgVar.a) && ffkj.e(this.b, dmvgVar.b) && this.c == dmvgVar.c && ffkj.e(this.d, dmvgVar.d) && ffkj.e(this.e, dmvgVar.e) && ffkj.e(this.f, dmvgVar.f) && ffkj.e(this.g, dmvgVar.g) && ffkj.e(this.h, dmvgVar.h) && ffkj.e(this.i, dmvgVar.i);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        doas doasVar = this.g;
        int hashCode2 = ((hashCode * 31) + (doasVar == null ? 0 : doasVar.hashCode())) * 31;
        doas doasVar2 = this.h;
        return ((hashCode2 + (doasVar2 != null ? doasVar2.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "DateTimePicker(context=" + this.a + ", initialDateTime=" + this.b + ", display24HourToggle=" + this.c + ", isSelectableYear=" + this.d + ", isSelectableDate=" + this.e + ", onDateTimeSelected=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }
}

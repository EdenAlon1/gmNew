package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmug {
    final /* synthetic */ dmvg a;

    public dmug(dmvg dmvgVar) {
        this.a = dmvgVar;
    }

    public final boolean a(long j) {
        LocalDate b = Instant.ofEpochMilli(j).atZone(ZoneOffset.UTC).b();
        b.getClass();
        return ((Boolean) this.a.e.invoke(b)).booleanValue();
    }

    public final boolean b(int i) {
        return ((Boolean) this.a.d.invoke(Integer.valueOf(i))).booleanValue();
    }
}

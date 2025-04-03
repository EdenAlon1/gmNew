package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebze implements erqj {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ ebzg c;
    private final String d;

    public ebze(ebzg ebzgVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = ebzgVar;
        this.d = ebwo.a(ebzgVar.d);
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int min = Math.min(((engw) obj).size(), 10);
        ebzg ebzgVar = this.c;
        ebzgVar.b.e(this.d, "OK", min, ebzgVar.c, this.a);
        long epochMilli = Instant.now().toEpochMilli() - this.b;
        ebzg ebzgVar2 = this.c;
        ebzgVar2.b.h(epochMilli, this.d, "OK", min, ebzgVar2.c, this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        String str = this.d;
        String a = eboa.a(th);
        ebzg ebzgVar = this.c;
        ebzgVar.b.e(str, a, -1, ebzgVar.c, this.a);
        long epochMilli = Instant.now().toEpochMilli() - this.b;
        ebzg ebzgVar2 = this.c;
        ebzgVar2.b.h(epochMilli, this.d, a, -1, ebzgVar2.c, this.a);
    }
}

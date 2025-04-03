package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebzc implements erqj {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ ebzd c;
    final /* synthetic */ int d;
    private final String e;
    private final String f;

    public ebzc(ebzd ebzdVar, int i, boolean z, long j) {
        this.d = i;
        this.a = z;
        this.b = j;
        this.c = ebzdVar;
        this.e = ebwo.a(ebzdVar.c);
        this.f = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        ebzd ebzdVar = this.c;
        ebzdVar.a.c(this.e, this.f, str, ebzdVar.b, z);
        long epochMilli = Instant.now().toEpochMilli() - this.b;
        boolean z2 = this.a;
        ebzd ebzdVar2 = this.c;
        ebzdVar2.a.g(epochMilli, this.e, this.f, str, ebzdVar2.b, z2);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        String str = this.f;
        String a = eboa.a(th);
        ebzd ebzdVar = this.c;
        ebzdVar.a.c(this.e, str, a, ebzdVar.b, this.a);
        long epochMilli = Instant.now().toEpochMilli() - this.b;
        ebzd ebzdVar2 = this.c;
        ebzdVar2.a.g(epochMilli, this.e, this.f, a, ebzdVar2.b, this.a);
    }
}

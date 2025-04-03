package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edx extends eej {
    final /* synthetic */ boolean a;
    final /* synthetic */ ejq b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ hun e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ long i;
    final /* synthetic */ eey j;
    final /* synthetic */ hus k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edx(long j, boolean z, edr edrVar, ejq ejqVar, int i, int i2, hun hunVar, hus husVar, boolean z2, int i3, int i4, long j2, eey eeyVar) {
        super(j, z, edrVar, ejqVar);
        this.a = z;
        this.b = ejqVar;
        this.c = i;
        this.d = i2;
        this.e = hunVar;
        this.k = husVar;
        this.f = z2;
        this.g = i3;
        this.h = i4;
        this.i = j2;
        this.j = eeyVar;
    }

    @Override // defpackage.eej
    public final eei a(int i, Object obj, Object obj2, List list, long j) {
        int i2 = i == this.c + (-1) ? 0 : this.d;
        return new eei(i, list, this.a, this.e, this.k, this.b.q(), this.f, this.g, this.h, i2, this.i, obj, obj2, this.j.j, j);
    }
}

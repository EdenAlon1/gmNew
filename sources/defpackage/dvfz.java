package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfz implements ealb {
    public static final entd a = entd.c("GnpSdk");
    public final ffbr b;
    public final fazb c;
    public final String d;
    public final dvft e;
    public final String f;
    private final ffhd g;
    private final int h;

    public dvfz(ffhd ffhdVar, ffbr ffbrVar, fazb fazbVar, String str, dvft dvftVar, String str2, int i) {
        this.g = ffhdVar;
        this.b = ffbrVar;
        this.c = fazbVar;
        this.d = str;
        this.e = dvftVar;
        this.f = str2;
        this.h = i;
    }

    @Override // defpackage.ealb
    public final int a() {
        return this.h;
    }

    @Override // defpackage.ealb
    public final long b() {
        return this.e.b();
    }

    @Override // defpackage.ealb
    public final Long c() {
        return Long.valueOf(this.e.a());
    }

    @Override // defpackage.ealb
    public final Object d(Bundle bundle, ffgu ffguVar) {
        a.o().q("Executing GnpJobGrowthKitWrapper");
        return ffra.a(this.g, new dvfy(this, null), ffguVar);
    }

    @Override // defpackage.ealb
    public final String e() {
        return this.f;
    }

    @Override // defpackage.ealb
    public final boolean f() {
        return this.e.d();
    }

    @Override // defpackage.ealb
    public final boolean g() {
        return this.e.e();
    }

    @Override // defpackage.ealb
    public final int h() {
        return this.e.f() + (-1) != 0 ? 2 : 1;
    }

    @Override // defpackage.ealb
    public final int i() {
        return this.e.g() + (-1) != 1 ? 1 : 2;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqk implements ealb {
    public static final entd a = entd.c("GnpSdk");
    public final Context b;
    public final ffbr c;
    public final dvpl d;
    private final ffhd e;
    private final String f;

    public dvqk(Context context, ffhd ffhdVar, ffbr ffbrVar, dvpl dvplVar) {
        context.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        dvplVar.getClass();
        this.b = context;
        this.e = ffhdVar;
        this.c = ffbrVar;
        this.d = dvplVar;
        this.f = "GNP_IN_APP_ACCOUNT_SYNC";
    }

    @Override // defpackage.ealb
    public final int a() {
        return 16;
    }

    @Override // defpackage.ealb
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ealb
    public final Long c() {
        return null;
    }

    @Override // defpackage.ealb
    public final Object d(Bundle bundle, ffgu ffguVar) {
        return ffra.a(this.e, new dvqi(this, bundle, null), ffguVar);
    }

    @Override // defpackage.ealb
    public final String e() {
        return this.f;
    }

    @Override // defpackage.ealb
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ealb
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ealb
    public final int h() {
        return 2;
    }

    @Override // defpackage.ealb
    public final int i() {
        return 1;
    }

    public final Object j(Exception exc, ffgu ffguVar) {
        return ffra.a(this.e, new dvqj(exc, null), ffguVar);
    }
}

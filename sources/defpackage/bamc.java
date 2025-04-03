package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamc extends ffhv implements ffjm {
    final /* synthetic */ bamw a;
    final /* synthetic */ Uri b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ long h;
    final /* synthetic */ lx i;
    final /* synthetic */ long j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bamc(ffgu ffguVar, bamw bamwVar, Uri uri, int i, String str, String str2, String str3, boolean z, long j, lx lxVar, long j2) {
        super(2, ffguVar);
        this.a = bamwVar;
        this.b = uri;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = j;
        this.i = lxVar;
        this.j = j2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bamc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bamw.a;
        bamw bamwVar = this.a;
        return bamwVar.m.r(bamwVar.c, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bamc bamcVar = new bamc(ffguVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        bamcVar.k = obj;
        return bamcVar;
    }
}

package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpae extends ffhv implements ffjm {
    final /* synthetic */ cpaf a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpae(cpaf cpafVar, String str, long j, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cpafVar;
        this.b = str;
        this.c = j;
        this.d = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cpaf cpafVar = this.a;
        axol.k(cpafVar.b, null, new cpad(cpafVar, this.b, this.c, this.d, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpae(this.a, this.b, this.c, this.d, ffguVar);
    }
}

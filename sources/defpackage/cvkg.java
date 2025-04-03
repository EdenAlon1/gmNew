package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvkg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    final /* synthetic */ Instant c;
    final /* synthetic */ enip d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvkg(ffgu ffguVar, cvki cvkiVar, Instant instant, enip enipVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
        this.c = instant;
        this.d = enipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvkg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cvki cvkiVar = this.b;
        cvkh cvkhVar = new cvkh(this.c, this.d);
        this.a = 1;
        Object d = cvkiVar.a.d(cvkhVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvkg cvkgVar = new cvkg(ffguVar, this.b, this.c, this.d);
        cvkgVar.e = obj;
        return cvkgVar;
    }
}

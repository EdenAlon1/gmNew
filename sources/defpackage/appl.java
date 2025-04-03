package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class appl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alxj b;
    final /* synthetic */ apmq c;
    final /* synthetic */ appm d;
    final /* synthetic */ boolean e;
    final /* synthetic */ long f;
    final /* synthetic */ boolean g;
    final /* synthetic */ String h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public appl(ffgu ffguVar, alxj alxjVar, apmq apmqVar, appm appmVar, boolean z, long j, boolean z2, String str) {
        super(2, ffguVar);
        this.b = alxjVar;
        this.c = apmqVar;
        this.d = appmVar;
        this.e = z;
        this.f = j;
        this.g = z2;
        this.h = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((appl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Optional m;
        Optional e;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqux f = this.b.f();
        awui awuiVar = null;
        if (f != null && (m = f.m()) != null && (e = ((aoku) m.get()).e()) != null) {
            awuiVar = (awui) e.get();
        }
        String b = this.c.b();
        b.getClass();
        awup b2 = awuq.b(b);
        ((ensz) appm.a.h()).D("Original content type: %s. Resolved content type: %s", this.c.b(), b2);
        appm appmVar = this.d;
        awar awarVar = (awar) awas.a.createBuilder();
        awarVar.getClass();
        String uri = this.c.e().toString();
        uri.getClass();
        awarVar.copyOnWrite();
        awas awasVar = (awas) awarVar.instance;
        awasVar.b |= 1;
        awasVar.c = uri;
        awarVar.copyOnWrite();
        awas awasVar2 = (awas) awarVar.instance;
        awasVar2.d = b2;
        awasVar2.b |= 2;
        boolean z = this.e;
        awarVar.copyOnWrite();
        awas awasVar3 = (awas) awarVar.instance;
        awasVar3.b |= 8;
        awasVar3.f = z;
        long j = this.f;
        awarVar.copyOnWrite();
        awas awasVar4 = (awas) awarVar.instance;
        awasVar4.b |= 4;
        awasVar4.e = j;
        if (awuiVar != null) {
            awarVar.copyOnWrite();
            awas awasVar5 = (awas) awarVar.instance;
            awasVar5.g = awuiVar;
            awasVar5.b |= 16;
        }
        awab awabVar = appmVar.c;
        boolean z2 = this.g;
        awarVar.copyOnWrite();
        awas awasVar6 = (awas) awarVar.instance;
        awasVar6.b |= 32;
        awasVar6.h = z2;
        String str = this.h;
        str.getClass();
        awarVar.copyOnWrite();
        awas awasVar7 = (awas) awarVar.instance;
        awasVar7.b |= 64;
        awasVar7.i = str;
        cfmh cfmhVar = cfmh.a;
        long a = cfmg.a(this.b.h());
        awarVar.copyOnWrite();
        awas awasVar8 = (awas) awarVar.instance;
        awasVar8.b |= 128;
        awasVar8.j = a;
        eyfy build = awarVar.build();
        build.getClass();
        this.a = 1;
        Object g = ((awaa) awabVar).c.g((awas) build, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        appl applVar = new appl(ffguVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        applVar.i = obj;
        return applVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgf {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public adgf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final addo a(int i) {
        cpbn a = ((cpbs) this.a.b()).a(i);
        cpbw cpbwVar = (cpbw) this.b.b();
        int g = a.g();
        int d = a.d();
        boolean r = a.r();
        boolean c = ((cpbw) this.b.b()).c(i);
        boolean d2 = cpbwVar.d(i);
        addk addkVar = (addk) addl.a.createBuilder();
        addkVar.copyOnWrite();
        ((addl) addkVar.instance).b = g;
        addkVar.copyOnWrite();
        ((addl) addkVar.instance).c = d;
        addkVar.copyOnWrite();
        ((addl) addkVar.instance).d = r;
        addkVar.copyOnWrite();
        ((addl) addkVar.instance).e = c;
        addkVar.copyOnWrite();
        ((addl) addkVar.instance).f = d2;
        addl addlVar = (addl) addkVar.build();
        int a2 = cpbwVar.a(i);
        int h = a.h();
        boolean e = cpbwVar.e(i);
        addm addmVar = (addm) addn.a.createBuilder();
        addmVar.copyOnWrite();
        ((addn) addmVar.instance).b = a2;
        addmVar.copyOnWrite();
        ((addn) addmVar.instance).d = h;
        addmVar.copyOnWrite();
        ((addn) addmVar.instance).c = e;
        addn addnVar = (addn) addmVar.build();
        addj addjVar = (addj) addo.a.createBuilder();
        addjVar.copyOnWrite();
        addo addoVar = (addo) addjVar.instance;
        addlVar.getClass();
        addoVar.c = addlVar;
        addoVar.b |= 1;
        addjVar.copyOnWrite();
        addo addoVar2 = (addo) addjVar.instance;
        addnVar.getClass();
        addoVar2.d = addnVar;
        addoVar2.b |= 2;
        final addo addoVar3 = (addo) addjVar.build();
        ((akno) this.c.b()).a(i).b.j(new emwl() { // from class: aknm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return addo.this;
            }
        });
        return addoVar3;
    }
}

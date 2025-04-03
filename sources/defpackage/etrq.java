package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class etrq implements etft {
    final String a;
    final Class b;
    final int c;

    public etrq(String str, Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    @Override // defpackage.etft
    public final etzm a(eyee eyeeVar) {
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).b = this.a;
        etzoVar.copyOnWrite();
        etzp etzpVar = (etzp) etzoVar.instance;
        eyeeVar.getClass();
        etzpVar.c = eyeeVar;
        euag euagVar = euag.RAW;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar.a();
        etti c = etsh.a.c(etry.a.a(etsh.a.b(ette.a((etzp) etzoVar.build())), null), ettd.class, etgk.a);
        etzk etzkVar = (etzk) etzm.a.createBuilder();
        ettd ettdVar = (ettd) c;
        String str = ettdVar.a;
        etzkVar.copyOnWrite();
        etzm etzmVar = (etzm) etzkVar.instance;
        str.getClass();
        etzmVar.b = str;
        eyee eyeeVar2 = ettdVar.c;
        etzkVar.copyOnWrite();
        etzm etzmVar2 = (etzm) etzkVar.instance;
        eyeeVar2.getClass();
        etzmVar2.c = eyeeVar2;
        int i = ettdVar.f;
        etzkVar.copyOnWrite();
        ((etzm) etzkVar.instance).d = etzl.a(i);
        return (etzm) etzkVar.build();
    }

    @Override // defpackage.etft
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.etft
    public final Object c(eyee eyeeVar) {
        return etse.a.a(etsh.a.a(ettd.a(this.a, eyeeVar, this.c, euag.RAW, null), etgk.a), this.b);
    }

    @Override // defpackage.etft
    public final String d() {
        return this.a;
    }
}

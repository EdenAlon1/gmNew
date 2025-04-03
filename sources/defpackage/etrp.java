package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrp extends etrq implements etft {
    public etrp(String str, Class cls) {
        super(str, cls, 4);
    }

    public final etzm e(eyee eyeeVar) {
        Object a = etsh.a.a(ettd.a(this.a, eyeeVar, this.c, euag.RAW, null), etgk.a);
        if (!(a instanceof etgg)) {
            throw new GeneralSecurityException("Key not private key");
        }
        etti c = etsh.a.c(((etgg) a).b(), ettd.class, etgk.a);
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
}

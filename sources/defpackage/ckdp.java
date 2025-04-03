package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class ckdp {
    static {
        emyl emylVar = ckds.a;
    }

    public static eqxi a() {
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.b |= 1;
        eqxkVar.c = -1;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.e = 2;
        eqxkVar2.b |= 4;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        return (eqxi) eqxhVar.build();
    }

    public static ckbx b(boolean z, Uri uri) {
        ckbw j = ckbx.j(true != z ? 3 : 1, 0);
        ((ckaw) j).c = uri;
        j.b(1);
        return j.a();
    }
}

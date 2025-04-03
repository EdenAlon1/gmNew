package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmt {
    private final Context a;
    private final dikt b;

    public djmt(Context context, dikt diktVar) {
        this.a = context;
        this.b = diktVar;
    }

    final void a(String str, String str2, int i) {
        eywg eywgVar = (eywg) eywh.a.createBuilder();
        eywgVar.copyOnWrite();
        eywh eywhVar = (eywh) eywgVar.instance;
        str.getClass();
        eywhVar.b |= 2;
        eywhVar.d = str;
        eywgVar.copyOnWrite();
        eywh eywhVar2 = (eywh) eywgVar.instance;
        str2.getClass();
        eywhVar2.b |= 1;
        eywhVar2.c = str2;
        eyvz eyvzVar = (eyvz) eywb.a.createBuilder();
        eyvzVar.copyOnWrite();
        eywb eywbVar = (eywb) eyvzVar.instance;
        eywbVar.b |= 1;
        eywbVar.c = i;
        eyvzVar.copyOnWrite();
        eywb eywbVar2 = (eywb) eyvzVar.instance;
        eywbVar2.d = 3;
        eywbVar2.b |= 2;
        eywgVar.copyOnWrite();
        eywh eywhVar3 = (eywh) eywgVar.instance;
        eywb eywbVar3 = (eywb) eyvzVar.build();
        eywbVar3.getClass();
        eywhVar3.i = eywbVar3;
        eywhVar3.b |= 64;
        b((eywh) eywgVar.build());
    }

    public final void b(eywh eywhVar) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 4;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b = 4 | eyvvVar2.b;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eywhVar.getClass();
        eyvvVar3.d = eywhVar;
        eyvvVar3.c = 6;
        this.b.h(this.a, (eyvv) eyvuVar.build());
    }
}

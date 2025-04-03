package defpackage;

import android.content.Context;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrf implements djqz, djri, djra, djqy {
    public static final Predicate a = new Predicate() { // from class: djre
        public final /* synthetic */ Predicate and(Predicate predicate) {
            return Predicate$CC.$default$and(this, predicate);
        }

        @Override // java.util.function.Predicate
        /* renamed from: negate */
        public final /* synthetic */ Predicate mo439negate() {
            return Predicate$CC.$default$negate(this);
        }

        public final /* synthetic */ Predicate or(Predicate predicate) {
            return Predicate$CC.$default$or(this, predicate);
        }

        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            Predicate predicate = djrf.a;
            int ordinal = ((eyvl) obj).ordinal();
            return ordinal == 2 || ordinal == 3;
        }
    };
    static final diyy b = dizd.a(202898879);
    private final Context c;
    private final dikt d;

    public djrf(Context context, dikt diktVar) {
        this.c = context;
        this.d = diktVar;
    }

    private static eyvv k(int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eyus eyusVar = (eyus) eyuu.a.createBuilder();
        eyusVar.copyOnWrite();
        eyuu eyuuVar = (eyuu) eyusVar.instance;
        eyuuVar.c = i - 1;
        eyuuVar.b |= 1;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyuu eyuuVar2 = (eyuu) eyusVar.build();
        eyuuVar2.getClass();
        eyuwVar.c = eyuuVar2;
        eyuwVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        return (eyvv) eyvuVar.build();
    }

    @Override // defpackage.djqz
    public final void a() {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eytz eytzVar = (eytz) eyub.a.createBuilder();
        eytzVar.copyOnWrite();
        eyub eyubVar = (eyub) eytzVar.instance;
        eyubVar.b |= 8;
        eyubVar.f = false;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyub eyubVar2 = (eyub) eytzVar.build();
        eyubVar2.getClass();
        eyuwVar.d = eyubVar2;
        eyuwVar.b |= 4;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }

    @Override // defpackage.djqz
    public final void b(int i, boolean z, boolean z2) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eytz eytzVar = (eytz) eyub.a.createBuilder();
        eytzVar.copyOnWrite();
        eyub eyubVar = (eyub) eytzVar.instance;
        eyubVar.c = i - 1;
        eyubVar.b |= 1;
        eytzVar.copyOnWrite();
        eyub eyubVar2 = (eyub) eytzVar.instance;
        eyubVar2.b = 2 | eyubVar2.b;
        eyubVar2.d = z;
        eytzVar.copyOnWrite();
        eyub eyubVar3 = (eyub) eytzVar.instance;
        eyubVar3.b |= 4;
        eyubVar3.e = z2;
        eytzVar.copyOnWrite();
        eyub eyubVar4 = (eyub) eytzVar.instance;
        eyubVar4.b |= 8;
        eyubVar4.f = true;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyub eyubVar5 = (eyub) eytzVar.build();
        eyubVar5.getClass();
        eyuwVar.d = eyubVar5;
        eyuwVar.b |= 4;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }

    @Override // defpackage.djra
    public final void c(int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eyus eyusVar = (eyus) eyuu.a.createBuilder();
        eyusVar.copyOnWrite();
        eyuu eyuuVar = (eyuu) eyusVar.instance;
        eyuuVar.c = 4;
        eyuuVar.b |= 1;
        eyusVar.copyOnWrite();
        eyuu eyuuVar2 = (eyuu) eyusVar.instance;
        eyuuVar2.b |= 2;
        eyuuVar2.d = i;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyuu eyuuVar3 = (eyuu) eyusVar.build();
        eyuuVar3.getClass();
        eyuwVar.c = eyuuVar3;
        eyuwVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }

    @Override // defpackage.djra
    public final void d() {
        h(k(4));
    }

    @Override // defpackage.djra
    public final void e(boolean z) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eyus eyusVar = (eyus) eyuu.a.createBuilder();
        eyusVar.copyOnWrite();
        eyuu eyuuVar = (eyuu) eyusVar.instance;
        eyuuVar.c = 1;
        eyuuVar.b = 1 | eyuuVar.b;
        eyusVar.copyOnWrite();
        eyuu eyuuVar2 = (eyuu) eyusVar.instance;
        eyuuVar2.b |= 4;
        eyuuVar2.e = z;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyuu eyuuVar3 = (eyuu) eyusVar.build();
        eyuuVar3.getClass();
        eyuwVar.c = eyuuVar3;
        eyuwVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }

    @Override // defpackage.djra
    public final void f() {
        h(k(3));
    }

    @Override // defpackage.djra
    public final void g() {
        h(k(6));
    }

    public final void h(eyvv eyvvVar) {
        if (((Boolean) b.a()).booleanValue()) {
            this.d.h(this.c, eyvvVar);
        }
    }

    @Override // defpackage.djri
    public final void i(eyxc eyxcVar, eyxa eyxaVar, eywy eywyVar, int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 3;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eyww eywwVar = (eyww) eyxd.a.createBuilder();
        eywwVar.copyOnWrite();
        eyxd eyxdVar = (eyxd) eywwVar.instance;
        eyxdVar.c = eyxcVar.d;
        eyxdVar.b |= 1;
        eywwVar.copyOnWrite();
        eyxd eyxdVar2 = (eyxd) eywwVar.instance;
        eyxdVar2.b |= 16;
        eyxdVar2.g = i;
        eywwVar.copyOnWrite();
        eyxd eyxdVar3 = (eyxd) eywwVar.instance;
        eyxdVar3.b |= 2;
        eyxdVar3.d = false;
        eywwVar.copyOnWrite();
        eyxd eyxdVar4 = (eyxd) eywwVar.instance;
        eyxdVar4.e = eywyVar.j;
        eyxdVar4.b |= 4;
        eywwVar.copyOnWrite();
        eyxd eyxdVar5 = (eyxd) eywwVar.instance;
        eyxdVar5.h = eyxaVar.l;
        eyxdVar5.b |= 32;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyxd eyxdVar6 = (eyxd) eywwVar.build();
        eyxdVar6.getClass();
        eyuwVar.e = eyxdVar6;
        eyuwVar.b |= 8;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }

    @Override // defpackage.djri
    public final void j(eyxc eyxcVar, eyxa eyxaVar, eywy eywyVar, String str, int i) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 3;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 3;
        eyvvVar2.b |= 4;
        eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
        eyww eywwVar = (eyww) eyxd.a.createBuilder();
        eywwVar.copyOnWrite();
        eyxd eyxdVar = (eyxd) eywwVar.instance;
        eyxdVar.c = eyxcVar.d;
        eyxdVar.b |= 1;
        eywwVar.copyOnWrite();
        eyxd eyxdVar2 = (eyxd) eywwVar.instance;
        eyxdVar2.b |= 16;
        eyxdVar2.g = i;
        eywwVar.copyOnWrite();
        eyxd eyxdVar3 = (eyxd) eywwVar.instance;
        eyxdVar3.b |= 2;
        eyxdVar3.d = false;
        eywwVar.copyOnWrite();
        eyxd eyxdVar4 = (eyxd) eywwVar.instance;
        eyxdVar4.e = eywyVar.j;
        eyxdVar4.b |= 4;
        eywwVar.copyOnWrite();
        eyxd eyxdVar5 = (eyxd) eywwVar.instance;
        eyxdVar5.b |= 64;
        eyxdVar5.i = emxe.b(str);
        eywwVar.copyOnWrite();
        eyxd eyxdVar6 = (eyxd) eywwVar.instance;
        eyxdVar6.h = eyxaVar.l;
        eyxdVar6.b |= 32;
        eyuvVar.copyOnWrite();
        eyuw eyuwVar = (eyuw) eyuvVar.instance;
        eyxd eyxdVar7 = (eyxd) eywwVar.build();
        eyxdVar7.getClass();
        eyuwVar.e = eyxdVar7;
        eyuwVar.b |= 8;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyuw eyuwVar2 = (eyuw) eyuvVar.build();
        eyuwVar2.getClass();
        eyvvVar3.d = eyuwVar2;
        eyvvVar3.c = 9;
        h((eyvv) eyvuVar.build());
    }
}

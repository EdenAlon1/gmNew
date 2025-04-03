package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clky extends cljn {
    private final ffbr a;
    private final ffbr b;

    public clky(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cljn
    /* renamed from: a */
    public final awvt apply(clqi clqiVar) {
        emxf.b(clqiVar.c == 3, "Unexpected missing groupEvent");
        emxf.b(!(clqiVar.c == 3 ? (clot) clqiVar.d : clot.a).b.isEmpty(), "Unexpected empty changedMember");
        awvs awvsVar = (awvs) awvt.c.createBuilder();
        clns clnsVar = clqiVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        awvsVar.copyOnWrite();
        awvt awvtVar = (awvt) awvsVar.instance;
        str.getClass();
        awvtVar.d |= 1;
        awvtVar.e = str;
        avkc avkcVar = (avkc) this.a.b();
        for (cloz clozVar : (clqiVar.c == 3 ? (clot) clqiVar.d : clot.a).b) {
            int i = clozVar.g;
            cloy b = cloy.b(i);
            if (b == null) {
                b = cloy.UNKNOWN_TYPE;
            }
            if (b != cloy.PRESENT) {
                cloy b2 = cloy.b(i);
                if (b2 == null) {
                    b2 = cloy.UNKNOWN_TYPE;
                }
                if (b2 == cloy.PENDING) {
                }
            }
            clqv clqvVar = clozVar.d;
            if (clqvVar == null) {
                clqvVar = clqv.a;
            }
            awvsVar.a(avkcVar.a((clqvVar.b == 1 ? (clqq) clqvVar.c : clqq.a).c, false));
        }
        avkc avkcVar2 = (avkc) this.a.b();
        for (cloz clozVar2 : (clqiVar.c == 3 ? (clot) clqiVar.d : clot.a).b) {
            cloy b3 = cloy.b(clozVar2.g);
            if (b3 == null) {
                b3 = cloy.UNKNOWN_TYPE;
            }
            if (b3 == cloy.ABSENT) {
                clqv clqvVar2 = clozVar2.d;
                if (clqvVar2 == null) {
                    clqvVar2 = clqv.a;
                }
                awvsVar.b(avkcVar2.a((clqvVar2.b == 1 ? (clqq) clqvVar2.c : clqq.a).c, false));
            }
        }
        awxe awxeVar = (awxe) awxf.a.createBuilder();
        avkc avkcVar3 = (avkc) this.a.b();
        clqv clqvVar3 = ((cloz) (clqiVar.c == 3 ? (clot) clqiVar.d : clot.a).b.get(0)).e;
        if (clqvVar3 == null) {
            clqvVar3 = clqv.a;
        }
        awui a = avkcVar3.a((clqvVar3.b == 1 ? (clqq) clqvVar3.c : clqq.a).c, false);
        awxeVar.copyOnWrite();
        awxf awxfVar = (awxf) awxeVar.instance;
        a.getClass();
        awxfVar.c = a;
        awxfVar.b |= 1;
        awxf awxfVar2 = (awxf) awxeVar.build();
        awvsVar.copyOnWrite();
        awvt awvtVar2 = (awvt) awvsVar.instance;
        awxfVar2.getClass();
        awvtVar2.p = awxfVar2;
        awvtVar2.d |= 128;
        awui awuiVar = (awui) ((chco) this.b.b()).c().orElseThrow(new Supplier() { // from class: clkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
        awvsVar.copyOnWrite();
        awvt awvtVar3 = (awvt) awvsVar.instance;
        awuiVar.getClass();
        awvtVar3.r = awuiVar;
        awvtVar3.d |= 512;
        return (awvt) awvsVar.build();
    }

    @Override // defpackage.cljn, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((clqi) obj);
    }
}

package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllc extends cljo {
    public static final cllb a = new cllb();
    private final ffbr b;

    public cllc(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.cljo
    /* renamed from: a */
    public final awvy apply(final clqi clqiVar) {
        emxf.b(clqiVar.c == 4, "Unexpected missing groupInformation");
        cltf cltfVar = (clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).e;
        if (cltfVar == null) {
            cltfVar = cltf.a;
        }
        emxf.b(!cltfVar.c.isEmpty(), "Unexpected empty conversation URI ");
        emxf.b(!r0.c.isEmpty(), "Unexpected empty group conversation id");
        awvx awvxVar = (awvx) awvy.b.createBuilder();
        clns clnsVar = clqiVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        awvxVar.copyOnWrite();
        awvy awvyVar = (awvy) awvxVar.instance;
        str.getClass();
        awvyVar.c |= 1;
        awvyVar.d = str;
        awuf awufVar = (awuf) awui.a.createBuilder();
        awuh awuhVar = awuh.GROUP;
        awufVar.copyOnWrite();
        awui awuiVar = (awui) awufVar.instance;
        awuiVar.c = awuhVar.f;
        awuiVar.b |= 1;
        clns clnsVar2 = clqiVar.e;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqv clqvVar = clnsVar2.d;
        if (clqvVar == null) {
            clqvVar = clqv.a;
        }
        String str2 = (clqvVar.b == 2 ? (cltf) clqvVar.c : cltf.a).c;
        awufVar.copyOnWrite();
        awui awuiVar2 = (awui) awufVar.instance;
        str2.getClass();
        awuiVar2.b |= 2;
        awuiVar2.d = str2;
        awui awuiVar3 = (awui) awufVar.build();
        awvxVar.copyOnWrite();
        awvy awvyVar2 = (awvy) awvxVar.instance;
        awuiVar3.getClass();
        awvyVar2.f = awuiVar3;
        awvyVar2.c |= 4;
        int i = clqiVar.c;
        if (((i == 4 ? (clov) clqiVar.d : clov.a).b & 8) != 0) {
            clor clorVar = (i == 4 ? (clov) clqiVar.d : clov.a).g;
            if (clorVar == null) {
                clorVar = clor.a;
            }
            if (clorVar.c) {
                awvxVar.c(awvh.SUBJECT_UPDATE);
            }
            clor clorVar2 = (clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).g;
            if (clorVar2 == null) {
                clorVar2 = clor.a;
            }
            int a2 = cloq.a(clorVar2.d);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                awvxVar.c(awvh.REMOVE_PARTICIPANT_BY_ADMIN);
            } else if (i2 == 2) {
                awvxVar.c(awvh.REMOVE_PARTICIPANT_BY_ALL);
            }
        }
        Stream map = Collection.EL.stream((clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).f).map(new Function() { // from class: clla
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cloz clozVar = (cloz) obj;
                awwn awwnVar = (awwn) awwq.a.createBuilder();
                clqi clqiVar2 = clqi.this;
                clns clnsVar3 = clqiVar2.e;
                if (clnsVar3 == null) {
                    clnsVar3 = clns.a;
                }
                clqv clqvVar2 = clozVar.d;
                if (clqvVar2 == null) {
                    clqvVar2 = clqv.a;
                }
                awui a3 = cllk.a(clnsVar3, clqvVar2);
                awwnVar.copyOnWrite();
                awwq awwqVar = (awwq) awwnVar.instance;
                a3.getClass();
                awwqVar.c = a3;
                awwqVar.b |= 1;
                cllb cllbVar = cllc.a;
                cloy b = cloy.b(clozVar.g);
                if (b == null) {
                    b = cloy.UNKNOWN_TYPE;
                }
                awwp awwpVar = (awwp) cllbVar.fP(b);
                awwnVar.copyOnWrite();
                awwq awwqVar2 = (awwq) awwnVar.instance;
                awwqVar2.d = awwpVar.e;
                awwqVar2.b |= 2;
                if ((clozVar.b & 4) != 0) {
                    awxe awxeVar = (awxe) awxf.a.createBuilder();
                    clns clnsVar4 = clqiVar2.e;
                    if (clnsVar4 == null) {
                        clnsVar4 = clns.a;
                    }
                    clqv clqvVar3 = clozVar.e;
                    if (clqvVar3 == null) {
                        clqvVar3 = clqv.a;
                    }
                    awui a4 = cllk.a(clnsVar4, clqvVar3);
                    awxeVar.copyOnWrite();
                    awxf awxfVar = (awxf) awxeVar.instance;
                    a4.getClass();
                    awxfVar.c = a4;
                    awxfVar.b |= 1;
                    awwnVar.copyOnWrite();
                    awwq awwqVar3 = (awwq) awwnVar.instance;
                    awxf awxfVar2 = (awxf) awxeVar.build();
                    awxfVar2.getClass();
                    awwqVar3.e = awxfVar2;
                    awwqVar3.b |= 4;
                }
                return (awwq) awwnVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = engw.d;
        awvxVar.b((Iterable) map.collect(endq.a));
        if (((clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).b & 2) != 0) {
            awwx awwxVar = (awwx) awwy.a.createBuilder();
            String str3 = (clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).d;
            awwxVar.copyOnWrite();
            awwy awwyVar = (awwy) awwxVar.instance;
            str3.getClass();
            awwyVar.b |= 1;
            awwyVar.c = str3;
            if (((clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).b & 16) != 0) {
                awxe awxeVar = (awxe) awxf.a.createBuilder();
                clns clnsVar3 = clqiVar.e;
                if (clnsVar3 == null) {
                    clnsVar3 = clns.a;
                }
                clsl clslVar = (clqiVar.c == 4 ? (clov) clqiVar.d : clov.a).h;
                if (clslVar == null) {
                    clslVar = clsl.a;
                }
                clqv clqvVar2 = clslVar.c;
                if (clqvVar2 == null) {
                    clqvVar2 = clqv.a;
                }
                awui a3 = cllk.a(clnsVar3, clqvVar2);
                awxeVar.copyOnWrite();
                awxf awxfVar = (awxf) awxeVar.instance;
                a3.getClass();
                awxfVar.c = a3;
                awxfVar.b = 1 | awxfVar.b;
                int i4 = clqiVar.c;
                clsl clslVar2 = (i4 == 4 ? (clov) clqiVar.d : clov.a).h;
                if (clslVar2 == null) {
                    clslVar2 = clsl.a;
                }
                if ((clslVar2.b & 2) != 0) {
                    clsl clslVar3 = (i4 == 4 ? (clov) clqiVar.d : clov.a).h;
                    if (clslVar3 == null) {
                        clslVar3 = clsl.a;
                    }
                    eyja eyjaVar = clslVar3.d;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    awxeVar.copyOnWrite();
                    awxf awxfVar2 = (awxf) awxeVar.instance;
                    eyjaVar.getClass();
                    awxfVar2.d = eyjaVar;
                    awxfVar2.b |= 2;
                }
                awwxVar.copyOnWrite();
                awwy awwyVar2 = (awwy) awwxVar.instance;
                awxf awxfVar3 = (awxf) awxeVar.build();
                awxfVar3.getClass();
                awwyVar2.d = awxfVar3;
                awwyVar2.b |= 2;
            }
            awvxVar.copyOnWrite();
            awvy awvyVar3 = (awvy) awvxVar.instance;
            awwy awwyVar3 = (awwy) awwxVar.build();
            awwyVar3.getClass();
            awvyVar3.i = awwyVar3;
            awvyVar3.c |= 8;
        }
        awui awuiVar4 = (awui) ((chco) this.b.b()).c().orElseThrow(new Supplier() { // from class: clkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
        awvxVar.copyOnWrite();
        awvy awvyVar4 = (awvy) awvxVar.instance;
        awuiVar4.getClass();
        awvyVar4.l = awuiVar4;
        awvyVar4.c |= 64;
        return (awvy) awvxVar.build();
    }

    @Override // defpackage.cljo, java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((clqi) obj);
    }
}

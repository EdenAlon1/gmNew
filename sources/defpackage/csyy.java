package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyy {
    private final effy a;

    public csyy(effy effyVar) {
        this.a = effyVar;
    }

    public final elfl a(final long j) {
        return f(new emwl() { // from class: csyp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csym csymVar = (csym) obj;
                csyd csydVar = (csyd) csymVar.toBuilder();
                csyf csyfVar = csymVar.c;
                if (csyfVar == null) {
                    csyfVar = csyf.a;
                }
                long j2 = j;
                csye csyeVar = (csye) csyfVar.toBuilder();
                csyeVar.copyOnWrite();
                csyf csyfVar2 = (csyf) csyeVar.instance;
                csyfVar2.b |= 1;
                csyfVar2.c = j2;
                csyf csyfVar3 = (csyf) csyeVar.build();
                csydVar.copyOnWrite();
                csym csymVar2 = (csym) csydVar.instance;
                csyfVar3.getClass();
                csymVar2.c = csyfVar3;
                csymVar2.b |= 1;
                return (csym) csydVar.build();
            }
        });
    }

    public final elfl b(final long j) {
        return f(new emwl() { // from class: csyu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csym csymVar = (csym) obj;
                csyd csydVar = (csyd) csymVar.toBuilder();
                csyh csyhVar = csymVar.d;
                if (csyhVar == null) {
                    csyhVar = csyh.a;
                }
                long j2 = j;
                csyg csygVar = (csyg) csyhVar.toBuilder();
                csygVar.copyOnWrite();
                csyh csyhVar2 = (csyh) csygVar.instance;
                csyhVar2.b |= 2;
                csyhVar2.d = j2;
                csyh csyhVar3 = (csyh) csygVar.build();
                csydVar.copyOnWrite();
                csym csymVar2 = (csym) csydVar.instance;
                csyhVar3.getClass();
                csymVar2.d = csyhVar3;
                csymVar2.b |= 2;
                return (csym) csydVar.build();
            }
        });
    }

    public final elfl c(final long j) {
        return f(new emwl() { // from class: csyq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csym csymVar = (csym) obj;
                csyd csydVar = (csyd) csymVar.toBuilder();
                csyl csylVar = csymVar.e;
                if (csylVar == null) {
                    csylVar = csyl.a;
                }
                long j2 = j;
                csyk csykVar = (csyk) csylVar.toBuilder();
                csykVar.copyOnWrite();
                csyl csylVar2 = (csyl) csykVar.instance;
                csylVar2.b |= 1;
                csylVar2.c = j2;
                csyl csylVar3 = (csyl) csykVar.build();
                csydVar.copyOnWrite();
                csym csymVar2 = (csym) csydVar.instance;
                csylVar3.getClass();
                csymVar2.e = csylVar3;
                csymVar2.b |= 4;
                return (csym) csydVar.build();
            }
        });
    }

    public final elfl d(final long j) {
        return f(new emwl() { // from class: csys
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csym csymVar = (csym) obj;
                csyd csydVar = (csyd) csymVar.toBuilder();
                csyh csyhVar = csymVar.d;
                if (csyhVar == null) {
                    csyhVar = csyh.a;
                }
                long j2 = j;
                csyg csygVar = (csyg) csyhVar.toBuilder();
                csygVar.copyOnWrite();
                csyh csyhVar2 = (csyh) csygVar.instance;
                csyhVar2.b |= 1;
                csyhVar2.c = j2;
                csyh csyhVar3 = (csyh) csygVar.build();
                csydVar.copyOnWrite();
                csym csymVar2 = (csym) csydVar.instance;
                csyhVar3.getClass();
                csymVar2.d = csyhVar3;
                csymVar2.b |= 2;
                return (csym) csydVar.build();
            }
        });
    }

    public final elfl e(emwl emwlVar) {
        return elfl.g(this.a.a()).h(emwlVar, erpp.a);
    }

    public final elfl f(emwl emwlVar) {
        return elfl.g(this.a.b(emwlVar, erpp.a));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgkv {
    public final comc a;
    public final errl b;

    public cgkv(comc comcVar, errl errlVar) {
        this.a = comcVar;
        this.b = errlVar;
    }

    public final elfl a() {
        return this.a.h().h(new emwl() { // from class: cgkp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgkx cgkxVar = ((cgkl) obj).c;
                if (cgkxVar == null) {
                    cgkxVar = cgkx.a;
                }
                return Boolean.valueOf(cgkxVar.b);
            }
        }, this.b);
    }

    public final elfl b() {
        return this.a.h().h(new emwl() { // from class: cgkq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgkz cgkzVar = ((cgkl) obj).d;
                if (cgkzVar == null) {
                    cgkzVar = cgkz.a;
                }
                return Long.valueOf(cgkzVar.b);
            }
        }, this.b);
    }

    public final elfl c(final long j) {
        return this.a.j(new emwl() { // from class: cgkt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgkl cgklVar = (cgkl) obj;
                cgkz cgkzVar = cgklVar.d;
                if (cgkzVar == null) {
                    cgkzVar = cgkz.a;
                }
                long j2 = j;
                cgky cgkyVar = (cgky) cgkzVar.toBuilder();
                cgkyVar.copyOnWrite();
                ((cgkz) cgkyVar.instance).b = j2;
                cgkz cgkzVar2 = (cgkz) cgkyVar.build();
                cgkk cgkkVar = (cgkk) cgklVar.toBuilder();
                cgkkVar.copyOnWrite();
                cgkl cgklVar2 = (cgkl) cgkkVar.instance;
                cgkzVar2.getClass();
                cgklVar2.d = cgkzVar2;
                cgklVar2.b |= 2;
                return (cgkl) cgkkVar.build();
            }
        }).h(new emwl() { // from class: cgku
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }

    public final elfl d(final boolean z) {
        return this.a.j(new emwl() { // from class: cgkm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgkl cgklVar = (cgkl) obj;
                cgkz cgkzVar = cgklVar.d;
                if (cgkzVar == null) {
                    cgkzVar = cgkz.a;
                }
                boolean z2 = z;
                cgky cgkyVar = (cgky) cgkzVar.toBuilder();
                cgkyVar.copyOnWrite();
                ((cgkz) cgkyVar.instance).c = z2;
                cgkz cgkzVar2 = (cgkz) cgkyVar.build();
                cgkk cgkkVar = (cgkk) cgklVar.toBuilder();
                cgkkVar.copyOnWrite();
                cgkl cgklVar2 = (cgkl) cgkkVar.instance;
                cgkzVar2.getClass();
                cgklVar2.d = cgkzVar2;
                cgklVar2.b |= 2;
                return (cgkl) cgkkVar.build();
            }
        }).h(new emwl() { // from class: cgkr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }
}

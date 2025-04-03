package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxz {
    public static boolean a(dwns dwnsVar, dwns dwnsVar2) {
        return b(dwnsVar, dwnsVar2, new emxg() { // from class: dwxp
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return (((dwns) obj).b & 2) != 0;
            }
        }, new emwl() { // from class: dwxq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dwns) obj).d;
            }
        }) && b(dwnsVar, dwnsVar2, new emxg() { // from class: dwxr
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return (((dwns) obj).b & 1) != 0;
            }
        }, new emwl() { // from class: dwxs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dwns) obj).c;
            }
        }) && b(dwnsVar, dwnsVar2, new emxg() { // from class: dwxt
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return (((dwns) obj).b & 4) != 0;
            }
        }, new emwl() { // from class: dwxu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dwns) obj).e;
            }
        }) && b(dwnsVar, dwnsVar2, new emxg() { // from class: dwxv
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return (((dwns) obj).b & 8) != 0;
            }
        }, new emwl() { // from class: dwxw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(((dwns) obj).f);
            }
        }) && b(dwnsVar, dwnsVar2, new emxg() { // from class: dwxx
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return (((dwns) obj).b & 16) != 0;
            }
        }, new emwl() { // from class: dwxy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwnr b = dwnr.b(((dwns) obj).g);
                return b == null ? dwnr.UNSPECIFIED : b;
            }
        }) && dwnsVar.h.size() == dwnsVar2.h.size();
    }

    private static boolean b(dwns dwnsVar, dwns dwnsVar2, emxg emxgVar, emwl emwlVar) {
        return !emxgVar.a(dwnsVar) ? !emxgVar.a(dwnsVar2) : emwlVar.apply(dwnsVar).equals(emwlVar.apply(dwnsVar2));
    }
}

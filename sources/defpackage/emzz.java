package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
class emzz {
    public static final emzz a;
    public static final emzz b;
    public static final emzz c;
    public static final emzz d;
    public static final emzz e;
    public static final emzz f;
    public static final emzz g;
    public static final emzz h;
    static final emzz[] i;
    private static final /* synthetic */ emzz[] j;

    static {
        emzz emzzVar = new emzz("STRONG", 0);
        a = emzzVar;
        emzz emzzVar2 = new emzz() { // from class: emzt
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                c(enbgVar, a2);
                return a2;
            }
        };
        b = emzzVar2;
        emzz emzzVar3 = new emzz() { // from class: emzu
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                d(enbgVar, a2);
                return a2;
            }
        };
        c = emzzVar3;
        emzz emzzVar4 = new emzz() { // from class: emzv
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                c(enbgVar, a2);
                d(enbgVar, a2);
                return a2;
            }
        };
        d = emzzVar4;
        emzz emzzVar5 = new emzz("WEAK", 4);
        e = emzzVar5;
        emzz emzzVar6 = new emzz() { // from class: emzw
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                c(enbgVar, a2);
                return a2;
            }
        };
        f = emzzVar6;
        emzz emzzVar7 = new emzz() { // from class: emzx
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                d(enbgVar, a2);
                return a2;
            }
        };
        g = emzzVar7;
        emzz emzzVar8 = new emzz() { // from class: emzy
            @Override // defpackage.emzz
            public final enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
                enbg a2 = super.a(enalVar, enbgVar, enbgVar2, obj);
                c(enbgVar, a2);
                d(enbgVar, a2);
                return a2;
            }
        };
        h = emzzVar8;
        j = new emzz[]{emzzVar, emzzVar2, emzzVar3, emzzVar4, emzzVar5, emzzVar6, emzzVar7, emzzVar8};
        i = new emzz[]{emzzVar, emzzVar2, emzzVar3, emzzVar4, emzzVar5, emzzVar6, emzzVar7, emzzVar8};
    }

    public emzz(String str, int i2) {
    }

    static final void c(enbg enbgVar, enbg enbgVar2) {
        enbgVar2.k(enbgVar.b());
        enbf.c(enbgVar.h(), enbgVar2);
        enbf.c(enbgVar2, enbgVar.f());
        enbf.e(enbgVar);
    }

    static final void d(enbg enbgVar, enbg enbgVar2) {
        enbgVar2.q(enbgVar.c());
        enbf.d(enbgVar.i(), enbgVar2);
        enbf.d(enbgVar2, enbgVar.g());
        enbf.f(enbgVar);
    }

    public static emzz[] values() {
        return (emzz[]) j.clone();
    }

    public enbg a(enal enalVar, enbg enbgVar, enbg enbgVar2, Object obj) {
        return b(enalVar, obj, enbgVar.a(), enbgVar2);
    }

    final enbg b(enal enalVar, Object obj, int i2, enbg enbgVar) {
        switch (ordinal()) {
            case 0:
                return new enaq(obj, i2, enbgVar);
            case 1:
                return new enao(obj, i2, enbgVar);
            case 2:
                return new enas(obj, i2, enbgVar);
            case 3:
                return new enap(obj, i2, enbgVar);
            case 4:
                return new enay(enalVar.h, obj, i2, enbgVar);
            case 5:
                return new enaw(enalVar.h, obj, i2, enbgVar);
            case 6:
                return new enba(enalVar.h, obj, i2, enbgVar);
            case 7:
                return new enax(enalVar.h, obj, i2, enbgVar);
            default:
                throw null;
        }
    }
}

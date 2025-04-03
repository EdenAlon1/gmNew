package defpackage;

import j$.util.List;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlth {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.Object r17, final defpackage.dlti r18, defpackage.cue r19, defpackage.cug r20, java.lang.String r21, final defpackage.ffjn r22, defpackage.hfd r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlth.a(java.lang.Object, dlti, cue, cug, java.lang.String, ffjn, hfd, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    public static final void b(final List list, final dlti dltiVar, final ffji ffjiVar, final ffji ffjiVar2, String str, final ffjn ffjnVar, hfd hfdVar, final int i) {
        ffjn ffjnVar2;
        ?? r10;
        final String str2;
        ffjnVar.getClass();
        hfd b = hfdVar.b(1852995754);
        int i2 = (i & 6) == 0 ? (true != b.F(list) ? 2 : 4) | i : i;
        dlti dltiVar2 = dltiVar;
        if ((i & 48) == 0) {
            i2 |= true != b.F(dltiVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar2) ? 1024 : 2048;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i3 |= true != b.F(ffjnVar2) ? 65536 : 131072;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((74899 & i3) == 74898 && b.I()) {
            b.s();
            str2 = str;
        } else {
            b.v(-1513030549);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ixm();
                hfmVar.ad(R);
            }
            ixm ixmVar = (ixm) R;
            hfmVar.Z();
            List list2 = (List) ixmVar.a;
            b.v(-1513025027);
            int i4 = 0;
            if (list2 == null || list.size() >= list2.size()) {
                r10 = list;
            } else if (list.isEmpty()) {
                int size = list2.size();
                r10 = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    r10.add(null);
                }
            } else {
                r10 = ffdx.am(list2);
                final Set ar = ffdx.ar(ffdx.ab(list2, ffdx.ar(list)));
                b.v(1123683877);
                boolean F = b.F(ar);
                Object R2 = hfmVar.R();
                if (F || R2 == hfc.a) {
                    R2 = new UnaryOperator() { // from class: dlte
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            if (ffdx.au(ar, obj)) {
                                return null;
                            }
                            return obj;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    };
                    hfmVar.ad(R2);
                }
                UnaryOperator m109m = afg$$ExternalSyntheticApiModelOutline0.m109m(R2);
                hfmVar.Z();
                List.EL.replaceAll(r10, m109m);
            }
            hfmVar.Z();
            for (Object obj : r10) {
                Integer valueOf = Integer.valueOf(i4);
                a(obj, dltiVar2, (cue) ffjiVar.invoke(valueOf), (cug) ffjiVar2.invoke(valueOf), "AnimatedListItemVisibilityAfterInitialComposition", ffjnVar2, b, 516208 & i3, 0);
                dltiVar2 = dltiVar;
                ffjnVar2 = ffjnVar;
                i4++;
            }
            ixmVar.a = list;
            str2 = "AnimatedListItemVisibilityAfterInitialComposition";
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dltf
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    java.util.List list3 = list;
                    dlti dltiVar3 = dltiVar;
                    ffji ffjiVar3 = ffjiVar;
                    ffji ffjiVar4 = ffjiVar2;
                    String str3 = str2;
                    dlth.b(list3, dltiVar3, ffjiVar3, ffjiVar4, str3, ffjnVar, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}

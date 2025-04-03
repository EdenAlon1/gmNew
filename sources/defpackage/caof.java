package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caof {
    public static final ffbz a;
    public static final caof b;
    public static final caof c;
    public static final caof d;
    public static final caof e;
    public static final caof f;
    public static final caof g;
    public static final /* synthetic */ ffhx i;
    private static final /* synthetic */ caof[] j;
    public final int h;

    static {
        caof caofVar = new caof("SWITCH_TO_RCS", 0, 215);
        b = caofVar;
        caof caofVar2 = new caof("SWITCH_TO_ENCRYPTED_RCS", 1, 216);
        c = caofVar2;
        caof caofVar3 = new caof("SWITCH_TO_ENCRYPTED_RCS_INFO", 2, 219);
        d = caofVar3;
        caof caofVar4 = new caof("GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE", 3, 233);
        e = caofVar4;
        caof caofVar5 = new caof("GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS", 4, 234);
        f = caofVar5;
        caof caofVar6 = new caof("GROUP_PROTOCOL_SWITCH_TO_MMS", 5, 252);
        g = caofVar6;
        caof[] caofVarArr = {caofVar, caofVar2, caofVar3, caofVar4, caofVar5, caofVar6};
        j = caofVarArr;
        i = ffhw.a(caofVarArr);
        a = ffca.a(new ffix() { // from class: caod
            @Override // defpackage.ffix
            public final Object invoke() {
                ffhx ffhxVar = caof.i;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(ffhxVar, 10)), 16));
                ffdb ffdbVar = new ffdb(ffhxVar);
                while (ffdbVar.hasNext()) {
                    Object next = ffdbVar.next();
                    linkedHashMap.put(Integer.valueOf(((caof) next).h), next);
                }
                return linkedHashMap;
            }
        });
    }

    private caof(String str, int i2, int i3) {
        this.h = i3;
    }

    public static caof[] values() {
        return (caof[]) j.clone();
    }

    public final camy a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return camy.d;
            }
            if (ordinal != 4) {
                if (ordinal == 5) {
                    return camy.b;
                }
                throw null;
            }
        }
        return camy.c;
    }
}

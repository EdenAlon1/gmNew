package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxf {
    public static final faxf a;
    public static final faxf b;
    public static final faxf c;
    public static final faxf d;
    public static final faxf e;
    public static final faxf f;
    private static final /* synthetic */ faxf[] h;
    public final String g;

    static {
        faxf faxfVar = new faxf("Stroke", 0, "st");
        a = faxfVar;
        faxf faxfVar2 = new faxf("Fill", 1, "fl");
        b = faxfVar2;
        faxf faxfVar3 = new faxf("Solid", 2, "1");
        c = faxfVar3;
        faxf faxfVar4 = new faxf("Shape", 3, "sh");
        d = faxfVar4;
        faxf faxfVar5 = new faxf("Group", 4, "gr");
        e = faxfVar5;
        faxf faxfVar6 = new faxf("Transform", 5, "tr");
        f = faxfVar6;
        faxf[] faxfVarArr = {faxfVar, faxfVar2, faxfVar3, faxfVar4, faxfVar5, faxfVar6};
        h = faxfVarArr;
        ffhw.a(faxfVarArr);
        faxf[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(values.length), 16));
        for (faxf faxfVar7 : values) {
            linkedHashMap.put(faxfVar7.g, faxfVar7);
        }
    }

    private faxf(String str, int i, String str2) {
        this.g = str2;
    }

    public static faxf[] values() {
        return (faxf[]) h.clone();
    }
}

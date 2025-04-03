package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gml {
    public static final gml a;
    public static final gml b;
    public static final gml c;
    private static final /* synthetic */ gml[] d;

    static {
        gml gmlVar = new gml("Hidden", 0);
        a = gmlVar;
        gml gmlVar2 = new gml("Expanded", 1);
        b = gmlVar2;
        gml gmlVar3 = new gml("PartiallyExpanded", 2);
        c = gmlVar3;
        gml[] gmlVarArr = {gmlVar, gmlVar2, gmlVar3};
        d = gmlVarArr;
        ffhw.a(gmlVarArr);
    }

    private gml(String str, int i) {
    }

    public static gml[] values() {
        return (gml[]) d.clone();
    }
}

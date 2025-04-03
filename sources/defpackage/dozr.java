package defpackage;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozr {
    public static final dozr a;
    public static final dozr b;
    public static final dozr c;
    public static final dozr d;
    public static final dozr e;
    public static final dozr f;
    public static final dozr g;
    public static final dozr h;
    public static final dozr i;
    public static final dozr j;
    private static final /* synthetic */ dozr[] l;
    public final String k;
    private final int m;

    static {
        dozr dozrVar = new dozr("ID", 0, "_id", 1);
        a = dozrVar;
        dozr dozrVar2 = new dozr("MIME_TYPE", 1, "mime_type", 1);
        b = dozrVar2;
        dozr dozrVar3 = new dozr("SIZE", 2, "_size", 1);
        c = dozrVar3;
        dozr dozrVar4 = new dozr("DISPLAY_NAME", 3, "_display_name", 1);
        d = dozrVar4;
        dozr dozrVar5 = new dozr("DATE_MODIFIED", 4, "date_modified", 1);
        e = dozrVar5;
        dozr dozrVar6 = new dozr("DATE_ADDED", 5, "date_added", 1);
        f = dozrVar6;
        dozr dozrVar7 = new dozr("WIDTH", 6, "width", 16);
        g = dozrVar7;
        dozr dozrVar8 = new dozr("HEIGHT", 7, "height", 16);
        h = dozrVar8;
        dozr dozrVar9 = new dozr("DURATION", 8, "duration", 29);
        i = dozrVar9;
        dozr dozrVar10 = new dozr("ORIENTATION", 9, "orientation", 29);
        j = dozrVar10;
        dozr[] dozrVarArr = {dozrVar, dozrVar2, dozrVar3, dozrVar4, dozrVar5, dozrVar6, dozrVar7, dozrVar8, dozrVar9, dozrVar10};
        l = dozrVarArr;
        ffhw.a(dozrVarArr);
    }

    private dozr(String str, int i2, String str2, int i3) {
        this.m = i3;
        this.k = Build.VERSION.SDK_INT < i3 ? null : str2;
    }

    public static dozr[] values() {
        return (dozr[]) l.clone();
    }
}

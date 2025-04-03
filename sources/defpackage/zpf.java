package defpackage;

import android.content.res.Resources;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpf {
    public static final zpf a;
    public static final zpf b;
    public static final /* synthetic */ ffhx d;
    private static final /* synthetic */ zpf[] e;
    public final int c;

    static {
        zpf zpfVar = new zpf("HALF_SCREEN", 0, Resources.getSystem().getDisplayMetrics().heightPixels / 2);
        a = zpfVar;
        zpf zpfVar2 = new zpf("FULL_SCREEN", 1, Resources.getSystem().getDisplayMetrics().heightPixels);
        b = zpfVar2;
        zpf[] zpfVarArr = {zpfVar, zpfVar2};
        e = zpfVarArr;
        d = ffhw.a(zpfVarArr);
    }

    private zpf(String str, int i, int i2) {
        this.c = i2;
    }

    public static zpf[] values() {
        return (zpf[]) e.clone();
    }
}

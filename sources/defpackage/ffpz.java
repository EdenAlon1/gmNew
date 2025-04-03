package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpz {
    public static final ffpz a;
    public static final ffpz b;
    public static final ffpz c;
    public static final ffpz d;
    public static final ffpz e;
    public static final ffpz f;
    public static final ffpz g;
    private static final /* synthetic */ ffpz[] i;
    public final TimeUnit h;

    static {
        ffpz ffpzVar = new ffpz("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = ffpzVar;
        ffpz ffpzVar2 = new ffpz("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = ffpzVar2;
        ffpz ffpzVar3 = new ffpz("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = ffpzVar3;
        ffpz ffpzVar4 = new ffpz("SECONDS", 3, TimeUnit.SECONDS);
        d = ffpzVar4;
        ffpz ffpzVar5 = new ffpz("MINUTES", 4, TimeUnit.MINUTES);
        e = ffpzVar5;
        ffpz ffpzVar6 = new ffpz("HOURS", 5, TimeUnit.HOURS);
        f = ffpzVar6;
        ffpz ffpzVar7 = new ffpz("DAYS", 6, TimeUnit.DAYS);
        g = ffpzVar7;
        ffpz[] ffpzVarArr = {ffpzVar, ffpzVar2, ffpzVar3, ffpzVar4, ffpzVar5, ffpzVar6, ffpzVar7};
        i = ffpzVarArr;
        ffhw.a(ffpzVarArr);
    }

    private ffpz(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static ffpz[] values() {
        return (ffpz[]) i.clone();
    }
}

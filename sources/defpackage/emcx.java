package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcx {
    public static final emcx a;
    public static final emcx b;
    public static final emcx c;
    public static final emcx d;
    private static final /* synthetic */ emcx[] e;

    static {
        emcx emcxVar = new emcx("AVAILABLE", 0);
        a = emcxVar;
        emcx emcxVar2 = new emcx("DOWNLOADING", 1);
        b = emcxVar2;
        emcx emcxVar3 = new emcx("DOWNLOADABLE", 2);
        c = emcxVar3;
        emcx emcxVar4 = new emcx("UNAVAILABLE", 3);
        d = emcxVar4;
        emcx[] emcxVarArr = {emcxVar, emcxVar2, emcxVar3, emcxVar4};
        e = emcxVarArr;
        ffhw.a(emcxVarArr);
    }

    private emcx(String str, int i) {
    }

    public static emcx[] values() {
        return (emcx[]) e.clone();
    }
}

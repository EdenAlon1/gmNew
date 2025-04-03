package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdpv {
    public static final bdpv a;
    public static final bdpv b;
    public static final bdpv c;
    private static final /* synthetic */ bdpv[] e;
    public final long d;

    static {
        bdpv bdpvVar = new bdpv("NO_TRACE_STORAGE", 0, 0L);
        a = bdpvVar;
        bdpv bdpvVar2 = new bdpv("LOCAL_TRACE_STORAGE", 1, 1L);
        b = bdpvVar2;
        bdpv bdpvVar3 = new bdpv("UPLOAD_TRACE_DATA", 2, 2L);
        c = bdpvVar3;
        bdpv[] bdpvVarArr = {bdpvVar, bdpvVar2, bdpvVar3};
        e = bdpvVarArr;
        ffhw.a(bdpvVarArr);
    }

    private bdpv(String str, int i, long j) {
        this.d = j;
    }

    public static bdpv[] values() {
        return (bdpv[]) e.clone();
    }
}

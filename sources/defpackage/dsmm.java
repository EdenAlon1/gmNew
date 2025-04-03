package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmm {
    public static final dsmm a;
    public static final dsmm b;
    public static final dsmm c;
    public static final dsmm d;
    private static final /* synthetic */ dsmm[] f;
    public final boolean e;

    static {
        dsmm dsmmVar = new dsmm("OPEN", 0, false);
        a = dsmmVar;
        dsmm dsmmVar2 = new dsmm("OPENING", 1, true);
        b = dsmmVar2;
        dsmm dsmmVar3 = new dsmm("CLOSING", 2, true);
        c = dsmmVar3;
        dsmm dsmmVar4 = new dsmm("CLOSED", 3, false);
        d = dsmmVar4;
        dsmm[] dsmmVarArr = {dsmmVar, dsmmVar2, dsmmVar3, dsmmVar4};
        f = dsmmVarArr;
        ffhw.a(dsmmVarArr);
    }

    private dsmm(String str, int i, boolean z) {
        this.e = !z;
    }

    public static dsmm[] values() {
        return (dsmm[]) f.clone();
    }
}

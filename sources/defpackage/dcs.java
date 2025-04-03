package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcs implements cyd {
    private final cyv[] a;

    public dcs(cyb cybVar, float f, float f2) {
        int b = cybVar.b();
        cyv[] cyvVarArr = new cyv[b];
        for (int i = 0; i < b; i++) {
            cyvVarArr[i] = new cyv(f, f2, cybVar.a(i));
        }
        this.a = cyvVarArr;
    }

    @Override // defpackage.cyd
    public final /* bridge */ /* synthetic */ cys a(int i) {
        return this.a[i];
    }
}

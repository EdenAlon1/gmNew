package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnl {
    public final lsr[] a;
    public final moa b;
    public final lsw c;

    public mnl(lsr... lsrVarArr) {
        moa moaVar = new moa();
        lsw lswVar = new lsw();
        lsr[] lsrVarArr2 = {moaVar, lswVar};
        this.a = lsrVarArr2;
        System.arraycopy(lsrVarArr, 0, lsrVarArr2, 0, 0);
        this.b = moaVar;
        this.c = lswVar;
    }
}

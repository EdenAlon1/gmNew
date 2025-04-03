package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iek {
    public static final cnw a;

    static {
        float[] fArr = ieg.a;
        iff iffVar = ieg.e;
        int i = iffVar.c;
        ieh iehVar = new ieh(iffVar);
        iff iffVar2 = ieg.e;
        int i2 = iffVar2.c;
        idy idyVar = ieg.x;
        int i3 = i2 | (idyVar.c << 6);
        iej iejVar = new iej(iffVar2, idyVar);
        idy idyVar2 = ieg.x;
        int i4 = idyVar2.c;
        iff iffVar3 = ieg.e;
        int i5 = i4 | (iffVar3.c << 6);
        iej iejVar2 = new iej(idyVar2, iffVar3);
        cnw cnwVar = cmz.a;
        cnw cnwVar2 = new cnw((byte[]) null);
        cnwVar2.f(i | (i << 6), iehVar);
        cnwVar2.f(i3, iejVar);
        cnwVar2.f(i5, iejVar2);
        a = cnwVar2;
    }
}

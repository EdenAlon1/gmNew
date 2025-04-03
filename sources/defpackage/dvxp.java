package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxp {
    public static dvxb a(int i) {
        emxf.a(i >= 0);
        eyfw eyfwVar = dvzr.a;
        dvzu dvzuVar = (dvzu) dvzv.a.createBuilder();
        dvzuVar.copyOnWrite();
        dvzv dvzvVar = (dvzv) dvzuVar.instance;
        dvzvVar.b = 1 | dvzvVar.b;
        dvzvVar.c = i;
        return new dvxb(eyfwVar, (dvzv) dvzuVar.build());
    }
}

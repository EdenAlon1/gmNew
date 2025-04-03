package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dglq {
    public abstract int a();

    public final boolean b() {
        return a() == 1;
    }

    public final String toString() {
        int a = a();
        return a != 1 ? a != 2 ? a != 3 ? "DO_NOT_ENFORCE" : "UNKNOWN" : "NOT_SET" : "ENFORCE";
    }
}

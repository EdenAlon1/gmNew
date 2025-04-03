package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxyf implements Comparable {
    public abstract cxyi a();

    public abstract cxym b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(((cxxz) a()).a, ((cxxz) ((cxyf) obj).a()).a);
    }
}

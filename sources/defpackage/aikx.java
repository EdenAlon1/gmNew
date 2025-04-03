package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikx implements aihs {
    public final String a;
    public final cfzm b;

    /* JADX WARN: Multi-variable type inference failed */
    public aikx() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public /* synthetic */ aikx(String str, cfzm cfzmVar, int i) {
        str = 1 == (i & 1) ? "Messenger_conversation" : str;
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : cfzmVar;
    }
}

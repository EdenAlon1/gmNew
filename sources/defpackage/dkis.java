package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkis {
    OK("ok"),
    ERROR("error");

    private final String d;

    dkis(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evza implements eyge {
    UITHEME_DEFAULT(0),
    UITHEME_GOOGLE_MATERIAL(1);

    public final int c;

    evza(int i) {
        this.c = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}

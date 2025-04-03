package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jul {
    public static final boolean a(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }
}

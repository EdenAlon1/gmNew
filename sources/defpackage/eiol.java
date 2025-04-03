package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiol {
    public static void a(String str, String str2, int i, int i2) {
        eioc.c(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        eioc.a(length <= i2 && length >= i, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
